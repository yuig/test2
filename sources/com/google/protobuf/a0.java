package com.google.protobuf;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z f33850a = new z();

    /* renamed from: b, reason: collision with root package name */
    public static final z f33851b;

    static {
        z zVar;
        try {
            zVar = (z) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zVar = null;
        }
        f33851b = zVar;
    }
}
