package com.pingchuan.Model;

import lombok.Data;

@Data
public class User {
    private int id;
    private int organizationId;
    private String name;
    private String username;
    private String password;
}
