package hashExam;

import java.util.HashMap;
import java.util.Map;

public class hashWrong02 {


    static boolean solution(String[] phone_book) {
        boolean answer = true;

        for(int i=0; i<phone_book.length; i++){
            for(int j=i+1; j<phone_book.length; j++){
                if(phone_book[i].startsWith(phone_book[j])){
                    return false;
                }else if(phone_book[j].startsWith(phone_book[i])){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args)  {

        String[] book01 = {"119", "97674223", "1195524421"};
        String[] book02 = {"123","456","789"};
        String[] book03 = {"12","123","1235","567","88"};


//        boolean answer = solution(book01);
//        boolean answer = solution(book02);
        boolean answer = solution(book03);


        System.out.println(answer);


    }
}
