package com.mycompany;

import org.apache.wicket.markup.html.WebPage;

public class HomePage extends WebPage {
    private static final long serialVersionUID = -8896769873107976128L;

    @Override
    protected void onInitialize() {
        super.onInitialize();

        System.out.println("HomePage - onInitialize");
    }

    @Override
    protected void onBeforeRender() {
        super.onBeforeRender();

        System.out.println("HomePage - onBeforeRender");
    }
}
