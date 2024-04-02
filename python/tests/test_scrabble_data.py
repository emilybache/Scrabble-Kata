import json
from pathlib import Path
from string import ascii_uppercase

import pytest

from scrabble import data


def test_board_matches_premium_squares():
    premium_cells_found = 0
    for row_offset, row in enumerate(data.BOARD):
        for col_offset, cell in enumerate(row, start=1):
            if cell.strip() != '':
                premium_cells_found += 1
                square_key = f'{ascii_uppercase[row_offset]},{col_offset}'
                assert cell == data.PREMIUM_SQUARES[square_key], f'Square {square_key} does not match premium data'
    assert premium_cells_found == len(data.PREMIUM_SQUARES), f'Mismatch in count of premium squares'


@pytest.fixture()
def scrabble_json_data():
    data_path = Path(__file__).parents[2] / 'scrabble_data.json'
    assert data_path.exists()
    return json.load(data_path.open())


def test_tiles_match_json(scrabble_json_data):
    tiles = scrabble_json_data['Tiles']
    assert len(tiles) == len(data.TILES)
    for tile, value in tiles.items():
        assert data.TILES[tile] == value


def test_board_matches_json(scrabble_json_data):
    json_board = scrabble_json_data['Board']
    assert len(json_board) == len(data.BOARD)
    for row_offset, row in enumerate(data.BOARD):
        assert len(row) == len(json_board[row_offset])
        for col_offset, cell in enumerate(row):
            assert cell == json_board[row_offset][col_offset]


def test_premium_squares_match_json(scrabble_json_data):
    json_premiums = scrabble_json_data['PremiumSquares']
    assert len(json_premiums) == len(data.PREMIUM_SQUARES)
    for key in json_premiums.keys():
        assert data.PREMIUM_SQUARES[key] == json_premiums[key]
