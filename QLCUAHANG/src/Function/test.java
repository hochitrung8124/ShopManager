package Function;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class test {
	static ArrayList<Product> product_list = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	static Product product = new Product();
	public static void main(String[] args) {
		menu();

	}
	private static void menu() {
		nhapDanhSach();
		while(true) {
			System.out.println("------------MENU------------");
			System.out.println("1. Xuat");
			System.out.println("2. LocTheoGia");
			System.out.println("3. TongTonKho");
			System.out.println("4. GiamGia");
			System.out.println("5. DatHang");
			System.out.println("------------END------------");
			String line = scanner.nextLine();
			switch (line) {
			case "1":	
				xuatDanhSach();
				break;
			case "2":
				locTheoGia(10000, 25000);
				break;
			case "3":
				tongTonKho();
				break;
			case "4":
				giamGia();
				xuatDanhSach();
				break;
			case "5":
				System.out.println(oder());
				break;
			case "0" : 
				return;
			default:
				break;
			}
		}
	}
	
	private static void nhapDanhSach() {
		Product product1  = new Product("Loai1", "Điện thoại", "M0001", "SP1", 20000, 10, "Note");
		Product product2  = new Product("Loai2", "Laptop",     "M0002", "SP2", 25000, 5,  "Note");
		Product product3  = new Product("Loai1", "Điện thoại", "M0003", "SP3", 30000, 8,  "Note");
		Product product4  = new Product("Loai3", "Tai nghe",   "M0004", "SP4", 18000, 15, "Note");
		Product product5  = new Product("Loai2", "Laptop",     "M0005", "SP5", 22000, 12, "Note");
		Product product6  = new Product("Loai1", "Điện thoại", "M0006", "SP6", 27000, 7,  "Note");
		Product product7  = new Product("Loai3", "Tai nghe",   "M0007", "SP7", 32000, 20, "Note");
		Product product8  = new Product("Loai2", "Laptop",     "M0008", "SP8", 21000, 9,  "Note");
		Product product9  = new Product("Loai1", "Điện thoại", "M0009", "SP9", 26000, 6,  "Note");
		Product product10 = new Product("Loai3", "Tai nghe",   "M0010", "SP10", 35000, 25, "Note");
		Product product11 = new Product("Loai2", "Laptop",     "M0011", "SP11", 23000, 30, "Note");



		 // Thêm tất cả vào product_list
	    product_list.add(product1);
	    product_list.add(product2);
	    product_list.add(product3);
	    product_list.add(product4);
	    product_list.add(product5);
	    product_list.add(product6);
	    product_list.add(product7);
	    product_list.add(product8);
	    product_list.add(product9);
	    product_list.add(product10);
	    product_list.add(product11);
		System.out.println("nhap xong du lieu ! "); 
	}
	
	private static void xuatDanhSach() {
		for (Product product : product_list) {
			System.out.println(product.toString());
		}	
	}
	
	private static void locTheoGia(double min, double max){
		ArrayList<Product> new_List = new ArrayList<>();
		for (Product product : product_list) {
			if(product.getPrice() >= min && product.getPrice() <= max) {
				new_List.add(product);
			}
		}	
		new_List.sort(Comparator.comparingDouble(Product::getPrice));
		for (Product product : new_List) {
			System.out.println(product.toString());
		}
	}
	
	private static void tongTonKho(){
		double sum  ;
		for (Product product : product_list) {
			sum = product.getPrice() * product.getQuantity() ;
			System.out.println("Name: " + product.getProductName() + " Sum: " + sum);
		}
	}
	
	private static void giamGia() {
		double priceNew;
		for (Product product : product_list) {
			if(product.getQuantity() >20 && product.getQuantity() <30) {
				priceNew = product.getPrice() - product.getPrice()*0.15 ;
				product.setPrice(priceNew);
			} else 
			if(product.getQuantity() >=30) {
				priceNew = product.getPrice() - product.getPrice()*0.25 ;
				product.setPrice(priceNew);
			}

		}
	}
	
	private static double oder() {
		double sum = 0 ;
		System.out.println("them san pham vao gio hang "); 
		String sp = scanner.nextLine();
		for (Product product : product_list) {
			if(product.getProductName().equals(sp)) {
				System.out.println("nhap so luong ! "); 
				int line = scanner.nextInt();
	            scanner.nextLine();
				sum = line * product.getPrice();
			}
		}
		return sum;
	}
}
