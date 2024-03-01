package com.example.travelagencystring.models;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor


@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingid;
    private int customerid;
    private Date bookingdate;
}
