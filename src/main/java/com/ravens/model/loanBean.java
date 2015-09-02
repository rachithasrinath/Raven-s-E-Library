/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ravens.model;

import java.util.Date;

/**
 *
 * @author pratibhakakarla
 */
public class loanBean {
    
    private String documentName;
    private Date issuedate;
    private Date returndate;
    private int patID;

    /**
     * @return the documentName
     */
    public String getDocumentName() {
        return documentName;
    }

    /**
     * @param documentName the documentName to set
     */
    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    /**
     * @return the issuedate
     */
    public Date getIssuedate() {
        return issuedate;
    }

    /**
     * @param issuedate the issuedate to set
     */
    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    /**
     * @return the returndate
     */
    public Date getReturndate() {
        return returndate;
    }

    /**
     * @param returndate the returndate to set
     */
    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    /**
     * @return the patID
     */
    public int getPatID() {
        return patID;
    }

    /**
     * @param patID the patID to set
     */
    public void setPatID(int patID) {
        this.patID = patID;
    }
    
    
    
    
}
