import org.junit.* ;
import static org.junit.Assert.* ;

public class DrawSquareTest {

  @Test
  public void constructor() {
    System.out.println("draw square class should be defined");
    DrawSquare drawSquare = new DrawSquare("a1", "black");
    assertNotNull(drawSquare);
    assertEquals("black", drawSquare.color);
    assertEquals("a1",    drawSquare.location);
  }
}