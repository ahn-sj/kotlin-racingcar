package racingcar

class RacingGame(
    private val carNames: String,
    private val round: Round,
    private val numberGenerator: NumberGenerator,
) {
    fun play(): Cars {
        val racingCars = Cars.joined(carNames)

        while (round.isFinished().not()) {
            racingCars.move(numberGenerator)
            racingCars.print()
            round.end()
        }
        return racingCars
    }
}
