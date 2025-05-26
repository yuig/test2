package tu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p implements t {

    /* renamed from: a, reason: collision with root package name */
    public final String f119302a;

    public p(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f119302a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && Intrinsics.d(this.f119302a, ((p) obj).f119302a);
    }

    public final int hashCode() {
        return this.f119302a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("OnPageStarted(url="), this.f119302a, ")");
    }
}
