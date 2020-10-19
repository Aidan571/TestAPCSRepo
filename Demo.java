public class Demo{
  public static void printLoop(int n){
  for(int i = 1; i <= n; i++){
    for(int j = 1; j <= n - i + 1; j++ ){
       System.out.print(i);
    }
    System.out.println();
  }
}
  public static void main(String[]args){
    printLoop(5);
    printLoop(10);
    printLoop(3);
  }
}
