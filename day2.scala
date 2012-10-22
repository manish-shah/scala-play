

val list = List("one", "two", "three");

list.foldLeft(0)((length, value) => length + value.length);