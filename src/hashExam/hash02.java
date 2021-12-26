package hashExam;

import org.omg.CORBA.INTERNAL;

import java.util.*;

public class hash02 {

    private int hour = 3;


    static boolean solution(String[] phone_book) {
        boolean answer = true;








        Map<String,String> has = new HashMap<String,String>();

        for(String abc : phone_book){
            has.put(abc,abc);
        }


        for(String abc : phone_book){
            for(int i=1; i<abc.length();i++) {
                if(has.containsKey(abc.substring(0,i))){
                    answer = false;
                    return answer;
                }
            }
        }



        return answer;
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
