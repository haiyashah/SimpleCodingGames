//Love-Calculator 
import java.util.Scanner;
    class LoveCal {
    ////////// Function to Convert Name into One Digit/////
    public static int sumOfNumber(int num){
      int sum=0;
      while(num!=0){
        sum+=(num%10);
        num=num/10;
      }
      return sum;
    }
    ////// Function to Convert String Type To Integer /////
    public static int sumofNames(String name){
        int sumOfName=0;
        int len=name.length();
        for(int i=0; i<len; i++){
            sumOfName += name.charAt(i);  
        }
        return sumOfName;
    }
     
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("============Love Calculator=============");
        System.out.println("This Program is Only For the Experimental Don't Take it Serious");
        System.out.println("Enter Your Name");
        String Name1=input.next();
        System.out.println("Enter Partner Name");
        String Name2=input.next();
        String firstName=Name1.toLowerCase();//Convert firstName Name into LowerCase.
        String SecondName=Name2.toLowerCase();//Convert Second Nameinto Lower Case.
        int sumOf1st=sumofNames(firstName);
        int sumOf2nd=sumofNames(SecondName); 
        String wordLove="love";
        int sumOfLove=sumofNames(wordLove);
        int name=sumOfNumber(sumOf1st);
        int partner=sumOfNumber(sumOf2nd);
        int love=sumOfNumber(sumOfLove);
        //// Calculating Percentage Of Love/////
        if(name+partner>love){
            int diff=(name+partner)-love;
            float per=(diff*100)/love;
            System.out.println(per);
        }
        else{
            int sumofNames=name+partner;
            float per=(sumofNames*100)/love;
            System.out.println(per);
        }
        input.close();
    }
}