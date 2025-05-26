package um0;

import com.pinterest.api.model.v7;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f122771a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f122772b;

    /* renamed from: c, reason: collision with root package name */
    public final tk0.i0 f122773c;

    /* renamed from: d, reason: collision with root package name */
    public final a1 f122774d;

    /* renamed from: e, reason: collision with root package name */
    public final zy.l0 f122775e;

    /* renamed from: f, reason: collision with root package name */
    public final v7 f122776f;

    /* renamed from: g, reason: collision with root package name */
    public final String f122777g;

    /* renamed from: h, reason: collision with root package name */
    public final int f122778h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f122779i;

    public w0(tk0.i0 i0Var, zy.l0 l0Var, int i13) {
        this(false, false, (i13 & 4) != 0 ? o0.f122748b : i0Var, o0.f122750d, (i13 & 16) != 0 ? new zy.l0((h32.i0) null, 3) : l0Var);
    }

    public static w0 b(w0 w0Var, boolean z13, boolean z14, tk0.i0 i0Var, a1 a1Var, int i13) {
        if ((i13 & 1) != 0) {
            z13 = w0Var.f122771a;
        }
        boolean z15 = z13;
        if ((i13 & 2) != 0) {
            z14 = w0Var.f122772b;
        }
        boolean z16 = z14;
        if ((i13 & 4) != 0) {
            i0Var = w0Var.f122773c;
        }
        tk0.i0 organizeToolsState = i0Var;
        if ((i13 & 8) != 0) {
            a1Var = w0Var.f122774d;
        }
        a1 pinSelectionState = a1Var;
        zy.l0 pinalyticsState = w0Var.f122775e;
        w0Var.getClass();
        Intrinsics.checkNotNullParameter(organizeToolsState, "organizeToolsState");
        Intrinsics.checkNotNullParameter(pinSelectionState, "pinSelectionState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        return new w0(z15, z16, organizeToolsState, pinSelectionState, pinalyticsState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f122771a == w0Var.f122771a && this.f122772b == w0Var.f122772b && Intrinsics.d(this.f122773c, w0Var.f122773c) && Intrinsics.d(this.f122774d, w0Var.f122774d) && Intrinsics.d(this.f122775e, w0Var.f122775e);
    }

    public final int hashCode() {
        return this.f122775e.hashCode() + ((this.f122774d.hashCode() + ((this.f122773c.hashCode() + ep.b.e(this.f122772b, Boolean.hashCode(this.f122771a) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OrganizeVMState(pinReordered=" + this.f122771a + ", sectionReordered=" + this.f122772b + ", organizeToolsState=" + this.f122773c + ", pinSelectionState=" + this.f122774d + ", pinalyticsState=" + this.f122775e + ")";
    }

    public w0(boolean z13, boolean z14, tk0.i0 organizeToolsState, a1 pinSelectionState, zy.l0 pinalyticsState) {
        Intrinsics.checkNotNullParameter(organizeToolsState, "organizeToolsState");
        Intrinsics.checkNotNullParameter(pinSelectionState, "pinSelectionState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        this.f122771a = z13;
        this.f122772b = z14;
        this.f122773c = organizeToolsState;
        this.f122774d = pinSelectionState;
        this.f122775e = pinalyticsState;
        this.f122776f = organizeToolsState.f117974d;
        this.f122777g = organizeToolsState.f117972b;
        this.f122778h = pinSelectionState.f122686c;
        this.f122779i = pinSelectionState.f122687d;
    }
}
