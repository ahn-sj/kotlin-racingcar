package racingcar

class Cars(
    private val cars: List<Car>,
    private val movementChecker: MovementChecker,
) {
    fun move() {
        cars.filter { movementChecker.isMovable() }
            .forEach { it.move() }
    }

    fun getCars(): List<Car> {
        return cars
    }
}
