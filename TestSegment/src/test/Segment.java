package test;

public class Segment {
	
	private int  x1,x2;

	public int getX1() {
		return x1;
	}

	public Segment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public Segment(int x1, int x2) {
		super();
		this.x1 = x1;
		this.x2 = x2;
	}
	
	public void ordonne() {
		if (x1>x2) {
			int x=x1;
			x1=x2;
			x2=x;
			
		}
	}
	
	public int getLongueur() {
		ordonne();
		return x2-x1;
	}
	
	public boolean appartient(int x) {
		ordonne();
		return  (x>=x1 && x<=x2);
	}

	@Override
	public String toString() {
		return "Segment [x1=" + x1 + ", x2=" + x2 + "]";
	}
	
	
}
