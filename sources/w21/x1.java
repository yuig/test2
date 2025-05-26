package w21;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x1 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f127864a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f127865b;

    /* renamed from: c, reason: collision with root package name */
    public final int f127866c;

    /* renamed from: d, reason: collision with root package name */
    public final List f127867d;

    /* renamed from: e, reason: collision with root package name */
    public final List f127868e;

    /* renamed from: f, reason: collision with root package name */
    public final zy.l0 f127869f;

    /* renamed from: g, reason: collision with root package name */
    public final String f127870g;

    /* renamed from: h, reason: collision with root package name */
    public final String f127871h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f127872i;

    public x1(String experienceId, boolean z13, int i13, List options, List chosenOptions, zy.l0 pinalyticsVMState, String errorMsg, String experienceNotExistentErrorMsg, boolean z14) {
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(chosenOptions, "chosenOptions");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        Intrinsics.checkNotNullParameter(experienceNotExistentErrorMsg, "experienceNotExistentErrorMsg");
        this.f127864a = experienceId;
        this.f127865b = z13;
        this.f127866c = i13;
        this.f127867d = options;
        this.f127868e = chosenOptions;
        this.f127869f = pinalyticsVMState;
        this.f127870g = errorMsg;
        this.f127871h = experienceNotExistentErrorMsg;
        this.f127872i = z14;
    }

    public static x1 b(x1 x1Var, int i13, List list, List list2, zy.l0 l0Var, int i14) {
        String experienceId = x1Var.f127864a;
        boolean z13 = x1Var.f127865b;
        if ((i14 & 4) != 0) {
            i13 = x1Var.f127866c;
        }
        int i15 = i13;
        if ((i14 & 8) != 0) {
            list = x1Var.f127867d;
        }
        List options = list;
        if ((i14 & 16) != 0) {
            list2 = x1Var.f127868e;
        }
        List chosenOptions = list2;
        if ((i14 & 32) != 0) {
            l0Var = x1Var.f127869f;
        }
        zy.l0 pinalyticsVMState = l0Var;
        String errorMsg = x1Var.f127870g;
        String experienceNotExistentErrorMsg = x1Var.f127871h;
        boolean z14 = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? x1Var.f127872i : false;
        x1Var.getClass();
        Intrinsics.checkNotNullParameter(experienceId, "experienceId");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(chosenOptions, "chosenOptions");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        Intrinsics.checkNotNullParameter(experienceNotExistentErrorMsg, "experienceNotExistentErrorMsg");
        return new x1(experienceId, z13, i15, options, chosenOptions, pinalyticsVMState, errorMsg, experienceNotExistentErrorMsg, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return Intrinsics.d(this.f127864a, x1Var.f127864a) && this.f127865b == x1Var.f127865b && this.f127866c == x1Var.f127866c && Intrinsics.d(this.f127867d, x1Var.f127867d) && Intrinsics.d(this.f127868e, x1Var.f127868e) && Intrinsics.d(this.f127869f, x1Var.f127869f) && Intrinsics.d(this.f127870g, x1Var.f127870g) && Intrinsics.d(this.f127871h, x1Var.f127871h) && this.f127872i == x1Var.f127872i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127872i) + cb.d(this.f127871h, cb.d(this.f127870g, jq.b.a(this.f127869f, ep.b.c(this.f127868e, ep.b.c(this.f127867d, ep.b.b(this.f127866c, ep.b.e(this.f127865b, this.f127864a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinOrSpinSelectionVMState(experienceId=");
        sb3.append(this.f127864a);
        sb3.append(", shouldRemoteFetch=");
        sb3.append(this.f127865b);
        sb3.append(", phase=");
        sb3.append(this.f127866c);
        sb3.append(", options=");
        sb3.append(this.f127867d);
        sb3.append(", chosenOptions=");
        sb3.append(this.f127868e);
        sb3.append(", pinalyticsVMState=");
        sb3.append(this.f127869f);
        sb3.append(", errorMsg=");
        sb3.append(this.f127870g);
        sb3.append(", experienceNotExistentErrorMsg=");
        sb3.append(this.f127871h);
        sb3.append(", isLoading=");
        return a.a.r(sb3, this.f127872i, ")");
    }
}
