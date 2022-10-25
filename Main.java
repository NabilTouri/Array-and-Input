import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        // Automobile wolksvagen = new Automobile("ga787dz", "touran", "gtx", 280, 2018, 5);

        Scanner scanner = new Scanner(System.in);

        

        Automobile[] benz = new Automobile[5];

        for(int i=0; i<5; i++){
            System.out.print("Targa: ");
            String targa = scanner.nextLine();
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Modello: ");
            String modello = scanner.nextLine();
            benz[i] = new Automobile(targa, marca, modello, i, i, i);
        }

        System.out.println("4° macchina: " + benz[3].getTarga() +" "+ benz[3].getMarca() +" "+ benz[3].getMarca() +" "+ benz[3].getCilindrata() +" "+ benz[3].getAnno() +" "+ benz[3].getNumero());

        // System.out.print("Targa: ");
        // String targa = scanner.nextLine();
        // System.out.print("Marca: ");
        // String marca = scanner.nextLine();
        // System.out.print("Modello: ");
        // String modello = scanner.nextLine();
        // benz= new Automobile(targa, marca, modello, 0, 0, 0);

        // System.out.println("La targa è: "+benz.getTarga());

        scanner.close();
    }
}