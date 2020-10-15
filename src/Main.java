/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.getXO("zzoo"));
    }
    
    public boolean getXO(String str){
        int xCounter = 0;
        int oCounter = 0;
        char[] letters = str.toCharArray();
        
        for(int i = 0 ; i < letters.length; i++){
            
            if(letters[i] == 'x'){
                xCounter++;
            }
            
            if(letters[i] == 'o'){
                oCounter++;
            }
            
        }
        
        
        
        return xCounter == oCounter;
    }
    
}
