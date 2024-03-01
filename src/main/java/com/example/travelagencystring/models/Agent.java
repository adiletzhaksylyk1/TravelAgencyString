package com.example.travelagencystring.models;

import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "agents")

public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int agentid;
    private String name;
    private String email;
}
