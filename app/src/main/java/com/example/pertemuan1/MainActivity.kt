package com.example.pertemuan1

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pertemuan1.ui.theme.Pertemuan1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pertemuan1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(paddingValues = (innerPadding))) {
//                        ProfileCard()
//                        StyledButton()
//                        CounterButton()
//                        MyApp()
//                        AnimalList()
//                        NameInputScreen()
                        TodoApp()
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Pertemuan1Theme {
        Greeting("Android")
    }
}

@Composable
fun ProfileCard() {
    // Membuat susunan vertikal
    Column(
        modifier = Modifier.padding(16.dp) //memberi jarak 16dp
    ) {
        Text (text = "Nama: Fachri Maulana", fontSize = 24.sp)
        Text (text = "Pekerjaan: Mahasiswa", fontSize = 16.sp)
        Text (text = "Hobi: Mancing", fontSize = 16.sp)
        Text (text = "Kampus: STT MANDALA BANDUNG")

        // Spcaer memberik jarak kosong
        Row {
            Text(text = "Umur: 21")
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = "Kota: Bandung")
        }
    }
}

@Composable
fun StyledButton() {
    Text (
        text = "Klik saya",
        modifier = Modifier
            .padding(20.dp)
            .background(Color.Blue)
            .padding(10.dp)
            .clickable{println("Tombol diklik!")}
    )
}

@Composable
fun CounterButton() {
    var count by remember { mutableStateOf(0) }

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text (text = "Angka saat ini: $count", fontSize = 30.sp)

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { count++ }) {
            Text(text = "Tambah +1")
        }
        Button(onClick = { count-- }) {
            Text(text = "Kurang -1")
        }
        Button(onClick = { count *= 2 }) {
            Text(text = "Kali 2")
        }
    }
}

@Composable
fun MyApp() {
    var isOnline by remember {mutableStateOf(false)}

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card (
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color.Red)
        ) {
            Column (
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text (
                    text = "Fachri Maulana",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text (
                    text = if (isOnline) "Status: Online" else "Status: Offline",
                    fontSize = 18.sp
                )
                Spacer(modifier = Modifier.height(16.dp))

                Button(onClick = {isOnline = !isOnline}) {
                    Text(text = "Ubah Status")
                }

            }
        }
    }
}

@Composable
fun AnimalList() {
    // Data dummy
    val animals = listOf(
        "Kucing", "Anjing", "Burung", "Ikan", "Ular", "Gajah",
        "Kucing", "Anjing", "Burung", "Ikan", "Ular", "Gajah",
        "Kucing", "Anjing", "Burung", "Ikan", "Ular", "Gajah",
        "Kucing", "Anjing", "Burung", "Ikan", "Ular", "Gajah",
        "Kucing", "Anjing", "Burung", "Ikan", "Ular", "Gajah",
        "Kucing", "Anjing", "Burung", "Ikan", "Ular", "Gajah",
        "Kucing", "Anjing", "Burung", "Ikan", "Ular", "Gajah",
        "Kucing", "Anjing", "Burung", "Ikan", "Ular", "Gajah",
        "Kucing", "Anjing", "Burung", "Ikan", "Ular", "Gajah",
        "Kucing", "Anjing", "Burung", "Ikan", "Ular", "Gajah",
        "Kucing", "Anjing", "Burung", "Ikan", "Ular", "Gajah",
        "Kucing", "Anjing", "Burung", "Ikan", "Ular", "Gajah",
        "Kucing", "Anjing", "Burung", "Ikan", "Ular", "Gajah",
        "Kucing", "Anjing", "Burung", "Ikan", "Ular", "Gajah",
        "Kucing", "Anjing", "Burung", "Ikan", "Ular", "Gajah",
        "Kucing", "Anjing", "Burung", "Ikan", "Ular", "Gajah",
        "Kucing", "Anjing", "Burung"
    )

    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp) // jarak antar item
    ) {
        // items() fungsi iterasi data
        items(animals) { animal ->
            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Color.Red)
            ) {
                Text(
                    text = animal,
                    fontSize = 32.sp,
                    modifier = Modifier.padding(32.dp)
                )
            }
        }
    }
}

@Composable
fun NameInputScreen() {
    // State disimpan di sini
    var name by remember {mutableStateOf("")}

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Halo, $name!",
            fontSize = 24.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Left
        )

        Spacer(modifier = Modifier.height(32.dp))

        // OutlinedTextField menerima 'value' dan 'onvalueChange'
        OutlinedTextField(
            value = name,
            onValueChange = { newText ->
                name = newText
            },
            label = { Text("Masukkan Nama")},
            modifier = Modifier.fillMaxWidth()
        )
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodoApp() {
    var tasks by remember { mutableStateOf(listOf<String>())}
    var inputText by remember {mutableStateOf("")}

    Scaffold(
        // Header
        topBar = {
            TopAppBar(
                title = { Text("Aplikasi Tugas Saya")},
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Blue,
                    titleContentColor = Color.White
                )
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                if (inputText.isNotBlank()) {
                    tasks = tasks + inputText
                    inputText = ""
                }
            }) {
                Icon(Icons.Default.Add, contentDescription = "Tambah")
            }
        }
    ) { innerPadding ->
        // Content Area
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            // input area
            OutlinedTextField(
                value = inputText,
                onValueChange = {inputText = it },
                label = { Text("Tugas Baru")},
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            LazyColumn {
                items(tasks) { task ->
                    TaskItem(task)
                }
            }
        }

    }
}

@Composable
fun TaskItem(task: String) {
    var isChecked by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(checked = isChecked, onCheckedChange = {isChecked = it})
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = task, fontSize = 18.sp)
        }
    }
}