package com.mph.testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.mph.test.*;
public class UserTest {

User user;

@Before
public void setUp() throws java.lang.Exception
{
	user = new User();
	System.out.println("@before called");
}

@Rule
public ExpectedException exception = ExpectedException.none();

@Test
public void testUserNameTooShort()
{
	user.setName("tj");
	exception.expect(IllegalArgumentException.class);
	exception.expectMessage("Username to short");
}

@ Test(expected = IllegalArgumentException.class)
public void testUserNameTooLong()
{
	user.setName("null");
}

@After
public void tearDown() throws java.lang.Exception{
	user=null;
	System.out.println("@After called");
	
}



}
