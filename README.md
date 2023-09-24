
import java.lang.Math;

public class MathCalc {
public static void main(String[] args) {
double e_radius = 3800.0;
double s_radius = 432500.0;

double e_volume = (4.0/3.0) * Math.PI * Math.pow(e_radius, 3);
double s_volume = (4.0/3.0) * Math.PI * Math.pow(s_radius, 3);
double Ratio = s_volume / e_volume;

System.out.println("The volume of the Earth is " + e_volume + " cubic miles, the volume of the Sun is " + s_volume + " cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is " + Ratio + ".");
}
}
