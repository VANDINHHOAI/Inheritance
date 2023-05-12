package advance.dev;

public class Teacher extends Person{
	private String mgv;
	private double hsl;
	
	
	public Teacher(String name, int age, int phone, String mgv, double hsl) {
		super(name, age, phone);
		this.mgv = mgv;
		this.hsl = hsl;
	}


	public String getMgv() {
		return mgv;
	}


	public void setMgv(String mgv) {
		this.mgv = mgv;
	}


	public double getHsl() {
		return hsl;
	}


	public void setHsl(double hsl) {
		this.hsl = hsl;
	}
	
	public double tinhLuong() {
		return hsl * 1500000.0;
	}
}
