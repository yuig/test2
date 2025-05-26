package tu;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i implements t {

    /* renamed from: a, reason: collision with root package name */
    public final String f119290a;

    public i(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f119290a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && Intrinsics.d(this.f119290a, ((i) obj).f119290a);
    }

    public final int hashCode() {
        return this.f119290a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("FailedToOpenChromeTabs(url="), this.f119290a, ")");
    }
}
