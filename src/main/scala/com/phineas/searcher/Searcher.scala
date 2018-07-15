package com.phineas.searcher

import com.phineas.datasource.Data
import com.phineas.parser.ParserResult

/**
  * Created by smarwaha on 7/8/18.
  */
trait Searcher {
  def search(parser: ParserResult, data: Data): SearchResult
}

/**
  * This class holds the result of the Search algorithm
  * @param found true, if the input was found, false otherwise
  * @param result the location of the match, None if it wasn't found
  */
case class SearchResult(found: Boolean, result: Option[Long])