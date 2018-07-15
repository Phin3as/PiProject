package com.phineas

import com.google.inject.AbstractModule
import com.phineas.datasource.{DataSource, SimpleDataSource}
import com.phineas.input.{SimpleUserInput, UserInput}
import com.phineas.parser.{Parser, SimpleParser}
import com.phineas.searcher.{Searcher, SimpleSearcher}

/**
  * Created by smarwaha on 7/8/18.
  */
class PiProjectModule extends AbstractModule {
  override def configure(): Unit = {
    bind(classOf[UserInput]).to(classOf[SimpleUserInput])
    bind(classOf[Parser]).to(classOf[SimpleParser])
    bind(classOf[DataSource]).to(classOf[SimpleDataSource])
    bind(classOf[Searcher]).to(classOf[SimpleSearcher])
  }
}
