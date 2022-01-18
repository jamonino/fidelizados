
package com.albares.fidelizados.api;

import jakarta.ws.rs.Path;

@Path("/user")
public class UserService {
    
    /*@POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String createUser(User newUser){
        if(newUser.getScore()!=0 ){
            newUser.setScore(-Math.abs(newUser.getScore()));
            return "Hackeo detectado... tu token es: "+JWTUtils.generateToken(Parameters.match.addUser(newUser));
        }
        return JWTUtils.generateToken(Parameters.match.addUser(newUser));
    }    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List getUsers(){ 
        return new ArrayList<>(Parameters.match.getUsers().values());
    }    */
}







