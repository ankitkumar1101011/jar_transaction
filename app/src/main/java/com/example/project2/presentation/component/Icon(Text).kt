import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

//texticon used in topbar
@Composable
fun texticon(text : String="VR",
             modifier: Modifier = Modifier
) {
    Column (modifier){
        Box(contentAlignment = Alignment.Center,
            modifier = Modifier
                .size(50.dp)
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(Color(0xFF2B173D), Color(0xFF4F3964)),
                        center = Offset(130f, 120f),
                        radius = 140f,
                    ),
                    shape = CircleShape
                )
                .padding(8.dp)
        ) {
            Text(text = text,
                color = Color.White,
                textAlign = TextAlign.Center,
            )
        }
    }

}
