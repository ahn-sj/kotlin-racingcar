package racingcar

class Cars(
    private val cars: List<Car>,
    private val movementChecker: MovementChecker,
) {
    fun move(tryCount: Int) {
        repeat(tryCount) {
            cars.filter { movementChecker.isMovable() }
                .forEach(Car::move)
        }
    }

    fun getCars(): List<Car> {
        return cars
    }
}
