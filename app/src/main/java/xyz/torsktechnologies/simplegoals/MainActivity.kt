package xyz.torsktechnologies.simplegoals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import xyz.torsktechnologies.simplegoals.ui.theme.SimpleGoalsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleGoalsTheme {
                MessageCard("bananeple")
            }
        }
    }
}

@Composable
fun MessageCard(name: String) {
    Row(modifier = Modifier.padding(all = 8.dp)) {
        Image(painter = painterResource(R.drawable.woman_1),
            contentDescription = "icon",
            modifier = Modifier.size(40.dp).clip(CircleShape)
                .border(1.5.dp, MaterialTheme.colors.secondary, CircleShape))

        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(text = "Hellooo $name",
                color = MaterialTheme.colors.primary,
                style = MaterialTheme.typography.subtitle2)
            Spacer(modifier = Modifier.height(4.dp))

            Surface(shape = MaterialTheme.shapes.medium, elevation = 1.dp) {
                Text(text = "jeg er karke", style = MaterialTheme.typography.body2)
            }
        }
    }
}

@Preview
@Composable
fun PreviewMessageCard() {
    SimpleGoalsTheme {
        MessageCard("")
    }
}