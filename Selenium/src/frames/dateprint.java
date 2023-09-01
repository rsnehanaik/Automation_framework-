package frames;

import java.util.Date;

public class dateprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d=new Date();
		System.out.println(d);
		String date = d.toString();
		String d1 = date.replaceAll(":","-");
		System.out.println(d1);
		

	}

}
