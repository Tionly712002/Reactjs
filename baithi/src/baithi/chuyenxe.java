package baithi;

import java.util.ArrayList;
import java.util.Scanner;

public class chuyenxe {
	private String hotentaixe;
	private String masochuyenxe;
	private String soxe;
	private float doanhthu;

//  GET / SET
	public String get_hotentaixe() {
		return hotentaixe;
	}

	public void set_hotentaixe(String httx) {
		this.hotentaixe = httx;
	}

	public String get_masochuyenxe() {
		return masochuyenxe;
	}

	public void set_masochuyen(String mscx) {
		this.masochuyenxe = mscx;
	}

	public String get_soxe() {
		return soxe;
	}

	public void set_soxe(String sx) {
		this.soxe = sx;
	}

	public float get_doanhthu() {
		return doanhthu;
	}

	public void set_doanhthu(float dt) {
		this.doanhthu = dt;
	}

// Hàm dựng constructors
	public chuyenxe() {
	}

	public chuyenxe(String mscx, String httx, String sx, float dt) {
		this.hotentaixe = httx;
		this.masochuyenxe = mscx;
		this.soxe = sx;
		this.doanhthu = dt;
	}

// Hàm nhập
	public void Nhap() {
		Scanner in = new Scanner(System.in);

// nhập họ tên tài xế
		System.out.print("		+ Nhap ho ten: \t");
		this.hotentaixe = in.nextLine();

// kiểm tra mã số chuyến xe nhập vào đủ 9 hay chưa
		do {
			System.out.print("		+ Nhap ma so chuyen xe: \t");
			this.masochuyenxe = in.nextLine();
		} while (this.masochuyenxe.length() != 9);

//kiểm tra số xe có đủ 7 hoặc 8 số và chữ hay không
		do {
			System.out.print("		+ Nhap so xe: \t");
			this.soxe = in.nextLine();
		} while (this.soxe.length() != 7 && this.soxe.length() != 8);

//nhập doanh thu
		while (true) {
			try {
				System.out.print("		+ Doanh thu: \t");
				doanhthu = Integer.parseInt(in.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("		... Vui long nhap so ... ");
			}
		}
	}

	// Xuất
	public String toString() {
		return (get_hotentaixe() + "\t|" + "|\t" + get_masochuyenxe() + "\t|" + "|\t" + get_soxe() + "\t|" + "|\t"
				+ get_doanhthu());
	}
}
