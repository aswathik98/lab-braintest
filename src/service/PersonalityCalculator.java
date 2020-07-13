package service;


public class PersonalityCalculator{
	public int[] findAnswers(String options) {
		String c[] = options.split(",");
		int n = c.length;
		int a[] = new int[n];

		int count=1;
		for(int i=0;i<n;i++) {
			a[i]= Integer.parseInt(c[i]);
			count = count +1;
			System.out.println("The answer for question - "+count+" is "+a[i]);
		}
		return a;
	}
	
public String findYourBrainType(String options) {
	int[] option = findAnswers(options);
	int x = option[0]+option[1]+option[2]+option[4]+option[7]+option[9]+option[10]+option[11]+option[13]+option[17]+option[19];
	int y = option[3]+option[5]+option[6]+option[12]+option[14]+option[15]+option[16]+option[18];
	int z = 66 - x + y;
	System.out.println("Yor total score "+z);
	if((z>=22)&&(z<=55))
		System.out.println("Left-brained ");
	if((z>=56)&&(z<=64))
		System.out.println( "No clear preference ");
	if((z>=65)&&(z<=100))
		System.out.println( "Right-brained");
return "false";
}
}