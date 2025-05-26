package qp1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f104779a;

    /* renamed from: b, reason: collision with root package name */
    public final String f104780b;

    public g(String str, String promotedName) {
        Intrinsics.checkNotNullParameter(promotedName, "promotedName");
        this.f104779a = str;
        this.f104780b = promotedName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f104779a, gVar.f104779a) && Intrinsics.d(this.f104780b, gVar.f104780b);
    }

    public final int hashCode() {
        String str = this.f104779a;
        return this.f104780b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("RefreshView(url=");
        sb3.append(this.f104779a);
        sb3.append(", promotedName=");
        return a.a.p(sb3, this.f104780b, ")");
    }
}
