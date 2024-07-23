package org.example.bt_nangcapungdungquanlycauthubongda_springdatarepository2.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date dob;
    private String experience;
    private String position;
    @ManyToOne
    @JoinColumn(name = "club_id")
    private Club club;


}
