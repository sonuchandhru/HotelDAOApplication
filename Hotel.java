package hoteldao;
import java.util.*;
public class Hotel {
	private int a[][]=new int [5][2];
	String name[]={"idle","dosa","puri","roti","rice"};
	{
	a[0][0]=30;
	a[1][0]=50;
	a[2][0]=20;
	a[3][0]=40;
	a[4][0]=50;
	}
	void setQuantity(int row,int val) {
	a[row][1]=val;
	}
	int getPrice(int i) {
	return a[i][0];
	}
	int getQuantity(int row) {
	return a[row][1];
	}
	}


