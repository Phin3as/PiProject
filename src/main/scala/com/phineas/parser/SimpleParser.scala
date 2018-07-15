package com.phineas.parser

import com.phineas.input.UserInputResult

/**
  * Created by smarwaha on 7/10/18.
  */
class SimpleParser extends Parser {
  override def parseData(userInputResult: UserInputResult): ParserResult =
    ParserResult(userInputResult.content.mkString(""))
}
