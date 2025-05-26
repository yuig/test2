package ba1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final o82.j0 f22386a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f22387b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f22388c;

    public /* synthetic */ o0(o82.j0 j0Var, int i13) {
        this((i13 & 1) != 0 ? new o82.j0() : j0Var, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Intrinsics.d(this.f22386a, o0Var.f22386a) && this.f22387b == o0Var.f22387b && this.f22388c == o0Var.f22388c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f22388c) + ep.b.e(this.f22387b, this.f22386a.f93634a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ListClaimedAccountsVMState(listVMState=");
        sb3.append(this.f22386a);
        sb3.append(", isConnected=");
        sb3.append(this.f22387b);
        sb3.append(", isConnectedToNewAPI=");
        return a.a.r(sb3, this.f22388c, ")");
    }

    public o0(o82.j0 listVMState, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        this.f22386a = listVMState;
        this.f22387b = z13;
        this.f22388c = z14;
    }
}
