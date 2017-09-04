package nybles.tech.nyblesapp;

/**
 * Created by akanksha on 3/9/17.
 */
import android.content.Context;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.List;


public class ArticlesAdapter extends RecyclerView.Adapter<ArticlesAdapter.MyViewHolder> {

    private Context mContext;
    private List<Article> articleList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, author;
        public ImageView thumbnail;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            author = (TextView) view.findViewById(R.id.author);
            thumbnail = (ImageView) view.findViewById(R.id.thumbnail);

        }
    }


    public ArticlesAdapter(Context mContext, List<Article> articleList) {
        this.mContext = mContext;
        this.articleList = articleList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.article_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Article article = articleList.get(position);
        holder.title.setText(article.getName());
        holder.author.setText(article.getAuthor());

        Glide.with(mContext).load(article.getThumbnail()).into(holder.thumbnail);


    }



    @Override
    public int getItemCount() {
        return articleList.size();
    }
}
