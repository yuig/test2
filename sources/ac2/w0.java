package ac2;

import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w0 implements y0 {

    /* renamed from: a */
    public final WeakReference f2070a;

    /* renamed from: b */
    public ao2.m0 f2071b;

    public w0(WeakReference boundView) {
        q0 playerReuseState = q0.f2040e;
        Intrinsics.checkNotNullParameter(boundView, "boundView");
        Intrinsics.checkNotNullParameter(playerReuseState, "playerReuseState");
        this.f2070a = boundView;
        this.f2071b = playerReuseState;
    }

    public final WeakReference d() {
        return this.f2070a;
    }

    public final ao2.m0 e() {
        return this.f2071b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Intrinsics.d(this.f2070a, w0Var.f2070a) && Intrinsics.d(this.f2071b, w0Var.f2071b);
    }

    public final hc2.q f() {
        ao2.m0 m0Var = this.f2071b;
        if (!(m0Var instanceof p0)) {
            return null;
        }
        Intrinsics.g(m0Var, "null cannot be cast to non-null type com.pinterest.video.PlayerReuseState.ReuseAllowed");
        if (v0.f2065a[((p0) m0Var).s0().ordinal()] == 1) {
            return hc2.q.GRID_TO_CLOSEUP_PLAYER_REUSE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void g() {
        q0 q0Var = q0.f2040e;
        Intrinsics.checkNotNullParameter(q0Var, "<set-?>");
        this.f2071b = q0Var;
    }

    public final int hashCode() {
        return this.f2071b.hashCode() + (this.f2070a.hashCode() * 31);
    }

    public final String toString() {
        boolean z13 = this.f2071b instanceof p0;
        WeakReference weakReference = this.f2070a;
        if (!z13) {
            return "Used(" + weakReference.get() + "), isNotCandidateForReuse";
        }
        Object obj = weakReference.get();
        ao2.m0 m0Var = this.f2071b;
        Intrinsics.g(m0Var, "null cannot be cast to non-null type com.pinterest.video.PlayerReuseState.ReuseAllowed");
        return "Used(" + obj + ", is candidate for reuse in the transition from " + ((p0) m0Var).s0() + ")";
    }
}
