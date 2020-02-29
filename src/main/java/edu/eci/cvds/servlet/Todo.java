/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.cvds.servlet;

/**
 *
 * @author estudiante
 */
public class Todo {

    private int userId;
    private int id;
    private String title;
    private boolean complete;
    
    
    public Todo(){
    
    }
    
    public void setUserId(int newUserId){
        userId=newUserId;
    }
    public void setId(int newId){
        id=newId;
    }
    public void setTitle(String newTitle){
        title= newTitle;
    }
    public void setComplete(boolean newComplete){
        complete= newComplete;
    }
    public int getUserId(){
        return userId;
    }
    
    public int getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public boolean getComplete(){
        return complete;
    }
    
    
}
