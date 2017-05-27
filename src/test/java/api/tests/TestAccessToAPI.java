package api.tests;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import inventory.test.APICclient;

/**
 * Test the API Connect Inventory API using the API Connect Gateway end point.
 * @author Jerome Boyer
 *
 */
public class TestAccessToAPI {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testGetItemsDirectAccessToAPIC() {
		APICclient client = new APICclient("172.16.254.89");
		try {
			String itemArray=client.executeGetMethod("csplab/sb/sample-inventory-api/items", null);
			System.out.println(itemArray);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
