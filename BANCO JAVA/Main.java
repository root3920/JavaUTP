import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Usuarios usuarioObj = new Usuarios(); //Creacion Objeto de Usuario
        Banco bancoObj = new Banco();
        usuarioObj.totalUsuarios.add(new Usuarios("Federico Alarcón",03,2002));
        usuarioObj.totalUsuarios.add(new Usuarios("Carlos Alarcón",18,1978));
        usuarioObj.totalUsuarios.add(new Usuarios("Carolina Uribe",28,1982));
        usuarioObj.totalUsuarios.add(new Usuarios("Ana Gabriela Ayala",20,2003));
        //Login de seguridad
        int cuenta = bancoObj.mensajeBienvenida2();
        int clave = bancoObj.mensajeBienvenida();

        //Verifica la cuenta
       boolean verificacion = bancoObj.verificarCuenta(usuarioObj.totalUsuarios,cuenta,clave);
       if(verificacion==true){
        int menuPrincipal=0;
        while(menuPrincipal!=3){//bucle menu principal
            Scanner scan = new Scanner(System.in);
            System.out.println("MENU PRINCIPAL: "+"\n[1] DEPOSITO"+"\n[2] RETIRO"+"\n[3] SALIR");
            menuPrincipal = scan.nextInt();
            switch (menuPrincipal){//inicio menu principal
                case 1://Caso 1: Deposito
                System.out.println("MENU DEPOSITO: "+"\n[1] CONOCER SALDO ACTUAL"+"\n[2] DEPOSITO");
                int menuDeposito = scan.nextInt();
                if(menuDeposito==1){
                    System.out.println("Su saldo actual es: "+"$"+usuarioObj.getSaldo());}
                if(menuDeposito==2){
                    usuarioObj.deposito();}
                    break;
                    case 2://Caso 2: Retiro
                System.out.println("MENU RETIRO: "+"\n[1] CONOCER SALDO ACTUAL"+"\n[2] RETIRO");
                int menuRetiro = scan.nextInt();
                if(menuRetiro==1){
                    System.out.println("Su saldo actual es: "+"$"+usuarioObj.getSaldo());}
                if(menuRetiro==2){
                    usuarioObj.retiro();}
                    break;
                    case 3:
                    bancoObj.mensajeDespedida();
                    break;
                    default:
                    System.out.println("Escriba un numero valido");
               }//fin del switch case
        }//fin del ciclo del menu principal
}//fin del if verificador
}}//fin del metodo main y de la clase