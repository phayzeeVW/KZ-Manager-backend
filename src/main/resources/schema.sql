-- Define Authors Table
CREATE TABLE IF NOT EXISTS Authors
(
    author_id   INT AUTO_INCREMENT PRIMARY KEY,
    author_name VARCHAR UNIQUE
);

-- Define Sprites Table
CREATE TABLE IF NOT EXISTS Sprites
(
    sprite_id   INT AUTO_INCREMENT PRIMARY KEY,
    sprite_name VARCHAR
);

-- Define Models Table
CREATE TABLE IF NOT EXISTS Models
(
    model_id   INT AUTO_INCREMENT PRIMARY KEY,
    model_name VARCHAR
);

-- Define Sounds Table
CREATE TABLE IF NOT EXISTS Sounds
(
    sound_id   INT AUTO_INCREMENT PRIMARY KEY,
    sound_name VARCHAR
);

-- Define Gfxs Table
CREATE TABLE IF NOT EXISTS Gfxs
(
    gfx_id   INT AUTO_INCREMENT PRIMARY KEY,
    gfx_name VARCHAR
);

-- Define Maps Table
CREATE TABLE IF NOT EXISTS Maps
(
    map_id           INT AUTO_INCREMENT PRIMARY KEY,
    map_name         VARCHAR,
    map_size         INTEGER,
    date_of_creation DATE
);

-- Define Map_Authors Table
CREATE TABLE IF NOT EXISTS Map_Authors
(
    map_id    INT,
    author_id INT,
    PRIMARY KEY (map_id, author_id),
    FOREIGN KEY (map_id) REFERENCES Maps (map_id),
    FOREIGN KEY (author_id) REFERENCES Authors (author_id)
);

-- Define Map_Sprites Table
CREATE TABLE IF NOT EXISTS Map_Sprites
(
    map_id    INT,
    sprite_id INT,
    PRIMARY KEY (map_id, sprite_id),
    FOREIGN KEY (map_id) REFERENCES Maps (map_id),
    FOREIGN KEY (sprite_id) REFERENCES Sprites (sprite_id)
);

-- Define Map_Models Table
CREATE TABLE IF NOT EXISTS Map_Models
(
    map_id   INT,
    model_id INT,
    PRIMARY KEY (map_id, model_id),
    FOREIGN KEY (map_id) REFERENCES Maps (map_id),
    FOREIGN KEY (model_id) REFERENCES Models (model_id)
);

-- Define Map_Sounds Table
CREATE TABLE IF NOT EXISTS Map_Sounds
(
    map_id   INT,
    sound_id INT,
    PRIMARY KEY (map_id, sound_id),
    FOREIGN KEY (map_id) REFERENCES Maps (map_id),
    FOREIGN KEY (sound_id) REFERENCES Sounds (sound_id)
);

-- Define Map_Gfxs Table
CREATE TABLE IF NOT EXISTS Map_Gfxs
(
    map_id INT,
    gfx_id INT,
    PRIMARY KEY (map_id, gfx_id),
    FOREIGN KEY (map_id) REFERENCES Maps (map_id),
    FOREIGN KEY (gfx_id) REFERENCES Gfxs (gfx_id)
);