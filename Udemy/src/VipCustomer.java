
public class VipCustomer {
	private String name;
	private double limit;
	private String email;
	public VipCustomer() {
		this("Default", 500.00, "s@mail");
		System.out.println("Empty constructor called:");
	}
	public VipCustomer(String name, double limit) {
		this.name = name;
		this.limit = limit;
		System.out.println("Constructor 1 called:");
	}
	public VipCustomer(String name, double limit, String email) {
		this.name = name;
		this.limit = limit;
		this.email = email;
		System.out.println("Constructor 2 called:");
	}
	public String getName() {
		return name;
	}
	public double getLimit() {
		return limit;
	}
	public String getEmail() {
		return email;
	}
	public static void main(String args[]) {
		VipCustomer vc = new VipCustomer();
		System.out.println(vc.getName());
		System.out.println(vc.getLimit());
		System.out.println(vc.getEmail());
		VipCustomer vc1 = new VipCustomer("Sneha", 20000.00);
		System.out.println(vc1.getName());
		System.out.println(vc1.getLimit());
		VipCustomer vc2 = new VipCustomer("Surbhi", 12000.00, "surbhi@gmail.com");
		System.out.println(vc2.getName());
		System.out.println(vc2.getLimit());
		System.out.println(vc2.getEmail());
	}
	
}
