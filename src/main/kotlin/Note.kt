import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Note(var titleNote: String,
           var contentNote: String,
           val date:String = " - " + LocalDateTime.now().format(DateTimeFormatter.ofPattern(" dd MMM yyyy, HH:mm "))) {


    override fun toString(): String{
    return titleNote + "  " + date
    }
}