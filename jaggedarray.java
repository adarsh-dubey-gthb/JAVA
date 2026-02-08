public class jaggedarray {
    static int [][] jagged = new int[3][];
    static{
        jagged[0] = new int[2];
        jagged[1] = new int[4];
        jagged[2] = new int[1];

    }
    public static void main( String[] args){
        for(int i =0; i<jagged.length; i++){
            for(int j=0; j< jagged[i].length; j++){
                System.out.print(jagged[i][j]+" ");
            }
        System.out.println();
    }
}
}
