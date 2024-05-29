package com.nahid.demorecyclerview;

public class Datamodel {
    private String product;
    private String layoutType;

    public Datamodel(String product, String layoutType) {
        this.product = product;
        this.layoutType = layoutType;
    }

    public String getProduct() {
        return product;
    }

    public String getLayoutType() {
        return layoutType;
    }
}
