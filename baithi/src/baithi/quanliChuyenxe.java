package baithi;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class quanliChuyenxe {
private static final baithi.ngoaithanh NGT = null;
// Nhập thông tin xe nội thành
	static ArrayList<noithanh> noithanh = new ArrayList<>();
	
	public static void nhap_xe_NT() {
		Scanner in = new Scanner(System.in);
		int sochuyenxe_NT;
		System.out.print("Nhap so chuyen xe noi thanh: \t");
		sochuyenxe_NT = Integer.parseInt(in.nextLine());
		System.out.println("* Nhap thong tin chuyen xe ");
		for (int i = 0; i < sochuyenxe_NT; i++) {
			System.out.println("	- Nhap chuyen xe thu " + (i + 1) + ":");
			noithanh NT = new noithanh();
			NT.Nhap();
			noithanh.add(NT);
		}
	}

// Xuất thông tin xe nội thành	
	public static void xuat_xe_NT() {
		System.out.println("Xuat cac chuyen xe noi thanh: \n");
		System.out.print(
				"Ho ten tai xe \t||\t Ma so chuyen xe \t||\t So xe \t||\t Doanh thu \t||\t So tuyen \t||\t So km di duoc \n");
		for (int i = 0; i < noithanh.size(); i++) {
			System.out.println(noithanh.get(i).toString());
		}
	}

// Tìm kiếm các tài xế theo tên trong nội thành	
	public static void timkiem_theoten_NT() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap ten tai xe can tim: \t");
		String ten = in.nextLine();
		noithanh Found = null;
		for (noithanh o : noithanh) {
			if (o.get_hotentaixe().equalsIgnoreCase(ten)) {
				Found = o;
				break;
			}
		}
		if (Found != null) {
			System.out.println("Ten tai xe can tim kiem: \n" + Found.toString());
		} else {
			System.err.println("!!!!! Khong tim thay ten tai xe !!!!!");
		}
	}

// Thêm vào danh sách 1 tài xế xe nội thành
	public static void themthongtinchuyenxe_NT() {
		Scanner in = new Scanner(System.in);
		System.out.println("Them thong tin chuyen xe noi thanh");
		System.out.println("++++++++++++++++++++++++++++++++++");

		System.out.print("	- Nhap ho ten tai xe: \t");
		String hotentaixe = in.nextLine();

		System.out.print("	- Nhap ma so chuyen xe: \t");
		String masochuyenxe = in.nextLine();

		System.out.print("	- Nhap so xe: \t");
		String soxe = in.nextLine();

		System.out.print("	- Nhap doanh thu: \t");
		float doanhthu = Float.parseFloat(in.nextLine());

		System.out.print("	- Nhap so tuyen: \t");
		int sotuyen = Integer.parseInt(in.nextLine());

		System.out.print("	- Nhap so km di duoc: \t");
		float sokmdiduoc = Float.parseFloat(in.nextLine());

		for (noithanh o : noithanh)
		{
			if (o.get_masochuyenxe() != masochuyenxe)
			{
				noithanh NT = new noithanh(masochuyenxe, hotentaixe, soxe, doanhthu, sotuyen, sokmdiduoc);
				noithanh.add(NT);
				break;
			}
			else
			{
				System.err.println("\\\\\\___ Ma da ton tai ___//////");
			}
		}
		//Sắp xếp
		Collections.sort(noithanh, new Comparator<noithanh>() 
		{	
			public int compare(noithanh a1, noithanh a2) 
			{
				// TODO Auto-generated method stub
				return a1.get_masochuyenxe().compareTo(a2.get_masochuyenxe());
			}	
		});
		System.out.println("Sau khi sap xep: \n");
		for(noithanh o : noithanh) 
		{
			System.out.println(o.toString());
		}
	}

// Xóa tài xế trong danh sách nội thành
	public static void xoataixetheomscx_NT() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap ma so chuyen xe cua tai xe can xoa: \t");
		String ma = in.nextLine();
		noithanh Found = null;
		for (noithanh o : noithanh) {
			if (o.get_masochuyenxe().equalsIgnoreCase(ma)) {
				Found = o;
				break;
			}
		}
		if (Found != null) {
			noithanh.remove(Found);
			System.out.println("Da xoa thanh cong");
		} else {
			System.err.println("Nhan vien co ma %s khong tim thay trong danh sach \n");
		}
	}

// Nhập thông tin xe ngoại thành
	static ArrayList<ngoaithanh> ngoaithanh = new ArrayList<>();

	public static void nhap_xe_NGT() {
		Scanner in = new Scanner(System.in);
		int sochuyenxe_NGT;
		System.out.print("Nhap so chuyen xe ngoai thanh: ");
		sochuyenxe_NGT = Integer.parseInt(in.nextLine());
		System.out.println("* Nhap thong tin chuyen xe");
		for (int i = 0; i < sochuyenxe_NGT; i++) {
			System.out.println("	- Nhap chuyen xe thu " + (i + 1) + ":");
			ngoaithanh NGT = new ngoaithanh();
			NGT.Nhap();
			ngoaithanh.add(NGT);
		}
	}

// Xuất thông tin xe ngoại thành
	public static void xuat_xe_NGT() {
		System.out.println("Xuat cac chuyen xe ngoai thanh: \n");
		System.out.print(
				"Ho ten tai xe \t||\t Ma so chuyen xe \t||\t So xe \t||\t Doanh thu \t||\t Noi den \t||\t So ngay di duoc \n");
		for (int i = 0; i < ngoaithanh.size(); i++) {
			System.out.println(ngoaithanh.get(i).toString());
		}
	}

