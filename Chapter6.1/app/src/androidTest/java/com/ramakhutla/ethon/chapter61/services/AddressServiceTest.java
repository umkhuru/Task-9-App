package com.ramakhutla.ethon.chapter61.services;


import android.content.Context;
import android.content.Intent;
import android.test.AndroidTestCase;

import com.ramakhutla.ethon.chapter61.domain.AddressEmbeddableType;
import com.ramakhutla.ethon.chapter61.factory.AddressFactory;
import com.ramakhutla.ethon.chapter61.repository.AddressRepository;
import com.ramakhutla.ethon.chapter61.repository.impl.AddressRepositoryImpl;

/**
 * Created by Ethon on 5/8/2016.
 */
public class AddressServiceTest extends AndroidTestCase{

    /*setUp

Added in API level 1
void setUp ()
Gets the current system context and stores it. Extend this method to do your own test initialization.
If you do so, you must call super.setUp() as the first statement in your override.
The method is called before each test method is executed.*/

    @Override
    public void setUp() throws Exception {
        super.setUp();
        Intent intent = new Intent(this.getContext(), AddressService.class);
        intent.putExtra("Address","e15-9th ave");
        intent.putExtra("City", "oranjemund");
        intent.putExtra("postalCode", "1624");
        this.getContext().startService(intent);

    }
}
