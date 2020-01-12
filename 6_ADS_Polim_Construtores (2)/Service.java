public class Service{  //entidade

	public int soma(int y, int x){
		return (y+x);
	}

	public String soma(int y, int x){
		return ("a");
	}

	public int soma(String str1, String str2){
		int x = str1.length();
		int y = str2.length();
		return (x+y);
	}

	public int soma(int x, String str3){
		int k = x*str3.length();
		return k;
	}	

}