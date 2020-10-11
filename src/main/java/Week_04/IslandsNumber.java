package Week_04;

/**
 * @author djcd
 * @version V1.0
 * @ClassName：AssignCookies
 * @Description：TODO
 * @date 2020/10/12 0:10
 */
public class IslandsNumber {

	public int numIslands(char[][] grid) {

		int count = 0;

		for (int i=0; i < grid.length; i++) {

			for (int j=0; j < grid[0].length; j++) {

				if (grid[i][j] == '1') {
					count++;
					updateGrid(i, j, grid);
				}

			}
		}
		return count;

	}

	void updateGrid(int i, int j, char[][] grid) {

		if (i>=grid.length || i<0 || j>= grid[0].length || j<0 ||  grid[i][j] == '0' ) {
			return;
		}

		grid[i][j] = '0';

		updateGrid(i-1, j, grid);
		updateGrid(i+1, j, grid);
		updateGrid(i, j-1, grid);
		updateGrid(i, j+1, grid);

	}
}
