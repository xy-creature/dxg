import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();
		String key = s.nextLine();
		char[] array = line.toCharArray();
		char[] keyArray = key.toCharArray();
		int sum = 0;
		for(int i=0;i<array.length-keyArray.length+1;i++){
			boolean match = true;
			for(int j=0;j<keyArray.length;j++){
				if(array[i+j] != keyArray[j]){
					match = false;
					break;
				}
	
			}
			if(match){
				sum ++ ;
			}
		}
		System.out.println(sum);
		//2
		//1
		//4
	}
}
