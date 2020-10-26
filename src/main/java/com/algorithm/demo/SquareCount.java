package com.algorithm.demo;

public class SquareCount {
    public static void main(String[] args){
        int[][] board = new int[3][];
        int n = 3;
        for(int i = 0 ; i < n ; ++i){
            for(int j = 0 ; j < n ; ++j){
                board[i][j] = 0;
            }
        }

        solution(board);

    }

    public static int solution(int [][]board)
    {
        int answer = 0;

        for(int i=1;i<board.length;i++) {
            for(int j=1;j<board[i].length;j++) {
                if( board[i][j] == 1 ) {
                    int minVal = 0;
                    minVal = Math.min(board[i - 1][j], board[i][j - 1]);
                    minVal = Math.min(board[i - 1][j - 1], minVal);

                    board[i][j] = minVal + 1;
                    answer = Math.max(answer, board[i][j]);
                }
            }
        }
        return answer*answer;
    }
}
