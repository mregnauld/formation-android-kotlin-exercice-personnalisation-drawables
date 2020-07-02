package com.formationandroid.personnalisationdrawables

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{

	companion object
	{
		// Constantes :
		private const val URL_TABLEAU = "https://www.le-tout-lyon.fr/content/images/2020/01/16/11958/thumbnailpicassobuste-de-femmemcclay-gallery.jpg"
	}


	override fun onCreate(savedInstanceState: Bundle?)
	{
		// init :
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		// chargement et affichage d'une image :
		Picasso.get()
				.load(URL_TABLEAU)
				.into(image_tableau)
	}

	override fun onCreateOptionsMenu(menu: Menu): Boolean
	{
		// fait le lien entre le xml du menu et la classe de cette activité :
		menuInflater.inflate(R.menu.main_menu, menu)
		return true
	}

	override fun onOptionsItemSelected(item: MenuItem): Boolean
	{
		return when (item.itemId)
		{
			R.id.action_legende ->
			{
				legende.visibility = View.VISIBLE
				true
			}
			else -> super.onOptionsItemSelected(item)
		}
	}

}