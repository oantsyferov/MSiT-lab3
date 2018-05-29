import akka.actor._

// (1) changed the constructor here
class HelloActor2(myName: String) extends Actor {
  def receive = {
    // (2) changed these println statements
    case "hello" => println("hello from %s".format(myName))
    case _       => println("'huh?', said %s".format(myName))
  }
}

object AkkaTutorial2 extends App {
  val system = ActorSystem("HelloSystem")
  // (3) changed this line of code
  val helloActor = system.actorOf(Props(new HelloActor2("Fred")), name = "helloactor")
  helloActor ! "hello"
  helloActor ! "buenos dias"
}