package ca0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i1 implements j1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27130a;

    public i1(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f27130a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1) && Intrinsics.d(this.f27130a, ((i1) obj).f27130a);
    }

    public final int hashCode() {
        return this.f27130a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("RemoteImage(url="), this.f27130a, ")");
    }
}
