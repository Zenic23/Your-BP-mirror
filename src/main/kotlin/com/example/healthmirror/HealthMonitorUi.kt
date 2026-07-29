package com.example.healthmirror

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.useResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.healthmirrorbackend.*

// Define retro terminal theme colors
val TerminalGreen = Color(0xFF39FF14) // Bright neon green
val TerminalDarkGreen = Color(0xFF1F4529) // Darker green for borders
val TerminalSubText = Color(0xFF3A7A40) // Subdued text color
val TerminalBg = Color(0xFF121212) // Very dark gray background
val TerminalInputBg = Color(0xFF222222) // Input field background
val TerminalPlaceholder = Color(0xFF4A4A4A) // Input placeholder

@Composable
fun HealthMonitorScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(TerminalBg)
            .padding(24.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        HeaderSection()
        
        Spacer(modifier = Modifier.height(24.dp))
        
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            BpAgeColumn(modifier = Modifier.weight(1f))
        }
        
        Spacer(modifier = Modifier.height(24.dp))
        
        FooterSection()
    }
}

@Composable
fun HeaderSection() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "HEALTH MONITOR v2.4",
            color = TerminalGreen,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp,
            letterSpacing = 4.sp
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "PATIENT DIAGNOSTIC TERMINAL",
            color = TerminalSubText,
            fontFamily = FontFamily.Monospace,
            fontSize = 12.sp,
            letterSpacing = 3.sp
        )
        Spacer(modifier = Modifier.height(12.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier
                .size(8.dp)
                .background(TerminalGreen))
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "SYSTEM ONLINE | ALL CHANNELS ACTIVE _",
                color = TerminalSubText,
                fontFamily = FontFamily.Monospace,
                fontSize = 11.sp,
                letterSpacing = 1.sp
            )
        }
        Spacer(modifier = Modifier.height(24.dp))
        HorizontalDivider(color = TerminalDarkGreen, thickness = 1.dp)
    }
}

@Composable
fun FooterSection() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "SYS: MEDITERM-RT | BUILD 2406",
            color = TerminalSubText,
            fontFamily = FontFamily.Monospace,
            fontSize = 11.sp,
            letterSpacing = 1.sp
        )
        Text(
            text = "[] DIAGNOSTIC MODULE | READY",
            color = TerminalSubText,
            fontFamily = FontFamily.Monospace,
            fontSize = 11.sp,
            letterSpacing = 1.sp
        )
    }
}

@Composable
fun TerminalCard(
    modifier: Modifier = Modifier,
    title: String,
    content: @Composable ColumnScope.() -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxHeight()
            .border(1.dp, TerminalDarkGreen, RoundedCornerShape(8.dp))
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier
                .size(12.dp)
                .background(TerminalGreen))
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                text = title,
                color = TerminalGreen,
                fontFamily = FontFamily.Monospace,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                letterSpacing = 3.sp
            )
        }
        
        Spacer(modifier = Modifier.height(16.dp))
        DashedDivider()
        Spacer(modifier = Modifier.height(24.dp))
        
        content()
    }
}

@Composable
fun DashedDivider() {
    Canvas(modifier = Modifier
        .fillMaxWidth()
        .height(1.dp)) {
        drawLine(
            color = TerminalDarkGreen,
            start = Offset(0f, 0f),
            end = Offset(size.width, 0f),
            pathEffect = PathEffect.dashPathEffect(floatArrayOf(10f, 10f), 0f)
        )
    }
}

@Composable
fun TerminalInputField(label: String, placeholder: String, value: String, onValueChange: (String) -> Unit) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(bottom = 20.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier
                .size(6.dp)
                .background(TerminalGreen))
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = label,
                color = TerminalGreen,
                fontFamily = FontFamily.Monospace,
                fontSize = 13.sp,
                letterSpacing = 1.sp
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            textStyle = TextStyle(
                color = TerminalGreen,
                fontFamily = FontFamily.Monospace,
                fontSize = 14.sp,
                letterSpacing = 2.sp
            ),
            cursorBrush = SolidColor(TerminalGreen),
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .background(TerminalInputBg, RoundedCornerShape(6.dp))
                .border(1.dp, Color(0xFF333333), RoundedCornerShape(6.dp))
                .padding(horizontal = 16.dp, vertical = 12.dp),
            decorationBox = { innerTextField ->
                if (value.isEmpty()) {
                    Text(
                        text = placeholder,
                        color = TerminalPlaceholder,
                        fontFamily = FontFamily.Monospace,
                        fontSize = 14.sp,
                        letterSpacing = 2.sp
                    )
                }
                innerTextField()
            }
        )
    }
}

