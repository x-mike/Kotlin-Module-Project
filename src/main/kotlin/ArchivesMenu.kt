import java.util.Scanner

class ArchivesMenu {

    companion object {

        fun createArchivesSheet(list: MutableList<Archive>): List<String> {
            val menuArchives: List<String> = List(list.size + 2) {
                when (it) {
                    0 -> "Создать архив"
                    in 1..list.size -> list[it - 1].toString()
                    else -> "Выход\n\n"
                }
            }
            return menuArchives
        }


        fun greateArchive(list: MutableList<Archive>) {
            println("Ввидите имя архива:")
            val archiveName = Scanner(System.`in`).nextLine()
            list.add(Archive(archiveName))

            println("Архив с именем '${archiveName}' создан!")
        }

    }

}