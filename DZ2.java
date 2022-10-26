//Обработайте возможные исключительные ситуации. “Битые” значения в исходном массиве считайте нулями.
// Можно внести в код правки, которые считаете необходимыми

public class DZ2{
  public static void main(String[] args){
    String[][] a = new String[5][5];
    int s = 0;
    for(int i=0; i< a.length; i++){
      for(int j=0;j < 5; j++){
        a[i][j]="0"+j;
        System.out.print(a[i][j]+" ");
        try{
          int val = Integer.parseInt(a[i][j]);
          s+=val;
        }
        catch(NumberFormatException e){
          System.out.println("Catching exception: " + e);
        }
                               
      }
      System.out.println(s);
    }
  }
}