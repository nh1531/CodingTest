// 둘만의 암호
class Solution {
    public String solution(String s, String skip, int index) {
       char[] words = s.toCharArray();
        for(int i = 0 ; i < words.length ; i++){
            for(int j = 0 ; j < index ; j++){
                do{
                    words[i]++;
                    if(words[i] > 'z'){
                        words[i] -= 26;
                    }
                }while(skip.contains(String.valueOf(words[i])));
            }
        }
        String answer = String.valueOf(words);
        return answer;
    }
}

// 크레인 인형뽑기 게임
import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for(int move : moves) {
          for(int j = 0; j < board.length; j++) {
            if(board[j][move - 1] != 0) {
              if(stack.peek() == board[j][move - 1]) {
                stack.pop();
                answer += 2;
              } else {
               stack.push(board[j][move - 1]);
              }
              board[j][move - 1] = 0;
              break;
            }
          }
        }
        return answer;
    }
}
