/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		Bevrage b = new Wisky();
		b.templateMethod();
		b= new Rum();
		b.templateMethod();
	}
}