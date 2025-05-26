package ra0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final String f106949a;

    public j(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f106949a = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.d(this.f106949a, ((j) obj).f106949a);
    }

    public final int hashCode() {
        return this.f106949a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("ImageUrl(url="), this.f106949a, ")");
    }
}
