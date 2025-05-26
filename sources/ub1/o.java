package ub1;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.m1;
import com.pinterest.gestalt.listAction.GestaltListAction;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.settings.SettingsRoundHeaderView;
import ea1.t0;
import ea1.u0;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.k0;
import rq.c2;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lub1/o;", "Lnl1/d;", "Lyb0/h;", "<init>", "()V", "permissions_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class o extends b0 implements yb0.h {

    /* renamed from: i0, reason: collision with root package name */
    public static final /* synthetic */ int f121730i0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public final m1 f121731c0;

    /* renamed from: d0, reason: collision with root package name */
    public SettingsRoundHeaderView f121732d0;

    /* renamed from: e0, reason: collision with root package name */
    public GestaltText f121733e0;

    /* renamed from: f0, reason: collision with root package name */
    public GestaltListAction f121734f0;

    /* renamed from: g0, reason: collision with root package name */
    public GestaltText f121735g0;

    /* renamed from: h0, reason: collision with root package name */
    public final d4 f121736h0;

    public o() {
        int i13 = 9;
        xk2.k r13 = d7.g.r(13, new t0(this, i13), xk2.n.NONE);
        int i14 = 10;
        this.f121731c0 = a1.s(this, k0.f80436a.b(a0.class), new u0(r13, i13), new ca1.m(r13, i14), new ca1.n(this, r13, i14));
        this.f121736h0 = d4.SETTINGS;
    }

    @Override // yb0.h
    public final void G6() {
        f7().d(new yb0.c(yb0.d.CANCEL_BUTTON_CLICK));
        kh2.j.x2((a0) this.f121731c0.getValue(), c.f121715a);
    }

    @Override // yb0.h
    public final void H0(boolean z13) {
        kh2.j.x2((a0) this.f121731c0.getValue(), new d(z13));
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF46720m() {
        return this.f121736h0;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = g52.b.fragment_content_permissions;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(g52.a.header_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f121732d0 = (SettingsRoundHeaderView) findViewById;
        View findViewById2 = v13.findViewById(g52.a.content_setup_description);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = v13.findViewById(g52.a.auto_product_tagging_disabled);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f121733e0 = (GestaltText) findViewById3;
        View findViewById4 = v13.findViewById(g52.a.auto_product_tagging_toggle);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f121734f0 = (GestaltListAction) findViewById4;
        View findViewById5 = v13.findViewById(g52.a.auto_product_tagging_disabled);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f121735g0 = (GestaltText) findViewById5;
        SettingsRoundHeaderView settingsRoundHeaderView = this.f121732d0;
        if (settingsRoundHeaderView == null) {
            Intrinsics.r("headerView");
            throw null;
        }
        settingsRoundHeaderView.f51780e = new x91.k(this, 21);
        settingsRoundHeaderView.k0(c52.e.settings_main_content_permissions);
        settingsRoundHeaderView.setElevation(0.0f);
        GestaltText gestaltText = this.f121733e0;
        if (gestaltText == null) {
            Intrinsics.r("autoProductTaggingDisabledDescription");
            throw null;
        }
        gestaltText.i(new c2(gestaltText, 15));
        GestaltListAction gestaltListAction = this.f121734f0;
        if (gestaltListAction == null) {
            Intrinsics.r("productTaggingToggle");
            throw null;
        }
        gestaltListAction.X(new nj.a(this, 1));
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new m(this, null), 3);
    }

    @Override // yb0.h
    public final void t2() {
        f7().d(new yb0.c(yb0.d.CONFIRM_BUTTON_CLICK));
        kh2.j.x2((a0) this.f121731c0.getValue(), e.f121717a);
    }
}
