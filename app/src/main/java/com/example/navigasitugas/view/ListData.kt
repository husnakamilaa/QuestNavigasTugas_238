package com.example.navigasitugas.view

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import com.example.navigasitugas.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListData(
    OnFormulirBtnClick:()-> Unit,
    OnBackToBeranda:()->Unit
) {
    val items = listOf(
        Pair(stringResource(R.string.nama_lengkap), "Aprilia Kurnianti"),
        Pair(stringResource(R.string.jenis_kelamin), "Perempuan"),
        Pair(stringResource(R.string.status), "Lajang"),
        Pair(stringResource(R.string.alamat), "Sleman")
    )
    Scaffold(modifier = Modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(R.string.list), color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(R.color.purple_200))
            )
        }) {  }
}