package i51;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import l82.i0;
import zy.l0;

/* loaded from: classes5.dex */
public final class a0 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f71566a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f71567b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f71568c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f71569d;

    /* renamed from: e, reason: collision with root package name */
    public final f f71570e;

    /* renamed from: f, reason: collision with root package name */
    public final bq.b f71571f;

    /* renamed from: g, reason: collision with root package name */
    public final l0 f71572g;

    /* renamed from: h, reason: collision with root package name */
    public final x31.p f71573h;

    public a0(String userId, boolean z13, boolean z14, boolean z15, f sortButtonInFilterBar, bq.b currentSortOrder, l0 pinalyticsVMState, x31.p filterBarVMState) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(sortButtonInFilterBar, "sortButtonInFilterBar");
        Intrinsics.checkNotNullParameter(currentSortOrder, "currentSortOrder");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(filterBarVMState, "filterBarVMState");
        this.f71566a = userId;
        this.f71567b = z13;
        this.f71568c = z14;
        this.f71569d = z15;
        this.f71570e = sortButtonInFilterBar;
        this.f71571f = currentSortOrder;
        this.f71572g = pinalyticsVMState;
        this.f71573h = filterBarVMState;
    }

    public static a0 b(a0 a0Var, boolean z13, boolean z14, boolean z15, bq.b bVar, x31.p pVar, int i13) {
        String userId = a0Var.f71566a;
        if ((i13 & 2) != 0) {
            z13 = a0Var.f71567b;
        }
        boolean z16 = z13;
        if ((i13 & 4) != 0) {
            z14 = a0Var.f71568c;
        }
        boolean z17 = z14;
        if ((i13 & 8) != 0) {
            z15 = a0Var.f71569d;
        }
        boolean z18 = z15;
        f sortButtonInFilterBar = a0Var.f71570e;
        if ((i13 & 32) != 0) {
            bVar = a0Var.f71571f;
        }
        bq.b currentSortOrder = bVar;
        l0 pinalyticsVMState = a0Var.f71572g;
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            pVar = a0Var.f71573h;
        }
        x31.p filterBarVMState = pVar;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(sortButtonInFilterBar, "sortButtonInFilterBar");
        Intrinsics.checkNotNullParameter(currentSortOrder, "currentSortOrder");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        Intrinsics.checkNotNullParameter(filterBarVMState, "filterBarVMState");
        return new a0(userId, z16, z17, z18, sortButtonInFilterBar, currentSortOrder, pinalyticsVMState, filterBarVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.f71566a, a0Var.f71566a) && this.f71567b == a0Var.f71567b && this.f71568c == a0Var.f71568c && this.f71569d == a0Var.f71569d && this.f71570e == a0Var.f71570e && this.f71571f == a0Var.f71571f && Intrinsics.d(this.f71572g, a0Var.f71572g) && Intrinsics.d(this.f71573h, a0Var.f71573h);
    }

    public final int hashCode() {
        return this.f71573h.hashCode() + jq.b.a(this.f71572g, (this.f71571f.hashCode() + ((this.f71570e.hashCode() + ep.b.e(this.f71569d, ep.b.e(this.f71568c, ep.b.e(this.f71567b, this.f71566a.hashCode() * 31, 31), 31), 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ProfileSavedTabVMState(userId=" + this.f71566a + ", hasBoards=" + this.f71567b + ", hasSecretBoards=" + this.f71568c + ", hasArchivedBoards=" + this.f71569d + ", sortButtonInFilterBar=" + this.f71570e + ", currentSortOrder=" + this.f71571f + ", pinalyticsVMState=" + this.f71572g + ", filterBarVMState=" + this.f71573h + ")";
    }
}
