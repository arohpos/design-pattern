package main.adapterExercise;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO  {
	
	@Override
	public void readFromFile(String filename) throws IOException{
		//loadはReader型を引数にとるが、FileReaderはReaderを間接的にextendsしているため使用できる。
		load(new FileReader(filename));
	};
	@Override
	public void writeToFile(String filename) throws IOException{
		store(new FileWriter(filename),"write by FileProperties");
	};
	@Override
	public void setValue(String key, String value) {
		setProperty(key, value);
	};
	@Override
	public void getValue(String key) {
		getProperty(key);
	};
	
	
}
