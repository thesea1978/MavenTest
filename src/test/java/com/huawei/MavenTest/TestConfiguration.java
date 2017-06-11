package com.huawei.MavenTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestConfiguration {

    @Test
    public void runTest1() {
        System.out.println("@Test - runTest1");
    }

    @Test
    public void runTest2() {
        System.out.println("@Test - runTest2");
    }

	@BeforeMethod
	public void beforeMethod() {
        System.out.println("@beforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
        System.out.println("@afterMethod");
	}

	@BeforeClass
	public void beforeClass() {
        System.out.println("@beforeClass");
	}

	@AfterClass
	public void afterClass() {
        System.out.println("@afterClass");
	}

	@BeforeSuite
	public void beforeGroups() {
        System.out.println("@BeforeGroups");
	}

	@AfterSuite
	public void afterGroups() {
        System.out.println("@afterGroups");
	}

}
