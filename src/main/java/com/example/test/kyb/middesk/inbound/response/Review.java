package com.example.test.kyb.middesk.inbound.response;

import java.util.ArrayList;
import java.util.Date;

public class Review {
    public String object;
    public String id;
    public Date created_at;
    public Date updated_at;
    public Date completed_at;
    public ArrayList<Task> tasks;
    public Assignee assignee;
}
