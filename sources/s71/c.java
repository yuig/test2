package s71;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f111349a;

    public c(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f111349a = query;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.f111349a, ((c) obj).f111349a);
    }

    public final int hashCode() {
        return this.f111349a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("CollageSearchEvent(query="), this.f111349a, ")");
    }
}
