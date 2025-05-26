package com.amazonaws.auth;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class SignerFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f28579a;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f28579a = concurrentHashMap;
        concurrentHashMap.put("QueryStringSignerType", QueryStringSigner.class);
        concurrentHashMap.put("AWS4SignerType", AWS4Signer.class);
        concurrentHashMap.put("NoOpSignerType", NoOpSigner.class);
    }
}
