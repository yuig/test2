package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class oe implements qe, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f132971d;

    /* renamed from: e, reason: collision with root package name */
    public final ne f132972e;

    public oe(String __typename, ne error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f132971d = __typename;
        this.f132972e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f132972e;
    }

    @Override // z40.b
    public final String b() {
        return this.f132971d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe)) {
            return false;
        }
        oe oeVar = (oe) obj;
        return Intrinsics.d(this.f132971d, oeVar.f132971d) && Intrinsics.d(this.f132972e, oeVar.f132972e);
    }

    public final int hashCode() {
        return this.f132972e.hashCode() + (this.f132971d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3LogDeviceScreenStateMutation(__typename=" + this.f132971d + ", error=" + this.f132972e + ")";
    }
}
