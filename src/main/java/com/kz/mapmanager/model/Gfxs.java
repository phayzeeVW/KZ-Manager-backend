package com.kz.mapmanager.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Gfxs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gfxs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gfx_id")
    private Long gfxId;

    @Column(name = "gfx_name")
    private String gfxName;
}