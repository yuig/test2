package me;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final String f86967a;

    /* renamed from: b, reason: collision with root package name */
    public final String f86968b;

    public a(String str, String appId) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.f86967a = str;
        this.f86968b = appId;
    }

    private final Object readResolve() {
        return new b(this.f86967a, this.f86968b);
    }
}
