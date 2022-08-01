package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public static void main(String[] args) {
        new Pyramid().printPyramid(9);
    }

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength; j++) {
                if (j > cathetusLength - i) {
                    System.out.print(cathetusLength + 1 - j);
                } else if (j <= cathetusLength - i) {
                    System.out.print(" ");
                }
            }
            for (int j = 2; j <= cathetusLength; j++) {
                if(i<j){
                    continue;
                }
                if(i>=j)
                {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
