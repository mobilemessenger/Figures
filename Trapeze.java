package myPrivate;

public class Trapeze {

	int a,b,h, sq;
	   String color;
	 
	   	   Trapeze(int a,int b,int h, String color){
		   this.a=a;
		   this.a=b;
		   this.a=h;
		   this.color=color;
		   sq=(int) ((a+b)*0.5*h);
	   }
	   	int getHeight() {return a;}
}
