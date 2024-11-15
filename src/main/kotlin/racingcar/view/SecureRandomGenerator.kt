package racingcar.view

import java.security.SecureRandom

class SecureRandomGenerator : RandomGenerator {
    override fun generate(): Int {
        val secureRandom = SecureRandom.getInstanceStrong()
        return secureRandom.nextInt(RANDOM_ORIGIN, RANDOM_BOUND)
    }

    companion object {
        const val RANDOM_ORIGIN = 0
        const val RANDOM_BOUND = 10
    }
}
