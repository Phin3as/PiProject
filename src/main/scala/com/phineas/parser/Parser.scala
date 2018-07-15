package com.phineas.parser

import com.phineas.input.UserInputResult

/**
  * Created by smarwaha on 7/8/18.
  */
trait Parser {
  def parseData(userInputResult: UserInputResult): ParserResult
}

/**
  * This class holds the parsed data
  * @param content the string equivalent of the data
  */
case class ParserResult(content: String)
