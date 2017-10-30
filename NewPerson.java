
public class NewPerson extends Person{
	/***************************************************
	 * Created Two Profiles based on their Role, Salary
	 * and Wanted to create Third Profile using previous
	 *  both profile
	 ***************************************************/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Manager();
		p.setName("Vivek");
		p.setAddress("Sanford, FL");
		p.setDob("02/02/1993");
		p.setPhoneNumber(4252291231L);
		p.setRole("Manager");
		p.setSalary(150000);
		
		System.out.println("Manager Profile:\nName: " + p.getName() + "\nPhoneNumber: " + p.getPhoneNumber()
		+ "\nRole: " + p.getRole() + "\nSalary: " + p.getSalary() + "\nAddress: " + p.getAddress() + "\nDOB: " + p.getDob());
		System.out.println();
		
		Person j = new Junior();
		j.setName("Mahant");
		j.setAddress("Leesburg, VA");
		j.setDob("02/02/1992");
		j.setPhoneNumber(4252291232L);
		j.setRole("Junior");
		j.setSalary(50000);
		
		System.out.println("Junior Profile:\nName: " + j.getName() + "\nPhoneNumber: " + j.getPhoneNumber()
		+ "\nRole: " + j.getRole() + "\nSalary: " + j.getSalary() + "\nAddress: " + j.getAddress() + "\nDOB: " + j.getDob());
		System.out.println();
		
		Person n = new NewPerson();
		n.setName(p.getName());
		n.setAddress(j.getAddress());
		n.setDob(p.getDob());
		n.setPhoneNumber(p.getPhoneNumber());
		n.setRole(j.getRole());
		n.setSalary(j.getSalary());
		
		System.out.printf("New Person Profile:\nName: " + n.getName() + "\nPhoneNumber: " + n.getPhoneNumber()
		+ "\nRole: " + n.getRole() + "\nSalary: " + n.getSalary() + "\nAddress: " + n.getAddress() + "\nDOB: " + n.getDob());
		
	}

}
