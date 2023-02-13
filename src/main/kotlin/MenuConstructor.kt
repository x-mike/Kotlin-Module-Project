import java.util.*

class MenuConstructor {

    fun getInputUser(formattedSheet: List<String>): Int {

        while (true) {

            println("Ввидите цифру соответствующую пункту меню:")
            val input = Scanner(System.`in`).nextLine().toIntOrNull()

            if (input == null) {
                println("Не корректное значение. Повторите, пожалуйста, ввод.\n")
                continue
            }

            when (input) {
                in 0 until formattedSheet.size -> return input
                else -> {
                    println("Вы ввели число которого нет в выборе пункта. Повторите ввод.\n")
                    continue
                }

            }
        }

    }


    fun buildMenu(
        list: MutableList<Archive>,
    ) {

        var locatedInMenu: String = "archive"
        var choiceUser: Int = 0
        var choiceUserInArch: Int = 0
        var choiceUserInNotes: Int = 0

        while (true) {

            var formattedSheet: List<String>

            when (locatedInMenu) {
                "archive" -> formattedSheet = ArchivesMenu.createArchivesSheet(list)
                "notes" -> formattedSheet = NotesMenu.createNotesSheet(list, choiceUserInArch - 1)
                "singleNote" -> formattedSheet = SingleNoteMenu.createNoteMenu()
                else -> formattedSheet = SingleNoteMenu.createNoteMenu()
            }

            if (locatedInMenu.equals("archive")) println("\nСписок архивов заметок:")

            for (element in formattedSheet) {
                println(
                    "---------------------------------------------------\n" +
                            "${formattedSheet.indexOf(element)}.  ${element}"
                )

            }

            choiceUser = getInputUser(formattedSheet)

            if (locatedInMenu.equals("archive")) {
                choiceUserInArch = choiceUser
                when (choiceUser) {
                    0 -> ArchivesMenu.greateArchive(list)
                    formattedSheet.size - 1 -> return println("До свидание!")
                    else -> locatedInMenu = "notes"
                }
            } else if (locatedInMenu.equals("notes")) {
                choiceUserInNotes = choiceUser
                when (choiceUser) {
                    0 -> NotesMenu.createNote(list, choiceUserInArch - 1)
                    formattedSheet.size - 1 -> locatedInMenu = "archive"
                    else -> locatedInMenu = "singleNote"

                }
            } else {
                when (choiceUser) {
                    0 -> SingleNoteMenu.editNote(list, choiceUserInArch - 1, choiceUserInNotes - 1)
                    1 -> SingleNoteMenu.viewNote(list, choiceUserInArch - 1, choiceUserInNotes - 1)
                    else -> locatedInMenu = "notes"
                }
            }

        }

    }
}