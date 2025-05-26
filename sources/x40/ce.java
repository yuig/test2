package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ce {

    /* renamed from: a, reason: collision with root package name */
    public final String f132148a;

    /* renamed from: b, reason: collision with root package name */
    public final String f132149b;

    public ce(String entityId, String str) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f132148a = entityId;
        this.f132149b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce)) {
            return false;
        }
        ce ceVar = (ce) obj;
        return Intrinsics.d(this.f132148a, ceVar.f132148a) && Intrinsics.d(this.f132149b, ceVar.f132149b);
    }

    public final int hashCode() {
        int hashCode = this.f132148a.hashCode() * 31;
        String str = this.f132149b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Data(entityId=");
        sb3.append(this.f132148a);
        sb3.append(", type=");
        return a.a.p(sb3, this.f132149b, ")");
    }
}
