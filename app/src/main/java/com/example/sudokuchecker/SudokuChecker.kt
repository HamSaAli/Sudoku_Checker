package com.example.sudokuchecker

import kotlin.math.sqrt

fun sudokuChecker(sudokuBoard: List<List<String>>): Boolean {
    val allowedChars = ('1'..'9').map { it.toString() }.toSet() + setOf("-")
    return isValidSizeAndCharacters(sudokuBoard, allowedChars)
            && hasValidRowsAndColumns(sudokuBoard)
            && hasValidBoxes(sudokuBoard)
}