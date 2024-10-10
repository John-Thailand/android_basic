package to.msn.wings.dialogargs

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class MyDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        var selected = 0
        val items = arrayOf("A型", "B型", "O型", "AB型")
        val dialog = activity?.let {
            AlertDialog.Builder(it).apply {
                setTitle("血液型")
                setIcon(R.drawable.wings)
                // 単一選択型のリストを生成
                setSingleChoiceItems(items, selected) { dialog, which ->
                    selected = which
                }
                // OKボタンを生成
                setPositiveButton("OK") { dialog, which ->
                    Toast.makeText(
                        activity,
                        "「${items[selected]}」が選択されました",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }.create()
        }
        // ダイアログを表示
        return dialog ?: throw IllegalStateException("Activity is null.")
    }
}