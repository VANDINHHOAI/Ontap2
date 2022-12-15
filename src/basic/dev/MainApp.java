package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// Phan_1
		// bai_1
		System.out.print("Nhap ten: ");
		String name = sc.nextLine();
		System.out.print("Nhap nam sinh: ");
		int age = sc.nextInt();

		System.out.print("Ho va ten: " + name);
		System.out.print("Tuoi: " + (2022 - age));

		// bai_2
		System.out.print("Nhap diem toan: ");
		int t = sc.nextInt();
		System.out.print("Nhap diem ly: ");
		int l = sc.nextInt();
		System.out.print("Nhap diem van: ");
		int v = sc.nextInt();

		int trung_binh = (t + l + v) / 3;
		System.out.println("Diem trung binh: " + trung_binh);

		// bai_3
		System.out.print("Nhap canh a: ");
		int a = sc.nextInt();
		System.out.print("Nhap canh b: ");
		int b = sc.nextInt();

		int chu_vi = (a + b) * 2;
		int dien_tich = a * b;
		System.out.print("Chu vi hinh chu nhat: " + chu_vi);
		System.out.print("Dien tich hinh chu nhat: " + dien_tich);

		// bai_4
		System.out.print("Nhap n: ");
		float n = sc.nextFloat();
		System.out.print("Nhap m: ");
		float m = sc.nextFloat();
		tinh(n, m);

		// bai_5
		int num1, num2, num3;
		System.out.print("Nhap so thu nhat: ");
		num1 = sc.nextInt();
		System.out.print("Nhap so thu hai: ");
		num2 = sc.nextInt();
		System.out.print("Nhap so thu ba: ");
		num3 = sc.nextInt();
		min(num1, num2, num3);
		max(num1, num2, num3);

		// bai_6

		System.out.print("Nhap h:");
		int h = sc.nextInt();
		System.out.print("Nhap k: ");
		int k = sc.nextInt();

		chia_het(h, k);

		// Phan_2

		// bai_1
		System.out.print("Nhap vao mot so nguyen: ");
		int so_nguyen = sc.nextInt();
		check_chan_le(so_nguyen);

		System.out.print("Nhap vao mot so nguyen: ");
		int sum = sc.nextInt();
		tong_n(sum);

		// bai_2

		System.out.print("Nhap co chia het cho 5: ");
		int chia_5 = sc.nextInt();
		chia_het_cho_5(chia_5);

		System.out.print("Nhap vao mot so nguyen: ");
		int u = sc.nextInt();
		cong(u);

		// bai_4
		System.out.print("Nhap so tinh giai thua: ");
		int x = sc.nextInt();
		giai_thua(x);

		// bai_6

		int month;
		do {
			System.out.print("Nhap vao mot thang: ");
			month = sc.nextInt();
		} while (month <= 0 && month > 12);

		switch (month) {
		case 1:
			System.out.println("Day la thang mot");
			break;
		case 2:
			System.out.println("Day la thang hai");
			break;
		case 3:
			System.out.println("Day la thang ba");
			break;
		case 4:
			System.out.println("Day la thang bon");
			break;
		case 5:
			System.out.println("Day la thang nam");
			break;
		case 6:
			System.out.println("Day la thang sau");
			break;
		case 7:
			System.out.println("Day la thang bay");
			break;
		case 8:
			System.out.println("Day la thang tam");
			break;
		case 9:
			System.out.println("Day la thang chin");
			break;
		case 10:
			System.out.println("Day la thang muoi");
			break;
		case 11:
			System.out.println("Day la thang muoi mot");
			break;
		case 12:
			System.out.println("Day la thang muoi hai");
			break;
		}
		// Phan_3
		// bai_3
		
		System.out.print("Nhap so: ");
		int o = sc.nextInt();
		tinh_tong_chan(o);
		
		// bai_4
		System.out.print("Nhap so: ");
		int d = sc.nextInt();
		tinh_tong_le(d);
		
		// bai_6
		
		System.out.print("Nhap so: ");
		int q = sc.nextInt();
		tinh_tong(q);
	}

	private static void tinh_tong(int q) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i < q; i++) {
			sum += i;
		}
		System.out.println("Tong cac so le nho hon hoac bang n: " + sum);
	}

	private static void tinh_tong_le(int d) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= d; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println("Tong cac so le nho hon hoac bang n: " + sum);
	}

	private static void tinh_tong_chan(int o) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= o; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("Tong cac so chan nho hon hoac bang n: " + sum);
	}

	private static void giai_thua(int x) {
		// TODO Auto-generated method stub
		int giaiThua = 1;
		for (int i = 1; i <= x; i++) {
			giaiThua *= i;
		}
		System.out.println("Giai thua: " + giaiThua);
	}

	private static void cong(int u) {
		// TODO Auto-generated method stub
		float sum = 0;
		for (int i = 2; i <= u; i++) {
			sum += 1.0 / i;
		}
		System.out.println("Tong = " + sum);
	}

	private static void chia_het_cho_5(int chia_5) {
		// TODO Auto-generated method stub
		if (chia_5 % 5 == 0) {
			System.out.println("Chia het cho 5");
		} else {
			System.out.println("Khong chia het cho 5");
		}
	}

	private static void tong_n(int sum) {
		// TODO Auto-generated method stub
		int mySum = 0;
		for (int i = 1; i <= sum; i++) {
			mySum += i;
		}
		System.out.println("Tong = " + mySum);
	}

	private static void check_chan_le(int so_nguyen) {
		// TODO Auto-generated method stub
		if (so_nguyen % 2 == 0) {
			System.out.println("So chan");
		} else {
			System.out.println("So le");
		}
	}

	private static void chia_het(int h, int k) {
		// TODO Auto-generated method stub
		if (h % k == 0) {
			System.out.println(h);
		} else if (k % h == 0) {
			System.out.println(k);
		} else {
			System.out.println("So nay khong chia het cho so kia va nguoc lai!");
		}
	}

	private static void max(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("So lon nhat: " + num1);
		} else if (num2 >= num3) {
			System.out.println("So lon nhat: " + num2);
		} else {
			System.out.println("So lon nhat: " + num3);
		}
	}

	private static void min(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		if (num1 <= num2 && num1 <= num3) {
			System.out.println("So nho nhat: " + num1);
		} else if (num2 <= num3) {
			System.out.println("So nho nhat: " + num2);
		} else {
			System.out.println("So nho nhat: " + num3);
		}
	}

	private static void tinh(float n, float m) {
		// TODO Auto-generated method stub
		System.out.println("Tong = " + (n + m));
		System.out.println("Hieu = " + (n - m));
		System.out.println("Tich = " + (n * m));
		System.out.println("Thuong = " + (n / m));
	}

}
