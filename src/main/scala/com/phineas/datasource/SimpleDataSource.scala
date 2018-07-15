package com.phineas.datasource

/**
  * Created by smarwaha on 7/8/18.
  */
class SimpleDataSource extends DataSource {
  override def getNextData(offset: Int): Data = Data(Seq(1,2,3,4), offset, Option.empty)
}
