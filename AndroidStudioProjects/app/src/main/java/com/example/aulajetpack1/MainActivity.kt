package com.example.aulajetpack1

import android.R.attr.onClick
import android.location.GnssAntennaInfo.Listener
import android.os.Bundle
import androidx.compose.material3.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aulajetpack1.ui.theme.AulaJetPack1Theme
import com.example.aulajetpack1.ui.theme.Blue01
import com.example.aulajetpack1.ui.theme.Blue02
import com.example.aulajetpack1.ui.theme.Pink40
import com.example.aulajetpack1.ui.theme.Purple500

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AulaJetPack1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProdutoItem()
                }
            }
        }
    }
}

@Composable
fun botao() {
    Button(
        onClick = { },
        modifier = Modifier
            .padding(16.dp)
            .width(250.dp)
            .height(50.dp)
            .fillMaxWidth()

    ) {
        Text("Enviar")
    }
}
@Preview(showBackground = true)
@Composable
fun ProdutoItem() {


    var text2 by remember { mutableStateOf("") }
    var text3 by remember { mutableStateOf("") }

    Column (
//        Modifier
//            .height(250.dp)
//            .width(200.dp)
    ){
        Box(
            modifier = Modifier
                .height(100.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            Blue01, Blue02
                        )
                    )
                )
                .fillMaxWidth()
        ){
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription =" Descrição da Imagem",
                modifier = Modifier
                .offset(y =(50).dp)
                    .clip(shape = CircleShape)
                    .align(Alignment.BottomCenter)
            )

        }
        Spacer(modifier = Modifier.height(50.dp))

        Column(Modifier.padding(16.dp)){

            Text(
                 modifier = Modifier.fillMaxWidth(),
                 text = "Login",
                 fontSize = 18.sp, fontWeight = FontWeight(700),
                 maxLines = 2,
                 overflow = TextOverflow.Ellipsis,
                 textAlign = TextAlign.Center
            )

            Text(
                text = "Nome",
                Modifier.padding(top = 8.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight(400)
            )

            Spacer(modifier = Modifier.height(10.dp))

            var text by remember { mutableStateOf("") }
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = text,
                onValueChange = { text = it },
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Telefone",
                Modifier.padding(top = 8.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight(400)
            )

            Spacer(modifier = Modifier.height(10.dp))

            var text2 by remember { mutableStateOf("") }
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = text2,
                onValueChange = { text2 = it }
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Curso",
                Modifier.padding(top = 8.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight(400)
            )

            Spacer(modifier = Modifier.height(10.dp))

            var text3 by remember { mutableStateOf("") }
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = text3,
                onValueChange = { text3 = it },
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "Série",
                Modifier.padding(top = 8.dp),
                fontSize = 14.sp,
                fontWeight = FontWeight(400)
            )

            Spacer(modifier = Modifier.height(10.dp))

            var text4 by remember { mutableStateOf("") }
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = text4,
                onValueChange = { text4 = it },
            )
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                botao()
            }

        }


    }
}
