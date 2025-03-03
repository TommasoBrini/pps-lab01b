package e2;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LogicTest {
  private static final int SIZE = 5;

  Logics logics;

  private void createRandomLogics(){
    logics = new LogicsImpl(SIZE);
  }

  @Test
  public void testRandomEmptyPosition(){
    this.createRandomLogics();
    assertFalse(this.logics.isEmpty());
  }


}
