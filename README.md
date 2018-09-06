# sudoku-with-generator

## Jquery Sudoku
Script that works on client site, checks if numbers in puzzle are correct, otherwise it highlights conflict numbers.  
  
Live preview : http://sitechecker.pl/sudoku.html  (pregenerated hardcoded list of puzzles).

## Generator
Program that works on server side, should generate an array with 81 elements (each one represents 1 field in the puzzle).
Based on difficulty level, should fill from 20 (hard) to 40 (easy) elements of the array with clues, then check if it is solvable. If not, create new puzzle.
