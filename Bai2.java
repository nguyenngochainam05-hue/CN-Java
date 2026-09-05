package com.lab2.sinhvien;

import java.util.ArrayList;
import java.util.List;


public class QuanLySinhVien {

    private List<SinhVien> danhSach;

    public QuanLySinhVien() {
        danhSach = new ArrayList<>();
    }

    public void themSinhVien(SinhVien sv) {
        danhSach.add(sv);
    }

    public List<SinhVien> getDanhSach() {
        return danhSach;
    }

    public boolean isEmpty() {
        return danhSach.isEmpty();
    }

    public void hienThiBangKetQua() {
        if (danhSach.isEmpty()) {
            System.out.println("Danh sach sinh vien dang trong.");
            return;
        }

        String dongKe = "";

        System.out.println(dongKe);
        System.out.printf("| %-10s | %-26s | %-14s | %-14s | %-14s | %-14s | %-9s |%n",
                "Ma SV", "Ho ten", "Chuyen can", "Giua ky", "Cuoi ky", "Tong ket", "Xep loai");
        System.out.println(dongKe);

        for (SinhVien sv : danhSach) {
            System.out.printf("| %-10s | %-26s | %14.1f | %14.1f | %14.1f | %14.2f | %-9s |%n",
                    sv.getMaSV(), sv.getHoTen(), sv.getDiemChuyenCan(),
                    sv.getDiemGiuaKy(), sv.getDiemCuoiKy(),
                    sv.getDiemTongKet(), sv.getXepLoai());
        }
        System.out.println(dongKe);
    }
}