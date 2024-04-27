import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gearswap.R
import com.example.gearswap.ui.myProfile.reviews.Review

class ReviewAdapter(private val reviews: List<Review>) :
    RecyclerView.Adapter<ReviewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.review_item, parent, false)
        return ReviewViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {
        val review = reviews[position]
        holder.customerNameTextView.text = review.customerName
        holder.ratingBar.rating = review.rating
        holder.reviewTextView.text = review.reviewText

    }

    override fun getItemCount(): Int = reviews.size
}

class ReviewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val customerNameTextView: TextView = itemView.findViewById(R.id.customerNameTextView)
    val ratingBar: RatingBar = itemView.findViewById(R.id.ratingBar)
    val reviewTextView: TextView = itemView.findViewById(R.id.reviewTextView)
}

