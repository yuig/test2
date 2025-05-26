package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wh implements yh, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f133630d;

    /* renamed from: e, reason: collision with root package name */
    public final vh f133631e;

    public wh(String __typename, vh error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f133630d = __typename;
        this.f133631e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f133631e;
    }

    @Override // z40.b
    public final String b() {
        return this.f133630d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh)) {
            return false;
        }
        wh whVar = (wh) obj;
        return Intrinsics.d(this.f133630d, whVar.f133630d) && Intrinsics.d(this.f133631e, whVar.f133631e);
    }

    public final int hashCode() {
        return this.f133631e.hashCode() + (this.f133630d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3RemoveBoardCollaboratorsMutationv2(__typename=" + this.f133630d + ", error=" + this.f133631e + ")";
    }
}
