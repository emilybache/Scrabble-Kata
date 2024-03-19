module ScrabbleData
  TILES = {
    ' ' => 0,
    'A' => 1,
    'B' => 3,
    'C' => 3,
    'D' => 2,
    'E' => 1,
    'F' => 4,
    'G' => 2,
    'H' => 4,
    'I' => 1,
    'J' => 8,
    'K' => 5,
    'L' => 1,
    'M' => 3,
    'N' => 1,
    'O' => 1,
    'P' => 3,
    'Q' => 10,
    'R' => 1,
    'S' => 1,
    'T' => 1,
    'U' => 1,
    'V' => 4,
    'W' => 4,
    'X' => 8,
    'Y' => 4,
    'Z' => 10,
  }

  BOARD = [
    ['3xWS', '    ', '    ', '2xLS', '    ', '    ', '    ', '3xWS', '    ', '    ', '    ', '2xLS', '    ', '    ', '3xWS'],
    ['    ', '2xWS', '    ', '    ', '    ', '3xLS', '    ', '    ', '    ', '3xLS', '    ', '    ', '    ', '2xWS', '    '],
    ['    ', '    ', '2xWS', '    ', '    ', '    ', '2xLS', '    ', '2xLS', '    ', '    ', '    ', '2xWS', '    ', '    '],
    ['    ', '    ', '    ', '2xWS', '    ', '    ', '    ', '2xLS', '    ', '    ', '    ', '2xWS', '    ', '    ', '    '],
    ['2xLS', '    ', '    ', '    ', '2xWS', '    ', '    ', '    ', '    ', '    ', '2xWS', '    ', '    ', '    ', '2xLS'],
    ['    ', '3xLS', '    ', '    ', '    ', '3xLS', '    ', '    ', '    ', '3xLS', '    ', '    ', '    ', '3xLS', '    '],
    ['    ', '    ', '2xLS', '    ', '    ', '    ', '2xLS', '    ', '2xLS', '    ', '    ', '    ', '2xLS', '    ', '    '],
    ['3xWS', '    ', '    ', '2xLS', '    ', '    ', '    ', 'star', '    ', '    ', '    ', '2xLS', '    ', '    ', '3xWS'],
    ['    ', '    ', '2xLS', '    ', '    ', '    ', '2xLS', '    ', '2xLS', '    ', '    ', '    ', '2xLS', '    ', '    '],
    ['    ', '3xLS', '    ', '    ', '    ', '3xLS', '    ', '    ', '    ', '3xLS', '    ', '    ', '    ', '3xLS', '    '],
    ['2xLS', '    ', '    ', '    ', '2xWS', '    ', '    ', '    ', '    ', '    ', '2xWS', '    ', '    ', '    ', '2xLS'],
    ['    ', '    ', '    ', '2xWS', '    ', '    ', '    ', '2xLS', '    ', '    ', '    ', '2xWS', '    ', '    ', '    '],
    ['    ', '    ', '2xWS', '    ', '    ', '    ', '2xLS', '    ', '2xLS', '    ', '    ', '    ', '2xWS', '    ', '    '],
    ['    ', '2xWS', '    ', '    ', '    ', '3xLS', '    ', '    ', '    ', '3xLS', '    ', '    ', '    ', '2xWS', '    '],
    ['3xWS', '    ', '    ', '2xLS', '    ', '    ', '    ', '3xWS', '    ', '    ', '    ', '2xLS', '    ', '    ', '3xWS'],
  ]

  PREMIUM_SQUARES = {
    'A,1' =>'3xWS',
    'D,1' =>'2xLS',
    'H,1' =>'3xWS',
    'L,1' =>'2xLS',
    'O,1' =>'3xWS',

    'B,2' =>'2xWS',
    'F,2' =>'3xLS',
    'J,2' =>'3xLS',
    'N,2' =>'2xWS',

    'C,3' =>'2xWS',
    'G,3' =>'2xLS',
    'I,3' =>'2xLS',
    'M,3' =>'2xWS',

    'A,4' =>'2xLS',
    'D,4' =>'2xWS',
    'H,4' =>'2xLS',
    'L,4' =>'2xWS',
    'O,4' =>'2xLS',

    'E,5' =>'2xWS',
    'K,5' =>'2xWS',

    'B,6' =>'3xLS',
    'F,6' =>'3xLS',
    'J,6' =>'3xLS',
    'N,6' =>'3xLS',

    'C,7' =>'2xLS',
    'G,7' =>'2xLS',
    'I,7' =>'2xLS',
    'M,7' =>'2xLS',

    'A,8' =>'3xWS',
    'D,8' =>'2xLS',
    'H,8' =>'star',
    'L,8' =>'2xLS',
    'O,8' =>'3xWS',

    'C,9' =>'2xLS',
    'G,9' =>'2xLS',
    'I,9' =>'2xLS',
    'M,9' =>'2xLS',

    'B,10' => '3xLS',
    'F,10' => '3xLS',
    'J,10' => '3xLS',
    'N,10' => '3xLS',

    'E,11' => '2xWS',
    'K,11' => '2xWS',

    'A,12' => '2xLS',
    'D,12' => '2xWS',
    'H,12' => '2xLS',
    'L,12' => '2xWS',
    'O,12' => '2xLS',

    'C,13' => '2xWS',
    'G,13' => '2xLS',
    'I,13' => '2xLS',
    'M,13' => '2xWS',

    'B,14' => '2xWS',
    'F,14' => '3xLS',
    'J,14' => '3xLS',
    'N,14' => '2xWS',

    'A,15' => '3xWS',
    'D,15' => '2xLS',
    'H,15' => '3xWS',
    'L,15' => '2xLS',
    'O,15' => '3xWS',
  }
end
