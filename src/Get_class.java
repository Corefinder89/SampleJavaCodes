import java.util.GregorianCalendar;

public class Get_class 
{

   public static void main(String[] args) 
   {

      // create a new ObjectDemo object
      GregorianCalendar cal = new GregorianCalendar();

      // print current time
      System.out.println("" + cal.getTime());

      // print the class of cal
      System.out.println("" + cal.getClass());

      // create a new Integer
      Integer i = new Integer(5);

      // print i
      System.out.println("" + i);

      // print the class of i
      System.out.println("" + i.getClass());
   }
}