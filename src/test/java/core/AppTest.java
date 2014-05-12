package core;

import static org.junit.Assert.*;
import junit.framework.ComparisonFailure;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;



public class AppTest {

@BeforeClass
public static void BeforeClass() throws Exception {
	System.out.println("BeforeClass method will be executed before first test method starts");
       }

@AfterClass
public static void AfterClass() throws Exception {
	System.out.println("AfterClass method will be executed after last test method completed");
       }

@Before
public void Before() throws Exception {
    System.out.println("Before method will execute before every test method");
       }

@After
public void After() throws Exception {
    System.out.println("After method will execute after every test method");
       }

@Test
public void Test_01_assertEquals_Positive() throws ComparisonFailure {
   System.out.println("Test_01_assertEquals_Positive");
   String s = "ok";
   assertEquals("Failure - string are not equal", "ok", s);
   System.out.println("Test_01_assertEquals_Positive ok s = " + s);
}

@Test
public void Test_02_assertEquals_Negative() throws ComparisonFailure {
       System.out.println("Test_02_assertEquals_Negative");
       String s = "ok";
       assertEquals("Failure - string are not equal", "ak", s);
       System.out.println("Test_02_assertEquals_Negative ok s = " + s);
       }

@Ignore
@Test
public void Test_03_assertEquals_Ignored() throws ComparisonFailure {
       System.out.println("Test_03_assertEquals_Ignored");
       String s = "ok";
       assertEquals("Failure - string are not equal", "ak", s);
       System.out.println("Test_03_assertEquals_Ignored ok s = " + s);
       }

@Test
public void Test_04_AssertSame_Positive() throws ComparisonFailure {
       System.out.println("Test_04_AssertSame_Positive");
       Integer i = 5;
       assertSame("Should be same", 5, i);
       System.out.println("Test_04_AssertSame_Positive 5 i =  "+ i);
       }

@Test
public void Test_05_AssertSame_Negative() throws ComparisonFailure{
       System.out.println("Test_05_AssertSame_Negative");
       Integer i = 6;
       assertSame("Should be same", 5, i);
       System.out.println("Test_04_AssertSame_Negative 5 i =  "+ i);
       }

@Ignore
@Test
public void Test_06_AssertSame_Ignored() throws ComparisonFailure {
       System.out.println("Test_06_AssertSame_Ignored");
       Integer i = 5;
       assertSame("Should be same", 5, i);
       System.out.println("Test_06_AssertSame_Ignored 5 i =  "+ i);
       }

@Test
public void Test_07_assertFalse_Positive() throws ComparisonFailure {
       System.out.println("Test_07_assertFalse_Positive");
       Boolean f = false;
       assertFalse("Fallure - should be false", f);
       System.out.println("Test_07_assertFalse_Positive false f =  "+ f);
       }

@Test
public void Test_08_assertFalse_Negative() throws ComparisonFailure {
       System.out.println("Test_08_assertFalse_Negative");
       Boolean f = true;
       assertFalse("Fallure - should be false", f);
       System.out.println("Test_08_assertFalse_Negative true f =  "+ f);
       }

@Test
public void Test_09_assertTrue_Positive() throws ComparisonFailure {
       System.out.println("Test_09_assertTrue_Positive");
       Boolean t = true;
       assertTrue("Fallure - should be false", t);
       System.out.println("Test_09_assertFalse_Positive false t =  "+ t);

       }

@Test
public void Test_10_assertTrue_Negative() throws ComparisonFailure {
       System.out.println("Test_10_assertTrue_Negative");
       Boolean t = false;
       assertTrue("Fallure - should be false", t);
       System.out.println("Test_10_assertFalse_Negative true t =  "+ t);
       }

}