package object;

import java.io.Serializable;

public class User implements Serializable {

    private String fullName;
    private String id;
    private String email;
    private String gender;
    private String study;
    private String[] subject;
    private String comment;
//    
//    public User() {
//        fullName = "";
//        id = "";
//        email = "";
//        gender = "";
//        study = "";
//        subject = null;
//        comment = "";
//    }
    public User() {
        fullName = "";
        id = "";
        email = "";
        gender = "";
        study = "";
        subject = null;
        comment = "";
    }
     public User(String fullName, String id, String email, String gender, String study, String[] subject, String comment) {
        this.fullName = fullName;
        this.id = id;
        this.email = email;
        this.gender = gender;
        this.study = study;
        this.subject = subject;
        this.comment = comment;
        
    }


//    public User(String fullName, String id, String email, String gender, String study, String[] subject, String comment) {
//        this.fullName = fullName;
//        this.id = id;
//        this.email = email;
//        this.gender = gender;
//        this.study = study;
//        this.subject = subject;
//        this.comment = comment;
//        
//    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getStudy() {
        return study;
    }
    public void setStudy(String study) {
        this.study = study;
    }
    public String[] getSubject() {
        return subject;
    }
    public void setSubject(String[] subject) {
        this.subject = subject;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
}
