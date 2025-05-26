package com.example.composestudy

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composestudy.ui.theme.ComposeStudyTheme

class BtnActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeStudyTheme {
                    BtnClicked(onClick = {
                        Toast.makeText(this, "Hello Android", Toast.LENGTH_SHORT).show()
                    })
                }


            }
        }
    }


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BtnClicked(onClick:()->Unit) {

//    스탭 1: Button을 클릭했을 때 Toast를 출력하게 만들어봅시다.
//    Button(onClick = onClick ) {
//        Text(text = "Send")
//    }

//    스탭 2: Icon을 Text 앞에 추가시켜봅시다. imageVector에는 Icons.Filled.Send를 넣고 contentDescription에는 null을 넣어봅시다.
//    강의와 다르게 ImageVector 사용이 안되어
//    따로 Send_image_vector를 다운로드후 painter를 사용하여 대체 하였습니다.
//    Button(onClick = onClick ) {
//        androidx.compose.material3.Icon(painter = painterResource(R.drawable.baseline_send_24), contentDescription = null)
//        Text(text = "Send")
//    }

//    스탭 3: 아이콘과 텍스트 사이에 Spacer를 넣어봅시다. modifier에 Modifier.size를 넣고 사이즈를 ButtonDefaults.IconSpacing을 지정합시다.
//    Button(onClick = onClick ) {
//        androidx.compose.material3.Icon(painter = painterResource(R.drawable.baseline_send_24), contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Send")
//    }

//    스탭 4: enabled를 false로 바꾸어봅시다.
//    Button(onClick = onClick, enabled = false ) {
//        androidx.compose.material3.Icon(painter = painterResource(R.drawable.baseline_send_24), contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Send")
//    }

//    스탭 5: border에 BorderStroke를 설정합시다.
//    Button(
//        onClick = onClick,
//        enabled = true,
//        border = BorderStroke(10.dp, Color.Magenta)
//    ) {
//        androidx.compose.material3.Icon(painter = painterResource(R.drawable.baseline_send_24), contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Send")
//    }

//    스탭 6: shape를 CircleShape로 지정합시다.
//    Button(
//        onClick = onClick,
//        border = BorderStroke(10.dp, Color.Magenta),
//        shape = CircleShape
//    ) {
//        androidx.compose.material3.Icon(painter = painterResource(R.drawable.baseline_send_24), contentDescription = null)
//        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
//        Text(text = "Send")
//    }

//    스탭 7: contentPadding에 PaddingValues를 설정합시다.
    Button(
        onClick = onClick,
        border = BorderStroke(10.dp, Color.Magenta),
        shape = CircleShape,
        contentPadding = PaddingValues(all = 20.dp)
    ) {
        androidx.compose.material3.Icon(painter = painterResource(R.drawable.baseline_send_24), contentDescription = null)
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
        Text(text = "Send")
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    ComposeStudyTheme {
        BtnClicked(onClick = {

        })
    }
}


