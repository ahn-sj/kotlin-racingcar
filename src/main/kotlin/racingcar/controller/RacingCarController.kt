package racingcar.controller

import racingcar.domain.CarNames
import racingcar.domain.Cars
import racingcar.domain.NumberGenerator
import racingcar.domain.RacingGame
import racingcar.domain.Round
import racingcar.view.v2.CarNameInputView
import racingcar.view.v2.CarNameOutputView

class RacingCarController(
    private val inputView: CarNameInputView,
    private val outputView: CarNameOutputView,
    private val numberGenerator: NumberGenerator,
) {
    private val carNames: String = inputView.inputCarCount()
    private val tryCount: Int = inputView.inputRoundCount()

    fun run() {
        val game = RacingGame(Cars.joined(CarNames.from(carNames)), Round(tryCount), numberGenerator)
        val playedCars = game.play()
        outputView.outputWinners(playedCars.getWinners())
    }
}
