package com.kz.mapmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Sprites")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sprites {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sprite_id")
    private Long spriteId;

    @Column(name = "sprite_name")
    private String spriteName;
}