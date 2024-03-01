package com.example.travelagencystring.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentid;
    private int bookingid;
    private int amount;
    private Date paymentdate;
    private String paymentmethod;
}
