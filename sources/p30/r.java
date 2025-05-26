package p30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class r implements t {

    /* renamed from: d, reason: collision with root package name */
    public final String f98755d;

    /* renamed from: e, reason: collision with root package name */
    public final q f98756e;

    public r(String __typename, q qVar) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        this.f98755d = __typename;
        this.f98756e = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.d(this.f98755d, rVar.f98755d) && Intrinsics.d(this.f98756e, rVar.f98756e);
    }

    public final int hashCode() {
        int hashCode = this.f98755d.hashCode() * 31;
        q qVar = this.f98756e;
        return hashCode + (qVar == null ? 0 : qVar.hashCode());
    }

    public final String toString() {
        return "InviteCodeResponseV3RedeemInviteMutation(__typename=" + this.f98755d + ", data=" + this.f98756e + ")";
    }
}
