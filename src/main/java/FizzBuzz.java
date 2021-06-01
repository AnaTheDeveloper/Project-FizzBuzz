public class FizzBuzz {


  public void numbers() {

    for (int counter = 1; counter <= 100;
        counter++) {                 //This for loop prints out numbers between 1 and 100.


      if (counter % 3 == 0 && counter % 5 == 0) {       //The one with the most variables that needs to be checked goes first
        System.out.println("Fizz Buzz!");
      } else if (counter % 3 == 0) {                    //else if to check the other conditions
        System.out.println("Fizz");
      } else if (counter % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(counter);                    //Once the variables have each been checked then it can print out the rest of the numbers
      }


    }
  }
}

