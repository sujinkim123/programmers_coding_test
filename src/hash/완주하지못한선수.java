package hash;

import java.util.Arrays;

public class 완주하지못한선수 {

    public String solution1(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[participant.length-1];
    }

}
