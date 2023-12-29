package com.kz.mapmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Map_Gfxs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MapGfxs {
    @Id
    @ManyToOne
    @JoinColumn(name = "map_id")
    private Maps map;

    @Id
    @ManyToOne
    @JoinColumn(name = "gfx_id")
    private Gfxs gfxs;
}
