package com.acechat.gluecode;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features/acechat_login.feature", glue = "com.acechat.gluecode")
public class CucumberTestRunner {
	
}
