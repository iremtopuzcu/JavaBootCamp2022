package classes;

/* 
 * 'class'ların ilk ve temel özelliği gruplama yapmaktır.
 * 'class'lar referans tiptir.
 */
public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		

		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
/*
 * int-double-float-byte; Bu sayısal değişkenler değer tipidir, bunlara value type denir.
 * diziler referans tiptir.
 */
		int sayi1 = 60;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1= 30;
		System.out.println(sayi2);
		
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2);
		
		

	}

}
