package programs;

public class Allinone {

	public static void main(String[] args) {

		String s = "123@#$%abh67i";
		char[] ch = s.toCharArray();
		String alp = "";
		String num = "";
		String spl = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] > 'a' && ch[i] < 'z') {
				alp = alp + ch[i];
			} else {
				
					if (ch[i] > '0' && ch[i] < '9') {
						num = num + ch[i];
					} else {
						spl = spl + ch[i];
					}
					
				}
			
			}
		System.out.println(alp);
		System.out.println(num);
		System.out.println(spl);

		}

	}

