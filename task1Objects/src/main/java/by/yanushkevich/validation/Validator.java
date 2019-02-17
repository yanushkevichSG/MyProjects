package by.yanushkevich.validation;

import by.yanushkevich.entity.Point3D;
import by.yanushkevich.exception.CannotCalculateException;

public interface Validator {
	boolean isValid(Point3D[] points) throws CannotCalculateException;
}