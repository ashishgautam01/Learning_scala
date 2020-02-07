import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object futures_example extends App{

    // for the delta time we use this
    val startTime = currentTime

    
    val aaplFuture = getStockPrice("AAPL")
    val amznFuture = getStockPrice("AMZN")
    val googFuture = getStockPrice("GOOG")

    // To get a tuple of all the ressults in a single place
    val result: Future[(Double, Double, Double)] = for { aapl <- aaplFuture ; amzn <- amznFuture ; goog <- googFuture }
    yield (aapl, amzn, goog)

    // what to do on comleting the future
    result.onComplete {
        case Success(x) => {
            val totalTime = deltaTime(startTime)
            println(s"Horrah Success , time delta: ${totalTime}")
            println(s"The stock prices are: $x")
        }
        case Failure(e) => e.printStackTrace
    }

    // the jvm’s main thread alive
    sleep(5000)

    def sleep(time: Long): Unit = Thread.sleep(time)

    // Example service 
    def getStockPrice(stockSymbol: String): Future[Double] = Future {
        val r = scala.util.Random
        val randomSleepTime = r.nextInt(3000)
        println(s"For $stockSymbol, sleep time is $randomSleepTime")
        val randomPrice = r.nextDouble * 1000
        sleep(randomSleepTime)
        randomPrice
    }

    def currentTime = System.currentTimeMillis()
    def deltaTime(t0: Long) = currentTime - t0


}