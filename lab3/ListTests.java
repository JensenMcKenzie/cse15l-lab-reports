import static org.junit.Assert.*;

import java.beans.Transient;

import org.junit.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface StringChecker { boolean checkString(String s); }

class checker implements StringChecker {
    String s = "";
    public checker (String s){
      this.s = s;
    }
    public boolean checkString(String s){
      return this.s.equals(s);
    }
  }

public class ListTests {
    @Test
    public void testFilter(){
        List<String> input1 = new ArrayList<String>(Arrays.asList("test"));
        List<String> result1 = ListExamples.filter(input1, "test");
        List<String> expected1 = new ArrayList<String>(Arrays.asList("test"));
        assertEquals(expected1.size(), result1.size());
        for (int i = 0; i < result1.size() -1 ; i++){
            assertEquals(expected1.get(i), result1.get(i));
        }
        
        List<String> input2 = new ArrayList<String>(Arrays.asList("test", "one", "test", "test", "two", "test"));
        List<String> result2 = ListExamples.filter(input2, "test");
        List<String> expected2 = new ArrayList<String>(Arrays.asList("test", "test", "test", "test"));
        assertEquals(expected2.size(), result2.size());
        for (int i = 0; i < result2.size() -1 ; i++){
            assertEquals(expected2.get(i), result2.get(i));
        }
        

    }

    @Test
    public void testMerge(){
        List<String> input1 = new ArrayList<String>(Arrays.asList("test"));
        List<String> input2 = new ArrayList<String>(Arrays.asList("test2"));
        List<String> result1 = ListExamples.merge(input1, input2);
        List<String> expected1 = new ArrayList<String>(Arrays.asList("test", "test2"));
        assertEquals(expected1.size(), result1.size());
        for (int i = 0; i < result1.size() -1 ; i++){
            assertEquals(expected1.get(i), result1.get(i));
        }

        List<String> input3 = new ArrayList<String>(Arrays.asList("a", "c", "d"));
        List<String> input4 = new ArrayList<String>(Arrays.asList("b"));
        List<String> result2 = ListExamples.merge(input3, input4);
        List<String> expected2 = new ArrayList<String>(Arrays.asList("a", "b", "c", "d"));
        assertEquals(expected2.size(), result2.size());
        for (int i = 0; i < result2.size() -1 ; i++){
            assertEquals(expected2.get(i), result2.get(i));
        }
        
    }
}
