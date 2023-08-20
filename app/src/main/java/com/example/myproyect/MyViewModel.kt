import androidx.compose.runtime.MutableState
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.text.input.TextFieldValue

class MyViewModel : ViewModel() {
    private val _text1 = mutableStateOf(TextFieldValue(""))
    val text1: MutableState<TextFieldValue> = _text1

    private val _text2 = mutableStateOf(TextFieldValue(""))
    val text2: MutableState<TextFieldValue> = _text2

    private val _resultText = mutableStateOf("")
    val resultText: MutableState<String> = _resultText

    fun onText1Changed(newText: String) {
        _text1.value = TextFieldValue(newText)
    }

    fun onText2Changed(newText: String) {
        _text2.value = TextFieldValue(newText)
    }

    fun compareStrings(text1: TextFieldValue, text2: TextFieldValue) {
        val text1Value = _text1.value.text
        val text2Value = _text2.value.text

        _resultText.value = if (text1Value == text2Value) {
            "Las cadenas son iguales"
        } else {
            "Las cadenas son diferentes"
        }
    }
}
