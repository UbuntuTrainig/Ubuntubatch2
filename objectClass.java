public class Dog{
String breed;
int ageC;
String color;

void barking(){

}
void hungry(){

}

void sleeping(){
}

}

public class Puppy{

public Puppy(){
}

public Puppy(String name)

// this constructor has one parameter, name.
}
}

//how to use singleton

//File name: Singleton.java
public class Singleton{

private static Singleton singleton = new Singleton( );

/* A private Constructor prevents any other
* class from instantiating.
*/

private Singleton(){
}

/* Static 'instanc' method */
public static Singleton getInstance() {
return singleton;
}
}
/* Other methods protcted by singleton-ness */
protected static void demoMethod( ) {
System.out.println("demoMethod for singleton");
}
}


 // file Name: SingletonDemo.java
public class SingletonDemo{
public static void main(String[]) args) {
Singleton tmp = Singleton.getInstance( );
tmp.demoMethod( );
}
}

private class ClassicSingleton{
private static ClassicSingleton intance = null;
private ClassicSingleton(){
//Exists only to defeat instatiation.
}
public static ClassicSingleton getInstance(){

if(instance = null){
instance = new ClassicSingleton();
}
return instance;
}
}

//following is an example of creating an object:

public class Puppy{

public Puppy(String name){

//This constructor has one parameter, name.
System.out.printin("Passed Name is : " + name );
}

public static void main(String []args){
//Following statement would create an object myPuppy
Puppy myPuppy = new Puppy("tommy");
} 
}


/* First create an object */
ObjectReference = new Construction();

/* Now call a variable as follows */
ObjectReference.variableName;

/* Now you can call a class method as follows */
ObjectReference.MethoName();

//this example explains how to access instance variables and methods of a class.

public class Puppy{

int  puppyAge;
public Puppy(String name){
//this constructor has one parameter, name;
System.out.printin("Name chosen is :" + name );
}

public void setAge( int age ){
puppyAge  = age;
}

public int getAge( ){
System.out.printin("Puppy's age is :" + puppyAge);
return puppyAge;
}

puplic static void main(String []args){
/*Object creation */
Puppy myPuppy = new Puppy("tommy");

/*Call class method to get pupp's age */
myPuppy.setAge(2);

/*Call another class method to get pupp's age */
myPuppy.getAge();

/* You can access instance variable as follows as well */
System.out.printin("Variable value :" + myPuppy.puppyAge );
}
}