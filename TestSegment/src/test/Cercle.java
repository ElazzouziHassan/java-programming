package test;

public class Cercle {
	
	private Point centre;
	private int r;
	public Point getCentre() {
		return centre;
	}
	public void setCentre(Point centre) {
		this.centre = centre;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public Cercle(Point centre, int r) {
		super();
		this.centre = centre;
		this.r = r;
	}
	
	public Cercle(Point centre, Point p) {
		super();
		this.centre = centre;
		this.r =  (int)Math.sqrt(Math.pow(centre.getX()-p.getX(), 2)+Math.pow(centre.getY()-p.getY(), 2));
	}
	public double getPerimetre() {
		return 2*Math.PI*r;
	}
	
	public boolean appartient( Point p) {
		int dis=(int)Math.sqrt(Math.pow(centre.getX()-p.getX(), 2)+Math.pow(centre.getY()-p.getY(), 2));
		return(r>=dis) ;
	}
	public double getSurface() {
		return (r*r*Math.PI);
	}
	@Override
	public String toString() {
		return "Cercle [centre=" + centre.toString() + ", r=" + r + "]";
	}
	

	
	
	

}
