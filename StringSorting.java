import java.util.Arrays;
public class StringSorting
{
public static void main(String[] args)
{

String s="To be or not to be, that is the question Whether this nobler in the mind to sufferthe slings and arrows of outrageous fortune,or to take arms against a sea of troubles,and by opposing end them?";
    
           String[] words = s.split(" ");
         //  System.out.println(Arrays.toString(words));
          int size = words.length;

      for(int i = 0; i<size-1; i++) {
         for (int j = i+1; j<words.length; j++) {
            if(words[i].compareTo(words[j])>0) {
               String temp = words[i];
               words[i] = words[j];
               words[j] = temp;
            }
         }
      }
       System.out.println("Reversed String: "+Arrays.toString(words));

}
}
