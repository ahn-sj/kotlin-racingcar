package racingcar.view

fun main() {
    val game = RacingGame(CarInputView(InputView()), CarOutputView(OutputView()))
    game.start()
}
