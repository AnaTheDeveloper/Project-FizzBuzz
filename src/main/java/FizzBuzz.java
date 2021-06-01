public class FizzBuzz {

  //for loops version one       for( x ; x ; x ){}
  public void numbers() {

    for (int counter = 1; counter <= 100;
        counter++) {                 //This for loop prints out numbers between 1 and 100.
      System.out.println(counter);
      if (counter % 3 == 0) {
        System.out.println("Fizz");
      if (counter % 5 == 0){
        System.out.println("Buzz");
      if (counter % 3 == 0 && counter % 5 == 0){
        System.out.println("Fizz Buzz!");
      }
      }
      }
    }




  }
}

