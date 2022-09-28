package org.example;

import java.util.Date;

public class CadastroClient {
    private String Name;
    private String address;
    private Number Phone;
    private Date Date;
    private String Sex;

    public CadastroClient(String name, String address, Number phone, java.util.Date date, String sex) {
        Name = name;
        this.address = address;
        Phone = phone;
        Date = date;
        Sex = sex;
    }

    public void clientRegister(){

    }
    public void clientSale(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Number getPhone() {
        return Phone;
    }

    public void setPhone(Number phone) {
        Phone = phone;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }
}
