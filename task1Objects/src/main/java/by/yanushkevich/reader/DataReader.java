package by.yanushkevich.reader;

import by.yanushkevich.exception.NotSupportedPathException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DataReader {
	private static final Logger LOGGER = LogManager.getLogger(DataReader.class);

	public List<String> readAllData(Path path, Charset charset) throws IOException {
		try {
			LOGGER.info("Start reading lines from: " + path);
			List<String> lines = Files.readAllLines(path, charset);
			LOGGER.info("All lines was read from: " + path);
			return lines;
		} catch (NoSuchFileException e) {
			LOGGER.error("Exception generated! Path " + path + " not valid. " + e);
			throw new NotSupportedPathException("Invalid path: " + path, e);
		} catch (IOException e){
			LOGGER.error(e);
			throw e;
		}
	}
}