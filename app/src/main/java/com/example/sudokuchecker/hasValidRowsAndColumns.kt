package com.example.sudokuchecker

fun hasValidRowsAndColumns(board: List<List<String>>): Boolean {
    val boardSize = board.size
    for (i in 0 until boardSize) {
        val rowSet = mutableSetOf<String>()
        val colSet = mutableSetOf<String>()
        for (j in 0 until boardSize) {
            val rowValue = board[i][j]
            val colValue = board[j][i]
            if (rowValue != "-" && !rowSet.add(rowValue)) return false
            if (colValue != "-" && !colSet.add(colValue)) return false
        }
    }
    return true
}