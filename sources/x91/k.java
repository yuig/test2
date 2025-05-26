package x91;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.settings.menu.view.SettingsProfilePreview;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.f4;
import h32.f1;
import h32.u0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import y01.l1;

/* loaded from: classes5.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134327a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f134328b;

    public /* synthetic */ k(Object obj, int i13) {
        this.f134327a = i13;
        this.f134328b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f134327a;
        Object obj = this.f134328b;
        switch (i13) {
            case 0:
                s this$0 = (s) obj;
                int i14 = s.L0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.P7();
                return;
            case 1:
                ba1.y this$02 = (ba1.y) obj;
                int i15 = ba1.y.M0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                kh2.j.x2(this$02.b9(), ba1.o.f22385a);
                return;
            case 2:
                ca1.o this$03 = (ca1.o) obj;
                int i16 = ca1.o.f27214k0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                this$03.P7();
                return;
            case 3:
                ma1.n this$04 = (ma1.n) obj;
                int i17 = ma1.n.K0;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                this$04.P7();
                return;
            case 4:
                ua1.d this$05 = (ua1.d) obj;
                int i18 = ua1.d.F0;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                this$05.P7();
                return;
            case 5:
                xa1.l this$06 = (xa1.l) obj;
                int i19 = xa1.l.O0;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                this$06.P7();
                return;
            case 6:
                xa1.w state = (xa1.w) obj;
                int i23 = SettingsProfilePreview.f48148d;
                Intrinsics.checkNotNullParameter(state, "$state");
                state.f134494e.invoke();
                return;
            case 7:
                bb1.z this$07 = (bb1.z) obj;
                int i24 = bb1.z.f22580t0;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                this$07.s7().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.CLIPBOARD_BUTTON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                Object systemService = this$07.requireContext().getSystemService("clipboard");
                ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
                if (clipboardManager != null) {
                    String string = this$07.getString(l52.c.settings_mfa_backup_code_clipboard_text);
                    GestaltText gestaltText = this$07.f22585n0;
                    if (gestaltText == null) {
                        Intrinsics.r("backupCodeText");
                        throw null;
                    }
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(string, pk.a0.R(gestaltText)));
                }
                i92.k kVar = this$07.f22583l0;
                if (kVar != null) {
                    kVar.k(l52.c.settings_mfa_backup_code_copied_to_clipboard);
                    return;
                } else {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
            case 8:
                com.pinterest.feature.settings.notifications.v this$08 = (com.pinterest.feature.settings.notifications.v) obj;
                int i25 = com.pinterest.feature.settings.notifications.v.J0;
                Intrinsics.checkNotNullParameter(this$08, "this$0");
                this$08.P7();
                return;
            case 9:
                gb1.c this$09 = (gb1.c) obj;
                int i26 = gb1.c.f64682z0;
                Intrinsics.checkNotNullParameter(this$09, "this$0");
                this$09.P7();
                return;
            case 10:
                gb1.w this$010 = (gb1.w) obj;
                int i27 = gb1.w.f64736f;
                Intrinsics.checkNotNullParameter(this$010, "this$0");
                m60.w wVar = this$010.f64739c;
                if (wVar != null) {
                    a.c.y(wVar);
                    return;
                } else {
                    Intrinsics.r("eventManager");
                    throw null;
                }
            case 11:
                ib1.e this$011 = (ib1.e) obj;
                int i28 = ib1.e.B0;
                Intrinsics.checkNotNullParameter(this$011, "this$0");
                this$011.P7();
                return;
            case 12:
                jb1.i this$012 = (jb1.i) obj;
                int i29 = jb1.i.f75340j0;
                Intrinsics.checkNotNullParameter(this$012, "this$0");
                this$012.P7();
                return;
            case 13:
                kb1.n this$013 = (kb1.n) obj;
                int i33 = kb1.n.f79083j0;
                Intrinsics.checkNotNullParameter(this$013, "this$0");
                this$013.P7();
                return;
            case 14:
                mb1.b this$014 = (mb1.b) obj;
                int i34 = mb1.b.f86866e0;
                Intrinsics.checkNotNullParameter(this$014, "this$0");
                this$014.P7();
                return;
            case 15:
                nb1.b this$015 = (nb1.b) obj;
                int i35 = nb1.b.f90340e0;
                Intrinsics.checkNotNullParameter(this$015, "this$0");
                this$015.getClass();
                this$015.z(new l1(1, Navigation.w1(f4.b())));
                return;
            case 16:
                pb1.m this$016 = (pb1.m) obj;
                int i36 = pb1.m.f99466f0;
                Intrinsics.checkNotNullParameter(this$016, "this$0");
                this$016.P7();
                return;
            case 17:
                rb1.k this$017 = (rb1.k) obj;
                int i37 = rb1.k.K0;
                Intrinsics.checkNotNullParameter(this$017, "this$0");
                this$017.P7();
                return;
            case 18:
                sb1.l this$018 = (sb1.l) obj;
                int i38 = sb1.l.f112255j0;
                Intrinsics.checkNotNullParameter(this$018, "this$0");
                this$018.P7();
                return;
            case 19:
                tb1.h this$019 = (tb1.h) obj;
                int i39 = tb1.h.f117139z0;
                Intrinsics.checkNotNullParameter(this$019, "this$0");
                this$019.P7();
                return;
            case 20:
                tb1.j this$020 = (tb1.j) obj;
                int i43 = tb1.j.f117156u0;
                Intrinsics.checkNotNullParameter(this$020, "this$0");
                this$020.P7();
                return;
            case 21:
                ub1.o this$021 = (ub1.o) obj;
                int i44 = ub1.o.f121730i0;
                Intrinsics.checkNotNullParameter(this$021, "this$0");
                this$021.P7();
                return;
            case 22:
                yb1.g this$022 = (yb1.g) obj;
                int i45 = yb1.g.G0;
                Intrinsics.checkNotNullParameter(this$022, "this$0");
                this$022.P7();
                return;
            case 23:
                yb1.j this$023 = (yb1.j) obj;
                int i46 = yb1.j.F0;
                Intrinsics.checkNotNullParameter(this$023, "this$0");
                this$023.P7();
                return;
            case 24:
                yb1.m this$024 = (yb1.m) obj;
                int i47 = yb1.m.J0;
                Intrinsics.checkNotNullParameter(this$024, "this$0");
                this$024.P7();
                return;
            case 25:
                yb1.t this$025 = (yb1.t) obj;
                int i48 = yb1.t.K0;
                Intrinsics.checkNotNullParameter(this$025, "this$0");
                this$025.P7();
                return;
            case 26:
                cc1.d this$026 = (cc1.d) obj;
                int i49 = cc1.d.J0;
                Intrinsics.checkNotNullParameter(this$026, "this$0");
                this$026.P7();
                return;
            case 27:
                fc1.e this$027 = (fc1.e) obj;
                int i53 = fc1.e.P0;
                Intrinsics.checkNotNullParameter(this$027, "this$0");
                this$027.P7();
                return;
            case 28:
                hc1.n this$028 = (hc1.n) obj;
                int i54 = hc1.n.O0;
                Intrinsics.checkNotNullParameter(this$028, "this$0");
                this$028.P7();
                return;
            default:
                lc1.a this$029 = (lc1.a) obj;
                int i55 = lc1.a.f82846e;
                Intrinsics.checkNotNullParameter(this$029, "this$0");
                Function2 function2 = this$029.f82847a;
                String str = this$029.f82850d;
                if (str == null) {
                    Intrinsics.r("countryPhoneCodeStr");
                    throw null;
                }
                String str2 = this$029.f82849c;
                if (str2 != null) {
                    function2.invoke(str, str2);
                    return;
                } else {
                    Intrinsics.r("countryCodeStr");
                    throw null;
                }
        }
    }
}
