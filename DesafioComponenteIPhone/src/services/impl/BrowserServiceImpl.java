package services.impl;

import services.BrowserService;

public class BrowserServiceImpl implements BrowserService {

    @Override
    public void showWebPage(String url) {
        System.out.println("Displaying a web page at: " + url);
    }

    @Override
    public void addNewTab() {
        System.out.println("Add a new tab");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshed the web page");
    }
}
