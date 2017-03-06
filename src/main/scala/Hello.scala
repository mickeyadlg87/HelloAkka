import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

class HelloActor(nombre: String = "David") extends Actor {
  def receive = {
    case "hello" => println("hello back at you, from " + nombre)
    case _ => println("huh?, from " + nombre)
  }
}

object Main extends App {
  val system = ActorSystem("HelloSystem")
  // default Actor constructor
  val helloActor = system.actorOf(Props(new HelloActor), name = "helloactor")
  helloActor ! "hello"
  helloActor ! "buenos dias"
}