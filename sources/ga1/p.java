package ga1;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.gestalt.radioGroup.GestaltRadioGroup;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.settings.SettingsRoundHeaderView;
import ea1.t0;
import ea1.u0;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import lh0.m3;
import lh0.z3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lga1/p;", "Lnl1/d;", "<init>", "()V", "n91/z", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class p extends y {

    /* renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ int f64637p0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final m1 f64638c0;

    /* renamed from: d0, reason: collision with root package name */
    public SettingsRoundHeaderView f64639d0;

    /* renamed from: e0, reason: collision with root package name */
    public FrameLayout f64640e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltSpinner f64641f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltText f64642g0;

    /* renamed from: h0, reason: collision with root package name */
    public GestaltButton f64643h0;

    /* renamed from: i0, reason: collision with root package name */
    public GestaltCheckBox f64644i0;

    /* renamed from: j0, reason: collision with root package name */
    public GestaltRadioGroup f64645j0;

    /* renamed from: k0, reason: collision with root package name */
    public LinearLayout f64646k0;

    /* renamed from: l0, reason: collision with root package name */
    public LinearLayout f64647l0;

    /* renamed from: m0, reason: collision with root package name */
    public GestaltText f64648m0;

    /* renamed from: n0, reason: collision with root package name */
    public m3 f64649n0;

    /* renamed from: o0, reason: collision with root package name */
    public final d4 f64650o0;

    public p() {
        int i13 = 1;
        xk2.k r13 = d7.g.r(5, new t0(this, i13), xk2.n.NONE);
        int i14 = 2;
        this.f64638c0 = a1.s(this, k0.f80436a.b(x.class), new u0(r13, i13), new ca1.m(r13, i14), new ca1.n(this, r13, i14));
        this.f64650o0 = d4.SETTINGS;
    }

    public final m3 Y7() {
        m3 m3Var = this.f64649n0;
        if (m3Var != null) {
            return m3Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    public final x Z7() {
        return (x) this.f64638c0.getValue();
    }

    public final boolean a8(boolean z13) {
        if (!Y7().a("enabled_quarter", z13 ? z3.ACTIVATE_EXPERIMENT : z3.DO_NOT_ACTIVATE_EXPERIMENT)) {
            if (!Y7().a("enabled_half_year", z13 ? z3.ACTIVATE_EXPERIMENT : z3.DO_NOT_ACTIVATE_EXPERIMENT)) {
                if (!Y7().a("enabled_year", z13 ? z3.ACTIVATE_EXPERIMENT : z3.DO_NOT_ACTIVATE_EXPERIMENT)) {
                    if (!Y7().a("employees", z13 ? z3.ACTIVATE_EXPERIMENT : z3.DO_NOT_ACTIVATE_EXPERIMENT)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF73841c0() {
        return this.f64650o0;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new tx0.j(Z7().c(), 24);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = b52.b.fragment_claim_success;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(b52.a.header_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f64639d0 = (SettingsRoundHeaderView) findViewById;
        View findViewById2 = v13.findViewById(b52.a.progress_spinner);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f64641f0 = (GestaltSpinner) findViewById2;
        View findViewById3 = v13.findViewById(b52.a.loading_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f64640e0 = (FrameLayout) findViewById3;
        View findViewById4 = v13.findViewById(b52.a.connected_to);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f64642g0 = (GestaltText) findViewById4;
        View findViewById5 = v13.findViewById(b52.a.action_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f64643h0 = (GestaltButton) findViewById5;
        View findViewById6 = v13.findViewById(b52.a.checkbox);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f64644i0 = (GestaltCheckBox) findViewById6;
        View findViewById7 = v13.findViewById(b52.a.backfill_radio_group);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f64645j0 = (GestaltRadioGroup) findViewById7;
        View findViewById8 = v13.findViewById(b52.a.backfill_container);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.f64646k0 = (LinearLayout) findViewById8;
        View findViewById9 = v13.findViewById(b52.a.backfill_option_container);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.f64647l0 = (LinearLayout) findViewById9;
        View findViewById10 = v13.findViewById(b52.a.backfill_option_tagline);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        View findViewById11 = v13.findViewById(b52.a.backfill_option_learn_more_link);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "findViewById(...)");
        this.f64648m0 = (GestaltText) findViewById11;
        SettingsRoundHeaderView settingsRoundHeaderView = this.f64639d0;
        if (settingsRoundHeaderView == null) {
            Intrinsics.r("headerView");
            throw null;
        }
        final int i13 = 1;
        settingsRoundHeaderView.f51780e = new View.OnClickListener(this) { // from class: ga1.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f64624b;

            {
                this.f64624b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                p this$0 = this.f64624b;
                switch (i14) {
                    case 0:
                        int i15 = p.f64637p0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l82.c e13 = this$0.Z7().f64663f.e();
                        Navigation navigation = this$0.I;
                        Boolean bool = null;
                        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_SOCIAL_ACCOUNT_TYPE") : null;
                        e82.w wVar = e82.w.INSTAGRAM;
                        if (!Intrinsics.d(v03, wVar.getApiParam())) {
                            wVar = e82.w.NONE;
                        }
                        if (!this$0.a8(false)) {
                            GestaltCheckBox gestaltCheckBox = this$0.f64644i0;
                            if (gestaltCheckBox == null) {
                                Intrinsics.r("checkbox");
                                throw null;
                            }
                            bool = Boolean.valueOf(c0.d.a2(gestaltCheckBox));
                        }
                        e13.a(new b(wVar, bool));
                        return;
                    default:
                        int i16 = p.f64637p0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P7();
                        return;
                }
            }
        };
        settingsRoundHeaderView.setElevation(0.0f);
        settingsRoundHeaderView.Z().t(l.f64629k);
        GestaltCheckBox gestaltCheckBox = this.f64644i0;
        if (gestaltCheckBox == null) {
            Intrinsics.r("checkbox");
            throw null;
        }
        c0.d.l(gestaltCheckBox, em1.i.f59624q);
        GestaltCheckBox gestaltCheckBox2 = this.f64644i0;
        if (gestaltCheckBox2 == null) {
            Intrinsics.r("checkbox");
            throw null;
        }
        gestaltCheckBox2.L(l.f64628j);
        GestaltButton gestaltButton = this.f64643h0;
        if (gestaltButton == null) {
            Intrinsics.r("actionButton");
            throw null;
        }
        final int i14 = 0;
        gestaltButton.setOnClickListener(new View.OnClickListener(this) { // from class: ga1.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f64624b;

            {
                this.f64624b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                p this$0 = this.f64624b;
                switch (i142) {
                    case 0:
                        int i15 = p.f64637p0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        l82.c e13 = this$0.Z7().f64663f.e();
                        Navigation navigation = this$0.I;
                        Boolean bool = null;
                        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_SOCIAL_ACCOUNT_TYPE") : null;
                        e82.w wVar = e82.w.INSTAGRAM;
                        if (!Intrinsics.d(v03, wVar.getApiParam())) {
                            wVar = e82.w.NONE;
                        }
                        if (!this$0.a8(false)) {
                            GestaltCheckBox gestaltCheckBox3 = this$0.f64644i0;
                            if (gestaltCheckBox3 == null) {
                                Intrinsics.r("checkbox");
                                throw null;
                            }
                            bool = Boolean.valueOf(c0.d.a2(gestaltCheckBox3));
                        }
                        e13.a(new b(wVar, bool));
                        return;
                    default:
                        int i16 = p.f64637p0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P7();
                        return;
                }
            }
        });
        if (a8(true)) {
            LinearLayout linearLayout = this.f64646k0;
            if (linearLayout == null) {
                Intrinsics.r("backfillContainer");
                throw null;
            }
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = this.f64647l0;
            if (linearLayout2 == null) {
                Intrinsics.r("backfillOptionContainer");
                throw null;
            }
            linearLayout2.setVisibility(0);
            GestaltText gestaltText = this.f64648m0;
            if (gestaltText == null) {
                Intrinsics.r("learnMoreAboutImportsLink");
                throw null;
            }
            gestaltText.i(new k(this, i14));
            m3 Y7 = Y7();
            z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
            if (!Y7.a("enabled_quarter", z3Var) && !Y7().a("employees", z3Var)) {
                if (Y7().a("enabled_half_year", z3Var)) {
                    i14 = 1;
                } else if (Y7().a("enabled_year", z3Var)) {
                    i14 = 2;
                }
            }
            ((l82.c) Z7().c()).a(new c(i14 != 0 ? i14 != 1 ? i14 != 2 ? e82.u.QUARTER : e82.u.YEAR : e82.u.HALF_YEAR : e82.u.QUARTER));
            GestaltRadioGroup gestaltRadioGroup = this.f64645j0;
            if (gestaltRadioGroup == null) {
                Intrinsics.r("backfillRadioGroup");
                throw null;
            }
            kh2.r.p(gestaltRadioGroup.t(new zx0.d(i14, 19)), new k(this, i13));
        }
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new o(this, null), 3);
    }
}
