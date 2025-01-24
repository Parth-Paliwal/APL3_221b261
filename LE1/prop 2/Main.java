/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	Mother m= new Mother ( );
  // show of Mother is called
 System.out.println(m.show());
 Child ch=new Child ( ); 
  // show ( ) inherited in Child from Mother is calle
 System.out.println(ch. show());
	}
}