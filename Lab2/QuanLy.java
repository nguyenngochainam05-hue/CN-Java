import java.util.Scanner;

public class QuanLy {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Chuong trinh quan ly diem sinh vien ===");
        System.out.print("Nhap ma sinh vien: ");
        String maSV = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();

        double diemChuyenCan = nhapDiemHopLe("Chuyen Can");
        double diemGiuaKi = nhapDiemHopLe("Giua Ki");
        double diemCuoiKi = nhapDiemHopLe("Cuoi Ki");

        double diemTongKet = tinhDiemTongKet(diemChuyenCan, diemGiuaKi, diemCuoiKi);
        String xepLoai = xepLoai(diemTongKet);

        hienThiKetQua(maSV, hoTen, diemTongKet, xepLoai);
    }

    static double nhapDiemHopLe(String tenDiem) {
        double diem;
        while (true) {
            System.out.print("Nhap diem " + tenDiem + ": ");
            String input = sc.nextLine();
            try {
                diem = Double.parseDouble(input);
                if (diem < 0 || diem > 10) {
                    System.out.println("Diem " + diem + " -> khong hop le. Vui long nhap lai.");
                } else {
                    return diem;
                }
            } catch (NumberFormatException e) {
                System.out.println("Du lieu khong hop le. Vui long nhap so.");
            }
        }
    }

    static double tinhDiemTongKet(double cc, double gk, double ck) {
        return cc * 0.1 + gk * 0.3 + ck * 0.6;
    }

    static String xepLoai(double diem) {
        if (diem >= 8.5) return "A";
        else if (diem >= 7.0) return "B";
        else if (diem >= 5.5) return "C";
        else if (diem >= 4.0) return "D";
        else return "F";
    }

    static void hienThiKetQua(String maSV, String hoTen, double diemTongKet, String xepLoai) {
        System.out.println("\n=== KET QUA ===");
        System.out.printf("%s - %s - %.2f - %s%n", maSV, hoTen, diemTongKet, xepLoai);
    }
}