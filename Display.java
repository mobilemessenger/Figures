package myPrivate;

public class Display {

	public static void main(String[] args) {
		Ring     ring    =new Ring (3,"�����");
		Triangle triangle=new Triangle (4,4,"�������");

		
		
		for ( double i=Math.random()*10; i<10;i++) 
			{System.out.println("����  "+ring.color+",  ������� "+ring.sq);} //����� ���������� ���������� ������        (� �������� � ������)
		for ( double j=Math.random()*10; j<10;j++)                           //����� ���������� ���������� ������������� (� �������� � ������)
			{System.out.println("�����������  "+triangle.color+",  ������� "+triangle.sq);}
		System.out.println(ring.getRadius());                               // ���������� ����� �����
	}																		//�� �������� ����� ��������� ������ ��� �������� � ��������; ��������� ���������� ������ 					

}
