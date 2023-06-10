
public class PrintAllPath {
    public static void ratInMaze(int maze[][]){
        int n=maze.length;
        int Path[][]=new int[n][n];
        printAllPath(maze , 0, 0 , Path);
    }
    private static void printAllPath(int maze[][],int  i ,int  j , int Path[][]){
        int n=maze.length;
        // check the cell is valid or invalid .
        if(i<0 || j<0 || i>=n || j>=n || maze[i][j]==0 || Path[i][j]==1){
            return ;
        }
        Path[i][j]=1;

        //Destination Cell
        if(i == n-1 && j == n-1){
            for (int r = 0; r < n; r++) {
                for (int c = 0; c <n; c++) {
                    System.out.print(Path[r][c]+" ");
                }
                System.out.println();
            }
            System.out.println();
            Path[i][j]=0;
            return;
        }
        //Top
        printAllPath(maze,i-1,j,Path);
        //Right
        printAllPath(maze,i,j+1,Path);
        //Down
        printAllPath(maze,i+1,j,Path);
        //Left
        printAllPath(maze,i,j-1,Path);
    }
    public static void main(String[] args) {
        int maze[][]={{1,1,0},{1,1,0},{1,1,1}};
        ratInMaze(maze);
    }
}
