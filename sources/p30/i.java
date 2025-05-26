package p30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i implements l, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f98740d;

    /* renamed from: e, reason: collision with root package name */
    public final h f98741e;

    public i(String __typename, h error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f98740d = __typename;
        this.f98741e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f98741e;
    }

    @Override // z40.b
    public final String b() {
        return this.f98740d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f98740d, iVar.f98740d) && Intrinsics.d(this.f98741e, iVar.f98741e);
    }

    public final int hashCode() {
        return this.f98741e.hashCode() + (this.f98740d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3EmailFollowUserMutation(__typename=" + this.f98740d + ", error=" + this.f98741e + ")";
    }
}
