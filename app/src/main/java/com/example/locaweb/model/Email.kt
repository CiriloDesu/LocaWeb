import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "emails")
data class Email(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val subject: String,
    val sender: String,
    val message: String,
    val timestamp: Long // Para armazenar a data e hora do envio
)
