package hashExam;

import java.util.HashMap;
import java.util.Map;

public class hash03 {

    static int solution(String[][] clothes) {
            int answer = 1;

            Map<String,Integer> maps = new HashMap<>();


            for(int i=0; i<clothes.length; i++){

                if(maps.get(clothes[i][1]) == null){
                    maps.put(clothes[i][1],1);
                }else{
                    maps.put(clothes[i][1],maps.get(clothes[i][1]) + 1);
                }
            }

        for (String key : maps.keySet()) {

            answer *= (maps.get(key)+1);

        }


        return answer -1;
    }





    public static void main(String[] args)  {

        String[][] cl01 = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
        String[][] cl03 = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}, {"bluesunglas4ses", "eyewear2"}, {"bluesunglasses", "eyewear2"}};

        String[][] cl02 = {{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}};
       // String[] book03 = {"12","123","1235","567","88"};


//        boolean answer = solution(book01);
//        boolean answer = solution(book02);
 //       boolean answer = solution(book03);
    int answer = solution(cl01);

        System.out.println(answer);


    }


}
