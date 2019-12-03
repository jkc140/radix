/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radixsortalgorithm;

/**
 *
 * @author S331474817
 */
public class RadixSortAlgorithm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] array=new String[3];
        array[0]="1000";
        array[1]="435";
        array[2]="1234";  
        
        int max=0;
        for(int x=0;x<array.length;x++){
            if(max<array[x].length()){
                max=array[x].length();
            }
        }
        for(int x=max;x>0;x--){
           /* look at the last number array[array[x].length] of each sort*/
        }
    }
    
}
