package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatLuckyThirteenTest {

  private int[][] thirteenParams = {
      {0, 2, 4},
      {1, 2, 3},
      {1, 2, 4},
      {2, 7, 2, 8},
      {2, 7, 1, 8},
      {3, 7, 2, 8},
      {2, 7, 2, 1},
      {1, 2},
      {2, 2},
      {2},
      {3},
      {}
  };


  private boolean[] thirteenExpected = {true, false, false, true, false, false, false, false, true,
      true, false, true};


  @Test
  void thirtheenTest() {
    for (int i = 0; i < thirteenParams.length; i++) {
      boolean actual = CodingBatLuckyThirteen.lucky13(thirteenParams[i]);
      Assertions.assertEquals(actual, thirteenExpected[i]);
    }
  }

}