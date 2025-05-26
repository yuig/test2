package y30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t implements u {

    /* renamed from: d, reason: collision with root package name */
    public final String f136767d;

    /* renamed from: e, reason: collision with root package name */
    public final String f136768e;

    public t(String __typename, String str) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f136767d = __typename;
        this.f136768e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.d(this.f136767d, tVar.f136767d) && Intrinsics.d(this.f136768e, tVar.f136768e);
    }

    public final int hashCode() {
        int hashCode = this.f136767d.hashCode() * 31;
        String str = this.f136768e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StringResponseV3GetUserStateQuery(__typename=");
        sb3.append(this.f136767d);
        sb3.append(", data=");
        return a.a.p(sb3, this.f136768e, ")");
    }
}
