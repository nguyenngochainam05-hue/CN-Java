/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lap3;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private String lop;
    private double diem;

    public SinhVien(String maSV, String hoTen, String lop, double diem) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.lop = lop;
        this.diem = diem;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public double getDiem() {
        return diem;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}