package p30;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p implements t, z40.b {

    /* renamed from: d, reason: collision with root package name */
    public final String f98749d;

    /* renamed from: e, reason: collision with root package name */
    public final o f98750e;

    public p(String __typename, o error) {
        Intrinsics.checkNotNullParameter(__typename, "__typename");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f98749d = __typename;
        this.f98750e = error;
    }

    @Override // z40.b
    public final z40.a a() {
        return this.f98750e;
    }

    @Override // z40.b
    public final String b() {
        return this.f98749d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Intrinsics.d(this.f98749d, pVar.f98749d) && Intrinsics.d(this.f98750e, pVar.f98750e);
    }

    public final int hashCode() {
        return this.f98750e.hashCode() + (this.f98749d.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorV3RedeemInviteMutation(__typename=" + this.f98749d + ", error=" + this.f98750e + ")";
    }
}
