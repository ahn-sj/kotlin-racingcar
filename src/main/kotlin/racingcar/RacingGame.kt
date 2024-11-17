package racingcar

class RacingGame(
    private val cars: Cars,
    private val round: Round,
) {
    fun play() {
        while (!round.isFinished()) {
            cars.move()
            cars.print()
            round.end()
        }
    }

    fun getWinners(): String {
        return cars.getWinners().joinToString(WINNER_NAME_JOINER) { it.getName() }
    }

    companion object {
        private const val WINNER_NAME_JOINER = ", "
    }
}
