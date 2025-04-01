package com.example.sudokuchecker


fun generateBoard(boardNumber: Int): List<List<Char>> {
    return when (boardNumber) {
        1 -> listOf(
            listOf('1', '2', '3'),
            listOf('4', '5', '6'),
            listOf('7', '8', '9')
        )
        2 -> listOf(
            listOf('5', '-', '3'),
            listOf('6', '-', '1'),
            listOf('-', '9', '8')
        )
        3 -> listOf(
            listOf('5', '3', '2'),
            listOf('5', '-', '1'),
            listOf('-', '9', '8')
        )
        4 -> listOf(
            listOf('5', '3', '3'),
            listOf('4', '-', '1'),
            listOf('-', '9', '8')
        )
        5 -> listOf(
            listOf('5', '3', '-'),
            listOf('6', '-', '5'),
            listOf('-', '9', '8')
        )
        6 -> listOf(
            listOf('5', '3', '-'),
            listOf('5', '-', '5'),
            listOf('-', '9', '8')
        )
        7 -> listOf(
            listOf('1', '2', '3'),
            listOf('2', '3', '4'),
            listOf('3', '4', '2')
        )
        8 -> listOf(
            listOf('-', '-', '-'),
            listOf('-', '-', '-'),
            listOf('-', '-', '-')
        )
        9 -> listOf(
            listOf('1', '2', '3'),
            listOf('4', '5', '6'),
            listOf('7', '2', '9')
        )
        10 -> listOf(
            listOf('1', '2', '3'),
            listOf('2', '3', '1'),
            listOf('3', '1', '2')
        )
        else -> throw IllegalArgumentException("Invalid board number")
    }
}