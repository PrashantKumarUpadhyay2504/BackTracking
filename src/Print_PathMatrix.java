

public class Print_PathMatrix {
    public static boolean ratInMaze(int maze[][]){
        int n=maze.length;
        int Path[][]=new int[n][n];
        return solveMaze(maze,0,0,Path);
    }
    private static boolean solveMaze(int maze[][],int  i ,int  j , int Path[][]){
        int n=maze.length;
        // check the cell is valid or invalid .
        if(i<0 || j<0 || i>=n || j>=n || maze[i][j]==0 || Path[i][j]==1){
            return false;
        }
        Path[i][j]=1;

        //Destination Cell
        if(i == n-1 && j== n-1){
            for (int r=0 ;r<n; r++){
                for (int c=0; c<n ; c++){
                    System.out.print(Path[r][c]+" ");
                }
                System.out.println();
            }
            return true;
        }
        //Top
        if(solveMaze(maze,i-1,j,Path)){
            return true;
        }
        //Right
        if(solveMaze(maze,i,j+1,Path)){
            return true;
        }
        //Down
        if(solveMaze(maze,i+1,j,Path)){
            return true;
        }

        //Left
        if(solveMaze(maze,i,j-1,Path)){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        int maze[][]={{1,1,0},{1,1,0},{1,1,1}};
        boolean path=ratInMaze(maze);
        System.out.println(path);
    }
}
