package com.example.test.kyb.middesk.create.daos;

import com.example.test.kyb.middesk.create.responsePayload.Root;

import java.io.Serializable;

public class CreateMiddeskBusinessDAO implements Serializable {

    public void apply(Root root) {
        //@TODO: Persist here with Piangles.
        System.out.println("The root! : " + root);
    }
}
