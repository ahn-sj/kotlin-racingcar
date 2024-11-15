package racingcar.view

import racingcar.view.DisplayConstant.Companion.CAR_VIEW_MESSAGE
import racingcar.view.DisplayConstant.Companion.TRY_VIEW_MESSAGE

fun main() {
    Game(CarInputView(InputView())).start()
}

class Game(
    private val view: CarInputView,
) {
    fun start() {
        val carCount = view.inputView(CAR_VIEW_MESSAGE)
        val tryCount = view.inputView(TRY_VIEW_MESSAGE)
    }
}
