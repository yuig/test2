package oi;

import com.pinterest.feature.core.view.RecyclerViewTypes;

/* loaded from: classes3.dex */
public final class i4 {

    /* renamed from: a, reason: collision with root package name */
    public final u4 f94843a;

    public i4(a7 a7Var) {
        this.f94843a = a7Var.f94666l;
    }

    public final boolean a() {
        u4 u4Var = this.f94843a;
        try {
            h6.q a13 = ph.b.a(u4Var.f95197a);
            if (a13 != null) {
                return a13.d(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN, "com.android.vending").versionCode >= 80837300;
            }
            y3 y3Var = u4Var.f95205i;
            u4.d(y3Var);
            y3Var.f95276n.c("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e13) {
            y3 y3Var2 = u4Var.f95205i;
            u4.d(y3Var2);
            y3Var2.f95276n.b(e13, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
