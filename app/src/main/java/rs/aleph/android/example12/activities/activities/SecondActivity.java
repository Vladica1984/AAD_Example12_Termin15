package rs.aleph.android.example12.activities.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Locale;

import rs.aleph.android.example12.R;
import rs.aleph.android.example12.activities.provider.JeloProvider;
import rs.aleph.android.example12.activities.provider.KategorijaProvider;
import rs.aleph.android.example12.activities.provider.SastojakProvider;

// Each activity extends Activity class
public class SecondActivity extends Activity {

   // private Jelo jelo = new Jelo("bananas.jpg","Naziv jela","Opis jela. Ovde ide neki dugacak opis","Voce","Banane",100,300.00f );

    private int position = 0;
    // onCreate method is a lifecycle method called when he activity is starting
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Each lifecycle method should call the method it overrides
        super.onCreate(savedInstanceState);
        // setContentView method draws UI
        setContentView(R.layout.activity_second);

        final int position = getIntent().getIntExtra("position", 0);

        // Finds "ivImage" ImageView and sets "imageDrawable" property
        ImageView ivImage = (ImageView) findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getAssets().open(JeloProvider.getJeloById(position).getSlika());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        TextView tvNaziv = (TextView) findViewById(R.id.tv_naziv);
        tvNaziv.setText(JeloProvider.getJeloById(position).getNaziv());

        TextView tvOpis = (TextView) findViewById(R.id.tv_opis);
        tvOpis.setText(JeloProvider.getJeloById(position).getOpis());

        //TextView tvKategorija = (TextView) findViewById(R.id.tv_kategorija);
        //tvKategorija.setText(jelo.getKategorija());

        Spinner kategorija = (Spinner) findViewById(R.id.sp_kategorija);
        List<String> kategorije = KategorijaProvider.getKategorijaNazivi();
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, kategorije);
        kategorija.setAdapter(adapter);
        kategorija.setSelection((int) JeloProvider.getJeloById(position).getKategorija().getId());

        final List<String> sastojciNazivi = SastojakProvider.getSastojakNazivi(JeloProvider.getJeloById(position));
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, R.layout.list_item, sastojciNazivi);

        ListView listView = (ListView) findViewById(R.id.list_sastojci);

        listView.setAdapter(dataAdapter);

        TextView tvKalorije = (TextView) findViewById(R.id.tv_kalorije);
        tvKalorije.setText(String.format(Locale.getDefault(),getString(R.string.jelo_calories),JeloProvider.getJeloById(position).getKalorije()));

        TextView tvCena = (TextView) findViewById(R.id.tv_cena);
        tvCena.setText(String.format(Locale.getDefault(), getString(R.string.jelo_price),JeloProvider.getJeloById(position).getCena()));

    }
    
    public void btnOpenCameraClicked(View view) {

        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        startActivity(i);
    }
}
