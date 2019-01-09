package e.wolfsoft1.uiuxlabecommerce_jp_shop25;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.viewpagerindicator.LinePageIndicator;

import java.util.ArrayList;

import e.wolfsoft1.uiuxlabecommerce_jp_shop25.adapter.ColorAdapter_25;
import e.wolfsoft1.uiuxlabecommerce_jp_shop25.adapter.CommentAdapter_25;
import e.wolfsoft1.uiuxlabecommerce_jp_shop25.adapter.Shirt_ViewpagerAdapter_Shop25;
import e.wolfsoft1.uiuxlabecommerce_jp_shop25.adapter.SizeAdapter_25;
import e.wolfsoft1.uiuxlabecommerce_jp_shop25.model.Color_Model;
import e.wolfsoft1.uiuxlabecommerce_jp_shop25.model.Comment_model_25;
import e.wolfsoft1.uiuxlabecommerce_jp_shop25.model.Size_Model;

public class Shop_25 extends AppCompatActivity {

    ViewPager viewpager_shop25;
    RecyclerView size_recyclerview_25, color_recycler_25,comment_recyclerview25;

    private String size[] = {"X", "XL", "S", "XS", "XL", "XX", "L", "SL"};
    private Integer[] color = {R.drawable.ic_color25_1, R.drawable.ic_color25_2, R.drawable.ic_color25_3, R.drawable.ic_color25_4, R.drawable.ic_color25_5, R.drawable.ic_color25_6, R.drawable.ic_color25_7, R.drawable.ic_color25_8};

    private String[] commenter_name={"Mary Cox","Sandra Bell"};
    private String[] comment_time={"05:52 PM","09:27 PM"};
    private String comment[]={"You have such a cool store","It's cool thanks"};
    private Integer commenter_image[]={R.drawable.commentimage1,R.drawable.commentimage2};
    private Integer comment_image[]={R.drawable.smile,R.drawable.thumb};
    private String notification[]={"3","2"};

    ArrayList<Size_Model> size_modelArrayList;
    ArrayList<Color_Model> color_modelArrayList;
    ArrayList<Comment_model_25> commentArrayList;
    LinePageIndicator indicator_line;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_25);

        color_recycler_25=findViewById(R.id.color_recycler_25);
        comment_recyclerview25=findViewById(R.id.comment_recyclerview25);
        size_recyclerview_25=findViewById(R.id.size_recyclerview_25);
        viewpager_shop25=findViewById(R.id.viewpager_shop25);
        indicator_line=findViewById(R.id.indicator_line);

        viewpager_shop25.setPageMargin(8);
        viewpager_shop25.setClipToPadding(false);
        Shirt_ViewpagerAdapter_Shop25 viewPagerAdapter = new Shirt_ViewpagerAdapter_Shop25(getSupportFragmentManager(), 3);
        viewpager_shop25.setAdapter(viewPagerAdapter);

        indicator_line.setViewPager(viewpager_shop25);

        size_modelArrayList = new ArrayList<>();

        for (int i = 0; i < size.length; i++) {
            Size_Model size_model = new Size_Model(size[i]);
            size_modelArrayList.add(size_model);
        }

        size_recyclerview_25.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        SizeAdapter_25 sizeAdapter = new SizeAdapter_25(this, size_modelArrayList);
        size_recyclerview_25.setAdapter(sizeAdapter);

        color_modelArrayList = new ArrayList<>();
        for (int i = 0; i < color.length; i++) {
            Color_Model color_model = new Color_Model(color[i]);
            color_modelArrayList.add(color_model);
        }

        color_recycler_25.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        ColorAdapter_25 adapter = new ColorAdapter_25(this, color_modelArrayList);
        color_recycler_25.setAdapter(adapter);

        commentArrayList=new ArrayList<>();
        for(int i=0;i<commenter_image.length;i++){
            Comment_model_25 comment_model=new Comment_model_25(commenter_image[i],commenter_name[i],comment[i],comment_time[i],comment_image[i],notification[i]);
            commentArrayList.add(comment_model);
        }

        comment_recyclerview25.setLayoutManager(new LinearLayoutManager(this));
        CommentAdapter_25 commentAdapter=new CommentAdapter_25(this,commentArrayList);
        comment_recyclerview25.setAdapter(commentAdapter);

    }
}
