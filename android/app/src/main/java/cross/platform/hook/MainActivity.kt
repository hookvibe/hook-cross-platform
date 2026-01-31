package cross.platform.hook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import cross.platform.hook.ui.theme.AndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidTheme {
                HookCardPage()
            }
        }
    }
}

@Composable
fun HookCardPage() {
    val backgroundBrush = Brush.linearGradient(
        listOf(
            Color(0xFF0F172A),
            Color(0xFF1E293B)
        )
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundBrush)
            .padding(24.dp),
        contentAlignment = Alignment.Center
    ) {
        Card(
            modifier = Modifier
                .widthIn(max = 360.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White.copy(alpha = 0.92f)
            ),
            elevation = CardDefaults.cardElevation(defaultElevation = 18.dp)
        ) {
            Column(
                modifier = Modifier.padding(start = 28.dp, top = 28.dp, end = 28.dp, bottom = 30.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "HOOK-CROSS-PLATFORM",
                    fontSize = 12.sp,
                    letterSpacing = 2.8.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF38BDF8),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = "Hello HCP",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 12.dp, bottom = 8.dp)
                )
                Text(
                    text = "跨端一致 Demo",
                    fontSize = 16.sp,
                    color = Color(0xFF334155),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Box(
                    modifier = Modifier
                        .padding(top = 16.dp, bottom = 12.dp)
                        .width(72.dp)
                        .height(3.dp)
                        .background(Color(0xFF38BDF8), RoundedCornerShape(999.dp))
                )
                Text(
                    text = "TS / Kotlin / SwiftUI",
                    fontSize = 13.sp,
                    color = Color(0xFF64748B),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HookCardPreview() {
    AndroidTheme {
        HookCardPage()
    }
}
