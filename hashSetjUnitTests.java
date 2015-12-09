import static org.junit.Assert.*;
import java.util.HashSet;
import org.junit.Test;

/**
 * @author cfortman
 * @author fcardenas
 */

public class hashSetjUnitTests {
  HashSet<Integer> a = new HashSet<Integer>();
  HashSet<Integer> b = new HashSet<Integer>();
  
  @Test // Same
  public void equalsTest1() {
    a.add(-1);
    b.add(-1);
    assertTrue(a.equals(b));
  }
  
  @Test // Same
  public void equalTest2(){
    a.add(-1);
    b.add(-1);
    assertTrue(b.equals(a));
  }
  
  @Test // Different values
  public void equalTest3() {
    a.add(400); a.add(200); a.add(300);
    b.add(100); b.add(200); b.add(300); b.remove(100); b.add(400);
    
    assertTrue(a.equals(b)); 
  }
  
  @Test // Different lengths
  public void equalTest4() {
    a.add(100); a.add(100);
    a.remove(100);
    assertFalse(a.contains(100)); 
  }
  
  @Test
  public void test1to100a(){
    for (int i = 0; i < 100; i++)
    {
      a.add(i);
      b.add(i);
    }
    assertTrue(a.equals(b));
  }
  
  @Test
  public void test1to100b()
  {
    for (int i = 0; i < 100; i++)
    {
      a.add(i);
      b.add(i);
    }
    assertTrue(b.equals(a));
  }
  
  @Test
  public void removeTest1()
  {
    a.add(-1);
    a.remove(-1);
    assertTrue(!a.contains(-1));
  } 
  
  @Test
  public void removeTest2()
  {
    for (int i = 0; i < 100; i++)
    {
      a.add(i);
    }
    for (int i = 5; i < 100; i+=5)
    {
      a.remove(i);
    }
    assertTrue(!a.contains(5));
  }
  
  @Test
  public void clearTest()
  {
    for (int i = 0; i < 100; i++)
    {
      a.add(i);
    }
    a.clear();
    assertTrue(a.isEmpty()); 
  }
  
  @Test
  public void setTest() {
    a.add(1);
    a.add(1);
    b.add(1);
    assertTrue(a.equals(b));
  }
}
