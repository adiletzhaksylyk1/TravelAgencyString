package com.example.travelagencystring.models;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "trips")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripid;
    private String destination;
    private Date startdate;
    private Date enddate;
}
