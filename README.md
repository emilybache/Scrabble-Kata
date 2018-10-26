Scrabble 
========

In the game of scrabble you create words from letter tiles. Common letters have a lower value than rarer letters. The value is shown on each letter tile is as follows:

  Letter                           Value
  A, E, I, O, U, L, N, R, S, T       1
  D, G                               2
  B, C, M, P                         3
  F, H, V, W, Y                      4
  K                                  5
  J, X                               8
  Q, Z                               10

When you place the word on the board, you receive a score for that word. The base score is the sum of the value for each letter. The first part of this Code Kata is to calculate the basic score for any word using any combination of these letters.

For example, if you took the word "Cabbage" the basic score is 14 (3+1+3+3+1+2+1)

Note: The longest word that will fit on a scrabble board has 15 letters, you don't need to handle words longer than that. Look at [wikipedia](https://en.wikipedia.org/wiki/Scrabble) for further explanations and a picture of the board with the actual layout.


Part 2
------

When you have mastered the basic score for a word, the second part is to adjust the score for which squares on the board you have laid it on.

Most squares are blank and have no effect on the score for a word. There are four kinds of special squares: 

    - 2×LS - Double letter score: the score for this letter is doubled
    - 3×LS - Triple letter score: the score for this letter is tripled
    - 2×WS - Double word score: the score for this word is doubled
    - 3×WS - Triple word score: the score for this word is tripled
    - star - starred square: the score for this word is doubled

If a word falls on several special squares, apply the modifiers in the order above.

For example if you took the word "Cabbage" the basic score is 14 (3+1+3+3+1+2+1). If you lay it on the following squares:

    C - blank
    A - 3xLS
    B - blank
    B - blank
    A - blank
    G - 2xWS
    E - blank

The score would be 32, calculated like this: (3+1*3+3+3+1+2+1)*2

If you instead laid it on these squares:

    C - 2xLS
    A - blank
    B - blank
    B - blank
    A - 3xWS
    G - blank
    E - blank

The score would be 51, calculated like this: (3*2+1+3+3+1+2+1)*3

Part 3
------

For this part you should be able to calculate the scrabble score for any word, given the co-ordinates of the first letter to place, the direction (vertical or horizontal) and the current board.

The board is a 15x15 grid with rows labelled 1-15 and columns labelled A-O. The co-ordinates of a particular square would for example be (3, D) or (11, F). For the positions of the squares that modify the score, look at  [wikipedia](https://en.wikipedia.org/wiki/Scrabble)

Part 4
------

Keep track of the score of an entire game of scrabble, as players take turns to place words.