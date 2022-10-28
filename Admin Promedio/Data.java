import java.util.ArrayList;
import java.util.Scanner;
public class Data{
    ArrayList<Usuarios> usuarios = new ArrayList<Usuarios>();
    
public void creaUsuarios(){
    double nota =0;
    Double[] notas = new Double[5];
//Consulta nombre y password
Scanner scan = new Scanner(System.in);
System.out.println("Escriba su username:");
String username = scan.nextLine();
System.out.println("Escriba su password:");
String password = scan.nextLine();
//consulta 5 notas para sacar el promedio
   for(int i=0;i<notas.length;i++){
    System.out.println("Escriba nota "+(i+1));
        notas[i] = scan.nextDouble();
        nota+=notas[i];
       }
       //saca promedio
   Double promedio = nota/5;
   //crea objeto(Usuario)
   usuarios.add(new Usuarios(username, password, promedio, notas));
}

public void imprimirUsuarios(){
    //imprime total de usuarios registrados
    for (Usuarios usuarios2 : usuarios){
    System.out.println(usuarios2.username);
    }
}

public void actualizarContraseña(){

    //boolean verficador = false;
    Scanner scan = new Scanner(System.in);
    try{

   
    //Solicita contraseña antigua
    System.out.println("Escriba su contraseña antigua: ");
    String oldPassword = scan.nextLine();
    //Verifica la contraseña antigua existe (Seguridad)
    for (Usuarios usuarios2 : usuarios){
        if(usuarios2.password.equals(oldPassword)){
            //verficador = true;
            //Si existe. Solicita que escriba una nueva contraseña
            System.out.println("Escriba su contraseña nueva: ");
            String newPassword = scan.nextLine();
            //Actualiza contraseña del usuario
            usuarios2.actualizarContraseña(newPassword);
            System.out.println("Su nueva contraseña es:"+newPassword);
            }}
        }catch(Exception e){

        
         //Si no existe la contraseña antigua
         //if(!verficador){
            System.out.println("Su contraseña es Incorrecta");
            }}
        
        
      public void imprimirPromedio(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Escoja el usuario para saber su promedio: ");
        int j = 1;
        for (Usuarios usuarios2 : usuarios){
            
            System.out.println(j+". "+usuarios2.username);
            j = j+ 1;
      }
      int n = scan.nextInt();
      n=n-1;
      for(int i=0;i<5;i++){
        System.out.print(usuarios.get(n).notas[i]+"\n");
      }
      System.out.println("Su promedio es: "+usuarios.get(n).promedio);

    }
    }