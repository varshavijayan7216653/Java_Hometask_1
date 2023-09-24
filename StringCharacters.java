public class StringCharacters
{
public static void main(String[] args)
{
String text = "To be or not to be, that is the question;"
+"Whether `tis nobler in the mind to suffer" 
+" the slings and arrows of outrageous fortune,"
+" or to take arms against a sea of troubles,"
+" and by opposing end them?";
int spaces = 0,
vowels = 0,
letters = 0;
System.out.println("Total length of Text :"+text.length());

for(int i=0;i<text.length();i++)
{

char s = text.charAt(i);

if (Character.isWhitespace(s))
{
  spaces++;
}
 if (s=='a'|| s=='e'||s=='i'|| s=='o'||s=='u')
 {
   vowels++;  
 }
 if (Character.isLetter(s))
 {
     letters++;
 }
}
System.out.println("The text contained vowels: " + vowels + "\n"+"consonants :" + (letters - vowels) + "\n"+ "spaces: " + spaces);
}
} 
