package groovy

static void main(String[] args) {
  def result = countElements(arrInit())
  println("Результат: " + result)
}

static def countElements(List list) {
  list.countBy { it }
}

static def arrInit() {
  println ("Groovy")
  println ("Введите значения: ")
  Scanner scanner = new Scanner(System.in);
  String input = scanner.nextLine()
  List<Integer> inputList = input.split(" ").collect { it.toInteger() }
}