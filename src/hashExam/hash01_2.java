package hashExam;

import java.util.Arrays;

public class hash01_2 {




    static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer += participant[i];
                return answer;
            }
        }
        answer += participant[participant.length - 1];
        return answer;
    }

    public static void main(String[] args)  {

         String[] participant1 = { "leo", "kiki", "eden" };
         String[] completion1 = { "eden", "kiki" };
         String[] participant2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
         String[] completion2 = { "josipa", "filipa", "marina", "nikola"};
         String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
         String[] completion3 = {"stanko", "ana", "mislav"};


    //    String answer = solution(participant1,completion1);
       String answer = solution(participant2,completion2);
    //    String answer = solution(participant3,completion3);

        System.out.println(answer);
        long end = System.currentTimeMillis();

    }


}
