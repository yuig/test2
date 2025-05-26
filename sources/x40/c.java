package x40;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c implements e, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f132064d;

    /* renamed from: e, reason: collision with root package name */
    public final b f132065e;

    public c(String __typename, b error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f132064d = __typename;
        this.f132065e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f132065e;
    }

    @Override // z40.b
    public final String b() {
        return this.f132064d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f132064d, cVar.f132064d) && Intrinsics.d(this.f132065e, cVar.f132065e);
    }

    public final int hashCode() {
        return this.f132065e.hashCode() + (this.f132064d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3AcceptBoardCollaboratorInviteMutation(__typename=" + this.f132064d + ", error=" + this.f132065e + ")";
    }
}
