package com.example.sudokuchecker

import kotlin.math.sqrt

fun sudokuChecker(sudokuBoard: List<List<String>>): Boolean {
    val boardSize = sudokuBoard.size
    val boxSize = sqrt(boardSize.toDouble()).toInt()
    val allowedChars = ('1'..'9').map { it.toString() }.toSet() + setOf("-")

    for (row in sudokuBoard) {
        if (row.size != boardSize) return false
        if (row.any { it !in allowedChars }) return false
    }

    for (index in 0 until boardSize) {
        val rowSet = mutableSetOf<String>()
        val columnSet = mutableSetOf<String>()

        for (secondIndex in 0 until boardSize) {
            val rowChar = sudokuBoard[index][secondIndex]
            val columnChar = sudokuBoard[secondIndex][index]

            if (rowChar != "-" && !rowSet.add(rowChar)) return false
            if (columnChar != "-" && !columnSet.add(columnChar)) return false
        }
    }

    for (rowStart in 0 until boardSize step boxSize) {
        for (colStart in 0 until boardSize step boxSize) {
            val boxSet = mutableSetOf<String>()

            for (index in 0 until boxSize) {
                for (secondIndex in 0 until boxSize) {
                    val boxChar = sudokuBoard[rowStart + index][colStart + secondIndex]
                    if (boxChar != "-" && !boxSet.add(boxChar)) return false
                }
            }
        }
    }

    return true
}
