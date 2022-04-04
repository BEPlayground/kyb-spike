package com.example.test.kyb.middesk.inbound.response;

import java.util.ArrayList;
import java.util.Date;

public class Datum {
    public String object;
    public String id;
    public Object external_id;
    public String name;
    public Date created_at;
    public Date updated_at;
    public String status;
    public ArrayList<Object> tags;
    public boolean subscriptions_enabled;
    public Review review;
}
