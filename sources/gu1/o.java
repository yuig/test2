package gu1;

import kotlin.jvm.internal.Intrinsics;
import l82.i0;

/* loaded from: classes4.dex */
public final class o implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final hu1.l f66151a;

    public o(hu1.l userLoaderVMState) {
        Intrinsics.checkNotNullParameter(userLoaderVMState, "userLoaderVMState");
        this.f66151a = userLoaderVMState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && Intrinsics.d(this.f66151a, ((o) obj).f66151a);
    }

    public final int hashCode() {
        return this.f66151a.f70428a.hashCode();
    }

    public final String toString() {
        return "NavDemoThreeVMState(userLoaderVMState=" + this.f66151a + ")";
    }
}