@Composable
fun TerminalButton(
    onClick: () -> Unit,
    label: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Transparent)
            .border(1.dp, TerminalGreen, RoundedCornerShape(6.dp))
            .clickable { onClick() }
            .padding(vertical = 12.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = label.uppercase(),
            color = TerminalGreen,
            fontFamily = FontFamily.Monospace,
            fontWeight = FontWeight.Bold,
            fontSize = 14.sp,
            letterSpacing = 2.sp
        )
    }
}

@Composable
fun TerminalResultBox(content: @Composable ColumnScope.() -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .border(1.dp, TerminalDarkGreen, RoundedCornerShape(6.dp))
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        content()
    }
}

@Composable
fun TerminalResultPane(
    lines: List<Pair<String, String>> = listOf(
        "STATUS" to "-- AWAITING INPUT --",
        
    )
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFF0D0D0D), RoundedCornerShape(6.dp))
            .border(1.dp, TerminalDarkGreen, RoundedCornerShape(6.dp))
            .padding(horizontal = 14.dp, vertical = 10.dp)
    ) {
        // Pane header bar
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(modifier = Modifier.size(6.dp).background(TerminalGreen))
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = "DIAGNOSTIC OUTPUT",
                color = TerminalSubText,
                fontFamily = FontFamily.Monospace,
                fontSize = 10.sp,
                letterSpacing = 1.sp
            )
        }
        DashedDivider()
        Spacer(modifier = Modifier.height(8.dp))
        // Result rows
        lines.forEach { (key, value) ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "$key :",
                    color = TerminalSubText,
                    fontFamily = FontFamily.Monospace,
                    fontSize = 11.sp,
                    letterSpacing = 1.sp
                )
                Text(
                    text = value,
                    color = TerminalGreen,
                    fontFamily = FontFamily.Monospace,
                    fontWeight = FontWeight.Bold,
                    fontSize = 11.sp,
                    letterSpacing = 1.sp
                )
            }
        }
    }
}

@Composable
fun BpAgeColumn(modifier: Modifier = Modifier) {
    var systolic by remember { mutableStateOf("") }
    var diastolic by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var bpDetails by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("") }

    TerminalCard(modifier = modifier, title = "BP / AGE") {
        TerminalInputField(label = "SYSTOLIC (mmHg)", placeholder = "e.g. 120", value = systolic, onValueChange = { systolic = it })
        TerminalInputField(label = "DIASTOLIC (mmHg)", placeholder = "e.g. 80", value = diastolic, onValueChange = { diastolic = it })
        TerminalInputField(label = "AGE (years)", placeholder = "e.g. 35", value = age, onValueChange = { age = it })
        
        Spacer(modifier = Modifier.weight(1f))
        
        TerminalResultBox {
            TerminalResultPane(
                lines = listOf(
                    "BP" to bpDetails
                    
                )
            )
            Spacer(modifier = Modifier.height(12.dp))
            TerminalButton(
                onClick = {
                    val systolicValue = systolic.toIntOrNull()
                    val diastolicValue = diastolic.toIntOrNull()
                    val ageValue = age.toIntOrNull()
                    if (systolicValue == null || diastolicValue == null || ageValue == null) {
                        errorMessage = "Invalid input. Please enter valid numbers for Systolic, Diastolic, and Age."
                        bpDetails = errorMessage
                    }
                    else {
                        val result1 = BpRecord(systolicValue , diastolicValue, ageValue)
                       
                        
                        // backend service call
                        val report1 = userBpService(result1)
                        
                        bpDetails = report1.BpReport()
                        
                        
                        
                        
                        
                        
                        
                    }
                },
                label = "Check"
            )
        }
    }
}


