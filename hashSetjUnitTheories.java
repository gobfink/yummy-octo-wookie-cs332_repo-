
import java.util.Arrays;
import java.util.HashSet;

import org.junit.Assume;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
public class hashSetjUnitTheories {
	HashSet<Integer> a = new HashSet<Integer>();
	HashSet<Integer> b = new HashSet<Integer>();
	@DataPoints
	public static Integer[] dataInts(){
		Integer [] data = new Integer[101];
		for (int i = 0; i < 100; i++)
		{
			data[i] = i;
		}
		data[100] = null;
		return data;
	}
	@DataPoints
	public static Integer[] [] dataArrays()
	{
		Integer [] [] data = new Integer[100] [100];
		for (int i = 0; i < 100; i++)
		{
			for (int j = 0; j < 100; j++)
			{
				data[i][j]= i+j;
			}
			
		}
		return data;
	}
	@Theory
	public void equalsTheory1(Integer int_in)
	{
		
		a.add(int_in);
		b.add(int_in);
		assertTrue(a.equals(b));
	}
	@Theory
	public void equalsTheory2(Integer int_in)
	{
		
		a.add(int_in);
		b.add(int_in);
		assertTrue(b.equals(a));
	}
	@Theory
	public void equalsTheory3(Integer int_in1, Integer int_in2)
	{
		Assume.assumeTrue(int_in1 != int_in2 );
		a.add(int_in2);
		b.add(int_in1);
		b.add(int_in2);
		b.remove(int_in1);
		assertTrue(a.equals(b));
	}
	@Theory
	public void theory1to100a(Integer [] int_in)
	{
		Assume.assumeTrue(int_in != null);
		for(int i = int_in[0]; i < int_in.length; i++)
		{
			a.add(int_in[i]);
			b.add(int_in[i]);
		}
		assertTrue(a.equals(b));
	}
	@Theory
	public void theory1to100b(Integer [] int_in)
	{
		Assume.assumeTrue(int_in != null);
		for (int i = int_in[0]; i < int_in.length; i++)
		{
			a.add(int_in[i]);
			b.add(int_in[i]);
		}
		assertTrue(b.equals(a));
	}
	@Theory
	public void setTheory(Integer int_in)
	{
		a.add(int_in);
		a.add(int_in);
		b.add(int_in);
		assertTrue(a.equals(b));
	}
	
}
