package od1;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n0 implements l82.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f94146a;

    /* renamed from: b, reason: collision with root package name */
    public final String f94147b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f94148c;

    /* renamed from: d, reason: collision with root package name */
    public final String f94149d;

    /* renamed from: e, reason: collision with root package name */
    public final String f94150e;

    /* renamed from: f, reason: collision with root package name */
    public final String f94151f;

    /* renamed from: g, reason: collision with root package name */
    public final String f94152g;

    /* renamed from: h, reason: collision with root package name */
    public final o82.j0 f94153h;

    /* renamed from: i, reason: collision with root package name */
    public final zy.l0 f94154i;

    public n0(String title, String pinId, Boolean bool, String str, String str2, String str3, String str4, o82.j0 multiSectionVMState, zy.l0 pinalyticsVMState) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        this.f94146a = title;
        this.f94147b = pinId;
        this.f94148c = bool;
        this.f94149d = str;
        this.f94150e = str2;
        this.f94151f = str3;
        this.f94152g = str4;
        this.f94153h = multiSectionVMState;
        this.f94154i = pinalyticsVMState;
    }

    public static n0 b(n0 n0Var, o82.j0 j0Var, zy.l0 l0Var, int i13) {
        String title = n0Var.f94146a;
        String pinId = n0Var.f94147b;
        Boolean bool = n0Var.f94148c;
        String str = n0Var.f94149d;
        String str2 = n0Var.f94150e;
        String str3 = n0Var.f94151f;
        String str4 = n0Var.f94152g;
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0) {
            j0Var = n0Var.f94153h;
        }
        o82.j0 multiSectionVMState = j0Var;
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0) {
            l0Var = n0Var.f94154i;
        }
        zy.l0 pinalyticsVMState = l0Var;
        n0Var.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(multiSectionVMState, "multiSectionVMState");
        Intrinsics.checkNotNullParameter(pinalyticsVMState, "pinalyticsVMState");
        return new n0(title, pinId, bool, str, str2, str3, str4, multiSectionVMState, pinalyticsVMState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Intrinsics.d(this.f94146a, n0Var.f94146a) && Intrinsics.d(this.f94147b, n0Var.f94147b) && Intrinsics.d(this.f94148c, n0Var.f94148c) && Intrinsics.d(this.f94149d, n0Var.f94149d) && Intrinsics.d(this.f94150e, n0Var.f94150e) && Intrinsics.d(this.f94151f, n0Var.f94151f) && Intrinsics.d(this.f94152g, n0Var.f94152g) && Intrinsics.d(this.f94153h, n0Var.f94153h) && Intrinsics.d(this.f94154i, n0Var.f94154i);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f94147b, this.f94146a.hashCode() * 31, 31);
        Boolean bool = this.f94148c;
        int hashCode = (d2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f94149d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f94150e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f94151f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f94152g;
        return this.f94154i.hashCode() + ep.b.c(this.f94153h.f93634a, (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "STLLandingPageVMState(title=" + this.f94146a + ", pinId=" + this.f94147b + ", isShopping=" + this.f94148c + ", entrySource=" + this.f94149d + ", entryPoint=" + this.f94150e + ", cropSource=" + this.f94151f + ", requestParams=" + this.f94152g + ", multiSectionVMState=" + this.f94153h + ", pinalyticsVMState=" + this.f94154i + ")";
    }
}