// Tìm kiếm các tài xế theo tên trong ngoại thành
	public static void timkiem_theoten_NGT() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap ten tai xe can tim: \t");
		String ten = in.nextLine();
		ngoaithanh Found1 = null;
		for (ngoaithanh o1 : ngoaithanh) {
			if (o1.get_hotentaixe().equalsIgnoreCase(ten)) {
				Found1 = o1;
				break;
			}
		}
		if (Found1 != null) {
			System.out.println("Ten tai xe can tim kiem: \n" + Found1.toString());
		} else {
			System.err.println("--- Khong tim thay ten tai xe ---");
		}
	}

// Thêm vào danh sách 1 tài xế xe ngoại thành
	public static void themthongtinchuyenxe_NGT() {
		Scanner in1 = new Scanner(System.in);
		System.out.println("Them thong tin chuyen xe ngoai thanh");
		System.out.println("++++++++++++++++++++++++++++++++++++");

		System.out.print("	- Nhap ho ten tai xe: \t");
		String hotentaixe = in1.nextLine();

		System.out.print("	- Nhap ma so chuyen xe: \t");
		String masochuyenxe = in1.nextLine();

		System.out.print("	- Nhap so xe: \t");
		String soxe = in1.nextLine();

		System.out.print("	- Nhap doanh thu: \t");
		float doanhthu = Float.parseFloat(in1.nextLine());

		System.out.print("	- Nhap noi den: \t");
		String noiden = in1.nextLine();

		System.out.print("	- Nhap so ngay di duoc: \t");
		float songaydiduoc = Float.parseFloat(in1.nextLine());
		
		ngoaithanh NGT = new ngoaithanh(masochuyenxe, hotentaixe, soxe, doanhthu, noiden, songaydiduoc);
		ngoaithanh.add(NGT);
	}

// Xóa tài xế trong danh sách ngoại thành
	public static void xoataixetheomscx_NGT() {
		Scanner in1 = new Scanner(System.in);
		System.out.println("Nhap ma so chuyen xe cua tai xe can xoa: \t");
		String ma1 = in1.nextLine();
		ngoaithanh Found1 = null;
		for (ngoaithanh o1 : ngoaithanh) {
			if (o1.get_masochuyenxe().equalsIgnoreCase(ma1)) {
				Found1 = o1;
				break;
			}
		}
		if (Found1 != null) {
			ngoaithanh.remove(Found1);
			System.out.println("Da xoa thanh cong");
		} else {
			System.err.println("Nhan vien co ma %s khong tim thay trong danh sach \n");
		}
	}

//tìm kiếm theo tên tài xế cả nội và ngoại thành
	// Nội thành
	public static void timkiem_theoten(String hotentaixe) {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap ten tai xe can tim: \t");
		String ten = in.nextLine();
		noithanh Found = null;
		for (noithanh o : noithanh) {
			if (o.get_hotentaixe().equalsIgnoreCase(ten)) {
				Found = o;
				break;
			}
		}
		if (Found != null) {
			System.out.println("Ten tai xe can tim kiem: \n" + Found.toString());
		} else {
			System.err.println("--- Khong tim thay ten tai xe ---");
		}
		// Ngoại thành
		ngoaithanh Found1 = null;
		for (ngoaithanh o1 : ngoaithanh) {
			if (o1.get_hotentaixe().equalsIgnoreCase(ten)) {
				Found1 = o1;
				break;
			}
		}
		if (Found1 != null) {
			System.out.println("Ten tai xe can tim kiem: \n" + Found1.toString());
		} else {
			System.err.println("!!!!! Khong tim thay ten tai xe !!!!!");
		}
	}

//sắp xếp theo mã số chuyến xe	
	public static void sapxeptheoma() {
		// nội thành
		Collections.sort(noithanh, new Comparator<noithanh>() {
			public int compare(noithanh o1, noithanh o2) {
				// TODO Auto-generated method stub
				return o1.get_masochuyenxe().compareTo(o2.get_masochuyenxe());
			}
		});
		System.out.println("Sau khi sap xep: \n");
		for (noithanh o : noithanh) {
			System.out.println(o.toString());
		}

		// ngoại thành
		Collections.sort(ngoaithanh, new Comparator<ngoaithanh>() {
			public int compare(ngoaithanh o1, ngoaithanh o2) {
				// TODO Auto-generated method stub
				return o1.get_masochuyenxe().compareTo(o2.get_masochuyenxe());
			}
		});
		System.out.println("Sau khi sap xep: \n");
		for (ngoaithanh o : ngoaithanh) {
			System.out.println(o.toString());
		}
	}

// Tính tổng trung bình thu nhập của các tài xế

//tính trung bình thu nhập của các chuyến xe
	public static void Tinhtb() {
		float tong = 0;
		float tb = 0;
		// nội thành
		for (int i = 0; i < noithanh.size(); i++) {
			tong += noithanh.get(i).get_doanhthu();
		}
		tb = tong / noithanh.size();
		System.out.println("Trung binh " + tb);
		// ngoại thành
		for (int i = 0; i < ngoaithanh.size(); i++) {
			tong += ngoaithanh.get(i).get_doanhthu();
		}
		tb = tong / ngoaithanh.size();
		System.out.println("Trung binh " + tb);
	}
}