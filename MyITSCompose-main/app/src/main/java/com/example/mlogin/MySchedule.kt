package com.example.mlogin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun MySchedule() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF6D84FF))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
                    .size(24.dp)
                    .height(54.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Image(painter = painterResource(R.drawable.panah), contentDescription = "Kembali")
                Image(
                    painter = painterResource(R.drawable.kalender),
                    contentDescription = "Kalender"
                )
                Text(
                    color = Color.White,
                    text = "Jadwal Kuliah",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
            Column {
                Text(modifier = Modifier.padding(16.dp), text = "Periode 2023/2024", color = Color.White, fontSize = 24.sp, fontWeight = FontWeight.Bold)
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .padding(24.dp)
            ) {

                Text(
                    text = "Senin",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(text = "13.30-15.20", fontSize = 16.sp)
                Text(
                    text = "TIF 113 Deep Learning - T",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(text = "Prof.Dr.Eng Chastine Fatichah, S.Kom., M.Kom.", fontSize = 12.sp)
                Spacer(modifier = Modifier.height(26.dp))
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray)
                    .padding(24.dp)
            ) {

                Text(
                    text = "Rabu",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                Text(text = "13.30-15.20", fontSize = 16.sp)
                Text(
                    text = "IF 305 Pemrograman Perangkat Bergerak - F",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold
                )
                Text(text = "Fajar Baskoro, S.Kom., M.T.", fontSize = 12.sp)
                Spacer(modifier = Modifier.height(26.dp))
            }
        }
    }