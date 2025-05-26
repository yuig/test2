package p71;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f99075a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f99076b;

    public a(String query, boolean z13) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f99075a = query;
        this.f99076b = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f99075a, aVar.f99075a) && this.f99076b == aVar.f99076b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99076b) + (this.f99075a.hashCode() * 31);
    }

    public final String toString() {
        return "BoardAutocompleteRequestParams(query=" + this.f99075a + ", personalSearch=" + this.f99076b + ")";
    }
}
