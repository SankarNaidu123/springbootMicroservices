package corejavaprograms.list;

public class ChocolateFeast {
	static int chocolateFeast(int n,int c,int m) {
		int choco=n/c;// 15/3 =5
		int wrap=choco;
		int newChoco = 0;
		while(wrap>=m) {
			newChoco=wrap/m;
			choco +=newChoco;
			wrap =(wrap%m)+newChoco;
		}
		return choco;
	}

	public static void main(String[] args) {
     int n=15,c=3,m=2;
     System.out.println(chocolateFeast(n,c,m));
	}

}
