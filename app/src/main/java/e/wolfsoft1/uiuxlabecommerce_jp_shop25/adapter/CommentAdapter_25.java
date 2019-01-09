package e.wolfsoft1.uiuxlabecommerce_jp_shop25.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_shop25.R;
import e.wolfsoft1.uiuxlabecommerce_jp_shop25.model.Comment_model_25;

public class CommentAdapter_25 extends RecyclerView.Adapter<CommentAdapter_25.MyCommentHolder> {

    private final ArrayList<Comment_model_25> commentArrayList;
    private final Context context;

    public CommentAdapter_25(Context context, ArrayList<Comment_model_25> commentArrayList) {
        this.commentArrayList = commentArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyCommentHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_comment25, viewGroup, false);
        return new MyCommentHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCommentHolder myCommentHolder, int i) {

        myCommentHolder.commenter_name.setText(commentArrayList.get(i).getCommenter_name());
        myCommentHolder.commenter_image.setImageResource(commentArrayList.get(i).getCommenter_image());
        myCommentHolder.comment_time.setText(commentArrayList.get(i).getComment_time());
        myCommentHolder.comment.setText(commentArrayList.get(i).getComment());
        myCommentHolder.comment_image.setImageResource(commentArrayList.get(i).getComment_image());
        myCommentHolder.notification.setText(commentArrayList.get(i).getNotification());
    }

    @Override
    public int getItemCount() {
        return commentArrayList.size();
    }

    class MyCommentHolder extends RecyclerView.ViewHolder {
        ImageView commenter_image,comment_image;
        TextView commenter_name, comment_time, comment,notification;

        public MyCommentHolder(@NonNull View itemView) {
            super(itemView);
            commenter_image = itemView.findViewById(R.id.commenter_image);
            commenter_name = itemView.findViewById(R.id.commenter_name);
            comment_time = itemView.findViewById(R.id.comment_time);
            comment = itemView.findViewById(R.id.comment);
            comment_image=itemView.findViewById(R.id.comment_image);
            notification=itemView.findViewById(R.id.notification);
        }
    }
}
