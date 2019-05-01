package myPrivate;

public class Display {

	public static void main(String[] args) {
		Ring     ring    =new Ring (3,"White");
		Triangle triangle=new Triangle (4,4,"Red");

		
		
		for ( double i=Math.random()*10; i<10;i++) 
			{System.out.println("Ring  "+ring.color+",  Square  "+ring.sq);} //вывод случайного количества кругов        (с площадью и цветом)
		for ( double j=Math.random()*10; j<10;j++)                               //вывод случайного количества треугольников (с площадью и цветом)
			{System.out.println("Triangle  "+triangle.color+",  Square "+triangle.sq);}
		System.out.println(ring.getRadius());                                    // уникальный метод круга
	}									         // По аналогии будет прописано рандом для трапеции и квадрата; добавлено уникальные методы 								//Ïî àíàëîãèè áóäåò ïðîïèñàíî ðàíäîì äëÿ òðàïåöèè è êâàäðàòà; äîáàâëåíî óíèêàëüíûå ìåòîäû 					

}
