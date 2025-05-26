package pb1;

import h32.a4;
import h32.d4;
import h32.g0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class x implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.pinterest.feature.settings.passcode.d f99488a;

    /* renamed from: b, reason: collision with root package name */
    public final d4 f99489b;

    /* renamed from: c, reason: collision with root package name */
    public final a4 f99490c;

    /* renamed from: d, reason: collision with root package name */
    public final l0 f99491d;

    public x(com.pinterest.feature.settings.passcode.d passcodeRequiredMode, d4 viewType, a4 viewParameterType) {
        g0 g0Var;
        int i13 = w.f99487a[passcodeRequiredMode.ordinal()];
        if (i13 == 1) {
            g0Var = g0.PASSCODE_REQUIRED_MODAL;
        } else if (i13 == 2) {
            g0Var = g0.PARENTAL_PASSCODE_DISABLING;
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            g0Var = g0.PASSWORD_RESET_PAGE;
        }
        l0 pinalyticsState = new l0(new h32.i0(viewType, viewParameterType, null, g0Var, null, null), 2);
        Intrinsics.checkNotNullParameter(passcodeRequiredMode, "passcodeRequiredMode");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(viewParameterType, "viewParameterType");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f99488a = passcodeRequiredMode;
        this.f99489b = viewType;
        this.f99490c = viewParameterType;
        this.f99491d = pinalyticsState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f99488a == xVar.f99488a && this.f99489b == xVar.f99489b && this.f99490c == xVar.f99490c && Intrinsics.d(this.f99491d, xVar.f99491d);
    }

    public final int hashCode() {
        return this.f99491d.hashCode() + ((this.f99490c.hashCode() + ((this.f99489b.hashCode() + (this.f99488a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BasePasscodeRequiredVMState(passcodeRequiredMode=" + this.f99488a + ", viewType=" + this.f99489b + ", viewParameterType=" + this.f99490c + ", pinalyticsState=" + this.f99491d + ")";
    }
}
