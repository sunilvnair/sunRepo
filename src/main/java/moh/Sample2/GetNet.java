package moh.Sample2;

import org.s2n.ddt.util.http.HttpData;
import org.s2n.ddt.util.http.NetSend;

public class GetNet {
 public static void main (String arg[]){
	
	try {
		 HttpData htp = new HttpData();
		 htp.setUrl("https://www.moh.gov.om");
		 String s;		
		s = NetSend.send(htp, "",null,"GET");
		 System.out.println(s);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
 }

}
