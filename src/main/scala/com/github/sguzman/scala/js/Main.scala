package com.github.sguzman.scala.js

import org.scalajs.dom

object Main {
  def main(args: Array[String]): Unit = {
    val canvas = org.scalajs.dom.document.getElementById("canvas")
    val c = canvas.asInstanceOf[org.scalajs.dom.html.Canvas]
    val ctx = c.getContext("2d").asInstanceOf[dom.CanvasRenderingContext2D]
    println(canvas.clientWidth)
    println(canvas.clientHeight)
    ctx.moveTo(0, 0)
    ctx.lineTo(canvas.clientWidth, canvas.clientHeight)
    ctx.stroke()
  }
}
