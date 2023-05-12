package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] p = new Person[3];
		
		input(p);
		print(p);
		findTeacher(p);
		findStudent(p);
	}

	private static void findStudent(Person[] p) {
		// TODO Auto-generated method stub
		double maxAvgScore = 0.0;
		int maxAvgScoreIndex = -1;
		
		for (int i = 0; i < p.length; i++) {
			if (p[i] instanceof Student) {
				Student student = (Student) p[i];
				double avgScore = student.diemTrungBinh();
				
				if (avgScore > maxAvgScore) {
					maxAvgScore = avgScore;
					maxAvgScoreIndex = i;
				}
			}
		}
		
		if(maxAvgScore != -1) {
			Student student = (Student) p[maxAvgScoreIndex];
			System.out.println("Sinh vien co diem trung binh cao nhat la:");
			System.out.println("Ten: " + student.getName());
			System.out.println("Ma sinh vien: " + student.getMsv());
			System.out.println("Lop: " + student.getClassName());
			System.out.println("Diem Toan: " + student.getToan());
			System.out.println("Diem Hoa: " + student.getLy());
			System.out.println("Diem Ly: " + student.getHoa());
			System.out.println("Diem Trung binh: " + student.diemTrungBinh());
		}else {
			System.out.println("Khong tim thay sinh vien nao.");
		}
	}

	private static void findTeacher(Person[] p) {
		// TODO Auto-generated method stub
		double maxSalary = 0.0;
		int maxSalaryIndex = -1;
		
		for (int i = 0; i < p.length; i++) {
			if (p[i] instanceof Teacher) {
				Teacher teacher = (Teacher) p[i];
				double salary = teacher.tinhLuong();
				
				if (salary > maxSalary) {
					maxSalary = salary;
					maxSalaryIndex = i;
				}
			}
		}
		
		if (maxSalaryIndex != -1) {
			Teacher teacher = (Teacher) p[maxSalaryIndex];
			System.out.println("Giao vien co luong cao nhat la:");
			System.out.println("Ten: " + teacher.getName());
			System.out.println("Ma giao vien: " + teacher.getMgv());
			System.out.println("He so luong: " + teacher.getHsl());
			System.out.println("Luong: " + teacher.tinhLuong());
		}else {
			System.out.println("Khong tim thay giao vien nao.");
		}
	}

	private static void print(Person[] p) {
		// TODO Auto-generated method stub
		for (int i = 0; i < p.length; i++) {
			if (p[i] instanceof Teacher) {
				Teacher teacher = (Teacher) p[i];
				System.out.println("Thong tin giao vien thu " + (i + 1) + ": ");
				System.out.println("Ten: " + teacher.getName());
				System.out.println("Tuoi: " + teacher.getAge());
				System.out.println("So dien thoai: " + teacher.getPhone());
				System.out.println("Ma giao vien: " + teacher.getMgv());
				System.out.println("He so luong: " + teacher.getHsl());
				System.out.println("Luong: " + teacher.tinhLuong());
			}else {
				Student student = (Student) p[i];
				System.out.println("Thong tin sinh vien thu " + (i - 1) + ": ");
				System.out.println("Ten: " + student.getName());
				System.out.println("Tuoi: " + student.getAge());
				System.out.println("So dien thoai: " + student.getPhone());
				System.out.println("Ma sinh vien: " + student.getMsv());
				System.out.println("Lop: " + student.getClassName());
				System.out.println("Diem trung binh: " + student.diemTrungBinh());
			}
		}
	}

	private static void input(Person[] p) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < p.length; i++) {
			System.out.println("Nhap thong tin nguoi thu " + (i + i));
			System.out.println("Ten: ");
			String name = sc.nextLine();
			System.out.println("Tuoi: ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("So dien thoai: ");
			int phone = sc.nextInt();
			sc.nextLine();
			
			if (i < 1) {
				System.out.println("Ma giao vien: ");
				String mgv = sc.nextLine();
				System.out.println("He so luong: ");
				double hsl = sc.nextDouble();
				sc.nextLine();
				
				p[i] = new Teacher(name, age, phone, mgv, hsl);
			}else {
				System.out.println("Ma sinh vien: ");
				String msv = sc.nextLine();
				System.out.println("Lop: ");
				String className = sc.nextLine();
				System.out.println("Diem Toan ");
				double toan = sc.nextDouble();
				sc.nextLine();
				System.out.println("Diem Ly ");
				double ly = sc.nextDouble();
				sc.nextLine();
				System.out.println("Diem Hoa ");
				double hoa = sc.nextDouble();
				sc.nextLine();
				
				p[i] = new Student(name, age, phone, toan, ly, hoa, msv, className);
			}
		}
	}

}
