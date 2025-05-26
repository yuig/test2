package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class he implements je, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f132503d;

    /* renamed from: e, reason: collision with root package name */
    public final ge f132504e;

    public he(String __typename, ge error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f132503d = __typename;
        this.f132504e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f132504e;
    }

    @Override // z40.b
    public final String b() {
        return this.f132503d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he)) {
            return false;
        }
        he heVar = (he) obj;
        return Intrinsics.d(this.f132503d, heVar.f132503d) && Intrinsics.d(this.f132504e, heVar.f132504e);
    }

    public final int hashCode() {
        return this.f132504e.hashCode() + (this.f132503d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3InviteBoardCollaboratorsMutation(__typename=" + this.f132503d + ", error=" + this.f132504e + ")";
    }
}
