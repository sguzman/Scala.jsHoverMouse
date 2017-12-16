package com.github.sguzman.scala.js

import org.scalajs.dom
import rxscalajs.Observable

import scala.util.Random

object Main {
  def main(args: Array[String]): Unit = {
    val canvas = org.scalajs.dom.document.getElementById("canvas")
    val c = canvas.asInstanceOf[org.scalajs.dom.html.Canvas]
    val ctx = c.getContext("2d").asInstanceOf[dom.CanvasRenderingContext2D]
    Observable.fromEvent(dom.document.body, "mousemove")
      .map(_.asInstanceOf[dom.MouseEvent])
      .map(s => (s.clientX, s.clientY))
      .subscribe(s => {
        ctx.fillStyle = s"rgb(${Random.nextInt(256)}, ${Random.nextInt(256)}, ${Random.nextInt(256)})"
        ctx.fillRect(Random.nextInt(200), 0, 200, 200)
      })
  }
}
