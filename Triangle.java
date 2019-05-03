package myPrivate;

public class Triangle {
	   int a,b, sq;
	   String color;
	 
	   	   Triangle(int a, int b, String color){
		   this.a=a;
		   this.b=b;
		   this.color=color;
		   sq=(a*b)/2;
	   }
	   	int getHypotenuse() {return (int) Math.sqrt(a*a+b*b);}
	   	   
	 

	}


