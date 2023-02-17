// import java.lang.String;
import java.util.Scanner;

public class testes {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String inputWord;
		do {
			inputWord = sc.nextLine();
			String ac = acronimo(inputWord);
			System.out.printf("%s\n", ac);

		} while (!inputWord.isEmpty());
	}

	public static String acronimo(String inputWord) {
		String acro = new String();
		for (int i = 0; i < inputWord.length(); i++) {
			char testedChar = inputWord.charAt(i);
			if (Character.isUpperCase(testedChar)) {
				acro += testedChar;
			}
		}
		return acro;
	}
}

// public class testes {
// 	public static void main(String[] args) {
// 		System.out.println(isPalindromo("subi ibus"));
// 	}
// 	static boolean isPalindromo(String t) {
// 		String tReverse = reverseString(t);

// 		return t.equals(tReverse);
// 	}

// 	static String reverseString(String t) {
// 		StringBuilder sb = new StringBuilder(t);
// 		return sb.reverse().toString();
// 	}
// }

// public class testes {
// 	public static void main(String[] args) {
// 		System.out.println(isPalindrome("subi  ibus"));
// 	}
// 	static boolean isPalindrome(String s) {
// 		int n = s.length();
// 		for (int i = 0; i < (n/2); ++i) {
// 			if (s.charAt(i) != s.charAt(n - i - 1)) {
// 				return false;
// 			}
// 		}
// 		return true;
// 	}
// }

// public class testes {
//     public static void main(String[] args) {
//         String s1, s2;
//         s1 = "java";
//         char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
//         s2 = new String(ch);
//         System.out.println(s1);
//         System.out.println(s2);
//     }
    
// }

// import java.util.Scanner;
// import static java.lang.System.*;

// public class testes {
// 	public static Scanner sc = new Scanner(System.in);
	
// 	public static void main(String[] args) {
// 		String hr = "================================================";
// 		out.print("Insere um paragrafo: ");
// 		String texto = sc.nextLine();
		
// 		out.println(hr);
// 		out.println("Tudo em minusculas: ");
// 		out.println(toLowerCase(texto));
		
// 	}
	
// 	static String toLowerCase (String t) {
// 		return t.toLowerCase();
// 	}
// }