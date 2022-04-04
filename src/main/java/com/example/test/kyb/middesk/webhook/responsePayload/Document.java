package com.example.test.kyb.middesk.webhook.responsePayload;

import java.util.Date;

public class Document{
    public String object;
    public String id;
    public String document_type;
    public String filename;
    public String content_type;
    public int size;
    public String download_url;
    public Date created_at;
    public Source source;
    public Date filing_date;
}
