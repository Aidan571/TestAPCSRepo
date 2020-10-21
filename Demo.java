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
    for(int h = 0; h < rows; h ++){
      arr[h][i] = 3;
    }
  }
  return arr;
}
  public static void main(String[]args){
    int[]x = {1};
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
    System.out.println(arrayDeepToString(create2DArray(5,3,5)).replace("},","},\n"));
  }
}
