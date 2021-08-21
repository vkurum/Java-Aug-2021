/*----------------------------------------------------------------------------------------------------------------------
	Derleyiciler bir takım mesajlar verebilirler. Bu tür mesajlara "teşhis mesajları (diagnostics)" denir. Java derleyicisi
	3(üç) çeşit mesaj verebilir:
	1. Gerçek hatalar (errors): Dilin sentaks ve/veya semantik kurallarına uyulmamasından kaynaklanan hatalardır. Derleyici
	bu hatalara yönelik mesajlar verir. Bu durumda ara kod (byte code) üretilmez. Programcının bu hataları düzeltmesi
	gerekir.

	2. Uyarılar (warnings): Derleyicinin olası bir programlama hatası olabileceğini gördüğü sentaks ve semantik olarak
	bir problemin olmadığı durumlarda verilir. Bu durum arakodun üretimini engellemez. Ancak programcının uyarıcı 
	mesajlarını mutlaka dikkate alması gerekir. Özel durumlar dışında (ki bunlar da geliştirme sırasında olur) uyarı
	mesajları içeren kodlar düzeltilmelidir. Pratikte bir uygulamanın hiçuyarı mesajı olmayacak şekilde derlenmesi
	ve ürün haline getirilmesi (build) hedeflenmelidir. Bazı durumlarda IDE programlar derleyici dışında kendi uyarı
	mesajlarını verebilirler. Bunlar da dikkate alınmalıdır. Yine emin olmadıkça bu uyarılarla devam edilmemelidir.

	3. Ölümcül hatalar (fatal errors): 
----------------------------------------------------------------------------------------------------------------------*/
package csd;

class App {	
	public static void main(String [] args)  
	{
		Sample.foo();
	}
}

