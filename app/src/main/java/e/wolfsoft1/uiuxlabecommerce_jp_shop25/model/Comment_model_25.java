package e.wolfsoft1.uiuxlabecommerce_jp_shop25.model;

public class Comment_model_25 {
    private final Integer commenter_image;
    private final String commenter_name;
    private final String comment;
    private final String comment_time;
    private final Integer comment_image;
    private final String notification;

    public String getNotification() {
        return notification;
    }

    public Integer getComment_image() {
        return comment_image;
    }

    public Integer getCommenter_image() {
        return commenter_image;
    }

    public String getCommenter_name() {
        return commenter_name;
    }

    public String getComment() {
        return comment;
    }

    public String getComment_time() {
        return comment_time;
    }

    public Comment_model_25(Integer commenter_image, String commenter_name, String comment, String comment_time, Integer comment_image, String notification) {

        this.notification=notification;
        this.commenter_image=commenter_image;
        this.commenter_name=commenter_name;
        this.comment_image=comment_image;
        this.comment=comment;
        this.comment_time=comment_time;
    }
}
