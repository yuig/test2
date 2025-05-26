package p50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f98875a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98876b;

    public n(String entityId, String str) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f98875a = entityId;
        this.f98876b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f98875a, nVar.f98875a) && Intrinsics.d(this.f98876b, nVar.f98876b);
    }

    public final int hashCode() {
        int hashCode = this.f98875a.hashCode() * 31;
        String str = this.f98876b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Data(entityId=");
        sb3.append(this.f98875a);
        sb3.append(", imageMediumUrl=");
        return a.a.p(sb3, this.f98876b, ")");
    }
}
