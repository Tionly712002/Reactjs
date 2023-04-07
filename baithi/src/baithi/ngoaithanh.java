package baithi;

import java.util.ArrayList;
import java.util.Scanner;

public class ngoaithanh extends chuyenxe {
	private float songaydiduoc;
	private String noiden;

// GET / SET
	public float get_songaydiduoc() {
		return songaydiduoc;
	}

	public void set_songaydiduoc(float sndd) {
		this.songaydiduoc = sndd;
	}

	public String get_noiden() {
		return noiden;
	}

	public void set_noiden(String nd) {
		this.noiden = nd;
	}

// Constructors
	public ngoaithanh() {
		super();
	}

	public ngoaithanh(String mscx, String httx, String sx, float dt, String nd, float sndd) {
		super(mscx, httx, sx, dt);
		this.songaydiduoc = sndd;
		this.noiden = nd;
	}

	public void Nhap() {
		super.Nhap();
		Scanner in = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("		+ So ngay di duoc \t");
				songaydiduoc = Float.parseFloat(in.nextLine());
				break;
			} catch (Exception e) {
				System.err.println("		***** Khong hop le ***** ");
			}
		}
		do {
			System.out.print("		+ Nhap noi den: \t");
			noiden = in.nextLine();
			if (noiden != null && noiden.equals(" ")) {
				System.err.println("		***** Vui long nhap lai ***** ");
			} else {
				System.out.println("			 + noi den la: " + noiden);
				break;
			}
		} while (true);
	}

	public String toString() {
		return super.toString() + ("\t|" + "|\t" + get_noiden() + "\t|" + "|\t" + get_songaydiduoc() + "\n");
	}
}