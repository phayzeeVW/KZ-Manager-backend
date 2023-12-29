package com.kz.mapmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "Maps")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Maps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "map_id")
    private Long mapId;

    @Column(name = "map_name")
    private String mapName;

    @Column(name = "map_size")
    private Integer mapSize;

    @Column(name = "date_of_creation")
    private Date dateOfCreation;
}
