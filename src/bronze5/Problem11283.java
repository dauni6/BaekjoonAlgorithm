package bronze5;

import java.io.*;

        /*유니코드 한글은 0xAC00 으로부터
        초성 19개, 중상21개, 종성28개로 이루어지고
        이들을 조합한 11,172개의 문자를 갖는다.

        한글코드의 값 = ((초성 * 21) + 중성) * 28 + 종성 + 0xAC00

        한글 시작 코드 : 44032 (0xAC00)
        한글 끝 코드   : 55199 (0xD79F)
        */
public class Problem11283 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine(); //글자입력
        int that = word.charAt(0);
        int result = word.charAt(0)-0xAC00 + 1;

        bw.write(result + "");
        bw.flush();


    }
}
