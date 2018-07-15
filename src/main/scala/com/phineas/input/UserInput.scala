package com.phineas.input

/**
  * Created by smarwaha on 7/10/18.
  */
trait UserInput {
  def getInput: UserInputResult
}

/**
  * This class holds the data from user Input
  * @param content the user input
  */
case class UserInputResult(content: Seq[Int])
