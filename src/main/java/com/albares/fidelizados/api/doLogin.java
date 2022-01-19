
package com.albares.fidelizados.api;

import com.albares.fidelizados.db.Login;
import com.albares.fidelizados.db.User;
import com.albares.fidelizados.utils.Db;
import com.albares.fidelizados.utils.GenericData;
import com.albares.fidelizados.utils.JWTUtils;
import com.albares.fidelizados.utils.Response;
import com.albares.fidelizados.utils.ResponseCodes;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.sql.SQLException;

@Path("/doLogin")
public class doLogin {
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response doLogin(GenericData gd) throws SQLException, Exception{
        
        Db myDb = new Db();
        myDb.connect();
        Login login = gd.getLogin();
        User user = gd.getUser();
        user.setLogin(login);
        String pass = login.getPass();
        
        if(gd.getUser()!=null){ // Se está haciendo login en la app user
            if(login.checkEmailAndGetIdPass(myDb)){
                if(login.checkPass(pass)){
                    user.getIdAndNamebyLogin(myDb);
                    user.setToken(JWTUtils.generateToken(user.getId(), login.getId()));
                }else{
                    myDb.disconnect();
                    return new Response(ResponseCodes.ERROR); 
                }
            }else{
                myDb.disconnect();
                return new Response(ResponseCodes.NO_USER); 
                /*
                login.insertLogin(myDb);
                User user = new User();
                user.setLogin(login);
                user.
                */
            }
        }else if (gd.getBusiness()!=null){ // Se está haciendo login en la app business
        
        }else{
            throw new Exception();
        }
        
       return null;
    }    
    
  
}
