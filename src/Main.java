import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        FileReader f1 = new FileReader("src/giris.txt");//dosya yolu verilir. CMDden gelen dosya adı. dist klasörünün içinde olmalı.
        f1.ReadFromFile();//Dosya okuma metodunu �a��r�r.
    }
}

//todo: after the prosess is age is 20, it should show a message that the process is terminated.

//todo: find why it says null in 21. second.