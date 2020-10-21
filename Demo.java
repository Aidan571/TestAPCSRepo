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
public static String arrDeepToString(int[][] arr){
String result = "";
String nums1 = arrToString(arr[0]);
String nums2 = arrToString(arr[1]);
result = "{" + nums1 + ", " + nums2 + "}";
return result;
}
  public static void main(String[]args){
    printLoop(5);
    printLoop(10);
    printLoop(3);
  }
}
