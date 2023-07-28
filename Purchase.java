package FLatSeller;

import java.util.Scanner;

public class Purchase {

	public static void main(String []args) {
		
		Owner[] flatowners= {
		
				new Owner("ajinkya",1500,80000,"988888888"),
				new Owner("aniket",1000,50000,"888888888"),
				new Owner("rohit",4000,30000,"9999999999"),
		
	};
		
		
		//get users requirement.
				Scanner sc=new Scanner(System.in);
				System.out.println(" enter the desired flat size in a sq.feet:");
				
				int desiredSize=sc.nextInt();
				
				System.out.println("enter the maximum flat price:");
				double desirable_flat_price=sc.nextDouble();
				
				for (Owner owners :flatowners ) {
					if (owners.getFlat_size()== desiredSize && owners.getFlat_price()<=desirable_flat_price) {
						System.out.println("matching flat found!");
						System.out.println("flat owner name :" +owners.getName()); 
						System.out.println("flat owners phone number:" +owners.getPhone_number());
						
						
						}
					else {
						System.out.println("Match not found!");
					}
					
					
				}
			}

		}

