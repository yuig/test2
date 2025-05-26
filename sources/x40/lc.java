package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lc implements jc, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f132749d;

    /* renamed from: e, reason: collision with root package name */
    public final kc f132750e;

    public lc(String __typename, kc error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f132749d = __typename;
        this.f132750e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f132750e;
    }

    @Override // z40.b
    public final String b() {
        return this.f132749d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc)) {
            return false;
        }
        lc lcVar = (lc) obj;
        return Intrinsics.d(this.f132749d, lcVar.f132749d) && Intrinsics.d(this.f132750e, lcVar.f132750e);
    }

    public final int hashCode() {
        return this.f132750e.hashCode() + (this.f132749d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorData(__typename=" + this.f132749d + ", error=" + this.f132750e + ")";
    }
}
