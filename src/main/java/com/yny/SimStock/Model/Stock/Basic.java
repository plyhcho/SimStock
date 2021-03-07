package com.yny.SimStock.Model.Stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Stock_Master")
public class Basic {
    @Id
    @Column(name = "Code")
    private String Code;
    @Column(name = "Name")
    private String Name;

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getCode() {
        return Code;
    }
    public void setCode(String code) {
        Code = code;
    }
}
