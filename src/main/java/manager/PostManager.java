package manager;

import domain.Post;

public class PostManager {
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
    private boolean favorite;
    private int postponedId;
    private boolean subscribed;


    public Post[] search(int ownerId, String domain, String query, int ownersOnly, int count, int offset) {
        return null;
    }

    public void delete(int ownerId, int postId) {

    }

}
