import java.util.Scanner;

public class Usuarios{
String username;
String password;
Double promedio;
Double[] notas = new Double[5];
Data dataObj = new Data();
public Usuarios(){

}
public Usuarios(String username, String password, Double promedio, Double[] notas){
    
    this.username = username;
    this.password = password;
    this.promedio = promedio;
    this.notas = notas;
}


//actualiza contraseña del usuario
public void actualizarContraseña(String password){



this.password = password;
}


//Si el usuario inicia sesión:
public static void login(Double promedio, Double[] notas){
    int menulogin=1;
    Scanner scan = new Scanner(System.in);
    do{
        //Menu de login:
 System.out.println("Menu Login: "+"\n 1.Imprimir Promedio"+"\n 2.Cerrar Sesión");
           menulogin = scan.nextInt();
           //El usuario digitó el numero 1:
            if(menulogin==1){
                //Imprime promedio del usuario
                for(int i=0;i<notas.length;i++){
                   System.out.print(notas[i]+"\n"); 
                }
                System.out.println("Su promedio es: "+promedio);
            }
        }while(menulogin==1);
        }
}
