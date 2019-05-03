package myPrivate;

public class Display {

	public static void main(String[] args) {
		Ring     ring    =new Ring (3,"áåëûé");
		Triangle triangle=new Triangle (4,4,"êðàñíûé");

		
		
		for ( double i=Math.random()*10; j<10;j++)                               //вывод случайного количества кругов        (с площадью и цветом)
			{System.out.println("Круг  "+ring.color+",  Площадь "+ring.sq);} 
		for ( double j=Math.random()*10; j<10;j++)                               //вывод случайного количества треугольников (с площадью и цветом)
			{System.out.println("Триугольник  "+triangle.color+",  Площадь "+triangle.sq);}
		for ( double j=Math.random()*10; j<10;j++)                               
			{System.out.println("Трапеция  "+trapeze.color+",  Площадь "+trapeze.sq);}
		for ( double j=Math.random()*10; j<10;j++)                               
			{System.out.println("Квадрат  "+square.color+",  Площадь "+square.sq);}
		
		System.out.println(ring.getRadius());                                    // уникальный метод круга
		System.out.println(triangle.getHypotenuse());                            // уникальный метод треугольника
		System.out.println(trapeze.getHeight()); 				 // уникальный метод трапеции
		System.out.println(square.getSide());					 // уникальный метод квадрата
	}																		//Ïî àíàëîãèè áóäåò ïðîïèñàíî ðàíäîì äëÿ òðàïåöèè è êâàäðàòà; äîáàâëåíî óíèêàëüíûå ìåòîäû 					

}
