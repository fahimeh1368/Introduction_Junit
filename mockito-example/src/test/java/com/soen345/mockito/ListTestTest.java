package com.soen345.mockito;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class ListTestTest {

	@Test
	public void letsMockListSize() {
		List list = mock(List.class);
		when(list.size()).thenReturn(10);
		assertEquals(10,list.size());
	}

	@Test
	public void letsMockListSizeWithMultipleReturnValues() {
		List list = mock(List.class);
		when(list.size()).thenReturn(10,20);
		assertEquals(10,list.size());
		assertEquals(20,list.size());
	}

	@Test
	public void letsMockListGet() {
		List<String> list = mock(List.class);
		when(list.get(0)).thenReturn("0th element");
		assertEquals("0th element", list.get(0));
	}

	@Test
	public void letsMockListGetWithAny() {
		List<String> list = mock(List.class);
		Mockito.when(list.get(Mockito.anyInt())).thenReturn("this is an int");
		assertEquals("this is an int", list.get(3));
		assertEquals("this is an int", list.get(6));
	}
}