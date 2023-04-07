package baithi;

import java.util.Scanner;

public class Menu_chuyenxe {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("-- 1/ Noi Thanh");
			System.out.println("-- 2/ Ngoai Thanh");
			System.out.println("-- 3/ Tim Kiem Theo Ten Tat Ca Cac Tai Xe Noi Thanh Va Ngoai Thanh");
			System.out
					.println("-- 4/ Tinh Trung Binh Doan Thu Cua Tat Ca Cac Tai Xe Co Trong Noi Thanh Va Ngoai Thanh");
			System.out.println("====================================================================================");
			System.out.print("moi chon so: \t");
			int luachon = in.nextInt();
			Menu_chuyenxe mn = new Menu_chuyenxe();
			if (luachon == 0) {
				System.exit(0);
			} else {
				switch (luachon) {
				case 1:
					Scanner in1 = new Scanner(System.in);
					while (true) {
						System.out.println("==========-=+=   MENU   =+=-==========");
						System.out.println("-- 1/ Nhap thong tin xe noi thanh");
						System.out.println("-- 2/ Xuat thong tin xe noi thanh");
						System.out.println("-- 3/ Tim kiem theo ten tai xe");
						System.out.println("-- 4/ Sap xep thep ma so chuyen xe");
						System.out.println("-- 5/ Tinh trung binh");
						System.out.println("-- 6/ Them moi tai xe vao danh sach");
						System.out.println("-- 7/ Xoa tai xe ra khoi danh sach");
						System.out.println("-- 0/ Tro lai menu tong");
						System.out.println("=================+++++==============");
						System.out.print("Moi chon so: \t");
						int luachon1 = in1.nextInt();
						if (luachon1 == 0) {
							mn.main(args);
						} else {
							switch (luachon1) {
							case 1:
								quanliChuyenxe.nhap_xe_NT();
								break;
							case 2:
								quanliChuyenxe.xuat_xe_NT();
								break;
							case 3:
								quanliChuyenxe.timkiem_theoten_NT();
								break;
							case 4:
								quanliChuyenxe.sapxeptheoma();
								break;
							case 5:
								quanliChuyenxe.Tinhtb();
								break;
							case 6:
								quanliChuyenxe.themthongtinchuyenxe_NT();
								break;
							case 7:
								quanliChuyenxe.xoataixetheomscx_NT();
								break;
							default:
								System.err.println("kHoNG Co LuA CHoN PHu HoP");
								break;
							}
						}
					}
				case 2:
					Scanner in2 = new Scanner(System.in);
					while (true) {
						System.out.println("============-+=   MENU   =+=-===========");
						System.out.println("-- 1/ Nhap thong tin xe ngoai thanh");
						System.out.println("-- 2/ Xuat thong tin xe ngoai thanh");
						System.out.println("-- 3/ Tim kiem theo ten tai xe");
						System.out.println("-- 4/ Sap xep thep ma so chuyen xe");
						System.out.println("-- 5/ Tinh trung binh");
						System.out.println("-- 6/ Them moi tai xe vao danh sach");
						System.out.println("-- 7/ Xoa tai xe ra khoi danh sach");
						System.out.println("-- 0/ Tro lai menu tong");
						System.out.println("=================++++++++=================");
						System.out.print("moi chon so: \t");
						int luachon2 = in2.nextInt();
						if (luachon2 == 0) {
							mn.main(args);
						} else {
							switch (luachon2) {
							case 1:
								quanliChuyenxe.nhap_xe_NGT();
								break;
							case 2:
								quanliChuyenxe.xuat_xe_NGT();
								break;
							case 3:
								quanliChuyenxe.timkiem_theoten_NGT();
								break;
							case 4:
								quanliChuyenxe.sapxeptheoma();
								break;
							case 5:
								quanliChuyenxe.Tinhtb();
								break;
							case 6:
								quanliChuyenxe.themthongtinchuyenxe_NGT();
								break;
							case 7:
								quanliChuyenxe.xoataixetheomscx_NGT();
								break;
							default:
								System.out.println("kHoNG Co LuA CHoN PHu HoP");
								break;
							}
						}
					}
				case 3:
					quanliChuyenxe.timkiem_theoten(null);
					break;
				case 4:
					quanliChuyenxe.Tinhtb();
					break;
				default:
					System.err.println("kHoNG Co LuA CHoN PHu HoP");
					break;
				}
			}
		}
	}
}