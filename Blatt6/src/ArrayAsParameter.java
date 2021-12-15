class Aasp{
  int a[];
  void initA(){
    a=new int[3];
    a[0]=-999;
  }
  
  int getA0(){
    return a[0];
  }

  void primPara(int a){
    a=5;
  }
  
  void arrayPara(int a[]){
    a[0]=5;
  }

  void runMain(){
	  
    int i=10;
    int b[]=new int[1];
    a[0]=10;

    initA();
    
    
    System.out.print("Primitiver Datentyp:\t"+i);
    primPara(i);
    System.out.println(" -- "+i);
    
    System.out.print("Array\t\t\t"+a[0]);
    arrayPara(a);
    System.out.println(" -- "+a[0]);
    System.out.println("Instanzvariable: -- "+getA0());
 
  }
}

class ArrayAsParameter{
  public static void main(String args[]){
    Aasp a=new Aasp();
    a.runMain();
  }
}

