package yanghui;

public class yanghui {
	public static void main(String[] args){
	int levelCount = 10;      
	int[][] yangHui = new int[levelCount][0];
	for (int i=0;i<levelCount;i++){
		yangHui[i]=new int[i+1];
		for(int j=0;j<=i;j++){
			if(i==0){
				yangHui[i][j]=1;
			}else {
				int value=0;
				if(j>=1){
					value =value+ yangHui[i-1][j-1];
				}
				if (j<i){
					value = value+yangHui[i-1][j];
				}
			yangHui[i][j]=value;		
			}
		}
		
	}
        for(int i=0;i<levelCount;i++) {
        	for (int j=0;j<=i;j++){
        		for(int x=0;x<levelCount-i-1;x++){
        			System.out.print("	");
        		}
        		System.out.print(yangHui[i][j] + "\t");
        	}
        	System.out.println();
        }
}
}
