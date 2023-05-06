//program to demonstrate type casting between primitive types

package Arati;

public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//widening / implicit type casting
		
      byte b=10;
      int i=b;
      System.out.println(i);
      
      float f=22.14f;
      double d=f;
      System.out.println(d);
      
      char ch='A';
      int i3=ch;
      System.out.println(i3);
      
      char var1='\u00A7';
      int i4=var1;
      System.out.println(i3);
      
      //narrowing/explicit type casting
      
      double f1=10.52f;
      long l=(long)f1;
      System.out.println(l);
       
      long ll = 92337236854775806l;
      int i2=(int)ll;
      System.out.println(i2);
      
      float f2=34.56f;
      int i1=(int)f2;
      System.out.println(i1);
      
      
      }

}
