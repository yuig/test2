package xs;

import com.pinterest.api.model.b1;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f135741a;

    /* renamed from: b, reason: collision with root package name */
    public final String f135742b;

    /* renamed from: c, reason: collision with root package name */
    public final String f135743c;

    /* renamed from: d, reason: collision with root package name */
    public final wy0 f135744d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f135745e;

    /* renamed from: f, reason: collision with root package name */
    public final b1 f135746f;

    /* renamed from: g, reason: collision with root package name */
    public final h0 f135747g;

    /* renamed from: h, reason: collision with root package name */
    public final List f135748h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f135749i;

    public m(f30 f30Var, String str, String str2, wy0 wy0Var, boolean z13, b1 b1Var, h0 h0Var, List bottomSheetActions, boolean z14) {
        Intrinsics.checkNotNullParameter(bottomSheetActions, "bottomSheetActions");
        this.f135741a = f30Var;
        this.f135742b = str;
        this.f135743c = str2;
        this.f135744d = wy0Var;
        this.f135745e = z13;
        this.f135746f = b1Var;
        this.f135747g = h0Var;
        this.f135748h = bottomSheetActions;
        this.f135749i = z14;
    }

    public static m e(m mVar, f30 f30Var, String str, String str2, wy0 wy0Var, boolean z13, b1 b1Var, h0 h0Var, List list, boolean z14, int i13) {
        f30 f30Var2 = (i13 & 1) != 0 ? mVar.f135741a : f30Var;
        String str3 = (i13 & 2) != 0 ? mVar.f135742b : str;
        String str4 = (i13 & 4) != 0 ? mVar.f135743c : str2;
        wy0 wy0Var2 = (i13 & 8) != 0 ? mVar.f135744d : wy0Var;
        boolean z15 = (i13 & 16) != 0 ? mVar.f135745e : z13;
        b1 b1Var2 = (i13 & 32) != 0 ? mVar.f135746f : b1Var;
        h0 h0Var2 = (i13 & 64) != 0 ? mVar.f135747g : h0Var;
        List bottomSheetActions = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? mVar.f135748h : list;
        boolean z16 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? mVar.f135749i : z14;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(bottomSheetActions, "bottomSheetActions");
        return new m(f30Var2, str3, str4, wy0Var2, z15, b1Var2, h0Var2, bottomSheetActions, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Intrinsics.d(this.f135741a, mVar.f135741a) && Intrinsics.d(this.f135742b, mVar.f135742b) && Intrinsics.d(this.f135743c, mVar.f135743c) && Intrinsics.d(this.f135744d, mVar.f135744d) && this.f135745e == mVar.f135745e && Intrinsics.d(this.f135746f, mVar.f135746f) && Intrinsics.d(this.f135747g, mVar.f135747g) && Intrinsics.d(this.f135748h, mVar.f135748h) && this.f135749i == mVar.f135749i;
    }

    public final int hashCode() {
        f30 f30Var = this.f135741a;
        int hashCode = (f30Var == null ? 0 : f30Var.hashCode()) * 31;
        String str = this.f135742b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f135743c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        wy0 wy0Var = this.f135744d;
        int e13 = ep.b.e(this.f135745e, (hashCode3 + (wy0Var == null ? 0 : wy0Var.hashCode())) * 31, 31);
        b1 b1Var = this.f135746f;
        int hashCode4 = (e13 + (b1Var == null ? 0 : b1Var.hashCode())) * 31;
        h0 h0Var = this.f135747g;
        return Boolean.hashCode(this.f135749i) + ep.b.c(this.f135748h, (hashCode4 + (h0Var != null ? h0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CartingBottomSheetDisplayState(pin=");
        sb3.append(this.f135741a);
        sb3.append(", title=");
        sb3.append(this.f135742b);
        sb3.append(", description=");
        sb3.append(this.f135743c);
        sb3.append(", promoter=");
        sb3.append(this.f135744d);
        sb3.append(", isCCTEnabled=");
        sb3.append(this.f135745e);
        sb3.append(", adsCartingData=");
        sb3.append(this.f135746f);
        sb3.append(", lastClickedInfo=");
        sb3.append(this.f135747g);
        sb3.append(", bottomSheetActions=");
        sb3.append(this.f135748h);
        sb3.append(", isEligibleForGridRepTests=");
        return a.a.r(sb3, this.f135749i, ")");
    }

    public m() {
        this(null, null, null, null, false, null, null, q0.f80391a, true);
    }
}
