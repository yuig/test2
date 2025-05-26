package com.appsflyer.internal;

/* loaded from: classes3.dex */
public abstract class AFh1eSDK extends AFa1rSDK {
    private final boolean copy;
    private final boolean hashCode;

    public AFh1eSDK() {
        this(null, null, null);
    }

    public AFh1eSDK(String str, Boolean bool, Boolean bool2) {
        super(str, null, Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false));
        this.hashCode = bool != null ? bool.booleanValue() : true;
        this.copy = true;
    }
}
