package hoteldao;

import java.util.Scanner;

public class Hotel_imple implements HotelInterface {
	public void menu(Hotel h) {
		for(int i=0;i<5;i++) {
		System.out.println(i+1+"." +" "+h.name[i]+" "+ h.getPrice(i));
		}
		System.out.println("Select 6 for bill");
		}
		public void bill(Hotel h) {
		System.out.println("Item Quantity Price Total") ; 
		
		for(int i=0;i<5;i++) {
		if(h.getQuantity(i)>0)
		System.out.println(h.name[i]+" "+h.getQuantity(i)+" "+ h.getPrice(i)+" "+h.getQuantity(i)*h.getPrice(i)) ;
		}
		System.out.println("GST 18%");
		float total=0;
		for(int i=0;i<5;i++){
		total=total+(h.getQuantity(i)* h.getPrice(i));
		}
		System.out.println("cost="+total);
		float bill=total+(total*0.18f);
		System.out.println(" Total Bill="+bill) ;
		}
		public void takeOrder(Hotel h,int c) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number plates");
		try {
		int q=scan.nextInt();
		if(q<1) {
		throw new NoOfPlatesException();
		}
		else {
		int z=h.getQuantity(c-1);
		z=z+q;
		h.setQuantity(c-1, z);
		}
		}
		catch(NoOfPlatesException e) {
		System.out.println(e.getMessage());
		}
		}
		}

