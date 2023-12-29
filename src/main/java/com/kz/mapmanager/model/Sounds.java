package com.kz.mapmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Sounds")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sounds {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sound_id")
    private Long soundId;

    @Column(name = "sound_name")
    private String soundName;
}