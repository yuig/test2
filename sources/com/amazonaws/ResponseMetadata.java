package com.amazonaws;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class ResponseMetadata {

    /* renamed from: a, reason: collision with root package name */
    public final Map f28544a;

    public ResponseMetadata(HashMap hashMap) {
        this.f28544a = hashMap;
    }

    public final String toString() {
        Map map = this.f28544a;
        return map == null ? "{}" : map.toString();
    }
}
