package racingcar

class RandomMovementChecker(
    private val randomGenerator: RandomGenerator,
) : MovementChecker {
    override fun isMovable(): Boolean {
        val random = randomGenerator.generate()
        return random >= MOVE_CONDITION
    }

    companion object {
        private const val MOVE_CONDITION = 4
    }
}
