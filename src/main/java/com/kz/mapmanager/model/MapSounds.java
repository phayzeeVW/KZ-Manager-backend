package com.kz.mapmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Map_Sounds")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MapSounds {
    @Id
    @ManyToOne
    @JoinColumn(name = "map_id")
    private Maps map;

    @Id
    @ManyToOne
    @JoinColumn(name = "sound_id")
    private Sounds sound;
}
