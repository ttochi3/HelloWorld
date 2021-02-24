package javaStudy;

public class ArrayExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] array4 = new int[3][4];
        array4[0][0] = 10;
        
        int[][] array5 = new int[3][]; //2차원에 크기를 정하지 앟고 시작할 수 있다.
        array5[0] = new int[1]; //사용 전에 2차원의 크기를 설정해야 한다.
        array5[0][0] = 10;
        
        int[][] array6 = {{1},{1,2},{1,2,3}};
        System.out.println(array6[0][0]);
        System.out.println(array6[2][2]);

        // 2차원 배열 array를 출력합니다.
        for(int i = 0 ; i < array6.length; i++) {
            System.out.print( (i+1) + "번째 줄을 출력합니다>");
            for(int j = 0; j< array6[i].length; j++) {
                System.out.print(array6[i][j]+" ");
            }
            System.out.println("");
        }
        
	}

}
