package by.yanushkevich.reader;

import by.yanushkevich.exception.NotSupportedPathException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.List;

import static org.testng.Assert.*;

public class DataReaderTest {
	private final DataReader reader = new DataReader();


	@Test(expectedExceptions = NotSupportedPathException.class)
	public void ThrowNotSupportedPathException() throws IOException {
		String notValidPath = File.separator  + "datas" + File.separator + "data.txt";
		reader.readAllData(Paths.get(notValidPath), Charset.defaultCharset());
	}

	@Test
	public  void ValidReadEightLinesFromFile() throws IOException {
		List<String> strings;
		String validPath = "data" + File.separator + "data.txt";
		strings =  reader.readAllData(Paths.get(validPath), Charset.defaultCharset());
		Assert.assertEquals(strings.size(),8);


	}

	@Test
	public void ValidReadZeroLinesFromEmptyFile() throws IOException {
		List<String> strings;
		String validPath = "data" + File.separator + "empty.txt";
		strings =  reader.readAllData(Paths.get(validPath), Charset.defaultCharset());
		Assert.assertEquals(strings.size(),0);

	}

}