package io.turntabl.functions

object func {

  def stringLength = (word : String) => word.length

    def numberOfSpaces = (sentence: String) => sentence.length - sentence.replaceAll(" ", "").length

    def ApplyToString = (sentence: String, word :(String => Int) ) => word(sentence)


    def calculate = (operation: String) => ((a: Int, b: Int) => operation match {
      case "add" => a + b
      case "subtract" => a - b
      case "multiply" => a * b
      case "division" => a / b
    })

}


