package com.bank.simulation.entity;

import java.util.Date;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private UUID userId;
    private String name;
    private Date doj;
    private Date dob;
    private String email;
    private String password;
    private String username;
}
