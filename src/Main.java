import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String nombres;
        int pago;
        String nombreA;
        int pagoA;
        String nombreB;
        int pagoB;
        String nombreC;
        int pagoC;
        String nombreD;
        int pagoD;
        pago = 800000;
        pagoA = 800000;
        pagoB = 800000;
        pagoC = 800000;
        pagoD = 800000;
        double horas;
        double horasA;
        double horasB;
        double horasC;
        double horasD;
        System.out.println("hola buenas tardes señor o señora usuario le pedimos que digite su nombre");
        nombres = Sc.nextLine();
        System.out.println("hola usuario porfavor digita horas trabajadas para saber su equivalente a su sueldo");
        horas = Sc.nextInt();
        System.out.println("su nombre es " +nombres+   " y sus horas son "  +horas+ "");
        System.out.println("y su pago es " +pago+ " gracias por consultar nuestro servicio de sueldo esperamos que vuelva pronto ");
        System.out.println("hola buenas  digita tu nombre");
        nombreA = Sc.nextLine();
        System.out.println("hola buenas digita tu edad");
        horasA = Sc.nextInt();
        System.out.println("hola usuario porfavor digita horas trabajadas para saber su equivalente a su sueldo");
        pagoA = Sc.nextByte();
        System.out.println("su nombre es " +nombreA+ " y sus horas son "  +horas+ "" );
        System.out.println("y su pago es " +pagoA+ " gracias por consultar nuestro servicio de sueldo esperamos que vuelva pronto ");
        System.out.println("hola buenas digita tu nombre");
        nombreB = Sc.nextLine();
        System.out.println("hola buenas digita tu edad");
        horasB = Sc.nextInt();
        System.out.println("hola usuario porfavor digita horas trabajadas para saber su equivalente a su sueldo");
        pagoB = Sc.nextByte();
        System.out.println("su nombre es " +nombreB+  " y sus horas son "  +horas+ "" );
        System.out.println("y su pago es " +pagoB+ " gracias por consultar nuestro servicio de sueldo esperamos que vuelva pronto ");
        System.out.println("hola buenas digita tu nombre");
        nombreC = Sc.nextLine();
        System.out.println("hola buenas digita tu edad");
        horasC = Sc.nextInt();
        System.out.println("hola usuario porfavor digita horas trabajadas para saber su equivalente a su sueldo");
        pagoC = Sc.nextByte();
        System.out.println("su nombre es " +nombreC+ " y sus horas son "  +horas+ "");
        System.out.println("y su pago es " +pagoC+ " gracias por consultar nuestro servicio de sueldo esperamos que vuelva pronto ");
        System.out.println("hola buenas digita tu nombre");
        nombreD = Sc.nextLine();
        System.out.println("hola buenas digita tu edad");
        horasD = Sc.nextInt();
        System.out.println("hola usuario porfavor digita horas trabajadas para saber su equivalente a su sueldo");
        pagoD = Sc.nextByte();
        System.out.println("su nombre es " +nombreD+ " y sus horas son "  +horas+ "" );
                System.out.println("y su sueldo es " +pagoD+ "gracias por consultar nuestro servicio de sueldo esperamos que vuelva pronto ");
        System.out.println("GRACIAS POR CONSULTAR CON NUESTRO SERVICIO Y QUE TENGA UN BUEN DIA");


    }

}