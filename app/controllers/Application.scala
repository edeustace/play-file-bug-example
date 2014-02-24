package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {

    val f = new java.io.File("foo.txt")

    println(s"absolute path: ${f.getAbsolutePath}")

    if(f.exists){
      Ok(scala.io.Source.fromFile( new java.io.File(f.getAbsolutePath)).getLines().mkString("\n"))
    } else {
      BadRequest("file doesn't exist")
    }
  }

}