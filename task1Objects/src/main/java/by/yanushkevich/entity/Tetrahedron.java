package by.yanushkevich.entity;

import by.yanushkevich.exception.CannotCalculateException;

import java.util.Arrays;

public class Tetrahedron extends Shape {

		private final Point3D[] points;

		public Tetrahedron(int id, Point3D[] points){

				super(id);
				this.points = points;
		}

		public Point3D getPoint(int pointNumber){
				return points[pointNumber];
		}

		public void setPoint(Point3D point, int pointNumber) throws CannotCalculateException {
				points[pointNumber] = point;
		}

		public Point3D[] getAllPoints(){
				return Arrays.copyOf(this.points,this.points.length);
		}

		@Override
		public boolean equals(Object o) {
				if (this == o) return true;
				if (o == null || getClass() != o.getClass()) return false;
				if (!super.equals(o)) return false;
				Tetrahedron that = (Tetrahedron) o;
				return Arrays.equals(points, that.points);
		}

		@Override
		public int hashCode() {
				int result = super.hashCode();
				result = 31 * result + Arrays.hashCode(points);
				return result;
		}

		@Override
		public String toString() {
				return "Tetrahedron{" +
								"points=" + Arrays.toString(points) +
								'}';
		}
}

