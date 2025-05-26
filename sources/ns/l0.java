package ns;

import a.cb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f91932a;

    /* renamed from: b, reason: collision with root package name */
    public final String f91933b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f91934c;

    /* renamed from: d, reason: collision with root package name */
    public final o82.j0 f91935d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.l0 f91936e;

    public l0(String pinId, String deeplinkUrl, boolean z13, o82.j0 multiSectionVMState, zy.l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(deeplinkUrl, "deeplinkUrl");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f91932a = pinId;
        this.f91933b = deeplinkUrl;
        this.f91934c = z13;
        this.f91935d = multiSectionVMState;
        this.f91936e = pinalyticsVMState;
    }

    public static l0 b(l0 l0Var, o82.j0 j0Var, zy.l0 l0Var2, int i13) {
        String pinId = l0Var.f91932a;
        String deeplinkUrl = l0Var.f91933b;
        boolean z13 = (i13 & 4) != 0 ? l0Var.f91934c : false;
        if ((i13 & 8) != 0) {
            j0Var = l0Var.f91935d;
        }
        o82.j0 multiSectionVMState = j0Var;
        if ((i13 & 16) != 0) {
            l0Var2 = l0Var.f91936e;
        }
        zy.l0 pinalyticsVMState = l0Var2;
        l0Var.getClass();
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(deeplinkUrl, "deeplinkUrl");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new l0(pinId, deeplinkUrl, z13, multiSectionVMState, pinalyticsVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.d(this.f91932a, l0Var.f91932a) && Intrinsics.d(this.f91933b, l0Var.f91933b) && this.f91934c == l0Var.f91934c && Intrinsics.d(this.f91935d, l0Var.f91935d) && Intrinsics.d(this.f91936e, l0Var.f91936e);
    }

    public final int hashCode() {
        return this.f91936e.hashCode() + ep.b.c(this.f91935d.f93634a, ep.b.e(this.f91934c, cb.d(this.f91933b, this.f91932a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return "SearchLandingAdPreviewVMState(pinId=" + this.f91932a + ", deeplinkUrl=" + this.f91933b + ", shouldShowToast=" + this.f91934c + ", multiSectionVMState=" + this.f91935d + ", pinalyticsVMState=" + this.f91936e + ")";
    }
}
