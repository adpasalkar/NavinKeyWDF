package com.qa.hs.test;

import org.testng.annotations.Test;

import com.qa.hs.KeyWord.engine.KeyWordEngine;

public class LoginTest {
	
	public KeyWordEngine KeyWordEngine;
	
	@Test
	public void LoginTest()
	{
		KeyWordEngine = new KeyWordEngine();
		KeyWordEngine.startExecution("login");
	}
	

}
