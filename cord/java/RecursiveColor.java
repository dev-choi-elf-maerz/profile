public class RecursiveColor {
    
    static final int SIZE = 5;
	static final int COLOR = 2;
	
	static int[][] colorMap = {
			               {0,0,0,0,0},
			               {0,0,1,1,0},
			               {0,0,0,0,1},
			               {0,0,0,0,0},
			               {0,0,1,0,0}
                        };
    public static void main(String[] args) {
        
        for (int i = 0; i < SIZE; i++){
			for (int j = 0; j < SIZE; j++){
				System.out.print(colorMap[i][j] + " ");
			}
			System.out.println();
		}       
		System.out.println();
		
		colorConversion(0, 0);
		
		for (int i = 0; i < SIZE; i++){
			for (int j = 0; j < SIZE; j++){
				System.out.print(colorMap[i][j] + " ");
			}
			System.out.println();
		}
 
    }

    public static void colorConversion(int x, int y) {
		
		if (colorMap[x][y] != 1) colorMap[x][y] = COLOR;

        if (x - 1 >= 0 && colorMap[x - 1][y] != COLOR && colorMap[x - 1][y] != 1) colorConversion(x - 1, y);

        if (x + 1 <= SIZE - 1 && colorMap[x + 1][y] != COLOR && colorMap[x + 1][y] != 1) colorConversion(x + 1, y);

        if (y + 1 <= SIZE - 1 && colorMap[x][y + 1] != COLOR && colorMap[x][y + 1] != 1) colorConversion(x, y + 1);

        if (y - 1 >= 0 && colorMap[x][y - 1] != COLOR && colorMap[x][y - 1] != 1) colorConversion(x, y - 1);
		
	}
}

/*
 * 0을 모두 2로 색칠하시오. 
 * (단, 0은 어떻게든 모두 연결됨)
 * 
 * 00000        22222
 * 00110        22112
 * 00001   =>   22221
 * 00000        22222
 * 00100        22122
 */