package com.example.listviewdactrung;

public class Truyen {
    private int hinh;
    private String ten;
    private String txt2;
    private String txt3;

    public Truyen(int hinh, String ten, String txt2, String txt3) {
        this.hinh = hinh;
        this.ten = ten;
        this.txt2 = txt2;
        this.txt3 = txt3;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }

    public String getTxt3() {
        return txt3;
    }

    public void setTxt3(String txt3) {
        this.txt3 = txt3;
    }
}
