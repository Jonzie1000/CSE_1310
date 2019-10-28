
package pkg2darrays;

import java.util.Arrays;



public class Main {

    
    public static void main(String[] args) {
     char[][] table = {{'X','X','O'},
			  {'X','O','O'},
			  {'O','X','O'},
			  {'X','O','X'}};

	for(int i = 0; i<table.length; i++){
		for(int j = 0; j<table[i].length; j++){
			if(table[i][j] == 'X'){
				table[i][j] = 'O';
			}else{
				table[i][j] = 'X';
}
}
}
System.out.println(Arrays.deepToString(table));
}
}
        
    
    

