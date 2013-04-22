import org.junit.* ;
import static org.junit.Assert.* ;

public class Chess.DrawSquareTest {

  @Test
  public void initialize {
    System.out.println("draw square class should be defined");
    DrawSquare drawSquare = new Chess.DrawSquare();
    assertNotNull(drawSquare);
  }

}