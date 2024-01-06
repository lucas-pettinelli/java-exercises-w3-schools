//Insert the missing keyword to execute code, after try..catch, regardless of the result.

public class MyClass{
try {
  int[] myNumbers = {1, 2, 3};
  System.out.println(myNumbers[10]);
} catch (Exception e) {
  System.out.println("Something went wrong.");
} 
finally
 {
  System.out.println("The 'try catch' is finished.");
}
}
