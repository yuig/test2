package com.facebook.login;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum j {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    NATIVE_ONLY(true, true, false, false, false, true, true),
    KATANA_ONLY(false, true, false, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false, false),
    WEB_VIEW_ONLY(false, false, true, false, false, false, false),
    DIALOG_ONLY(false, true, true, false, true, true, true),
    DEVICE_AUTH(false, false, false, true, false, false, false);

    private final boolean allowsCustomTabAuth;
    private final boolean allowsDeviceAuth;
    private final boolean allowsFacebookLiteAuth;
    private final boolean allowsGetTokenAuth;
    private final boolean allowsInstagramAppAuth;
    private final boolean allowsKatanaAuth;
    private final boolean allowsWebViewAuth;

    j(boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19) {
        this.allowsGetTokenAuth = z13;
        this.allowsKatanaAuth = z14;
        this.allowsWebViewAuth = z15;
        this.allowsDeviceAuth = z16;
        this.allowsCustomTabAuth = z17;
        this.allowsFacebookLiteAuth = z18;
        this.allowsInstagramAppAuth = z19;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static j[] valuesCustom() {
        j[] valuesCustom = values();
        return (j[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final boolean allowsCustomTabAuth() {
        return this.allowsCustomTabAuth;
    }

    public final boolean allowsDeviceAuth() {
        return this.allowsDeviceAuth;
    }

    public final boolean allowsFacebookLiteAuth() {
        return this.allowsFacebookLiteAuth;
    }

    public final boolean allowsGetTokenAuth() {
        return this.allowsGetTokenAuth;
    }

    public final boolean allowsInstagramAppAuth() {
        return this.allowsInstagramAppAuth;
    }

    public final boolean allowsKatanaAuth() {
        return this.allowsKatanaAuth;
    }

    public final boolean allowsWebViewAuth() {
        return this.allowsWebViewAuth;
    }
}
