package com.example.rams.Entities;

import com.example.rams.ErrorType;
import javax.persistence.*;

@Entity
public class ErrorData {
    //public static HashMap<ErrorType, ErrorData> allErrors;

    public ErrorData(){

    }

    /*public ErrorData(int id, ErrorType type, int precinctID, String comment) {
        this.id = id;
        this.type = type;
        this.precinctID = precinctID;
        this.comment = comment;
    }*/


    @Id
    @Column(name = "ErrorID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int errorID;

    private ErrorType type;

    private String comment;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "precinct_ID")
    private Precinct precinctForError;


    public static ErrorData getErrorById(int errorID) {
        //find the error based on this id and return the error
        return new ErrorData();
    }


    public int getErrorID() {
        return errorID;
    }

    public void setErrorID(int errorID) {
        this.errorID = errorID;
    }

    public ErrorType getType() {
        return type;
    }

    public void setType(ErrorType type) {
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Precinct getPrecinctForError() {
        return precinctForError;
    }

    public void setPrecinctForError(Precinct precinctForError) {
        this.precinctForError = precinctForError;
    }
}
