package javaStudy;

public class ArrayExam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[][] array4 = new int[3][4];
        array4[0][0] = 10;
        
        int[][] array5 = new int[3][]; //2������ ũ�⸦ ������ �۰� ������ �� �ִ�.
        array5[0] = new int[1]; //��� ���� 2������ ũ�⸦ �����ؾ� �Ѵ�.
        array5[0][0] = 10;
        
        int[][] array6 = {{1},{1,2},{1,2,3}};
        System.out.println(array6[0][0]);
        System.out.println(array6[2][2]);

        // 2���� �迭 array�� ����մϴ�.
        for(int i = 0 ; i < array6.length; i++) {
            System.out.print( (i+1) + "��° ���� ����մϴ�>");
            for(int j = 0; j< array6[i].length; j++) {
                System.out.print(array6[i][j]+" ");
            }
            System.out.println("");
        }
        
	}

}
