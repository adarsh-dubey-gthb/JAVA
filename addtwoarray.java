public class addtwoarray {
    
 public static void main(String[] args){
    int[] array1 = {1,2,3,4,5};
    int[] array2 = {5,3,2,4,5};
    int[] result = new int[array1.length];
    for(int i =0; i< array1.length; i++){
        result[i] = array1[i]+array2[i];
    }
    System.out.println("Result: ");
    for( int i =0; i<result.length; i++){
        System.out.println(result[i]);
    }

 }


}