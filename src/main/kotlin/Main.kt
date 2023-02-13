fun main() {

    println("Программа для хранения заметок.")

    val menuConstructor = MenuConstructor()

    val listArch: MutableList<Archive> = mutableListOf()

    menuConstructor.buildMenu(listArch)

}
