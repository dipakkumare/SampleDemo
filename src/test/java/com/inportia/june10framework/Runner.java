package com.inportia.june10framework;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				features="src\\test\\java\\resources",
				glue= "stepdef",
				//tags={"@mw"},
				monochrome= true,  
				dryRun= false  //"verify the specific step definition to the steps(no execution only verification) make always false
		)
public class Runner {

}
