import java.util.*

class NotesMenu {

    companion object {
        fun createNotesSheet(list: MutableList<Archive>, element: Int): List<String> {

            val menu: List<String> = List(list[element].listNotes.size + 2) {

                when (it) {
                    0 -> "Создать заметку"
                    in 1..list[element].listNotes.size -> list[element].listNotes[it - 1].toString()
                    else -> "Выход в меню архивов\n\n"
                }

            }
            return menu
        }

        fun createNote(list: MutableList<Archive>, element: Int) {
            println("Ввидите имя заметки:")
            val titleName = Scanner(System.`in`).nextLine()
            println("Ввидите текст заметки:")
            val contentNote = Scanner(System.`in`).nextLine()
            list[element].listNotes.add(Note(titleName, contentNote))

            println("Заметка с именем '${titleName}' создана! Чтобы посмотреть содержание заметки выберите ее в меню.\n")

        }

    }
}