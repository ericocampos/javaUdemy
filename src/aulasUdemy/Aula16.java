package aulasUdemy;

/**
 * @author Erico
 * 
 *         Multi-Dimensional Array
 *
 */

public class Aula16 {

	public static void main(String[] args) {
		int[][] grid = {
				{1,2,3,4,5},
				{10,20,30,40,50},
				{100,200,300,400,500}
		};
		
//		System.out.println(grid[2][3]);
		
		for(int row = 0; row < grid.length; row++){
			for(int col = 0; col < grid[row].length; col++){
				System.out.print("Coluna " + col + ": ");
				System.out.print(grid[row][col] + "\t");
			}
			System.out.println("\t Linha " + row);
		}

	}

}
