import java.util.Scanner;
public class Main{
    
    public static void main(String[] args){
        //Creacion de Objetos
        Data dataObj = new Data();
        Usuarios usuarioObj = new Usuarios();
    
            //Inicio menu principal
            Scanner scan = new Scanner(System.in);
            int menu=1;
            while(menu!=5){
            System.out.println("Menu Principal: "+"\n 1.Crear Usuario"+"\n 2.actualizar contraseña"+"\n 3.Conocer total Usuarios"+"\n 4.Imprimir promedio"+"\n 5.Salir");
            menu = scan.nextInt();
            switch(menu){
                case 1: 
                dataObj.creaUsuarios();
                System.out.println();
                break;

                case 2:
                dataObj.actualizarContraseña();
                break;

                case 3:
                dataObj.imprimirUsuarios();
                break;
                case 4:
                dataObj.imprimirPromedio();
                break;
                case 5:
                menu=5;
                break;
            }}}}
