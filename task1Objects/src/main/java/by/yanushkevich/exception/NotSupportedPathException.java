package by.yanushkevich.exception;

import java.io.IOException;

public class NotSupportedPathException extends IOException {
	public NotSupportedPathException(String msg, Throwable exception) {
		super(msg, exception);
	}

}
