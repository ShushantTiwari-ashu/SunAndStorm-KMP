import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        Window("SunAndStorm App") {
            Column(modifier = Modifier.fillMaxSize()) {
                MainViewWeb()
            }
        }
    }
}

