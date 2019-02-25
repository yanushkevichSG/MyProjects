package by.yanushkevich.action;

import by.yanushkevich.entity.Point3D;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class DistanceCalculator {

		public double calculateDistance(Point3D point1, Point3D point2){
				double oX = point2.getX() - point1.getX();
				double oXSquare = pow(oX,2);
				double oY = point2.getY() - point1.getY();
				double oYSquare = pow(oY,2);
				double oZ = point2.getZ() - point1.getZ();
				double oZSquare = pow(oZ,2);
				return (double)Math.round(sqrt(oXSquare + oYSquare + oZSquare));
		}
}
