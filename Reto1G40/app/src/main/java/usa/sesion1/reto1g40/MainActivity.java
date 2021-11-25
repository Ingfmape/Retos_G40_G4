package usa.sesion1.reto1g40;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuItemImpl;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnArbol;
    private Button btnEstrella;
    private Button btnCampana;
    private Button btnGorro;
    private Button btnCorona;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //metodo que permite habilitar el logo para visualizarlo
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //permite colocar un titulo y subtitulo
        getSupportActionBar().setTitle("Chrismas Store");
        getSupportActionBar().setSubtitle("Productos Nevideños");
        //muestra el icono en la barra
        getSupportActionBar().setLogo(R.mipmap.ic_icon_santa);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        btnArbol = (Button) findViewById(R.id.btnComprar1);
        btnArbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityProducto1.class);
                startActivity(intent);
            }
        });

        btnEstrella = (Button) findViewById(R.id.btnComprar2);
        btnEstrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityProducto2.class);
                startActivity(intent);
            }
        });

        btnCampana = (Button) findViewById(R.id.btnComprar3);
        btnCampana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityProducto3.class);
                startActivity(intent);
            }
        });

        btnGorro = (Button) findViewById(R.id.btnComprar4);
        btnGorro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityProducto4.class);
                startActivity(intent);
            }
        });

        btnCorona = (Button) findViewById(R.id.btnComprar5);
        btnCorona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityProducto5.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuopciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int idItem = item.getItemId();
        if (idItem == R.id.productos) {
            Intent productos = new Intent(this, MainActivity.class);
            startActivity(productos);
        }
        if (idItem == R.id.servicios) {
            Toast.makeText(getApplicationContext(), "Lo sentimos Menu en Construcción", Toast.LENGTH_LONG).show();
        }
        if (idItem == R.id.sucursales) {
            Toast.makeText(getApplicationContext(), "Lo sentimos Menu en Construcción", Toast.LENGTH_LONG).show();
        }
            return super.onOptionsItemSelected(item);
    }
}
