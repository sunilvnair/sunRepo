package moh.Sample2;
import java.text.DecimalFormat;

import org.apache.log4j.BasicConfigurator;
import org.s2n.ddt.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BasicConfigurator.configure();
    	System.out.println( "Hello World!" );
        
      
     //  FileUtils.fileCopy("C:/myXml.xml","C:/apps/myXml12.xml");
    	formatNum(123.589);
    }
    public static String formatNum(int i){
    	DecimalFormat dF = new DecimalFormat("####.##");
    	System.out.println(dF.format(i));
    	return dF.format(i);
    }
    
}
