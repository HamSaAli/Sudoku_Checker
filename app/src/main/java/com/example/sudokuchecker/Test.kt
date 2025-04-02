package com.example.sudokuchecker

fun main(){

    test(
        name = "Test 1 - when board have no duplicate in each row, column and box should return true",
        result = sudokuChecker(generateBoard(1)),
        correctResult = true
    )
    test(
        name = "Test 2 - when board have a spaces and the board have no duplicates should return true",
        result = sudokuChecker(generateBoard(2)),
        correctResult = true
    )
    test(
        name = "Test 3 - when board have duplicate numbers in one column should return false ",
        result = sudokuChecker(generateBoard(3)),
        correctResult = false
    )
    test(
        name = "Test 4 - when board have duplicate numbers in multiple column should return false ",
        result = sudokuChecker(generateBoard(4)),
        correctResult = false
    )
    test(
        name = "Test 5 - when board have duplicate numbers in one row should return false ",
        result = sudokuChecker(generateBoard(5)),
        correctResult = false
    )
    test(
        name = "Test 6 - when board have duplicate numbers in multiple row should return false ",
        result = sudokuChecker(generateBoard(6)),
        correctResult = false
    )
    test(
        name = "Test 7 - when board have duplicate numbers in 3*3 subgrid should return false ",
        result = sudokuChecker(generateBoard(7)),
        correctResult = false
    )
    test(
        name = "Test 8 - when board have a spaces and the board has duplicates should return false",
        result = sudokuChecker(generateBoard(8)),
        correctResult = false
    )
    test(
        name = "Test 9 - when board have duplicates in multiple rows,columns and box should return false",
        result = sudokuChecker(generateBoard(9)),
        correctResult = false
    )
    test(
        name = "Test 10 - when board have just empty cells with no numbers should return true",
        result = sudokuChecker(generateBoard(10)),
        correctResult = true
    )
    test(
        name = "Test 11 - when board have duplicates both row and column should return false",
        result = sudokuChecker(generateBoard(11)),
        correctResult = false
    )
    test(
        name = "Test 12 - when board have duplicates in multiple rows,columns and box and empty cells should return false",
        result = sudokuChecker(generateBoard(12)),
        correctResult = false
    )

    test(
        name = "Test 13 - when board have missing row or col should return false",
        result = sudokuChecker(generateBoard(13)),
        correctResult = false
    )


}

fun test(name: String, result:Boolean, correctResult:Boolean){
    if (result == correctResult){
        println("Passed - $name - $result")
    } else{
        println("Failed - $name - $result")
    }
}
