package dev.wiixnative.android

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val page = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(28, 32, 28, 32)
            setBackgroundColor(Color.rgb(14, 20, 34))
        }

        val title = TextView(this).apply {
            text = "WiiXNative"
            textSize = 32f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }
        val subtitle = TextView(this).apply {
            text = "Projeto Android • ARM64\n\nBase inicial para desenvolvimento."
            textSize = 16f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
            setPadding(0, 16, 0, 28)
        }
        val status = TextView(this).apply {
            text = "Núcleo de compatibilidade Wii U ainda não incluído."
            textSize = 14f
            setTextColor(Color.rgb(255, 210, 120))
            gravity = Gravity.CENTER
            setPadding(0, 0, 0, 24)
        }
        val choose = Button(this).apply {
            text = "Selecionar jogo"
            setOnClickListener {
                status.text = "A seleção de jogos será conectada quando o carregador estiver implementado."
            }
        }

        page.addView(title)
        page.addView(subtitle)
        page.addView(status)
        page.addView(choose)
        setContentView(page)
    }
}
