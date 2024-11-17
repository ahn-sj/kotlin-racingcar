package racingcar

import racingcar.view.InputView
import racingcar.view.v2.CarNameInputView
import racingcar.view.v2.CarNameOutputView

fun main() {
    // input
    val inputView = CarNameInputView(InputView())
    val carNames = inputView.inputCarCount()
    val tryCount = inputView.inputRoundCount()

    val racingCars = Cars.joined(carNames, RandomMovementChecker(SecureRandomGenerator()))
    val round = Round(tryCount)
    val game = RacingGame(racingCars, round)

    game.play()
    val winners = game.getWinners()

    // output
    val outputView = CarNameOutputView()
    outputView.outputWinners(winners)
}
