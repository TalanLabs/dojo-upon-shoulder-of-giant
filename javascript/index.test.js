const {most_long_succession_of_influnce} = require("./index");


describe('Succession of influence', () =>  {

    it('simple', () => {
      let relationships = [[1, 2], [1, 3], [3, 4]]
      expect(most_long_succession_of_influnce(relationships))
        .toEqual(3)
    })

    it('simple complete', () => {
      let relationships = [
            [1, 2], [1, 3], [3, 4], [2, 4],
            [2, 5], [10, 11], [10, 1], [10, 3]
        ]
      expect(most_long_succession_of_influnce(relationships))
        .toEqual(4)

    })

    it('most common', () => {
      let relationships = [
            [2, 3], [8, 9], [1, 2], [6, 3]
        ]
      expect(most_long_succession_of_influnce(relationships))
        .toEqual(3)
    })

    it('most common 2', () => {
      let relationships = [
            [7, 2], [8, 9], [1, 6], [6, 9],
            [1, 7], [1, 2], [3, 9], [2, 3], [6, 3]
        ]
      expect(most_long_succession_of_influnce(relationships))
        .toEqual(5)
    })
});
