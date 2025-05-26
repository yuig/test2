package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wb implements yb, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f133620d;

    /* renamed from: e, reason: collision with root package name */
    public final vb f133621e;

    public wb(String __typename, vb error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f133620d = __typename;
        this.f133621e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f133621e;
    }

    @Override // z40.b
    public final String b() {
        return this.f133620d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb)) {
            return false;
        }
        wb wbVar = (wb) obj;
        return Intrinsics.d(this.f133620d, wbVar.f133620d) && Intrinsics.d(this.f133621e, wbVar.f133621e);
    }

    public final int hashCode() {
        return this.f133621e.hashCode() + (this.f133620d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3GetUserBoardInviteQuery(__typename=" + this.f133620d + ", error=" + this.f133621e + ")";
    }
}
