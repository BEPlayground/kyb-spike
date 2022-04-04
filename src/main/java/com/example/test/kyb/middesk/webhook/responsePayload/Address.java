package com.example.test.kyb.middesk.webhook.responsePayload;

import java.util.ArrayList;
import java.util.Date;

public class Address{
    public String object;
    public String address_line1;
    public Object address_line2;
    public String city;
    public String state;
    public String postal_code;
    public String full_address;
    public boolean submitted;
    public String id;
    public double latitude;
    public double longitude;
    public Object property_type;
    public boolean deliverable;
    public Object deliverability_analysis;
    public boolean street_view_available;
    public ArrayList<Object> labels;
    public Date created_at;
    public Date updated_at;
    public Object registered_agent_name;
    public boolean cmra;
    public String business_id;
    public ArrayList<Source> sources;
}
