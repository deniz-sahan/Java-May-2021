/*----------------------------------------------------------------------------------------------------------------------
    Sınıf Çalışması: Komut satırı argümanı ile text bir dosyanın içerisindeki yine komut satırı ile aldığı bir karakterden
    kaç tane olduğunu ekrana basan programı yazınız. Programın ismini dilediğiniz gibi verebilirsiniz
        Kullanım örneği: java org.csystem.app.App test.txt a
    Burada test.txt dosyasında a karakterinden kaç tane olduğu bulunacaktır. Komut satırından verilen ikinci argümanın
    tek bir karakter olduğu kontrol edilecektir.
    	Program ikinci argüman olarak aşağdaki gibi ters bölü ile özel karakterleri de kabul edebilecektir:
    	\n -> line feed
    	\r -> carriage return
    	\t -> horizontal tab
    	\s -> space
    	Örneğin:
    		java org.csystem.app.App test.txt \s
    	şeklindeki kullanım space karakterinin sayısını bulacaktır.
----------------------------------------------------------------------------------------------------------------------*/
package org.csystem.app;

import org.csystem.application.io.file.ncharacters.NumberOfCharacterInFileApp;

class App {
	public static void main(String [] args)
	{
		NumberOfCharacterInFileApp.run(args);
	}
}
