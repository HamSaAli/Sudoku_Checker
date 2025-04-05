package com.example.sudokuchecker

import kotlin.math.sqrt

fun hasValidBoxes(board: List<List<String>>): Boolean {
    val boardSize = board.size
    val boxSize = sqrt(boardSize.toDouble()).toInt()

    for (rowStart in 0 until boardSize step boxSize) {
        for (colStart in 0 until boardSize step boxSize) {
            val boxSet = mutableSetOf<String>()
            for (i in 0 until boxSize) {
                for (j in 0 until boxSize) {
                    val value = board[rowStart + i][colStart + j]
                    if (value != "-" && !boxSet.add(value)) return false
                }
            }
        }
    }
    return true
}