class Board {

    var theBoard = Array.ofDim[Char](3, 3);

    def place(player: Char, x: Int, y: Int) {
        theBoard(x)(y) = player;
    }

    def status() {
        checkWinner(Array(theBoard(0)(0), theBoard(1)(0), theBoard(2)(0)));
        checkWinner(Array(theBoard(0)(1), theBoard(1)(1), theBoard(2)(1)));
        checkWinner(Array(theBoard(0)(2), theBoard(1)(2), theBoard(2)(2)));
        
        checkWinner(Array(theBoard(0)(0), theBoard(0)(1), theBoard(0)(2)));
        checkWinner(Array(theBoard(1)(0), theBoard(1)(1), theBoard(1)(2)));
        checkWinner(Array(theBoard(2)(0), theBoard(2)(1), theBoard(2)(2)));
        
        checkWinner(Array(theBoard(0)(0), theBoard(1)(1), theBoard(2)(2)));
        checkWinner(Array(theBoard(0)(2), theBoard(1)(1), theBoard(2)(0)));
    }

    def checkWinner(line: Array[Char]) {
        var x = 0;
        var o = 0;
        line.foreach { player : Char =>
            if (player == 'x') x = x + 1;
            if (player == 'o') o = o + 1;
        }
        if (x == 3) println("x has won");
        if (o == 3) println("o has won");;
    }
} 

val board = new Board();
board.place('x', 0, 0);
board.place('x', 1, 0);
board.place('x', 2, 0);
board.status();

val board = new Board();
board.place('o', 1, 0);
board.place('o', 1, 1);
board.place('o', 1, 2);
board.status();

val board = new Board();
board.place('o', 0, 0);
board.place('o', 1, 1);
board.place('o', 2, 2);
board.status();

