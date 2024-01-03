// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

class Main {
  public static void main(String[] args) {
    
 int [] weathertemp = new int [4];
    weathertemp [0] = 22;
    weathertemp [1] = 23;
    weathertemp [2] =24;
    weathertemp [3] =25;

    weathertemp[2] = 21;

    for(double temp : weathertemp){
      System.out.println(temp);
      
    }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }