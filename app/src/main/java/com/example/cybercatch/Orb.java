package com.example.cybercatch;

public class Orb {

    public float x;
    public float y;
    public float size;
    public float speed;

    // 0 = normal, 1 = hazard, 2 = bonus
    public int typ;

    public Orb(float x, float y, float size, float speed, int typ) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.speed = speed;
        this.typ = typ;
    }
}
