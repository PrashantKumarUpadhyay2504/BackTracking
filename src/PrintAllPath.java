public class PrintAllPath {
    public static void ratInMaze(int[][] maze){
        int n=maze.length;
        int[][] path =new int[n][n];
        printAllPath(maze , 0, 0 , path);
    }

    public static void printAllPath(int[][] maze , int i, int j , int[][] path){
        // check maze exsist or not
        int n=maze.length;
        if(i<0 || j<0 || i>=n|| j>=n|| maze[i][j]==0|| path[i][j]==1){

        }
    }
    public static void main(String[] args) {
        int[][] maze={{1,1,0},{1,1,0},{1,1,1}};
        ratInMaze(maze);
    }
}
