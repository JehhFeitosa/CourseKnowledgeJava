package applicaton;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class UsandoAClasseDate {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		//Data atual
		 Date x1 = new Date();
		 Date x2 = new Date();
		
		
		 Date y1 = sdf1.parse("25/06/2018");
		 Date y2 = sdf1.parse("25/06/2018  15:42:07");
		
		//Date no formato iso8601
		 Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("------------------------");
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(sdf1.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println(sdf2.format(y3));
		System.out.println(x1);
		System.out.println(x2);
		System.out.println("------------------------");
		System.out.println(sdf3.format(y1));
		System.out.println(sdf3.format(y2));
		System.out.println(sdf3.format(y3));
		System.out.println(sdf3.format(x1));
		System.out.println(sdf3.format(x2));
		
	}

}
