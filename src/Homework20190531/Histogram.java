package Homework20190531;

import java.io.IOException;
import java.io.InputStreamReader;

class Histogram {
	static int alphabet[] = null;
    final static int alphabetNum = 26;
    Histogram(){
        alphabet = new int[alphabetNum];
        for(int i=0;i<alphabetNum;i++){
            alphabet[i]=0;
        }
    }
    public static void main(String[] args) {
        new Histogram();
        InputStreamReader rd = new InputStreamReader(System.in);
        int index;
        try{
            while(true){
                int c = rd.read();
                if(c==13)
                    break;
                if(Character.isAlphabetic(c)){
                    if(c>='a'&&c<='z'){
                        c-=32;
                    }
                    index = c-'A';
                    alphabet[index]+=1;
                }
                 
            }
            System.out.println("히스토그램을 그립니다.");
            for(int i=0;i<alphabetNum;i++){
                System.out.print((char)(i+'A'));
                for(int j=0;j<alphabet[i];j++)
                    System.out.print("-");
                System.out.println();
            }
        }
        catch(IOException e){
            System.out.println("입력 오류 발생");
        }
    }
}

