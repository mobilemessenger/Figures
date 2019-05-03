package myPrivate;

public class Ring {

	  int r, sq;
	  double pi=3.14;
	  String color;
	 
	   	 public  Ring(int r,  String color){
		   this.r=r;
		   this.color=color;
		   sq=(int)pi*r*r;
	   	   }
	   	int getRadius() {return r;}
	   	   
	   	   
}
