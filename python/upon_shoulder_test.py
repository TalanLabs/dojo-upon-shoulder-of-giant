
import unittest

from upon_shoulder import (
    most_long_succession_of_influence
)


class UponShoulderTest(unittest.TestCase):

    def test_simple_example(self):
        relationships = [(1, 2), (1, 3), (3, 4)]
        self.assertEqual(3, most_long_succession_of_influence(relationships))

    def test_simple_complete(self):
        relationships = [
            (1, 2), (1, 3), (3, 4), (2, 4),
            (2, 5), (10, 11), (10, 1), (10, 3)
        ]
        self.assertEqual(4, most_long_succession_of_influence(relationships))

    def test_most_common(self):
        relationships = [
            (2, 3), (8, 9), (1, 2), (6, 3)
        ]
        self.assertEqual(3, most_long_succession_of_influence(relationships))

    def test_most_common_2(self):
        relationships = [
            (7, 2), (8, 9), (1, 6), (6, 9),
            (1, 7), (1, 2), (3, 9), (2, 3), (6, 3)
        ]
        self.assertEqual(5, most_long_succession_of_influence(relationships))

