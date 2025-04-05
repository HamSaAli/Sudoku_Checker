package com.example.sudokuchecker

fun isValidSizeAndCharacters(board: List<List<String>>, allowedChars: Set<String>): Boolean {
    val boardSize = board.size
    return board.all { row ->
        row.size == boardSize && row.all { it in allowedChars }
    }
}