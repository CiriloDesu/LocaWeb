import android.app.Application
import androidx.room.Room

class EmailApplication : Application() {
    companion object {
        lateinit var database: EmailDatabase
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            applicationContext,
            EmailDatabase::class.java, "email-database"
        ).build()
    }
}
