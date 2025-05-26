package me;

import java.io.Serializable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f87021a;

    public s(HashMap proxyEvents) {
        Intrinsics.checkNotNullParameter(proxyEvents, "proxyEvents");
        this.f87021a = proxyEvents;
    }

    private final Object readResolve() {
        return new t(this.f87021a);
    }
}
