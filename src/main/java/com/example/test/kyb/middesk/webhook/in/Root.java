package com.example.test.kyb.middesk.webhook.in;

import java.util.ArrayList;
import java.util.Date;

public class Root{
    public String object;
    public String id;
    public Object external_id;
    public String name;
    public Date created_at;
    public Date updated_at;
    public String status;
    public ArrayList<Object> tags;
    public Requester requester;
    public String assignee_id;
    public Review review;
    public Object tin;
    public Object business_batch_id;
    public Formation formation;
    public Object website;
    public Watchlist watchlist;
    public ArrayList<Object> bankruptcies;
    public ArrayList<Object> certifications;
    public ArrayList<Document> documents;
    public ArrayList<Lien> liens;
    public ArrayList<String> names; // they thought this was a class. So no idea if this will be an issue.
    public ArrayList<Address> addresses;
    public ArrayList<Object> people;
    public ArrayList<Object> phone_numbers;
    public ArrayList<Object> profiles;
    public ArrayList<Registration> registrations;
    public ArrayList<Order> orders;
    public Object industry_classification;
    public Object subscription;
    public Object tax_exempt_organization;
    public ArrayList<Object> fmcsa_registrations;
}
