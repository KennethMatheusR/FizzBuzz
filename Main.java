class Main {
  public static void main(String[] args) {
        // tittle message
        System.out.println("FizzBuzz practice");

    //loop to print the values
    for(int count = 1; count <= 100; count++){
        // to get the first condition if the value is mutiple of 3 and 5
        if(count %3 == 0 && count %5 == 0){
          System.out.println("FizzBuzz");
        }else if(count %3 == 0){
          // to get the second condition if the value is multiple of 3
          System.out.println("Fizz");
        }else if(count %5 == 0){
          //to get the third condition , if value is multiple of 5 
          System.out.println("Buzz");
        }else{
          //if not alll above print the number
          System.out.println(count);
        }


    }

  }
}