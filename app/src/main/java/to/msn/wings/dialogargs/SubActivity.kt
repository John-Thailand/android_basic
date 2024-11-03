package to.msn.wings.dialogargs

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        // インテント経由で渡されたデータをトーストに反映
        val txtName = intent.getStringExtra(Intent.EXTRA_TEXT)
        Toast.makeText(
            this,
            "こんにちは、${txtName}さん！",
            Toast.LENGTH_SHORT
        ).show()
    }
}