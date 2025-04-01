package com.example.sudokuchecker

fun main(){

    test(
        name = "Test 1 - when board is valid should return true",
        result = sudokuChecker(generateBoard(1)),
        correctResult = true
    )
    test(
        name = "Test 2 - when board have a spaces and the board is valid should return true",
        result = sudokuChecker(generateBoard(2)),
        correctResult = true
    )
    test(
        name = "Test 3 - when board have duplicate numbers in column should return false ",
        result = sudokuChecker(generateBoard(3)),
        correctResult = false
    )
    test(
        name = "Test 4 - when board have duplicate numbers in row should return false ",
        result = sudokuChecker(generateBoard(4)),
        correctResult = false
    )
    test(
        name = "Test 5 - when board have duplicate numbers in 3*3 grid should return false ",
        result = sudokuChecker(generateBoard(5)),
        correctResult = false
    )
    test(
        name = "Test 6 - when board have a spaces and the board is invalid should return false",
        result = sudokuChecker(generateBoard(6)),
        correctResult = false
    )
    test(
        name = "Test 7 - when board have duplicates in multiple rows/columns/boxes should return false",
        result = sudokuChecker(generateBoard(7)),
        correctResult = false
    )
    test(
        name = "Test 8 - when board have empty cells with no duplicates should return true",
        result = sudokuChecker(generateBoard(8)),
        correctResult = true
    )
    test(
        name = "Test 9 - when board have duplicates both row and column should return false",
        result = sudokuChecker(generateBoard(9)),
        correctResult = false
    )
    test(
        name = "Test 10 - when board have duplicates in multiple rows,columns and box should return false",
        result = sudokuChecker(generateBoard(10)),
        correctResult = false
    )


}

fun test(name: String, result:Boolean, correctResult:Boolean){
    if (result == correctResult){
        println("Passed - $name")
    }else{
        println("Failed - $name")
    }
}
