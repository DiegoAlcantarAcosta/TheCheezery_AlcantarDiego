package alcantar.diego.thecheezery_247122

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)


        var btnCold: Button = findViewById(R.id.button_cold_drinks) as Button
        var btnHot: Button = findViewById(R.id.button_hot_drinks) as Button
        var btnSweet: Button = findViewById(R.id.button_sweets) as Button
        var btnSalties: Button = findViewById(R.id.button_salties) as Button

        btnCold.setOnClickListener(){
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("categoria", "ColdDrinks") // Cambia según la categoría deseada
            startActivity(intent)
        }

        btnHot.setOnClickListener(){
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("categoria", "HotDrinks") // Cambia según la categoría deseada
            startActivity(intent)
        }

        btnSweet.setOnClickListener(){
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("categoria", "Sweets") // Cambia según la categoría deseada
            startActivity(intent)
        }

        btnSalties.setOnClickListener(){
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("categoria", "Salties") // Cambia según la categoría deseada
            startActivity(intent)
        }
    }
}