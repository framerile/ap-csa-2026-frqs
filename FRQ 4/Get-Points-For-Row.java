public int getPointsForRow(int targetRow){
    boolean sameColor = true;
    String firstColor = board[targetRow][0].getColor();
    int sum = 0;

    for(int i = 0; i < board[targetRow].length; i++){
        if(!board[targetRow][i].getColor().equals(firstColor)) sameColor = false;

        sum += board[targetRow][i].getPoints();
    }

    return (sameColor) ? sum * 2 : sum;
}
