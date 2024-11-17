package racingcar

// TODO: MovementChecker와 의존하지 않고 List<Car>만 갖도록 바꿀 수는 없을까
class Cars(
    private val cars: List<Car>,
    private val movementChecker: MovementChecker,
) {
    fun move() {
        cars.filter { movementChecker.isMovable() }
            .forEach(Car::move)
    }

    fun print() {
        cars.forEach { println("${it.getName()} : ${it.getDisplayDistance()}") }
        println()
    }

    fun getWinners(): List<Car> {
        val max = cars.maxOf { it.getDistance() }
        return cars.filter { it.getDistance() == max }
    }

    fun getCars(): List<Car> {
        return cars
    }

    companion object {
        private const val CAR_NAME_DELIMITER = ","

        fun joined(
            carNames: String,
            checker: MovementChecker,
        ): Cars {
            val names = carNames.split(CAR_NAME_DELIMITER)
            return Cars(names.map { Car(it) }, checker)
        }
    }
}
