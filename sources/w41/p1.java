package w41;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p1 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f128060a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f128061b;

    /* renamed from: c, reason: collision with root package name */
    public final String f128062c;

    /* renamed from: d, reason: collision with root package name */
    public final o82.j0 f128063d;

    /* renamed from: e, reason: collision with root package name */
    public final f31.m0 f128064e;

    /* renamed from: f, reason: collision with root package name */
    public final x31.p f128065f;

    /* renamed from: g, reason: collision with root package name */
    public final k51.v f128066g;

    /* renamed from: h, reason: collision with root package name */
    public final zy.l0 f128067h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f128068i;

    public p1(String userId, boolean z13, String str, o82.j0 sectionVMState, f31.m0 searchBarVMState, x31.p filterBarVMState, k51.v viewOptionsVMState, zy.l0 pinalyticsVMState, boolean z14) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(sectionVMState, "sectionVMState");
        Intrinsics.checkNotNullParameter(searchBarVMState, "searchBarVMState");
        Intrinsics.checkNotNullParameter(filterBarVMState, "filterBarVMState");
        Intrinsics.checkNotNullParameter(viewOptionsVMState, "viewOptionsVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f128060a = userId;
        this.f128061b = z13;
        this.f128062c = str;
        this.f128063d = sectionVMState;
        this.f128064e = searchBarVMState;
        this.f128065f = filterBarVMState;
        this.f128066g = viewOptionsVMState;
        this.f128067h = pinalyticsVMState;
        this.f128068i = z14;
    }

    public static p1 b(p1 p1Var, o82.j0 j0Var, f31.m0 m0Var, x31.p pVar, k51.v vVar, zy.l0 l0Var, int i13) {
        String userId = p1Var.f128060a;
        boolean z13 = p1Var.f128061b;
        String str = p1Var.f128062c;
        o82.j0 sectionVMState = (i13 & 8) != 0 ? p1Var.f128063d : j0Var;
        f31.m0 searchBarVMState = (i13 & 16) != 0 ? p1Var.f128064e : m0Var;
        x31.p filterBarVMState = (i13 & 32) != 0 ? p1Var.f128065f : pVar;
        k51.v viewOptionsVMState = (i13 & 64) != 0 ? p1Var.f128066g : vVar;
        zy.l0 pinalyticsVMState = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? p1Var.f128067h : l0Var;
        boolean z14 = p1Var.f128068i;
        p1Var.getClass();
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(sectionVMState, "sectionVMState");
        Intrinsics.checkNotNullParameter(searchBarVMState, "searchBarVMState");
        Intrinsics.checkNotNullParameter(filterBarVMState, "filterBarVMState");
        Intrinsics.checkNotNullParameter(viewOptionsVMState, "viewOptionsVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new p1(userId, z13, str, sectionVMState, searchBarVMState, filterBarVMState, viewOptionsVMState, pinalyticsVMState, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return Intrinsics.d(this.f128060a, p1Var.f128060a) && this.f128061b == p1Var.f128061b && Intrinsics.d(this.f128062c, p1Var.f128062c) && Intrinsics.d(this.f128063d, p1Var.f128063d) && Intrinsics.d(this.f128064e, p1Var.f128064e) && Intrinsics.d(this.f128065f, p1Var.f128065f) && Intrinsics.d(this.f128066g, p1Var.f128066g) && Intrinsics.d(this.f128067h, p1Var.f128067h) && this.f128068i == p1Var.f128068i;
    }

    public final int hashCode() {
        int e13 = ep.b.e(this.f128061b, this.f128060a.hashCode() * 31, 31);
        String str = this.f128062c;
        return Boolean.hashCode(this.f128068i) + jq.b.a(this.f128067h, (this.f128066g.hashCode() + ((this.f128065f.hashCode() + ((this.f128064e.hashCode() + ep.b.c(this.f128063d.f93634a, (e13 + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ProfilePinsVMState(userId=");
        sb3.append(this.f128060a);
        sb3.append(", isMe=");
        sb3.append(this.f128061b);
        sb3.append(", structuredFeedRequestParams=");
        sb3.append(this.f128062c);
        sb3.append(", sectionVMState=");
        sb3.append(this.f128063d);
        sb3.append(", searchBarVMState=");
        sb3.append(this.f128064e);
        sb3.append(", filterBarVMState=");
        sb3.append(this.f128065f);
        sb3.append(", viewOptionsVMState=");
        sb3.append(this.f128066g);
        sb3.append(", pinalyticsVMState=");
        sb3.append(this.f128067h);
        sb3.append(", isCalicoTheme=");
        return a.a.r(sb3, this.f128068i, ")");
    }
}
