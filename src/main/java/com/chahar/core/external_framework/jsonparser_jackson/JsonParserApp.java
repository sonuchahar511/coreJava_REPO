package com.chahar.core.external_framework.jsonparser_jackson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonParserApp {

	public static void main(String[] args) throws IOException {
		String jsonFile = "E:\\PROJECT_CODEBASE\\DEMO\\REPOSITORY\\CORE_JAVA_REPO\\src\\main/resources/paytm_refund_response.json";
		
		BufferedReader reader = new BufferedReader(new FileReader(jsonFile));
		StringBuilder stringBuilder = new StringBuilder();
		String line = null;
		String ls = System.getProperty("line.separator");
		while ((line = reader.readLine()) != null) {
			stringBuilder.append(line);
			stringBuilder.append(ls);
		}
		// delete the last new line separator
		stringBuilder.deleteCharAt(stringBuilder.length() - 1);
		reader.close();

		String jsonData = stringBuilder.toString();
		
		System.out.println(jsonData);
		
		
		ObjectMapper mapper = new ObjectMapper();
		Map<String,String> bean = (Map<String,String>) mapper.readValue(jsonData.getBytes(), TreeMap.class);
		System.out.println(bean);
		
	}

}
