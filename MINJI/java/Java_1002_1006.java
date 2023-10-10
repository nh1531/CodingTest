// 같은 숫자는 싫어
import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        int value = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != value) {
                answerList.add(arr[i]);
                value = arr[i];
            }
        }
        return answerList.stream().mapToInt(i->i).toArray();
    }
}

// 3진법 뒤집기
import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        String ans = "";
        while(n != 0) {
            ans += n%3;
            n /= 3;
        }
        return Integer.parseInt(ans, 3);
    }
}

// 예산
import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
	    int total = 0;
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++){
            if(total + d[i] <= budget) {
                total += d[i];
                answer++;
            }
        }
        return answer;
    }
}

// 이상한 문자 만들기
class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = 0;
        String[] array = s.split("");
        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
        }
        return answer;
    }
}

// 크기가 작은 부분문자열
class Solution {
    public int solution(String t, String p) {
        int len = p.length();
		long num = Long.parseLong(p);
		int result = 0;
		for (int i = 0; i < t.length() - len + 1; i++) {
			long diff = Long.parseLong(t.substring(i, i + len));
			if (diff <= num) result++;
		}
		return result;
    }
}

// 삼총사
class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i = 0; i < number.length; i++) {
            for(int j = i + 1; j < number.length; j++) {
                for(int k = j + 1; k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
