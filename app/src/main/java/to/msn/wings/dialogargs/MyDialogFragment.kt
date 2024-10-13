package to.msn.wings.dialogargs

import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.EditText
import androidx.fragment.app.DialogFragment
import java.util.Calendar

class MyDialogFragment : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // 現在の時刻を準備
        val cal = Calendar.getInstance()
        val dialog = activity?.let {
            TimePickerDialog(
                it,
                { view, hourOfDay, minute ->
                    val txtDate = it.findViewById<EditText>(R.id.txtTime)
                    txtDate.setText("${hourOfDay}:${minute}")
                },
                cal[Calendar.HOUR_OF_DAY],
                cal[Calendar.MINUTE],
                false
            )
        }
        return dialog ?: throw IllegalStateException("Activity is null.")
    }
}