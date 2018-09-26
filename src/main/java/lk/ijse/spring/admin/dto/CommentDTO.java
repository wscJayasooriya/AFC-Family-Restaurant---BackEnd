package lk.ijse.spring.admin.dto;

public class CommentDTO {

    private int commentID;
    private String name;
    private String email;
    private String contact;
    private String comment;

    public CommentDTO() {
    }

    public CommentDTO(int commentID, String name, String email, String contact, String comment) {
        this.setCommentID(commentID);
        this.setName(name);
        this.setEmail(email);
        this.setContact(contact);
        this.setComment(comment);
    }

    public int getCommentID() {
        return commentID;
    }

    public void setCommentID(int commentID) {
        this.commentID = commentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "CommentDTO{" +
                "commentID=" + commentID +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
