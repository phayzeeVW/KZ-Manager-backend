package com.kz.mapmanager.bsp.data;

public class BSPHeader {
    public int version; // 30 for valid HF bsp file
    public BSPLump[] lumps = new BSPLump[15];
}

