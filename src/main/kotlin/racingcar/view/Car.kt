package racingcar.view

class Car {
    var distance: Int = 0

    fun move() {
        distance++
    }

    companion object {
        const val MOVE_CONDITION = 4
    }
}
