package wr1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f130970a;

    public g1(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f130970a = query;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1) && Intrinsics.d(this.f130970a, ((g1) obj).f130970a);
    }

    public final int hashCode() {
        return this.f130970a.hashCode();
    }

    public final String toString() {
        return a.a.p(new StringBuilder("UserSearchRequestArgs(query="), this.f130970a, ")");
    }
}
