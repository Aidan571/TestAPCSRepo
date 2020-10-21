public class Demo{
  public static void printLoop(int n){

  for(int i = 1; i <= n; i++){
    for(int j = 1; j <= n - i + 1; j++ ){
       System.out.print(i);
    }
    System.out.println();
  }

}
public static String arrToString(int[] arr){
String result = "{";
if(arr.length == 0){
    return "{}";
  }
for(int i = 0; i < arr.length; i++){
  if(i == arr.length-1){
    result = result + arr[i] + "}";
  }
  else
  result = result + arr[i] + ", ";
}
return result;
}
public static String arrayDeepToString(int[][] arr){
String result = "{";
for(int i = 0; i < arr.length; i++){
    result = result + arrToString(arr[i]) + ", ";
}
return result + "}";
}
public static int[][] create2DArray(int rows, int cols, int maxValue){
  int[][] arr = new int[rows][cols];
  for(int i = 0; i < cols; i++){
    for(int h = 0; h < rows; h++){
      arr[h][i] = (int)(Math.random() * ((maxValue-0)+1));
    }
  }
  return arr;
}
public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue){
  int[][] arr = new int[rows][];
  int holder;
  for(int i = 0; i < rows; i++){
    holder = (int)(Math.random() * ((cols-0)+1));
    arr[i] = new int[holder];
    for(int h = 0; h < holder; h++){
      arr[i][h] = (int)(Math.random() * ((maxValue-0)+1));
    }
  }
  return arr;
}
  public static void main(String[]args){
    int argument;
    if(args.length == 0){
      argument = 5;
    }
    else
    argument = Integer.parseInt(args[0]);
    printLoop(argument);
    /*int[]x = {1};
    int[]y = {1,2};
    int[]w = {1,2,3};
    int[]z = {1,2,3,4};
    int[]v = {1,2,3,4,5};
    int[][]a = {x,y};
    int[][]b = {w,v};
    System.out.println(arrayDeepToString(a));
    System.out.println(arrayDeepToString(b));
    System.out.println(arrayDeepToString(a).replace("},","},\n"));
    System.out.println(arrayDeepToString(b).replace("},","},\n"));
    System.out.println(arrayDeepToString(create2DArray(argument,3,5)).replace("},","},\n"));
    System.out.println(arrayDeepToString(create2DArrayRandomized(10,10,10)).replace("},","},\n"));*/
  }
}
