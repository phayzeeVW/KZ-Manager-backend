package com.kz.mapmanager.bsp.parser;

import com.google.common.io.LittleEndianDataInputStream;
import com.kz.mapmanager.bsp.data.BSPEntities;
import com.kz.mapmanager.bsp.data.BSPHeader;
import com.kz.mapmanager.bsp.data.BSPLump;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;

public class BSPParser {
    private static final Logger LOG = LoggerFactory.getLogger(BSPParser.class);
    public static void parseBSP(File bspToParse) {
        LOG.info("Parsing {}", bspToParse.getName());
        bspToParse = new File("C:\\Users\\ZZ03CV826\\WebstormProjects\\map-manager\\map-manager\\data\\muj_to_Shad0ws.bsp");

        try (LittleEndianDataInputStream dis = new LittleEndianDataInputStream(new FileInputStream(bspToParse))) {
            BSPHeader bspHeader = new BSPHeader();
            bspHeader.version = dis.readInt();

            if(bspHeader.version != 30) {
                throw new IllegalArgumentException("Invalid .bsp version");
            }


            BSPLump entitiesLump = new BSPLump();
            entitiesLump.offset = dis.readInt();
            entitiesLump.length = dis.readInt();

            dis.skipBytes(entitiesLump.offset - (bspHeader.lumps.length * 8 + 4));

            byte[] entityData = new byte[entitiesLump.length];
            dis.readFully(entityData);

            BSPEntities bspEntities = new BSPEntities();
            bspEntities.entityData = new String(entityData, StandardCharsets.UTF_8);
        }
        catch (Exception e) {
            LOG.error(("Error parsing {}: {}"), bspToParse.getName(), e.getMessage());
        }
    }
}
