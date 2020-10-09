package domain;

public class Post {
    private int id;
    private int ownerId;
    private int authorId;
    private String text;
    private int date;
    private int views;
    private boolean pinned;
    private boolean subscribed;

    private LikesInfo likesInfo;
    private MoreAction otherInfo;
    private CommentsInfo commentsInfo;
    private RepostsInfo repostsInfo;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }
    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getAuthorId() {
        return authorId;
    }
    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }

    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }

    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }

    public boolean isPinned() {
        return pinned;
    }
    public void setPinned(boolean pinned) {
        this.pinned = pinned;
    }

    public boolean isSubscribed() {
        return subscribed;
    }
    public void setSubscribed(boolean subscribed) {
        this.subscribed = subscribed;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }
    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public MoreAction getOtherInfo() {
        return otherInfo;
    }
    public void setOtherInfo(MoreAction otherInfo) {
        this.otherInfo = otherInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }
    public void setRepostsInfo(RepostsInfo repostsInfo) {
        this.repostsInfo = repostsInfo;
    }

}
