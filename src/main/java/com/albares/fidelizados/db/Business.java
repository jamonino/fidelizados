
package com.albares.fidelizados.db;

public class Business {
    private Integer id;
    private String name;
    private String address;
    private String vat;
    private String phone;
    private Integer ratio_euro_point;
    private Integer freePrizes;
    private Login login;

    public Business() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getRatio_euro_point() {
        return ratio_euro_point;
    }

    public void setRatio_euro_point(Integer ratio_euro_point) {
        this.ratio_euro_point = ratio_euro_point;
    }

    public Integer getFreePrizes() {
        return freePrizes;
    }

    public void setFreePrizes(Integer freePrizes) {
        this.freePrizes = freePrizes;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
    
    
}
