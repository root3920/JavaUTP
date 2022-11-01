import java.util.ArrayList;
import java.util.Scanner;

public class Banco{

        Usuarios usuarioObj = new Usuarios(); //Creacion Objeto de Usuario
       
    public int mensajeBienvenida(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba su clave unica: ");
        int clave = scan.nextInt();
        return clave; 
        }

    public int mensajeBienvenida2(){
        Scanner scan = new Scanner(System.in);
            System.out.println("Escriba su numero de cuenta: ");
            int cuenta = scan.nextInt();
            return cuenta; 

    }

    public boolean verificarCuenta(ArrayList<Usuarios> array, int cuenta,int clave){
        boolean verificacion = false;
        for(Usuarios usuarios : array){
            if(usuarios.nCuenta == cuenta && usuarios.clave == clave){
               verificacion = true;
               System.out.println("!Bienvenido "+usuarios.nombre+"!"+"\nNumero de cuenta: "+usuarios.nCuenta);
               break;
            }}
                if(!verificacion){
                    System.out.println("Su clave o cuenta es incorrecta");}
            return verificacion;
    }

    public void mensajeDespedida(){
        System.out.println("¡Fue un placer servirte!"+"\nEspero que regreses pronto");
    }

}