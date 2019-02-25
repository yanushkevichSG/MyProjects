package by.yanushkevich.action;

import by.yanushkevich.entity.Point3D;


public class VectorLength {
		public Point3D calculateVector(Point3D point1, Point3D point2){
				double oX = point2.getX() - point1.getX();
				double oY = point2.getY() - point1.getY();
				double oZ = point2.getZ() - point1.getZ();
				return new Point3D(oX, oY, oZ);
		}
}
