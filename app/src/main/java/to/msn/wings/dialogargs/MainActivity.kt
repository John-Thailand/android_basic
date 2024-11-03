package to.msn.wings.dialogargs

import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ツールバーとの紐付け
        val navController = (supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment).navController
        findViewById<Toolbar>(R.id.toolbar).setupWithNavController(
            navController,
            AppBarConfiguration(navController.graph)
        )
    }
}