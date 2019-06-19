package com.chahar.core.string;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class StringFormatterApp {

	public static void main(String[] args) throws IOException {
		System.out.println(String.format("%sProductCatalog", "hi"));
		
		String TYPE_SYSTEM_TABLES_QUERY = " SELECT name,tablename FROM ydeployments WHERE typesystemname='%1$s' AND propstablename like '%2$s' ";
		System.out.println( String.format(TYPE_SYSTEM_TABLES_QUERY, "DEFAULT","%typesystem%") ) ;

		System.out.println("=========================================>>>>>>>>>");

		String DELETE_ALL_RECORD_IMPEX_QUERY = "REMOVE %1$s[batchmode=true];itemType(code)[unique=true];\n;%1$s;";
		String formattedQuery = String.format(DELETE_ALL_RECORD_IMPEX_QUERY, "Recommendation");
		System.out.print(formattedQuery);
		
		File file = new File("C:\\Users\\yschahar\\desktop\\1.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		InputStream inputStream = new ByteArrayInputStream(formattedQuery.getBytes(StandardCharsets.UTF_8));
		OutputStream outputStream = new FileOutputStream(file);
		int c;
		while( (c=inputStream.read() ) != -1) {
			outputStream.write(c);
		}
		outputStream.flush();
		outputStream.close();
		
		System.out.println("\n=========================================");
	}

}
