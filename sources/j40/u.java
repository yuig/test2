package j40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class u implements l {

    /* renamed from: d, reason: collision with root package name */
    public final String f74627d;

    /* renamed from: e, reason: collision with root package name */
    public final t f74628e;

    public u(String __typename, t tVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f74627d = __typename;
        this.f74628e = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f74627d, uVar.f74627d) && Intrinsics.d(this.f74628e, uVar.f74628e);
    }

    public final int hashCode() {
        int hashCode = this.f74627d.hashCode() * 31;
        t tVar = this.f74628e;
        return hashCode + (tVar == null ? 0 : tVar.hashCode());
    }

    public final String toString() {
        return "V3OrientationTopicsDataConnectionContainerData(__typename=" + this.f74627d + ", connection=" + this.f74628e + ")";
    }
}
