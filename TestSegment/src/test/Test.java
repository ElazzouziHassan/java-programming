package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Segment s1=new Segment(12,10);
//		System.out.println(s1.toString());
//		s1.ordonne();
//		System.out.println(s1.toString());
//		System.out.println(s1.appartient(19));
//		System.out.println(s1.getLongueur());
		
		
		Cercle c1=new Cercle(new Point(100,100), new Point(200,200));
		Cercle c2=new Cercle(new Point(130,100), 40);
		
		System.out.println("Perometre C1 :"+ c1.getPerimetre()+" Rayon :" +c1.getR());
		System.out.println("Perometre C2 :"+ c2.getPerimetre()+" Rayon :" +c2.getR());
		Point p=new Point(90,100);
		
		if (c1.appartient(p) && c2.appartient(p)) {
			System.out.println(p.toString()+ "Appartient au intersection de "+c1.toString()+" et "+c2.toString());
		}

	}

}
