package jb1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.settings.SettingsRoundHeaderView;
import ea1.t0;
import ea1.u0;
import h32.a4;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import pk.a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljb1/i;", "Lnl1/d;", "<init>", "()V", "passcode_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class i extends a {

    /* renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f75340j0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final d4 f75341c0 = d4.PARENTAL_PASSCODE;

    /* renamed from: d0, reason: collision with root package name */
    public final a4 f75342d0 = a4.PARENTAL_PASSCODE_CODE;

    /* renamed from: e0, reason: collision with root package name */
    public final m1 f75343e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltTextField f75344f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltTextField f75345g0;

    /* renamed from: h0, reason: collision with root package name */
    public GestaltButton f75346h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f75347i0;

    public i() {
        int i13 = 4;
        xk2.k r13 = d7.g.r(8, new t0(this, i13), xk2.n.NONE);
        int i14 = 5;
        this.f75343e0 = a1.s(this, k0.f80436a.b(o.class), new u0(r13, i13), new ca1.m(r13, i14), new ca1.n(this, r13, i14));
    }

    @Override // nl1.d
    public final void K7() {
        Window window;
        super.K7();
        FragmentActivity E4 = E4();
        if (E4 == null || (window = E4.getWindow()) == null) {
            return;
        }
        this.f75347i0 = window.getAttributes().softInputMode;
        window.setSoftInputMode(16);
    }

    @Override // nl1.d
    public final void L7() {
        Window window;
        hf0.b.k(getView());
        FragmentActivity E4 = E4();
        if (E4 != null && (window = E4.getWindow()) != null) {
            window.setSoftInputMode(this.f75347i0);
        }
        super.L7();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Y7() {
        /*
            r8 = this;
            com.pinterest.gestalt.textfield.view.GestaltTextField r0 = r8.f75344f0
            java.lang.String r1 = "codeTextField"
            r2 = 0
            if (r0 == 0) goto La6
            java.lang.String r0 = r0.B0()
            boolean r0 = kotlin.text.z.j(r0)
            r0 = r0 ^ 1
            u50.h0 r3 = u50.h0.f120562a
            r4 = 0
            if (r0 == 0) goto L32
            com.pinterest.gestalt.textfield.view.GestaltTextField r0 = r8.f75344f0
            if (r0 == 0) goto L2e
            java.lang.String r0 = r0.B0()
            int r0 = r0.length()
            r5 = 4
            if (r0 == r5) goto L32
            int r0 = f52.c.error_enter_four_digits
            java.lang.String[] r5 = new java.lang.String[r4]
            u50.k0 r0 = bs1.c.j2(r5, r0)
            goto L33
        L2e:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r2
        L32:
            r0 = r3
        L33:
            com.pinterest.gestalt.textfield.view.GestaltTextField r5 = r8.f75344f0
            if (r5 == 0) goto La2
            fx.e r6 = new fx.e
            r7 = 5
            r6.<init>(r7, r0)
            r5.X(r6)
            com.pinterest.gestalt.textfield.view.GestaltTextField r0 = r8.f75345g0
            java.lang.String r5 = "confirmCodeTextField"
            if (r0 == 0) goto L9e
            java.lang.String r0 = r0.B0()
            boolean r0 = kotlin.text.z.j(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L79
            com.pinterest.gestalt.textfield.view.GestaltTextField r0 = r8.f75345g0
            if (r0 == 0) goto L75
            java.lang.String r0 = r0.B0()
            com.pinterest.gestalt.textfield.view.GestaltTextField r6 = r8.f75344f0
            if (r6 == 0) goto L71
            java.lang.String r1 = r6.B0()
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            if (r0 != 0) goto L79
            int r0 = f52.c.error_passcode_does_not_match
            java.lang.String[] r1 = new java.lang.String[r4]
            u50.k0 r3 = bs1.c.j2(r1, r0)
            goto L79
        L71:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r2
        L75:
            kotlin.jvm.internal.Intrinsics.r(r5)
            throw r2
        L79:
            com.pinterest.gestalt.textfield.view.GestaltTextField r0 = r8.f75345g0
            if (r0 == 0) goto L9a
            fx.e r1 = new fx.e
            r4 = 6
            r1.<init>(r4, r3)
            r0.X(r1)
            com.pinterest.gestalt.button.view.GestaltButton r0 = r8.f75346h0
            if (r0 == 0) goto L94
            com.pinterest.feature.settings.notifications.y0 r1 = new com.pinterest.feature.settings.notifications.y0
            r2 = 3
            r1.<init>(r8, r2)
            r0.d(r1)
            return
        L94:
            java.lang.String r0 = "nextButton"
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r2
        L9a:
            kotlin.jvm.internal.Intrinsics.r(r5)
            throw r2
        L9e:
            kotlin.jvm.internal.Intrinsics.r(r5)
            throw r2
        La2:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r2
        La6:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jb1.i.Y7():void");
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType, reason: from getter */
    public final a4 getF22548u0() {
        return this.f75342d0;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF22547t0() {
        return this.f75341c0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = f52.b.fragment_passcode_setup_code;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        SettingsRoundHeaderView settingsRoundHeaderView = (SettingsRoundHeaderView) onCreateView.findViewById(c52.c.header_view);
        settingsRoundHeaderView.k0(f52.c.settings_parental_passcode_create_code_title);
        settingsRoundHeaderView.g0(new x91.k(this, 12));
        View findViewById = onCreateView.findViewById(f52.a.text_current_step);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        a0.q((GestaltText) findViewById, bs1.c.j2(new String[]{SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE, "2"}, f52.c.settings_parental_passcode_create_step));
        View findViewById2 = onCreateView.findViewById(f52.a.text_field_code);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltTextField gestaltTextField = (GestaltTextField) findViewById2;
        this.f75344f0 = gestaltTextField;
        if (gestaltTextField == null) {
            Intrinsics.r("codeTextField");
            throw null;
        }
        final int i13 = 0;
        gestaltTextField.Z(new gm1.a(this) { // from class: jb1.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f75331b;

            {
                this.f75331b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                i this$0 = this.f75331b;
                switch (i14) {
                    case 0:
                        int i15 = i.f75340j0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.Y7();
                        return;
                    case 1:
                        int i16 = i.f75340j0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.Y7();
                        return;
                    default:
                        int i17 = i.f75340j0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        GestaltTextField gestaltTextField2 = this$0.f75344f0;
                        if (gestaltTextField2 == null) {
                            Intrinsics.r("codeTextField");
                            throw null;
                        }
                        gestaltTextField2.clearFocus();
                        GestaltTextField gestaltTextField3 = this$0.f75345g0;
                        if (gestaltTextField3 == null) {
                            Intrinsics.r("confirmCodeTextField");
                            throw null;
                        }
                        gestaltTextField3.clearFocus();
                        o oVar = (o) this$0.f75343e0.getValue();
                        GestaltTextField gestaltTextField4 = this$0.f75344f0;
                        if (gestaltTextField4 == null) {
                            Intrinsics.r("codeTextField");
                            throw null;
                        }
                        String B0 = gestaltTextField4.B0();
                        GestaltTextField gestaltTextField5 = this$0.f75345g0;
                        if (gestaltTextField5 != null) {
                            kh2.j.x2(oVar, new c(B0, gestaltTextField5.B0()));
                            return;
                        } else {
                            Intrinsics.r("confirmCodeTextField");
                            throw null;
                        }
                }
            }
        });
        View findViewById3 = onCreateView.findViewById(f52.a.text_field_code_confirm);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        GestaltTextField gestaltTextField2 = (GestaltTextField) findViewById3;
        this.f75345g0 = gestaltTextField2;
        if (gestaltTextField2 == null) {
            Intrinsics.r("confirmCodeTextField");
            throw null;
        }
        final int i14 = 1;
        gestaltTextField2.Z(new gm1.a(this) { // from class: jb1.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f75331b;

            {
                this.f75331b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                i this$0 = this.f75331b;
                switch (i142) {
                    case 0:
                        int i15 = i.f75340j0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.Y7();
                        return;
                    case 1:
                        int i16 = i.f75340j0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.Y7();
                        return;
                    default:
                        int i17 = i.f75340j0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        GestaltTextField gestaltTextField22 = this$0.f75344f0;
                        if (gestaltTextField22 == null) {
                            Intrinsics.r("codeTextField");
                            throw null;
                        }
                        gestaltTextField22.clearFocus();
                        GestaltTextField gestaltTextField3 = this$0.f75345g0;
                        if (gestaltTextField3 == null) {
                            Intrinsics.r("confirmCodeTextField");
                            throw null;
                        }
                        gestaltTextField3.clearFocus();
                        o oVar = (o) this$0.f75343e0.getValue();
                        GestaltTextField gestaltTextField4 = this$0.f75344f0;
                        if (gestaltTextField4 == null) {
                            Intrinsics.r("codeTextField");
                            throw null;
                        }
                        String B0 = gestaltTextField4.B0();
                        GestaltTextField gestaltTextField5 = this$0.f75345g0;
                        if (gestaltTextField5 != null) {
                            kh2.j.x2(oVar, new c(B0, gestaltTextField5.B0()));
                            return;
                        } else {
                            Intrinsics.r("confirmCodeTextField");
                            throw null;
                        }
                }
            }
        });
        final int i15 = 2;
        this.f75346h0 = ((GestaltButton) onCreateView.findViewById(f52.a.button_next)).e(new gm1.a(this) { // from class: jb1.d

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f75331b;

            {
                this.f75331b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i15;
                i this$0 = this.f75331b;
                switch (i142) {
                    case 0:
                        int i152 = i.f75340j0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.Y7();
                        return;
                    case 1:
                        int i16 = i.f75340j0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        this$0.Y7();
                        return;
                    default:
                        int i17 = i.f75340j0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        GestaltTextField gestaltTextField22 = this$0.f75344f0;
                        if (gestaltTextField22 == null) {
                            Intrinsics.r("codeTextField");
                            throw null;
                        }
                        gestaltTextField22.clearFocus();
                        GestaltTextField gestaltTextField3 = this$0.f75345g0;
                        if (gestaltTextField3 == null) {
                            Intrinsics.r("confirmCodeTextField");
                            throw null;
                        }
                        gestaltTextField3.clearFocus();
                        o oVar = (o) this$0.f75343e0.getValue();
                        GestaltTextField gestaltTextField4 = this$0.f75344f0;
                        if (gestaltTextField4 == null) {
                            Intrinsics.r("codeTextField");
                            throw null;
                        }
                        String B0 = gestaltTextField4.B0();
                        GestaltTextField gestaltTextField5 = this$0.f75345g0;
                        if (gestaltTextField5 != null) {
                            kh2.j.x2(oVar, new c(B0, gestaltTextField5.B0()));
                            return;
                        } else {
                            Intrinsics.r("confirmCodeTextField");
                            throw null;
                        }
                }
            }
        });
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new h(this, null), 3);
    }
}
