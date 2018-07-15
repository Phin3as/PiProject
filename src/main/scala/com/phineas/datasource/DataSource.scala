package com.phineas.datasource

/**
  * Created by smarwaha on 7/8/18.
  */
trait DataSource {
  def getNextData(offset: Int): Data
}

/**
  * This class holds the data returned by the DataSource
  * @param content the actual data
  * @param offset the sequence number of the data requested
  * @param nextOffset the offset of the next set of data, None if no more exists
  */
case class Data(content: Seq[Int], offset: Int, nextOffset: Option[Int])
