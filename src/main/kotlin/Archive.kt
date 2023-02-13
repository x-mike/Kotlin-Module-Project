import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Archive(val titleArchive: String,
              val date:String = " - " + LocalDateTime.now().format(DateTimeFormatter.ofPattern(" dd MMM yyyy, HH:mm "))) {

    val listNotes: MutableList<Note> = mutableListOf()

    override fun toString(): String{
        return titleArchive + "  " + date
    }
}