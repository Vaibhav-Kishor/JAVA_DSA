package Stack;
import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack <Character> st = new Stack<Character> ();

        for(int i=0;i<str.length()-1;i++){
            char c = str.charAt(i);

            if(c ==')'){
                st.pop('c');
            }
            else{
                st.push(c);
           }
        }
   
    }
}
