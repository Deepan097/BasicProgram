package com.apitesting;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SampleResponce {
	public static void main(String[] args) throws IOException, ParseException {

		FileReader fileReader = new FileReader("src\\test\\resources\\reqres.json");

		JSONParser jsonPaser = new JSONParser();

		Object obj = jsonPaser.parse(fileReader);

		JSONObject jsonobject = (JSONObject) obj;
		Object objectid = jsonobject.get("data");

		Object objdata = jsonobject.get("data");
		JSONObject add = (JSONObject) objdata;

		Object email = add.get("email");
		System.out.println(email);

		Object id = add.get("id");
		System.out.println(id);
		
		Object firstName = add.get("first_name");
		System.out.println(firstName);
		
		Object lastName = add.get("last_name");
		System.out.println(lastName);
		
		Object avatar = add.get("avatar");
		System.out.println(avatar);
		
	
		Object support=jsonobject.get("support");
		JSONObject support1=(JSONObject)support;
		
		Object url = support1.get("url");
		System.out.println(url);
		
		Object text = support1.get("text");
		System.out.println(text);
		
	}

}
