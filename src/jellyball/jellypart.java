package jellyball;

public class jellypart {
double x;
double y;
double xvel=0;
double yvel=0;
double xtarg;
double ytarg;
	public jellypart(double a, double b) {
		x=500;
		y=500;
		xtarg=a;
		ytarg=b;
	}
	public void step(double mx, double my){
		xvel = xvel+(x-xtarg)/Math.sqrt((Math.abs(x)-Math.abs(xtarg)*Math.abs(x)-Math.abs(xtarg))+(Math.abs(y)-Math.abs(ytarg)*Math.abs(y)-Math.abs(ytarg)));
		yvel = yvel+(y-ytarg)/Math.sqrt((Math.abs(x)-Math.abs(xtarg)*Math.abs(x)-Math.abs(xtarg))+(Math.abs(y)-Math.abs(ytarg)*Math.abs(y)-Math.abs(ytarg)));
		
		
	}

}
