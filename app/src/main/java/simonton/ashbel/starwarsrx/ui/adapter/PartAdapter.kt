package simonton.ashbel.starwarsrx.ui.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.part_list_item.view.*
import simonton.ashbel.starwarsrx.model.PartData
import simonton.ashbel.starwarsrx.R

class PartAdapter(private val partItemList : List<PartData>,
                  private val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        (holder as PartViewHolder).bind(partItemList[position])
    }

    override fun getItemCount() = partItemList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.part_list_item, parent, false)
        return PartViewHolder(view)
    }

    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(partData: PartData){
            itemView.tv_part_item_name.text = partData.itemName
            itemView.tv_part_id.text = partData.id.toString()
        }
    }
}