package simonton.ashbel.starwarsrx

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import simonton.ashbel.starwarsrx.model.PartData
import simonton.ashbel.starwarsrx.ui.adapter.PartAdapter

class MainActivity : AppCompatActivity() {

    var partList = ArrayList<PartData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = rv_parts
        recyclerView.adapter = PartAdapter(parts(), this)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
    }
    private fun parts() : List<PartData>{
        return listOf(
            PartData(100000, "Renan Esteves"),
            PartData(156651, "Ana Carolina")
        )
    }
}
