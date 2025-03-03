package e2;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LogicTest {
  private static final int SIZE = 5;
  private static final int DEFAULT_KNIGHT_ROW = 0;
  private static final int DEFAULT_KNIGHT_COLUMN = 0;
  private static final int DEFAULT_PAWN_ROW = 2;
  private static final int DEFAULT_PAWN_COLUMN = 1;

  Logics logics;

  private void createRandomLogics(){
    logics = new LogicsImpl(SIZE);
  }

  private void createDefaultLogics(){
    logics = new LogicsImpl(SIZE, new Pair<>(DEFAULT_KNIGHT_ROW, DEFAULT_KNIGHT_COLUMN), new Pair<>(DEFAULT_PAWN_ROW, DEFAULT_PAWN_COLUMN));
  }

  @Test
  public void testRandomEmptyPosition(){
    this.createRandomLogics();
    assertFalse(this.logics.isEmpty());
  }

  @Test
  public void testHit(){
    this.createDefaultLogics();
    assertTrue(this.logics.hit(DEFAULT_PAWN_ROW, DEFAULT_PAWN_COLUMN));
  }

}
