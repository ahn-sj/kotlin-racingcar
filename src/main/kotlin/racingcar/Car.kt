package racingcar

class Car(
    private var distance: Int = 0,
) {
    fun move() {
        distance++
    }

    fun getDistance(): Int {
        return distance
    }
}
