package com.example.test.kyb.middesk.webhook.responsePayload;

import java.util.ArrayList;

public class Lien{
    public String object;
    public String type;
    public String id;
    public ArrayList<Debtor> debtors;
    public ArrayList<SecuredParty> secured_parties;
    public String file_number;
    public String state;
    public String status;
    public String filing_date;
    public String updated_date;
    public String lapse_date;
    public String collateral;
    public Object collateral_type;
    public boolean negative_pledge;
}