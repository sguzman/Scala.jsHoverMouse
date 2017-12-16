package com.github.sguzman.scala.js

import org.scalajs.dom
import rxscalajs.Observable

object Main {
  def main(args: Array[String]): Unit = {
    val canvas = org.scalajs.dom.document.getElementById("canvas")
    val c = canvas.asInstanceOf[org.scalajs.dom.html.Canvas]
    val ctx = c.getContext("2d").asInstanceOf[dom.CanvasRenderingContext2D]
    Observable.fromEvent(dom.document.body, "mousemove")
        .map(_.asInstanceOf[dom.MouseEvent])
      .subscribe(s => {
        println(s.clientX, s.clientY)
      })
  }
}
