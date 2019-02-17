package by.yanushkevich.validation;

public class PointsArrayValidator {
	public boolean isValid(double[] cordinates){
		return cordinates.length%3 == 0
				&& cordinates.length != 0;
	}
}
