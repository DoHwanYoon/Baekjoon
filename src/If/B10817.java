package If;

import java.util.Scanner;
public class B10817 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int x,y,z;
        x=scan.nextInt();
        y=scan.nextInt();
        z=scan.nextInt();

        if((y<=x && x<=z)||(z<=x && x<=y)){
            System.out.print(x);
        }
        else if((x<=y && y<=z)||(z<=y && y<=x)){
            System.out.print(y);
        }
        else{
            System.out.print(z);
        }

	}

}
