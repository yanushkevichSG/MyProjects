package by.yanushkevich.action;

import by.yanushkevich.entity.Point3D;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class PointsArrayCreatorTest {
	private final  PointsArrayCreator creator = PointsArrayCreator.getInstance();

	@Test
	public void NotValidDataArray(){
		double[] firsTestData = {1, 2, 3, 4, 5, 6, 7, 8};
		Point3D[] testArray = {new Point3D(1,2, 3), new Point3D(4,5,6), new Point3D(7,8, 9)};

		Point3D[] resultArray = creator.createPoints(firsTestData);

		Assert.assertEquals(testArray, resultArray);
	}

	@Test
	public void ValidDataArray() {
		double[] firsTestData = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Point3D[] testArray = {new Point3D(1,2, 3), new Point3D(4,5,6), new Point3D(7,8, 9)};

		Point3D[] resultArray = creator.createPoints(firsTestData);

		Assert.assertEquals(testArray, resultArray);
	}



	@Test
	public void ValidFourPointsArray() {
		List<double[]> pointsCordinates = new ArrayList<>();
		pointsCordinates.add(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
		pointsCordinates.add(new double[]{3, 2, 1, 4, 5, 2, 1, 5, 6});
		pointsCordinates.add(new double[]{4, 5, 2, 4, 46, -4, 1, 4, 9});
		pointsCordinates.add(new double[]{-2, 41, 2, 3, -4, 4, 0, 2, 4});
		List<Point3D[]> testData = new ArrayList<>();
		testData.add(new Point3D[]{new Point3D(1, 2, 3),new Point3D(4,5, 6), new Point3D(7, 8, 9)});
		testData.add(new Point3D[]{new Point3D(3, 2, 1),new Point3D(4, 5, 2), new Point3D(1, 5, 6)});
		testData.add(new Point3D[]{new Point3D(4,5, 2),new Point3D(4,46, -4), new Point3D(1, 4, 9)});
		testData.add(new Point3D[]{new Point3D(-2, 41, 2),new Point3D(3,-4, 4), new Point3D(0, 2, 4)});

		List<Point3D[]> pointsList = creator.createPointsList(pointsCordinates);

		Assert.assertEquals(4, pointsList.size());
		Assert.assertEquals(testData.get(0), pointsList.get(0));
		Assert.assertEquals(testData.get(1), pointsList.get(1));
		Assert.assertEquals(testData.get(2), pointsList.get(2));
		Assert.assertEquals(testData.get(3), pointsList.get(3));
	}




}
