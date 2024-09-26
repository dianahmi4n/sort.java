import java.util.Arrays;
import java.util.Comparator;
public class sort{
public static void main(String[]args){
Integer[] numbers = {5,3,8,1,2};
Arrays.sort(numbers,Comparator. reverseOrder());
System.out.println("Arrays in Descending order: "+ Arrays.toString(numbers));
  }
  }
