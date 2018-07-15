package com.phineas.searcher

import com.phineas.datasource.Data
import com.phineas.parser.ParserResult

/**
  * Created by smarwaha on 7/10/18.
  */
class SimpleSearcher extends Searcher {
  override def search(parser: ParserResult, data: Data): SearchResult = SearchResult(found = true, Some(0))
}
