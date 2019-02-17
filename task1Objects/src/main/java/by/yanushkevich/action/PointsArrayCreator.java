package by.yanushkevich.action;


import by.yanushkevich.entity.Point3D;
import by.yanushkevich.validation.PointsArrayValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PointsArrayCreator {

	private static final Logger LOGGER = LogManager.getLogger(PointsArrayCreator.class);
	private PointsArrayCreator(){}

	private static class PointsArrayCreatorHolder{
		private static final PointsArrayCreator INSTANCE = new PointsArrayCreator();
	}

	public static PointsArrayCreator getInstance(){
		return PointsArrayCreatorHolder.INSTANCE;
	}

	public Point3D[] createPoints(double[] cordinates){

		PointsArrayValidator validator = new PointsArrayValidator();
		if(!validator.isValid(cordinates)) {
			LOGGER.warn("Not valid data for creating Points3D[]: " + Arrays.toString(cordinates));
			return null;
		}

		Point3D[] points = new Point3D[cordinates.length/3];

		for (int i = 0, j =0 ; i < cordinates.length ; i = i+3, ++j){
			double x = cordinates[i];
			double y = cordinates[i+1];
			double z = cordinates[i+2];
			points[j] = new Point3D(x,y,z);
		}
		return points;
	}

	public List<Point3D[]> createPointsList(List<double[]> doubles){
		List<Point3D[]> pointsList = new LinkedList<>();
		for (double[] doubleArray: doubles){
			Point3D[] pointArray = createPoints(doubleArray);
			if(pointArray != null){
				pointsList.add(pointArray);
			}
		}
		return pointsList;
	}
}
