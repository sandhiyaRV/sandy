import java.util.Scanner;

public class Encryption {
    
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		String s =scr.nextLine();
		String[] s1 = s.split(" ");
		String answer = "";
		String temp="";
		char key =0;
		for (int i = 0; i < s1.length; i++) {
			String s2 = s1[i];
			int len = s2.length();
			int k=0;
			for(int j=1;j<len;j++){
					k=j;		
				key = s2.charAt(len-j);
			
			if(key >65 && key<91 || key>96 && key<123 ){
				System.out.println(key);
				break;
				}
			temp=key+temp;
			}
			System.out.println(k);
			int[] flag = new int[len];
			for (int j = 0; j < len; j++) {
				if (s2.charAt(j) < 91) {
					flag[j] = 1;
				}
				}
			String s3 = s2.toLowerCase();
			int key1 =key - 96;
			String s4 = "";
			for (int j = 0; j <= len-k; j++) {
				char ch;
				if (j == len - k) {
					ch = s3.charAt(j);
				} else {
	     				ch = s3.charAt(j);
					ch -= key1;
				}
				if (ch < 97 ) {
					ch += 26;
				}
				s4 = s4+ch;
			}
			String output="";
			for(int j=0;j<=len-k;j++){
				char ch = s4.charAt(j);
				if(flag[j]== 1){
					ch -=32;
				}
				output += ch;
			}
			answer += output+temp+"";
		}
		System.out.println(answer);
		
	}
}
