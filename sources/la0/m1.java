package la0;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m1 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final xa0.l f82428a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f82429b;

    /* renamed from: c, reason: collision with root package name */
    public final xa0.q f82430c;

    /* renamed from: d, reason: collision with root package name */
    public final o82.j0 f82431d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f82432e;

    /* renamed from: f, reason: collision with root package name */
    public final zy.l0 f82433f;

    /* renamed from: g, reason: collision with root package name */
    public final x31.p f82434g;

    /* renamed from: h, reason: collision with root package name */
    public final String f82435h;

    /* renamed from: i, reason: collision with root package name */
    public final Map f82436i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f82437j;

    public m1(xa0.l type, boolean z13, xa0.q draftSelectionResult, o82.j0 listVMState, boolean z14, zy.l0 pinalyticsState, x31.p filterBarVMState, String collageIdToDelete, Map experimentsGroupInfo, boolean z15) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(draftSelectionResult, "draftSelectionResult");
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(filterBarVMState, "filterBarVMState");
        Intrinsics.checkNotNullParameter(collageIdToDelete, "collageIdToDelete");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        this.f82428a = type;
        this.f82429b = z13;
        this.f82430c = draftSelectionResult;
        this.f82431d = listVMState;
        this.f82432e = z14;
        this.f82433f = pinalyticsState;
        this.f82434g = filterBarVMState;
        this.f82435h = collageIdToDelete;
        this.f82436i = experimentsGroupInfo;
        this.f82437j = z15;
    }

    public static m1 b(m1 m1Var, xa0.l lVar, o82.j0 j0Var, zy.l0 l0Var, x31.p pVar, String str, int i13) {
        xa0.l type = (i13 & 1) != 0 ? m1Var.f82428a : lVar;
        boolean z13 = m1Var.f82429b;
        xa0.q draftSelectionResult = m1Var.f82430c;
        o82.j0 listVMState = (i13 & 8) != 0 ? m1Var.f82431d : j0Var;
        boolean z14 = m1Var.f82432e;
        zy.l0 pinalyticsState = (i13 & 32) != 0 ? m1Var.f82433f : l0Var;
        x31.p filterBarVMState = (i13 & 64) != 0 ? m1Var.f82434g : pVar;
        String collageIdToDelete = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? m1Var.f82435h : str;
        Map experimentsGroupInfo = m1Var.f82436i;
        boolean z15 = m1Var.f82437j;
        m1Var.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(draftSelectionResult, "draftSelectionResult");
        Intrinsics.checkNotNullParameter(listVMState, "listVMState");
        Intrinsics.checkNotNullParameter(pinalyticsState, "pinalyticsState");
        Intrinsics.checkNotNullParameter(filterBarVMState, "filterBarVMState");
        Intrinsics.checkNotNullParameter(collageIdToDelete, "collageIdToDelete");
        Intrinsics.checkNotNullParameter(experimentsGroupInfo, "experimentsGroupInfo");
        return new m1(type, z13, draftSelectionResult, listVMState, z14, pinalyticsState, filterBarVMState, collageIdToDelete, experimentsGroupInfo, z15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return this.f82428a == m1Var.f82428a && this.f82429b == m1Var.f82429b && this.f82430c == m1Var.f82430c && Intrinsics.d(this.f82431d, m1Var.f82431d) && this.f82432e == m1Var.f82432e && Intrinsics.d(this.f82433f, m1Var.f82433f) && Intrinsics.d(this.f82434g, m1Var.f82434g) && Intrinsics.d(this.f82435h, m1Var.f82435h) && Intrinsics.d(this.f82436i, m1Var.f82436i) && this.f82437j == m1Var.f82437j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f82437j) + a.c.e(this.f82436i, cb.d(this.f82435h, (this.f82434g.hashCode() + jq.b.a(this.f82433f, ep.b.e(this.f82432e, ep.b.c(this.f82431d.f93634a, (this.f82430c.hashCode() + ep.b.e(this.f82429b, this.f82428a.hashCode() * 31, 31)) * 31, 31), 31), 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "CollageRetrievalFeedVMState(type=" + this.f82428a + ", addCreateNew=" + this.f82429b + ", draftSelectionResult=" + this.f82430c + ", listVMState=" + this.f82431d + ", showFilters=" + this.f82432e + ", pinalyticsState=" + this.f82433f + ", filterBarVMState=" + this.f82434g + ", collageIdToDelete=" + this.f82435h + ", experimentsGroupInfo=" + this.f82436i + ", isCalicoTheme=" + this.f82437j + ")";
    }
}
