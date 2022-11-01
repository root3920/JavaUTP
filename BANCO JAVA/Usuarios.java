import java.util.ArrayList;
import java.util.Scanner;
public class Usuarios{
    String nombre;
    int nCuenta;
    double saldo = 1000;
    protected int clave;
    boolean cuentaActiva = true;
    ArrayList<Usuarios> totalUsuarios = new ArrayList<Usuarios>();//Lista de Usuarios Activos

    public Usuarios(){}//Constructor vacio de clase Usuarios

    public Usuarios(String nombre,int nCuenta,int clave){//Constructor de creacion de Usuario
    this.nombre = nombre;
    this.nCuenta = nCuenta;
    this.clave = clave;
    }
   
    public void deposito(){//Deposito en la cuenta
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Escriba el monto a depositar: ");
            int deposito = scan.nextInt();
    if(this.saldo<5000 && this.cuentaActiva==true){//Controla que el saldo sea menor a 5000 dolares
        this.saldo = this.saldo + deposito;
        if(this.saldo>5000){//Controla que el saldo no sobrepase los 5000 dolares
            System.out.println("Usted ha excedido el limite permitido."+"\nConsulte con su banco");
            this.cuentaActiva = false;
        }else{
            System.out.println("Su nuevo saldo es: "+"$"+this.saldo);//Imprime el balance de la cuenta actualizado
        }}else{
            System.out.println("Su cuenta no esta activa");
        }
        }catch(Exception e){
            System.out.println("Ha ocurrido un problema."+"\nIntentelo más tarde.");//Mensaje de error
        }
       
        }
      
    public double getSaldo(){
        return this.saldo;
    }
    
    public void retiro(){//Deposito en la cuenta
        Scanner scan = new Scanner(System.in);
        try{//Inicio Try-Catch
            System.out.println("Escriba el monto a retirar: ");
            int retiro = scan.nextInt();
    if(this.saldo>0 && retiro>4 && this.cuentaActiva==true){//Controla que el saldo sea mayor a 0 dolares y el valor a sacar sea minimo de 5 dolares
        this.saldo = this.saldo - retiro;
        if(this.saldo<0){//Controla que el saldo no sea negativo
            System.out.println("Fondos Insuficientes."+"\nConsulte con su banco");
            this.saldo = this.saldo + retiro; 
        }else{
            System.out.println("Su nuevo saldo es: "+"$"+this.saldo);//Imprime el balance de la cuenta actualizado
        }}else{
            System.out.println("Su cuenta no esta activa");
        }//fin del if
        }catch(Exception e){//Final Try-Catch
            System.out.println("Ha ocurrido un problema."+"\nIntentelo más tarde.");//Mensaje de error
        }
       
        }//fin del if-else
    }
