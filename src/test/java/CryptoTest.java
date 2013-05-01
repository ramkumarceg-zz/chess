/**
 * Created with IntelliJ IDEA.
 * User: Gnana
 * Date: 4/29/13
 * Time: 12:30 AM
 * To change this template use File | Settings | File Templates.
 */

import org.junit.* ;
import static org.junit.Assert.* ;
import java.util.UUID;

public class CryptoTest {

    public String key = UUID.randomUUID().toString().replaceAll("-", "");
    public String src = "Gnana Prakash";
    public String result;

    @Test
    public void EncryptTest(){

        try{
            result = Crypto.encrypt(src, key);
        }
        catch (Exception e){
           System.out.println(e);
        }
        System.out.println(result);
        assertNotNull(result);
    }

    @Test
    public void DecryptTest(){


    }
}

