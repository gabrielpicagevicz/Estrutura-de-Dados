package estruturadeDados;

/*5. Escreva um programa chamado Armstrong para imprimir todos os números Armstrong
entre 1 e 500. Um número é chamado número Armstrong se a soma dos cubos de cada um
de seus dígitosfor igual ao próprio número. Por exemplo, 153 = (1∗1∗1)+(5∗5∗5)+(3∗3∗3)
é um número Armstrong.
 
 */
public class ex05Armstrong {

	public static void main(String[] args) {
		int a, b, c, d;
		
		
		System.out.println("Os números Armstrong entre 1 e 500 são: ");
		
		for(int num = 1; num <= 500; num++) {
		a = num / 100;
        b = (num - a * 100) / 10;
        c = (num - a * 100 - b * 10);
        d = a * a * a + b * b * b + c * c * c;
        if (num == d){
        	System.out.println(num);
        }

}
}
	}