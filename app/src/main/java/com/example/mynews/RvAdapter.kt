import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mynews.Articles
import com.example.mynews.databinding.NewContactListBinding
import com.squareup.picasso.Picasso

lateinit var binding: NewContactListBinding
class RvAdapter(var artcles: List<Articles>): RecyclerView.Adapter<RecyclerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        var binding = NewContactListBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return RecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        var currentArticle = artcles.get(position)

        with(holder.binding){
            tvTitle.text = currentArticle.title
            tvDescription.text = currentArticle.description
            Picasso.get().load(currentArticle.urlToImage).into(imgPhoto)
        }
    }

    override fun getItemCount(): Int {
        return artcles.size
    }

}

class RecyclerViewHolder(var binding: NewContactListBinding) : RecyclerView.ViewHolder(binding.root)