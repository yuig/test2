package p50;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f98861a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98862b;

    public e(String entityId, String str) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        this.f98861a = entityId;
        this.f98862b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f98861a, eVar.f98861a) && Intrinsics.d(this.f98862b, eVar.f98862b);
    }

    public final int hashCode() {
        int hashCode = this.f98861a.hashCode() * 31;
        String str = this.f98862b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Node(entityId=");
        sb3.append(this.f98861a);
        sb3.append(", imageMediumUrl=");
        return a.a.p(sb3, this.f98862b, ")");
    }
}
