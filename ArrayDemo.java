public class ArrayDemo {

  //0a printing 1D arrays
  public static void printArray(int[]ary) {
    String s = "{";
    for (int i = 0; i < ary.length; i++) {
      s += ary[i];
      if (i < ary.length - 1) {
        s+= ", ";
      }
    }
    System.out.print(s + "}\n");
  }

  //0b printing 2D arrays
  public static void printArray(int[][]ary){
    String s = "";
    for (int i = 0; i < ary.length; i++) {
      s+= "{";
      for (int j = 0; j < ary[i].length; j++) {
        s+= ary[i][j];
        if (j < ary[i].length-1) {
          s+= ", ";
        }
        if (j == ary[i].length-1) {
          s+= "}\n";
        }
      }
    }
    System.out.print(s);
  }

  //making test cases for 0a and 0b
  public static int[] makeArray1() {
    int[] anArray = new int[] {
      100, 200, 300,
      400, 500, 600,
      700, 800, 900, 1000
    };
    return anArray;
  }
  public static int[] makeArray2() {
    int[] anArray = new int[] {
      10, 20, 30,
      40, 50, 60,
      70, 80, 90,
    };
    return anArray;
  }
  public static int[][] make2DArray1() {
    int[][] multiA = new int[][] {
      {100,200,300,400},
      {500,600,700,800},
      {900,1000,1100,1200},
    };
    return multiA;
  }
  public static int[][] make2DArray2() {
    int[][] multiA = new int[][] {
      {10,20,30,40},
      {90,100,110},
      {120},
    };
    return multiA;
  }

  //1 counting zeroes in 2D arrays
  public static int countZeros2D(int[][]nums){
    int c = 0;
    for (int i = 0; i< nums.length; i++){
      for (int j = 0; j < nums[i].length; j++) {
        if (nums[i][j] == 0) {
          c++;
        }
      }
    }
    return c;
  }

  //1 test case 1 & 2
  public static int[][] make0Array1() {
    int[][] multiZ = new int[][] {
      {0, 1, 0, 1},
      {1, 0, 1, 0},
      {0, 0, 0, 1},
    };
    return multiZ;
  }
  public static int[][] make0Array2() {
    int[][] multiZ = new int[][] {
      {0},
      {2,3},
      {1,3,4},
    };
    return multiZ;
  }

  //2a replaces all values with 1s except when row number is same as column number
  public static void fill2D(int[][]vals){
    String s = "";
    for (int i = 0; i < vals.length; i++) {
      s+= "{";
      for (int j = 0; j < vals[i].length; j++) {
        if (j == i) {
          s+= 3;
        } else {
          s+= 1;
        }
        if ( j < vals[i].length - 1) {
          s+= ", ";
        }
        if (j == vals[i].length - 1) {
          s+= "}\n";
        }
      }
    }
    System.out.print(s);
  }

  //2a test cases
  public static int[][] makeFill2D1() {
    int[][] multiF = new int[][] {
      {3,5,7,8,2},
      {1,0,5},
      {9,6,8,4},
    };
    return multiF;
  }
  public static int[][] makeFill2D2() {
    int[][] multiF = new int[][] {
      {3},
      {1,0},
      {4, 5, 8, 1, 2},
      {9, 2, 3, 7, 8, 4}
    };
    return multiF;
  }

  //2b filling an array with 1s and 3s
  public static int[][] fill2Dcopy(int[][]vals) {
    int[][] newAry = new int[vals.length][];
    for (int i = 0; i < vals.length; i++) {
      newAry[i] = new int[vals[i].length];
    }
    for (int j = 0; j < newAry.length; j++) {
      for (int k = 0; k < newAry[j].length; k++) {
        if (vals[j][k] < 0) {
          newAry[j][k] = 3;
        } else {
          newAry[j][k] = 1;
        }
      }
    }
    return newAry;
  }

  //2b test cases
  public static int[][] make2DCopy1() {
    int[][] multiC = new int[][] {
      {1, -3, 4, -5},
      {-2},
      {1, 3, 9, 0},
      {-3, 4, -5, -6},
    };
    return multiC;
  }
  public static int[][] make2DCopy2() {
    int[][] multiC = new int[][] {
      {-5},
      {5},
      {1, 3, -7, 0},
      {4, -1, 3, 3, -9},
    };
    return multiC;
  }

  //main print function
  public static void main(String[] args) {
    System.out.println("#0a test case 1");
    printArray(makeArray1());
    System.out.println("#0a test case 2");
    printArray(makeArray2());
    System.out.print("#0b test case 1\n");
    printArray(make2DArray1());
    System.out.print("#0b test case 2\n");
    printArray(make2DArray2());
    System.out.print("#1 test case 1\n");
    System.out.println(countZeros2D(make0Array1()));
    System.out.print("#1 test case 2\n");
    System.out.println(countZeros2D(make0Array2()));
    System.out.print("#2a test case 1\n");
    fill2D(makeFill2D1());
    System.out.print("#2a test case 2\n");
    fill2D(makeFill2D2());
    System.out.println("#2b test case 1");
    printArray(fill2Dcopy(make2DCopy1()));
    System.out.println("#2b test case 2");
    printArray(fill2Dcopy(make2DCopy2()));
  }
}
