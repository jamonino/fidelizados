
package com.albares.fidelizados.db;

import com.albares.fidelizados.utils.Db;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Login {
    private Integer id;
    private String email;
    private String pass;
    private String emailCode;
    private Date exptirationCode;

    public Login() {
    }
    
    public Boolean checkEmailAndGetIdPass(Db myDb) throws SQLException{
        PreparedStatement ps = myDb.prepareStatement(
                    "SELECT id,pass FROM logins WHERE  email = ?;"
            );
        ps.setInt(1, this.getId());
        ResultSet rs = myDb.executeQuery(ps);
        if(rs.next()){
            this.setId(rs.getInt("id"));
            this.setPass(rs.getString("pass"));
            return true;
        }else{
            return false;
        }
    } 
    
    public Boolean checkPass(String pass) {
        return pass.equals(this.getPass());
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmailCode() {
        return emailCode;
    }

    public void setEmailCode(String emailCode) {
        this.emailCode = emailCode;
    }

    public Date getExptirationCode() {
        return exptirationCode;
    }

    public void setExptirationCode(Date exptirationCode) {
        this.exptirationCode = exptirationCode;
    }
    
    
    
}
