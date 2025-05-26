package j40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z implements b0, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f74637d;

    /* renamed from: e, reason: collision with root package name */
    public final y f74638e;

    public z(String __typename, y error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f74637d = __typename;
        this.f74638e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f74638e;
    }

    @Override // z40.b
    public final String b() {
        return this.f74637d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.d(this.f74637d, zVar.f74637d) && Intrinsics.d(this.f74638e, zVar.f74638e);
    }

    public final int hashCode() {
        return this.f74638e.hashCode() + (this.f74637d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3OrientationStatusQuery(__typename=" + this.f74637d + ", error=" + this.f74638e + ")";
    }
}
