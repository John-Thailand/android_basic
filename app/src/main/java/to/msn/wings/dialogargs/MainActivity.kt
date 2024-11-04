package to.msn.wings.dialogargs

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ヘルパーを準備
        val helper = SimpleDatabaseHelper(this)
        // データベースを取得
        helper.writableDatabase.use { db ->
            Toast.makeText(this, "接続しました", Toast.LENGTH_SHORT).show()
            // 本来であれば、ここにデータベース処理を記述
        }
    }
}