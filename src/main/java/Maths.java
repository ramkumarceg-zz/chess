/**
 * Created with IntelliJ IDEA.
 * User: Gnana
 * Date: 4/28/13
 * Time: 9:08 PM
 * To change this template use File | Settings | File Templates.
 */

import org.springframework.stereotype.Controller;

@Controller
public class Maths {

    public int Add(int a, int b){
        int c = a + b;
        return c;
    }

    public int Subtract(int a, int b){
        int c = a - b;
        return c;
    }

    public int Multiply(int a, int b){
        int c = a * b;
        return c;
    }

    public int Divide(int a, int b){
        int c = a / b;
        return c;
    }
}
