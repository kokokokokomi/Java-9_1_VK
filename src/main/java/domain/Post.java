package domain;

public class Post {
    private int id;
    private int fromId;
    private int createdBy;
    private String text;
    private int date;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String copyright;
    private String postType;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean favorite; // Невозможно назвать isFavorite - не получится сделать геттер и сеттер для boolean  //
    private int postponedId;

    private boolean subscribed; // В документации не нашёл описание возможности подписаться на сообщество из поста //

    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private PostSource postSource;
    private Geo geo;

    private MoreAction moreAction; // В документации не нашёл описание как поажаловаться и т.д. //


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getFromId() {
        return fromId;
    }
    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
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


    public int getIsPinned() {
        return isPinned;
    }
    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
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

    public MoreAction getMoreAction() {
        return moreAction;
    }
    public void setMoreAction(MoreAction moreAction) {
        this.moreAction = moreAction;
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

    public int getReplyOwnerId() {
        return replyOwnerId;
    }
    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }
    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }
    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getCopyright() {
        return copyright;
    }
    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }
    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }
    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public String getPostType() {
        return postType;
    }
    public void setPostType(String postType) {
        this.postType = postType;
    }

    public PostSource getPostSource() {
        return postSource;
    }
    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public Geo getGeo() {
        return geo;
    }
    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public int getSignerId() {
        return signerId;
    }
    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getCanPin() {
        return canPin;
    }
    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }
    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }
    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }
    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return favorite;
    }
    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }
    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }
}
