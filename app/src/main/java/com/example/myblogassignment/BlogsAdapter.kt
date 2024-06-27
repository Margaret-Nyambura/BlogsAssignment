package com.example.myblogassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BlogsAdapter(var blogList: List<Blog>):
    RecyclerView.Adapter<BlogsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.blogs_list_item, parent, false)
        return BlogsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: BlogsViewHolder, position: Int) {
       val blog = blogList[position]
        holder.ivAvatar.text = blog.image
        holder.date.text = blog.date
        holder.name.text = blog.name
        holder.title.text = blog.title
        holder.preview.text = blog.preview
    }

    override fun getItemCount(): Int {
        return blogList.size
    }
}

class BlogsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val ivAvatar = itemView.findViewById<TextView>(R.id.ivAvatar)
    val date = itemView.findViewById<TextView>(R.id.tvDate)
    val name = itemView.findViewById<TextView>(R.id.tvName)
    val title = itemView.findViewById<TextView>(R.id.tvTitle)
    val preview = itemView.findViewById<TextView>(R.id.tvPreview)
}