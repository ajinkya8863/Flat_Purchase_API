package FLatSeller;

public class Owner {
	private String name;
	private int flat_size;
	private double flat_price;
	private String phone_number;


//constructor
public Owner(String name,int flat_size, double flat_price, String phone_number)
{
	this.name=name;
	this.flat_size=flat_size;
	this.flat_price=flat_price;
	this.phone_number=phone_number;
	
}
    //getters

public String getName() {
	return name;

	
}
public int getFlat_size() {
	return flat_size;
	
}

public double getFlat_price() {
	return flat_price;
}

public String getPhone_number() {
	return phone_number;
	
}

}