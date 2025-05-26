package pu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class v implements w {

    /* renamed from: a, reason: collision with root package name */
    public final tu.b0 f101372a;

    public v(tu.b0 webBrowserEffect) {
        Intrinsics.checkNotNullParameter(webBrowserEffect, "webBrowserEffect");
        this.f101372a = webBrowserEffect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && Intrinsics.d(this.f101372a, ((v) obj).f101372a);
    }

    public final int hashCode() {
        return this.f101372a.hashCode();
    }

    public final String toString() {
        return "WrappedWebBrowserEffectRequest(webBrowserEffect=" + this.f101372a + ")";
    }
}
