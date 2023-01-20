import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		double armut = 2.14,elma = 3.67,domates = 1.11,muz = 0.95,patlican = 5.00;

		double alinanArmut,alinanElma,alinanDomates,alinanMuz,alinanPatlican,result;

		Scanner input = new Scanner(System.in);


		System.out.print("Aldığınız Armutun Kilosunu Giriniz:");
		alinanArmut = input.nextDouble();

		System.out.print("Aldığınız Elma nın Kilosunu Giriniz:");
		alinanElma = input.nextDouble();

		System.out.print("Aldığınız Domates in Kilosunu Giriniz:");
		alinanDomates = input.nextDouble();

		System.out.print("Aldığınız Muz un Kilosunu Giriniz:");
		alinanMuz = input.nextDouble();

		System.out.print("Aldığınız Patlıcan ın Kilosunu Giriniz:");
		alinanPatlican = input.nextDouble();

		 result = (armut * alinanArmut + elma * alinanElma + domates * alinanDomates + muz * alinanMuz + patlican * alinanPatlican);


		System.out.println("Toplam Ödeyeceğiniz:" + result + "TL");


	}
}