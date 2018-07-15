package com.phineas

import com.google.inject.{Guice, Inject}
import com.phineas.datasource.DataSource
import com.phineas.input.UserInput
import com.phineas.parser.Parser
import com.phineas.searcher.Searcher
import com.typesafe.scalalogging.LazyLogging

/**
  * Created by smarwaha on 7/8/18.
  */
object PiProjectApp {
  def main(args: Array[String]): Unit = {
    val injector = Guice.createInjector(new PiProjectModule)

    val app = injector.getInstance(classOf[PiProjectApp])

    app.run()
  }
}
class PiProjectApp @Inject() (userInput: UserInput, parser: Parser, dataSource: DataSource, searcher: Searcher)
  extends LazyLogging {

  def run(): Unit = {
    val userInputResult = userInput.getInput
    val parserResult = parser.parseData(userInputResult)
    val source = dataSource.getNextData(0)
    val result = searcher.search(parserResult, source)

    logger.info(s"Result -> ${result.found}")
    result.result.foreach(loc => logger.info(s"Location -> $loc"))

  }
}
