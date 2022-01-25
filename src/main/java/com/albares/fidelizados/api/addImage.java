
package com.albares.fidelizados.api;

import com.albares.fidelizados.db.User;
import com.albares.fidelizados.utils.GenericData;
import com.albares.fidelizados.utils.Image;
import com.albares.fidelizados.utils.Response;
import com.albares.fidelizados.utils.ResponseCodes;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.io.IOException;
import java.io.InputStream;
/*
    REQUEST:


    RESPONSE:

*/


@Path("/addImage")
public class addImage {
    @POST
    @Consumes(MediaType.APPLICATION_OCTET_STREAM)
    @Produces(MediaType.APPLICATION_JSON)
    
    public Response addImage(InputStream uploadedInputStream) throws IOException {
        
        
        Image i = new Image();
        
        i.saveStreamedImage(uploadedInputStream);
        
        return (new Response(ResponseCodes.OK, new GenericData(i)));
        
        
    }    
    


    
  
}
