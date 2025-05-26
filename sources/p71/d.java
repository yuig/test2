package p71;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f99084a;

    /* renamed from: b, reason: collision with root package name */
    public final int f99085b;

    public d(String query, int i13) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f99084a = query;
        this.f99085b = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f99084a, dVar.f99084a) && this.f99085b == dVar.f99085b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f99085b) + (this.f99084a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("GeneralAutocompleteRequestParams(query=");
        sb3.append(this.f99084a);
        sb3.append(", itemCount=");
        return a.a.n(sb3, this.f99085b, ")");
    }
}
