package javainterview;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import static java.lang.System.*;;

public class DateExp {

	public static void main(String[] args) {
	
          Date d=new Date();;
          out.println(d);;
          SimpleDateFormat sdf=new SimpleDateFormat("dd-MMMM-YYYY");
      String date=    sdf.format(d);
      out.println(date);
	}

}
