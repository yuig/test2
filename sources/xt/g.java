package xt;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g extends j {

    /* renamed from: a, reason: collision with root package name */
    public final String f135877a;

    public g(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f135877a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f135877a, ((g) obj).f135877a);
    }

    public final int hashCode() {
        return this.f135877a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("Clickthrough(url="), this.f135877a, ")");
    }
}
