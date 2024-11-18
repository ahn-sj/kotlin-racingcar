package racingcar.domain

class RacingGame(
    private val cars: Cars,
    private val round: Round,
    private val numberGenerator: NumberGenerator,
) {
    fun play(): Cars {
        while (round.isFinished().not()) {
            cars.move(numberGenerator)
            cars.print("-")
            round.end()
        }
        return cars
    }
}
