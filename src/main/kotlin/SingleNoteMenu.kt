import java.util.Scanner

class SingleNoteMenu {

    companion object {


        fun createNoteMenu(): List<String> {
            return listOf("Изменить заметку", "Посмотреть заметку", "Выход к заметкам\n")
        }


        fun editNote(list: MutableList<Archive>, elementArch: Int, elementNote: Int) {

            println("Ввидите новое название заметки. Если его не нужно менять просто нажмите Enter")
            var change = Scanner(System.`in`).nextLine()
            if (!change.isEmpty()) list[elementArch].listNotes[elementNote].titleNote = change

            println("Ввидите новое содержание заметки:")
            change = Scanner(System.`in`).nextLine()
            list[elementArch].listNotes[elementNote].contentNote = change
            println("Изменения сохранены\n\n")

        }

        fun viewNote(list: MutableList<Archive>, elementArch: Int, elementNote: Int) {
            println(
                "\nНазвание заметки: ${list[elementArch].listNotes[elementNote].titleNote}\n" +
                "Содержание заметки: ${list[elementArch].listNotes[elementNote].contentNote}\n"
            )

        }


    }


}
