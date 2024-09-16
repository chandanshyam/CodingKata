package ChristmasLights_Kata;

public class Decoration {

   public static  int[][] lightsGrid = new int[1000][1000];


    public Boolean turnOnLight(int startRow, int startCol, int emdRow, int endCol) {

        for(int i= startRow;i<=emdRow;i++)
        {
            for(int j= startCol;j<=endCol;j++)
            {
                lightsGrid[i][j] = 1;
            }

        }
        return  lightsGrid[startRow][startCol]==1;
    }

    public boolean turnOffLights(int startRow, int startCol, int emdRow, int endCol)
    {
        for(int i= startRow;i<=emdRow;i++)
    {
        for(int j= startCol;j<=endCol;j++)
        {
            lightsGrid[i][j] = 0;
        }

    }
        return  lightsGrid[startRow][startCol]==0;
}


    public boolean toggleLights(int startRow, int startCol, int emdRow, int endCol) {
        for(int i= startRow;i<=emdRow;i++)
        {
            for(int j= startCol;j<=endCol;j++)
            {
                lightsGrid[i][j] = 2;
            }

        }
        return  lightsGrid[startRow][startCol]==2;
    }
}
