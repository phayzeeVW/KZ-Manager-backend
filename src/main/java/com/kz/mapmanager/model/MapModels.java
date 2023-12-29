package com.kz.mapmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Map_Models")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MapModels {
    @Id
    @ManyToOne
    @JoinColumn(name = "map_id")
    private Maps map;

    @Id
    @ManyToOne
    @JoinColumn(name = "model_id")
    private Models model;
}
