public class ConstantComparison {
 
    public static void main(String[] args) {
        
        int constantA = 528;
        int constantB = 293;
        int multiplyValue = 1;

        int[] constantArrayA = new int[3];
        int constantLengthA = 0;
        int conversionA = 0;
        
        do {
            constantArrayA[constantLengthA] = constantA % 10;
            constantA /= 10;
            constantLengthA++;
        } while (constantA > 0);

        for (int i = constantArrayA.length-1; i >=0; i--) {
            constantA += constantArrayA[i] * multiplyValue;
            multiplyValue *= 10;
        }
        System.out.println(conversionA);
        
        multiplyValue = 1;
        
        int[] constantArrayB = new int[3];
        int constantLengthB = 0;
        int conversionB = 0;
        
        do {
            constantArrayB[constantLengthB] = constantB % 10;
            constantB /= 10;
            constantLengthB++;
        } while (constantB > 0);

        for (int i = constantArrayB.length-1; i >=0; i--) {
            constantB += constantArrayB[i] * multiplyValue;
            multiplyValue *= 10;
        }
        System.out.println(conversionB);
        
        if (constantA > conversionB) 
            System.out.println(constantA);
        if (constantA < conversionB)
            System.out.println(conversionB);            

    }

}


/*
 * 입력: 734 893
 * 출력: 437
 */
