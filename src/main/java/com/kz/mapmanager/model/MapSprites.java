package com.kz.mapmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Map_Sprites")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MapSprites {
    @Id
    @ManyToOne
    @JoinColumn(name = "map_id")
    private Maps map;

    @Id
    @ManyToOne
    @JoinColumn(name = "sprite_id")
    private Sprites sprite;
}
