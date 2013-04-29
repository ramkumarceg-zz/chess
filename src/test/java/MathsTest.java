/**
 * Created with IntelliJ IDEA.
 * User: Gnana
 * Date: 4/28/13
 * Time: 9:13 PM
 * To change this template use File | Settings | File Templates.
 */

import org.junit.* ;
import static org.junit.Assert.* ;

public class MathsTest {

    public int a = 10;
    public int b = 5;


    @Test
    public void AddTest(){
        Maths add = new Maths();
        System.out.print("Add: ");
        System.out.println(add.Add(a, b));
        assertNotNull(add);
    }

    @Test
    public void SubtractTest(){
        Maths sub = new Maths();
        System.out.print("Subtract: ");
        System.out.println(sub.Subtract(a, b));
        assertNotNull(sub);
    }

    @Test
    public void MultiplyTest(){
        Maths multiply = new Maths();
        System.out.print("Multiply: ");
        System.out.println(multiply.Multiply(a, b));
        assertNotNull(multiply);
    }

    @Test
    public void DivideTest(){
        Maths divide = new Maths();
        System.out.print("Divide: ");
        System.out.println(divide.Divide(a, b));
        assertNotNull(divide);
    }
}
