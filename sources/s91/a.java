package s91;

import android.content.res.Resources;
import android.os.Build;
import com.pinterest.api.model.wy0;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.z3;
import df.j1;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.m3;
import m60.x0;
import n91.z;
import uj2.b0;
import va1.k1;
import yk1.v;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112046i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ c f112047j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, int i13) {
        super(1);
        this.f112046i = i13;
        this.f112047j = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ScreenLocation screenLocation;
        int i13 = this.f112046i;
        c cVar = this.f112047j;
        switch (i13) {
            case 0:
                wy0 user = (wy0) obj;
                Intrinsics.checkNotNullParameter(user, "user");
                ((b60.d) cVar.f112054p).k(user);
                Boolean G3 = user.G3();
                Intrinsics.checkNotNullExpressionValue(G3, "getIsPartner(...)");
                return G3.booleanValue() ? cVar.f112051m.f131564a.a().r(tk2.e.f118017c) : b0.j(new rq0.a(user, true));
            default:
                rq0.a eligibility = (rq0.a) obj;
                Intrinsics.checkNotNullParameter(eligibility, "eligibility");
                cVar.getClass();
                wy0 wy0Var = eligibility.f109689a;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new q(null, Integer.valueOf(b52.c.settings_account_management_screen_description), 1, null));
                arrayList.add(new o(b52.c.settings_account_management_your_account_header));
                arrayList.add(n.f112097f);
                Boolean L3 = wy0Var.L3();
                Intrinsics.checkNotNullExpressionValue(L3, "getIsSsoUser(...)");
                boolean booleanValue = L3.booleanValue();
                yk1.a aVar = cVar.f112052n;
                if (booleanValue) {
                    String N2 = wy0Var.N2();
                    arrayList.add(new p(z.c(N2 != null ? N2 : "")));
                } else if (eligibility.a()) {
                    mr1.h V = com.bumptech.glide.c.V(wy0Var, cVar.f112050l);
                    if (V != null) {
                        wy0 wy0Var2 = V.f88089b;
                        String N22 = wy0Var2.N2();
                        if (N22 == null) {
                            N22 = "";
                        }
                        int i14 = b52.c.settings_account_management_email_description;
                        Object[] objArr = new Object[1];
                        String Z2 = wy0Var2.Z2();
                        objArr[0] = Z2 != null ? Z2 : "";
                        String string = aVar.f139224a.getString(i14, objArr);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                        arrayList.add(new j(N22, z.c(string), false));
                    }
                } else {
                    String N23 = wy0Var.N2();
                    arrayList.add(new j(N23 == null ? "" : N23, z.d(), false, 4, null));
                    String string2 = aVar.f139224a.getString(b52.c.settings_account_management_password_value);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    arrayList.add(new m(string2));
                }
                Boolean v33 = wy0Var.v3();
                Intrinsics.checkNotNullExpressionValue(v33, "getIsCandidateForParentalControlPasscode(...)");
                if (v33.booleanValue()) {
                    Boolean E3 = wy0Var.E3();
                    Intrinsics.checkNotNullExpressionValue(E3, "getIsParentalControlPasscodeEnabled(...)");
                    if (!E3.booleanValue()) {
                        Boolean F3 = wy0Var.F3();
                        Intrinsics.checkNotNullExpressionValue(F3, "getIsParentalControlPass…eVerificationPending(...)");
                        if (!F3.booleanValue()) {
                            screenLocation = (ScreenLocation) z3.f51682h.getValue();
                            Boolean F32 = wy0Var.F3();
                            Intrinsics.checkNotNullExpressionValue(F32, "getIsParentalControlPass…eVerificationPending(...)");
                            k1 d2 = (F32.booleanValue() || wy0Var.E3().booleanValue()) ? z.d() : z.b(b52.c.settings_account_management_parental_passcode_pending_disclaimer);
                            int i15 = c52.e.settings_account_management_parental_passcode_value;
                            String string3 = aVar.f139224a.getString(c52.e.manage_parental_passcode_url);
                            int i16 = c52.e.notification_settings_learn_more;
                            Resources resources = aVar.f139224a;
                            String string4 = resources.getString(i15, string3, resources.getString(i16));
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                            arrayList.add(new k(z.c(string4), d2, screenLocation));
                        }
                    }
                    m3 m3Var = cVar.f112055q;
                    m3Var.getClass();
                    lh0.z3 z3Var = a4.f83297a;
                    g1 g1Var = (g1) m3Var.f83424a;
                    screenLocation = (g1Var.o("android_passcode_summary_sba", "enabled", z3Var) || g1Var.l("android_passcode_summary_sba")) ? (ScreenLocation) z3.f51684j.getValue() : (ScreenLocation) z3.f51683i.getValue();
                    Boolean F322 = wy0Var.F3();
                    Intrinsics.checkNotNullExpressionValue(F322, "getIsParentalControlPass…eVerificationPending(...)");
                    if (F322.booleanValue()) {
                    }
                    int i152 = c52.e.settings_account_management_parental_passcode_value;
                    String string32 = aVar.f139224a.getString(c52.e.manage_parental_passcode_url);
                    int i162 = c52.e.notification_settings_learn_more;
                    Resources resources2 = aVar.f139224a;
                    String string42 = resources2.getString(i152, string32, resources2.getString(i162));
                    Intrinsics.checkNotNullExpressionValue(string42, "getString(...)");
                    arrayList.add(new k(z.c(string42), d2, screenLocation));
                }
                if (!wy0Var.L3().booleanValue()) {
                    Boolean G32 = eligibility.f109689a.G3();
                    Intrinsics.checkNotNullExpressionValue(G32, "getIsPartner(...)");
                    if (G32.booleanValue()) {
                        if (eligibility.a()) {
                            arrayList.add(new r(z.b(b52.c.settings_account_management_unlink_account_description)));
                        }
                        arrayList.add(new g(z.b(b52.c.settings_account_management_convert_to_personal_description), eligibility));
                    } else if (!wy0Var.J3().booleanValue()) {
                        arrayList.add(new f(z.b(b52.c.settings_account_management_convert_to_business_description), eligibility));
                    }
                }
                int i03 = j1.i0(cVar.f112056r);
                arrayList.add(new e(((yk1.a) ((v) cVar.f112053o.f83754b)).f139224a.getString(i03 != 1 ? i03 != 2 ? Build.VERSION.SDK_INT <= 28 ? c52.e.settings_dark_mode_battery_saver : c52.e.settings_dark_mode_follow_system : x0.settings_dark_mode_dark : x0.settings_dark_mode_light)));
                arrayList.add(new d(ig1.b.h0(), z.b(c52.e.settings_account_management_app_sounds_description)));
                arrayList.add(new o(b52.c.settings_account_management_deactivation_and_deletion_header));
                if (!eligibility.a()) {
                    arrayList.add(new h(z.b(b52.c.settings_account_management_deactivate_account_description)));
                }
                arrayList.add(new i(z.b(b52.c.settings_account_management_account_deletion_description)));
                return arrayList;
        }
    }
}
