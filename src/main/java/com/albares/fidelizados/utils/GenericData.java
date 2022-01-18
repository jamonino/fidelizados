
package com.albares.fidelizados.utils;

import com.albares.fidelizados.db.Business;
import com.albares.fidelizados.db.Login;
import com.albares.fidelizados.db.User;


public class GenericData {
    private Login login;
    private User user;
    private Business business;

    public GenericData() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }
    
    
}