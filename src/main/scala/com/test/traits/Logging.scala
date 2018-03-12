package com.test.traits

trait Logging {
  def info (message: String): Unit
  def warning(message: String): Unit
  def error (message: String): Unit
}
