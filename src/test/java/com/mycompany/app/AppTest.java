package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void test1() {
      //doğru vermesi gereken bir unit test 
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4,5,6));
      assertTrue(new App().search(array, 4,7,1));//arrayde 4 ile 7 arasında 1 den fazla sayı var mı?
    }

    public void test2() {
      // sınırları sayıyor mu onu kontrol edelim
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array, 2,4,1));//arrayde 2 ile 4 arasında 1 den fazla sayı var mı?
    }

    public void test3() {
      //array boş ise ne veriyor bakalım
      ArrayList<Integer> array = new ArrayList<>();
      assertFalse(new App().search(array, 1,5,0));//arrayde 1 ile 5 arasında 0 den fazla sayı var mı?
    }

    public void test4() {
      //null gönderip  test edelim
      assertFalse(new App().search(null, 1,5,0));//arrayde(null) 1 ile 5 arasında 0 den fazla sayı var mı?
    }

    public void test5() {
      //negatif sayı test edelim
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5, -6));
      assertTrue(new App().search(array, -6,-1,3));//arrayde -6 ile -1 arasında 3 den fazla sayı var mı?
    }

    public void test6() {
      //büyük olan inputu ilk verelim sonra küçük inputu verelim
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(-1, -2, -3, -4, -5, -6));
      assertTrue(new App().search(array, -1,-6,3));//arrayde -1 ile -6 arasında 3 den fazla sayı var mı?
    }

}
