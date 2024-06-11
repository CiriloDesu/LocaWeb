import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Email::class], version = 1, exportSchema = false)
abstract class EmailDatabase : RoomDatabase() {
    abstract fun emailDao(): EmailDao
}
