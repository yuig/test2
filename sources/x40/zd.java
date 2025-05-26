package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zd implements be, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f133823d;

    /* renamed from: e, reason: collision with root package name */
    public final yd f133824e;

    public zd(String __typename, yd error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f133823d = __typename;
        this.f133824e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f133824e;
    }

    @Override // z40.b
    public final String b() {
        return this.f133823d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd)) {
            return false;
        }
        zd zdVar = (zd) obj;
        return Intrinsics.d(this.f133823d, zdVar.f133823d) && Intrinsics.d(this.f133824e, zdVar.f133824e);
    }

    public final int hashCode() {
        return this.f133824e.hashCode() + (this.f133823d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3InviteBoardCollaboratorEmailMutation(__typename=" + this.f133823d + ", error=" + this.f133824e + ")";
    }
}
