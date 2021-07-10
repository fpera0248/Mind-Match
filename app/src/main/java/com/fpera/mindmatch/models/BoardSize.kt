package com.fpera.mindmatch.models

enum class BoardSize(val numCards: Int) {
  EASY(8),
  MEDIUM(18),
  HARD(24),
  BOSS(32),
  EXPERT(40),
  MASTER(60);

  companion object {
    fun getByValue(value: Int) = values().first { it.numCards == value }
  }

  fun getWidth(): Int {
    return when (this) {
      EASY -> 2
      MEDIUM -> 3
      HARD -> 4
      BOSS -> 4
      EXPERT -> 5
      MASTER -> 6
    }
  }

  fun getHeight(): Int {
    return numCards / getWidth()
  }

  fun getNumPairs(): Int {
    return numCards / 2
  }
}