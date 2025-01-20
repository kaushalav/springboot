package com.bank.simulation.entity;

import java.util.Date;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manager {
    private UUID id;
    private String username;
    private String password;
    private String email;
    private String name;
    private Date doj;
    private Date dob;
}
