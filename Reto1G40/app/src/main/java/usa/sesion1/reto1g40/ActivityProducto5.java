package usa.sesion1.reto1g40;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityProducto5 extends AppCompatActivity {

    private Button btnAddCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto5);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Chrismas Store");
        getSupportActionBar().setSubtitle("Productos Nevideños");
        getSupportActionBar().setLogo(R.mipmap.ic_icon_santa);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        btnAddCart = (Button) findViewById(R.id.btnAddCart);

        btnAddCart.setOnClickListener(new View.OnClickListener (){
            @Override
            public  void onClick(View v){
                Toast.makeText(getApplicationContext(), "Usted ha añadido el producto al carrito de compras", Toast.LENGTH_LONG).show();
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