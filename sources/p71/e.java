package p71;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f99086a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f99087b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f99088c;

    public e(String query, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f99086a = query;
        this.f99087b = z13;
        this.f99088c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f99086a, eVar.f99086a) && this.f99087b == eVar.f99087b && this.f99088c == eVar.f99088c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99088c) + ep.b.e(this.f99087b, this.f99086a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinAutocompleteRequestParams(query=");
        sb3.append(this.f99086a);
        sb3.append(", personalSearch=");
        sb3.append(this.f99087b);
        sb3.append(", isTablet=");
        return a.a.r(sb3, this.f99088c, ")");
    }
}
