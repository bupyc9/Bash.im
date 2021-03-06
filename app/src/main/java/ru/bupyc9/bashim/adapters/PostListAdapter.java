package ru.bupyc9.bashim.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ru.bupyc9.bashim.R;
import ru.bupyc9.bashim.models.Post;

public class PostListAdapter extends RecyclerView.Adapter<PostListAdapter.ViewHolder> {
    private List<Post> mItems;

    public PostListAdapter(List<Post> items) {
        mItems = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Post item = mItems.get(position);
        holder.desc.setText(item.getElementPureHtml());
    }

    @Override
    public int getItemCount() {
        return mItems == null ? 0 : mItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView desc;

        public ViewHolder(View view) {
            super(view);
            desc = (TextView) view.findViewById(R.id.desc);
        }
    }
}
