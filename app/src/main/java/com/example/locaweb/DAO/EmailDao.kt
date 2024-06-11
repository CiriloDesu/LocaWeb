import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface EmailDao {
    @Query("SELECT * FROM emails ORDER BY timestamp DESC")
    suspend fun getAllEmails(): List<Email>

    @Insert
    suspend fun insertEmail(email: Email)

    // Outros métodos para atualizar, excluir, etc., se necessário
}
