/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesYobjetos;

import java.util.Scanner;

/**
 *
 * @author Admin
 */

public class Lista {
    Nodo primero;
Nodo ultimo;
Nodo pivote;
Nodo ayuda;
Lista()
{
primero=ultimo=pivote=null;
}
public void insertar_ayu(Object nomb)
{
Nodo ayuda = pivote;
if(pivote==null)
{
primero=ultimo=pivote=new Nodo(nomb);
}
else
{
insertar(nomb,ayuda);
}
}
public void insertar(Object nomb,Nodo puntero)
{
if(puntero==null)
{
Nodo temporal = new Nodo(nomb);
if (pivote.nombre.toString().compareTo(temporal.nombre.toString())>0)
{
primero.ant =temporal;
temporal.sig = primero;
primero = temporal;
}
else if (pivote.nombre.toString().compareTo(temporal.nombre.toString())<0)
{
ultimo.sig=temporal;
temporal.ant = ultimo;
ultimo = temporal;
}
}
else if (pivote.nombre.toString().compareTo(nomb.toString())>0)
{
insertar(nomb,puntero.ant);
}
else if (pivote.nombre.toString().compareTo(nomb.toString())<0)
{
insertar(nomb,puntero.sig);
}
}

public void imprimir_ayu()
{
Nodo aux = primero;
imprimir(aux);
}

public void imprimir(Nodo puntero)
{
if(puntero!=null)
{
System.out.println("Nombre:" + puntero.nombre.toString() + " n ");
imprimir (puntero.sig);
}
}


public void acomodar_i_ayu()
{
Nodo aux=primero;
acomodar_i(aux);
}


public void acomodar_i(Nodo puntero)
{
if(pivote==null)
{

}
else
{
if(puntero.sig!=null)
{
if(puntero.nombre.toString().compareTo(puntero.sig.nombre.toString())>0)
{
Nodo temporal = new Nodo (puntero.nombre.toString());
puntero.nombre = puntero.sig.nombre;
puntero.sig.nombre = temporal.nombre;
}
acomodar_i(puntero.sig);
}
}
}


public void busqueda_ayu(Object nomb)
{
Nodo aux = pivote;
busqueda(nomb,aux);
}



public void busqueda(Object nomb,Nodo puntero)
{
if(pivote==null)
{
System.out.print("La lista esta vacia");
}
else
{
try
{
if(puntero==null)
{
System.out.print("No se encontro: "+nomb.toString());
}
else
{
if(puntero.nombre.equals(nomb))
{
System.out.print("Se encontro : "+puntero.nombre.toString());
}
else if(puntero.nombre.toString().compareTo(nomb.toString())<0)
{
busqueda(nomb,puntero.sig);
}
else if(puntero.nombre.toString().compareTo(nomb.toString())>0)
{
busqueda(nomb,puntero.ant);
}
}
}
catch(StackOverflowError e)
{
System.out.print("No se encontro");
}
}
}
public static void main(String[] args) 
{
Lista L = new Lista();
Scanner leer = new Scanner(System.in);
do
{

System.out.println("::Bienvenido::n  ");
System.out.print("1.-Ingresar n  \n2.-Mostrar n  \n3.-Buscar n  \n4.-Salir del programa>> ");
int opcion = leer.nextInt();
switch(opcion)
{
case 1:
String nomb;
System.out.print("Ingrese nombre: ");
nomb = leer.next();
L.insertar_ayu(nomb);
break;
case 2:
L.acomodar_i_ayu();
L.imprimir_ayu();
break;
case 3:
L.acomodar_i_ayu();
String nom_bus;
System.out.print("Ingrese nombre: ");
nom_bus = leer.next();
L.busqueda_ayu(nom_bus);
break;
case 4:
System.exit(0);
break;
}

}
while(true);
}
}
