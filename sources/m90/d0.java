package m90;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d0 implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f86643a;

    /* renamed from: b, reason: collision with root package name */
    public final za0.b f86644b;

    public d0(String query, za0.b type) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f86643a = query;
        this.f86644b = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return Intrinsics.d(this.f86643a, d0Var.f86643a) && this.f86644b == d0Var.f86644b;
    }

    public final int hashCode() {
        return this.f86644b.hashCode() + (this.f86643a.hashCode() * 31);
    }

    public final String toString() {
        return "Search(query=" + this.f86643a + ", type=" + this.f86644b + ")";
    }
}
