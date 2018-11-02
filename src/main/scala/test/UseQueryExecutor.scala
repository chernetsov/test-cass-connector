package test

import com.datastax.spark.connector.writer.AsyncExecutor
import shade.com.datastax.spark.connector.google.common.util.concurrent.ListenableFuture

class UseQueryExecutor(queryExecutor: AsyncExecutor[Int, Long]) {

  private val value: ListenableFuture[Long] = queryExecutor.executeAsync(1)

}
