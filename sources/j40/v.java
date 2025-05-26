package j40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements k {

    /* renamed from: d, reason: collision with root package name */
    public final String f74629d;

    /* renamed from: e, reason: collision with root package name */
    public final l f74630e;

    public v(String __typename, l lVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f74629d = __typename;
        this.f74630e = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f74629d, vVar.f74629d) && Intrinsics.d(this.f74630e, vVar.f74630e);
    }

    public final int hashCode() {
        int hashCode = this.f74629d.hashCode() * 31;
        l lVar = this.f74630e;
        return hashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public final String toString() {
        return "V3OrientationTopicsV3OrientationTopicsQuery(__typename=" + this.f74629d + ", data=" + this.f74630e + ")";
    }
}
