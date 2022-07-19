/**
 * 
 * @author Jamon, Miles MJ V.
 */
public class MulTable{
    final int INVALID = -987654321;
    public void formatPrint(int[] elems, int maxColSize, int maxSpace, boolean newLine){
        int l = elems.length;
        for(int i=0; i<l; i++){
            String num;
            if(elems[i] == INVALID){
                num = "*";
            }else{
                num = String.valueOf(elems[i]);
            }
            int temp = (int) Math.log10((double) num.length()) + 1;
            int j=0;
            for( ; j<num.length(); ){
                System.out.print(num.charAt(j));
                j++;
            }
            while(j < maxColSize){
                System.out.print(" ");
                j++;
            }
            if(i < l-1){
                for(int q=0; q<maxSpace; q++){
                    System.out.print(" ");
                }
            }
        }
        if(newLine)
            System.out.println();
    }
    public void run(int width, int height){
        final int adjust = 2;
        int w = width + adjust;
        int h = height + adjust;
        int[][] table = new int[h][w];
        for(int i=0; i<h; i++){
            for(int j=0; j<w; j++){
                ///System.out.print("" + i + "," + j + " ");
                if( i == 0 && j == 0){
                    table[i][j] = INVALID;
                }else if(i == 0){
					table[i][j] = i+(j-1);
                }else if(j == 0){
					table[i][j] = (i-1)+j;
                }else{
					table[i][j] = (i-1)*(j-1);
                }
            }
            formatPrint(table[i], 3, 1, true);
        }
    }
    public static void main(String[] args){
        MulTable app = new MulTable();
        app.run(5, 5);
        ///app.formatPrint(new int[]{1,2,3,4}, 1, 2, true);
    }
}