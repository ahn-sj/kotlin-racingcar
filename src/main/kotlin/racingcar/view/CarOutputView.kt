package racingcar.view

class CarOutputView(
    private val output: OutputView,
) {
    fun outputView(cars: List<Car>) {
        cars.forEach { car -> output.print(car.getDistance()) }
    }
}
