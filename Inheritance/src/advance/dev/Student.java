package advance.dev;

public class Student extends Person{
	
	private double toan;
	private double ly;
	private double hoa;
	private String msv;
	private String className;
	
	
	public Student(String name, int age, int phone, double toan, double ly, double hoa, String msv, String className) {
		super(name, age, phone);
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;
		this.msv = msv;
		this.className = className;
	}
	

	
	
	public double getToan() {
		return toan;
	}




	public void setToan(double toan) {
		this.toan = toan;
	}




	public double getLy() {
		return ly;
	}




	public void setLy(double ly) {
		this.ly = ly;
	}




	public double getHoa() {
		return hoa;
	}




	public void setHoa(double hoa) {
		this.hoa = hoa;
	}




	public String getMsv() {
		return msv;
	}




	public void setMsv(String msv) {
		this.msv = msv;
	}




	public String getClassName() {
		return className;
	}




	public void setClassName(String className) {
		this.className = className;
	}




	public double diemTrungBinh() {
		return (toan + ly + hoa) / 3.0;
	}
	
}
