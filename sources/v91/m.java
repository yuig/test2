package v91;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.m1;
import androidx.lifecycle.z;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.switchComponent.GestaltSwitch;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.settings.SettingsRoundHeaderView;
import h32.d4;
import kh2.a1;
import kl0.x;
import kl0.y;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv91/m;", "Lnl1/d;", "<init>", "()V", "account_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class m extends w {

    /* renamed from: l0, reason: collision with root package name */
    public static final /* synthetic */ int f124995l0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final m1 f124996c0;

    /* renamed from: d0, reason: collision with root package name */
    public SettingsRoundHeaderView f124997d0;

    /* renamed from: e0, reason: collision with root package name */
    public FrameLayout f124998e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltSpinner f124999f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltText f125000g0;

    /* renamed from: h0, reason: collision with root package name */
    public GestaltButton f125001h0;

    /* renamed from: i0, reason: collision with root package name */
    public GestaltSwitch f125002i0;

    /* renamed from: j0, reason: collision with root package name */
    public GestaltText f125003j0;

    /* renamed from: k0, reason: collision with root package name */
    public final d4 f125004k0;

    public m() {
        int i13 = 24;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new uv0.f(28, new kl0.w(this, i13)));
        int i14 = 25;
        this.f124996c0 = a1.s(this, k0.f80436a.b(v.class), new ml0.v(a13, i13), new x(null, a13, i14), new y(this, a13, i14));
        this.f125004k0 = d4.SETTINGS;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF0() {
        return this.f125004k0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = b52.b.fragment_auto_org_opt_in;
        Navigation navigation = this.I;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_SOCIAL_ACCOUNT_TYPE") : null;
        if (v03 == null) {
            v03 = "";
        }
        ((v) this.f124996c0.getValue()).h(v03);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(b52.a.header_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f124997d0 = (SettingsRoundHeaderView) findViewById;
        View findViewById2 = v13.findViewById(b52.a.progress_spinner);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f124999f0 = (GestaltSpinner) findViewById2;
        View findViewById3 = v13.findViewById(b52.a.loading_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f124998e0 = (FrameLayout) findViewById3;
        View findViewById4 = v13.findViewById(b52.a.connected_to);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f125000g0 = (GestaltText) findViewById4;
        View findViewById5 = v13.findViewById(b52.a.action_button);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f125001h0 = (GestaltButton) findViewById5;
        View findViewById6 = v13.findViewById(b52.a.auto_org_opt_in_switch);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f125002i0 = (GestaltSwitch) findViewById6;
        View findViewById7 = v13.findViewById(b52.a.auto_org_opt_in_switch_label);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.f125003j0 = (GestaltText) findViewById7;
        SettingsRoundHeaderView settingsRoundHeaderView = this.f124997d0;
        if (settingsRoundHeaderView == null) {
            Intrinsics.r("headerView");
            throw null;
        }
        final int i13 = 1;
        settingsRoundHeaderView.g0(new View.OnClickListener(this) { // from class: v91.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f124983b;

            {
                this.f124983b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                m this$0 = this.f124983b;
                switch (i14) {
                    case 0:
                        int i15 = m.f124995l0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((v) this$0.f124996c0.getValue()).f125014e.e().a(b.f124977a);
                        break;
                    default:
                        int i16 = m.f124995l0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P7();
                        break;
                }
            }
        });
        settingsRoundHeaderView.setElevation(0.0f);
        settingsRoundHeaderView.Z().t(l.f124990j);
        GestaltButton gestaltButton = this.f125001h0;
        if (gestaltButton == null) {
            Intrinsics.r("actionButton");
            throw null;
        }
        final int i14 = 0;
        gestaltButton.g(new View.OnClickListener(this) { // from class: v91.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f124983b;

            {
                this.f124983b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                m this$0 = this.f124983b;
                switch (i142) {
                    case 0:
                        int i15 = m.f124995l0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        ((v) this$0.f124996c0.getValue()).f125014e.e().a(b.f124977a);
                        break;
                    default:
                        int i16 = m.f124995l0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.P7();
                        break;
                }
            }
        });
        GestaltSwitch gestaltSwitch = this.f125002i0;
        if (gestaltSwitch == null) {
            Intrinsics.r("optInToggle");
            throw null;
        }
        gestaltSwitch.j(new l11.p(this, 27));
        z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new k(this, null), 3);
    }
}
