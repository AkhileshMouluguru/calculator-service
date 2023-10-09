package com.calc.service.calc.service;

public class Response {
    private int xpy;
    private int y;
    private int result;

    public Response(int x, int y, int result) {
        this.xpy = x;
        this.y = y;
        this.result = result;
    }

    public int getX() {
        return xpy;
    }

    public int getY() {
        return y;
    }

    public int getResult() {
        return result;
    }
}
