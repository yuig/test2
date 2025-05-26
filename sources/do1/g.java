package do1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements i {

    /* renamed from: a, reason: collision with root package name */
    public final String f55678a;

    public g(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f55678a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.d(this.f55678a, ((g) obj).f55678a);
    }

    public final int hashCode() {
        return this.f55678a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("URL(url="), this.f55678a, ")");
    }
}
