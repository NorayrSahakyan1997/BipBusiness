package com.example.bipbusiness.model.main.restclient.adapters
//import com.example.kointest.model.main.restclient.model.Row

//class RecyclerAdapter(private val partItemList: List<Row>, private val clickListener: (Row) -> Unit) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        val inflater = LayoutInflater.from(parent.context)
//        val view = inflater.inflate(R.layout.recycler_item_row, parent, false)
//        return PartViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
////        (holder as PartViewHolder).bind(partItemList[position], clickListener)
////        holder.itemView.recyclerTextView.text = partItemList.get(position).firstName
////        Picasso.get().load(partItemList[position].avatar).into(holder.itemView.recyclerImageView)
//    }
//
//    override fun getItemCount() = partItemList.size
//
//    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        fun bind(part: Row, clickListener: (Row) -> Unit) {
//            itemView.setOnClickListener { clickListener(part) }
//        }
//    }
//
//}