package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1 == 1);
	}

	@Test
	public void test_withdraw() throws InsufficientFundsException {
		Account AccountTest = new Account(1122, 20000);
		AccountTest.setAnnualInterestRate(4.5);
		AccountTest.withdraw(2500);
		double expectedbalance = 17500;
		assertEquals(expectedbalance, AccountTest.getBalance(), .001);
		System.out.println("The balance equals: $" + AccountTest.getBalance());
		System.out.println("The monthly interest equals: " + AccountTest.getMonthlyInterestRate() + "%");
		System.out.println("The date the account was created is " + AccountTest.getDateCreated());
	}

	@Test
	public void test_deposit() {
		Account AccountTest = new Account(1122, 20000);
		AccountTest.setAnnualInterestRate(4.5);
		AccountTest.deposit(3000);
		double expectedbalance2 = 23000;
		assertEquals(expectedbalance2, AccountTest.getBalance(), .001);
		System.out.println("The balance equals: $" + AccountTest.getBalance());
		System.out.println("The monthly interest equals: " + AccountTest.getMonthlyInterestRate() + "%");
		System.out.println("The date the account was created is " + AccountTest.getDateCreated());
	}

	@Test(expected = InsufficientFundsException.class)
	public void testWithdraw() throws InsufficientFundsException {
		Account test = new Account(1122,0);
		test.deposit(500.00);
		assertEquals("$400 Expected, actual is $500", (long) test.getBalance(), (long) 500.00);
		test.withdraw(900);
	}
}