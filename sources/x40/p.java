package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final String f133011a;

    /* renamed from: b, reason: collision with root package name */
    public final String f133012b;

    /* renamed from: c, reason: collision with root package name */
    public final String f133013c;

    public p(String __typename, String entityId, String str) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f133011a = __typename;
        this.f133012b = entityId;
        this.f133013c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f133011a, pVar.f133011a) && Intrinsics.d(this.f133012b, pVar.f133012b) && Intrinsics.d(this.f133013c, pVar.f133013c);
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.f133012b, this.f133011a.hashCode() * 31, 31);
        String str = this.f133013c;
        return d2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Data(__typename=");
        sb3.append(this.f133011a);
        sb3.append(", entityId=");
        sb3.append(this.f133012b);
        sb3.append(", text=");
        return a.a.p(sb3, this.f133013c, ")");
    }
}
