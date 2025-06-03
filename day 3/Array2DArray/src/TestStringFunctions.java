
public class TestStringFunctions {

	public static void main(String[] args) {
		//String[] strarr=new String[5];
		String[] strarr= {"Kishori","Rajan","Revati","Anil","Deepa"};
		for(int i=0;i<strarr.length;i++) {
			System.out.println(strarr[i].toUpperCase());
		}
		System.out.println("--------------------------------");
		//to display strings with name starts with R
		for(int i=0;i<strarr.length;i++){
			if(strarr[i].startsWith("R")) {
			System.out.println(strarr[i]);
			}
		}
		//to find position of the substring
		for(int i=0;i<strarr.length;i++) {
			System.out.println(strarr[i]+"---> a is at "+strarr[i].indexOf("a")+"---->"+strarr[i].charAt(0)+"---"+strarr[i].contains("a"));
		}
		String s="test";
		s.concat("ing");
		System.out.println(s.concat("xxx")); //test, testing, testxxx,compiletime error
		//StringBuffer and String Builder classes are mutable strings
		StringBuilder sb=new StringBuilder("Hello");
		sb.append(" everyone");
		System.out.println(sb);//Hello everyone
		StringBuffer sbuf=new StringBuffer("Testing");
		sbuf.append("xxxxx");
		System.out.println(sbuf); ///Testingxxxxx
	}

}
