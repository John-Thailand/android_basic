package to.msn.wings.dialogargs

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("LIFE", "onCreate")

        // ボタンクリック時に呼び出されるイベントリスナー
        val btn = findViewById<Button>(R.id.btnSend)
        btn.setOnClickListener {
            // SubActivityへのインテントを作成
            val i = Intent(this, SubActivity::class.java)
            // アクティビティを起動
            startActivity(i)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("LIFE", "onStart")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("LIFE", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("LIFE", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("LIFE", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("LIFE", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LIFE", "onDestroy")
    }
}