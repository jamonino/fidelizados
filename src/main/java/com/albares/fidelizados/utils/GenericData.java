
package com.albares.fidelizados.utils;

import com.albares.fidelizados.db.Business;
import com.albares.fidelizados.db.Login;
import com.albares.fidelizados.db.User;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class GenericData {
    private Login login;
    private User user;
    private Business business;

    public GenericData() {
    }

    public GenericData(User user) {
        this.user = user;
    }

    public GenericData(Business business) {
        this.business = business;
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
