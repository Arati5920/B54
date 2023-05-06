/**date:2/5/2023
 * PrimitiveDatatypesDemo
 * 
 */
package Arati;

/**
 * @author Arati Kumbar
 *
 */
public class PrimitiveDatatypesDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      byte byteMax=127;
      byte byteMin=-128;
     System.out.println("Min range of byte is"+byteMin+"Max range of byte is"+byteMax);
      
     //short-2bytes
     short shortMax=32767;
     short shortMin=-32768;
     System.out.println("Minshort range of byte is"+shortMin+"Maxshort range of byte is"+shortMax);
     
     //int-4bytes
     int MaxInt=2147483647;
     int MinInt=-2147483648;
     System.out.println("Minint range of byte is"+MaxInt+"Maxint range of byte is"+MinInt);
     
     //long-8bytes
     long maxLong=9223372036854775807L;
     long minLong=-9223372036854775808L;
     System.out.println("MinLong range of byte is"+ 
             minLong+"MaxLong range of byte is "+maxLong);
     
     float f=3234.141243278345f;
     double d=5456.141245123445678902345678914f;
      System.out.println("float value is "+f+" double value is "+d);
     
     //boolean
     boolean flag=false;
      System.out.println("boolean value is "+flag);
     
   }

}
