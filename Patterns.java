public class Patterns {

    public  static void simplePattern(int rows,int cols){
        for (int i = 1; i <= rows; i++) {
            for (int j=1 ; j<=cols;j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    public  static  void hollowPattern(int rows , int cols){
        for (int i =1 ; i<=rows;i++){
            for (int j=1;j<=cols;j++){
                if (j==1 || j==cols || i==1 || i==rows ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static  void  halfPyramid(int rows){
        for ( int i=1;i<=rows;i++){
            for (int j=1 ; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static  void  invertPyramid(int rows){
        for ( int i=rows;i>=1;i--){
            for (int j=1 ; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static  void  rightPyramid(int rows){
        for ( int i=1;i<=rows;i++){
            for (int j=1 ; j<=rows ;j++){
                if (j>rows-i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public  static  void numberPattern(int rows){
        for (int i =1 ; i<=rows;i++){
            for (int j =1 ; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static  void  invertNumberPattern(int rows){
        for ( int i=rows;i>=1;i--){
            for (int j=1 ; j<=i ;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void NumberPatternIncreasing(int rows,int number){
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print(number+" " );

                number++;


            }
            System.out.println();
        }
    }
    public  static  void  binaryPattern(int rows){
        for (int i =1 ;i<=rows;i++){
            for (int j =1 ;j<=i;j++){
                if (i%2==j%2){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");

                }
        }
            System.out.println();
    }}

    public  static  void butterFlyPattern(int rows){

       for (int i =1 ; i<=rows;i++){

           for (int j=1 ;j<=rows*2;j++){
               if (j<=i || j>rows*2-i){
                   System.out.print("*");
               }
               else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
        for (int i =rows ; i>=1;i--){

            for (int j=1 ;j<=rows*2;j++){
                if (j<=i || j>rows*2-i){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }}
    public  static  void rhombusPattern(int rows,int star){

        for (int i =1 ;i<=rows;i++){
            for (int j =1 ;j<=rows;j++){
                if (j<=rows-i) {
                    System.out.print(" ");
                }
                else{
                    for (int st=1 ;st<=star;st++){
                        System.out.print("*");

                    }
                    break;
                }
            }
            System.out.println();
        }
    }
    public static void numberPyramid(int max_number){
        for (int i =1;i<=max_number;i++){
            for(int j =1 ; j<=max_number;j++){
                System.out.println("ok");

            }

        }

    }


    public static void main(String[] args) {
//        simplePattern(4,5);
//        hollowPattern(5,20);
//        halfPyramid(4);
//        invertPyramid(4);
//        rightPyramid(4);
//        numberPattern(10);
//        invertNumberPattern(5);
//        NumberPatternIncreasing(5,1);
//        binaryPattern(4);
//        butterFlyPattern(10);
        rhombusPattern(10,50);
    }
}
