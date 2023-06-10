public class printAllPatth {
    public static void ratInMaze(int[][] maze){
        int n= maze.length;
        int[][] path = new int[n][n];
        printallpaths(maze,0,0,path);
    }
    public static void printallpaths(int[][] maze , int i, int j, int[][] path){
        int n= maze.length;

        if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1){
            return;
        }
        path[i][j]=1;

        if(i == n - 1 && j == n-1){
            for (int row = 0; row < n; row++) {
                for (int col = 0; col < n; col++) {
                    System.out.print(path[row][col]+" ");
                }
                System.out.println();
            }
            System.out.println();
            path[i][j]=0;
            return;
        }
        //top
        printallpaths(maze, i-1, j, path);
        //right
        printallpaths(maze, i, j+1, path);
        //down
        printallpaths(maze,i+1, j, path);
        //left
        printallpaths(maze, i, j-1, path);
        path[i][j]=0;
    }
    public static void main(String[] args) {
         int[][] maze = {{1,1,0},{1,1,0},{1,1,1}};
         ratInMaze(maze);
    }
}
