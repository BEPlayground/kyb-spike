package com.example.test.kyb.middesk.outbound.request.daos;

import com.example.test.kyb.middesk.outbound.request.in.Root;

import java.io.Serializable;

public class MiddeskBusinessDAO implements Serializable {

    public void save(Root root) {
        //@TODO: Persist here with Piangles.
        System.out.println("The root! : " + root);
    }
}
