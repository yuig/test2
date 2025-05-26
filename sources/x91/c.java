package x91;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f134310a;

    public c(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f134310a = query;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f134310a, ((c) obj).f134310a);
    }

    public final int hashCode() {
        return this.f134310a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("SearchQueryChanged(query="), this.f134310a, ")");
    }
}
