package com.example.myapplication

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.ModifierLocalReadScope

@composable
fun FormDataDiri(modifier: Modifier){
    //variable-variable untuk mengingat nilai masukan dari keyboard
    var textName by remember { mutableStateOf(value = "") }
    var textAlamat by remember { mutableStateOf(value = "") }
    var textJK by remember { mutableStateOf(value = "") }

    //variable-variable untuk menyimpan data yang di peroleh
    var nama by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var jenis by remember { mutableStateOf(value = "") }

    val gender:List<String> = listOf("Laki-Laki","Perempuan")

    column(modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CentreHorizontally){
        OutlinedTextField(
            value = textName,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(width = 250.dp),
            label = {Text(text = "Nama Lengkap")},
            onValueChange = {textName = it }

        )
        Row {
            gender.forEach { item ->
                Row{modifier = Modifier.selectable(
                    selected = textJK == item,
                    onClick = {textJK = item}
                )}
            }
        }
    }

}
