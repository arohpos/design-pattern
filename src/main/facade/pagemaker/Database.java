package main.facade.pagemaker;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Database {

	private Database() {
	};

	public static Properties getProperties(String dbname) throws IOException {
		String filename = "/Applications/Eclipse_2022-03.app/Contents/workspace/design-pattern/src/main/facade/" + dbname + ".txt";
		Properties prop = new Properties();
		prop.load(new FileReader(filename));
		return prop;
	}
}


