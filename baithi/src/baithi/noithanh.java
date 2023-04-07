package baithi;

import java.util.ArrayList;
import java.util.Scanner;

public class noithanh extends chuyenxe {
	private int sotuyen;
	private float sokmdiduoc;

// GET / SET
	public int get_sotuyen() {
		return sotuyen;
	}

	public void set_sotuyen(int st) {
		this.sotuyen = st;
	}

	public float get_sokmdiduoc() {
		return sokmdiduoc;
	}

	public void set_sokmdiduoc(float skmdd) {
		this.sokmdiduoc = skmdd;
	}

// Constructors
	public noithanh() {
		super();
	}

	public noithanh(String mscx, String httx, String sx, float dt, int st, float skmdd) {
		super(mscx, httx, sx, dt);
		this.sotuyen = st;
		this.sokmdiduoc = skmdd;
	}

	public void Nhap() {
		super.Nhap();
		Scanner in = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("		+ So tuyen: \t");
				sotuyen = Integer.parseInt(in.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("		.... Vui long nhap so nguyen .... ");
			}
		}
		while (true) {
			try {
				System.out.print("		+ So km di duoc: \t");
				sokmdiduoc = Integer.parseInt(in.nextLine());
				break;
			} catch (Exception e) {
				System.out.println("		..... Vui long nhap so.... ");
			}
		}
	}

	public String toString() {
		return super.toString() + ("\t|" + "|\t" + get_sotuyen() + "\t|" + "|\t" + get_sokmdiduoc() + "\n");
	}
}