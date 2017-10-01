package net.forestlive.kotlinrecyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.ImageView
import net.forestlive.kotlinrecyclerview.Utils.Util

class ScrollingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scrolling)


        val extras = intent.extras

        val imageTransitionName = extras.getString(Util.EXTRA_ANIMAL_IMAGE_TRANSITION_NAME)
        (findViewById(R.id.animal_detail_image_view) as ImageView).transitionName = imageTransitionName


        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)


    }
}
