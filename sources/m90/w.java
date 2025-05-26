package m90;

import a.sc;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.q1;
import com.pinterest.api.model.wy0;
import com.pinterest.collagesCoreLibrary.model.CutoutPickerPage;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.searchField.GestaltStaticSearchBar;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import h32.a4;
import h32.d4;
import h32.x3;
import i2.f2;
import i2.y3;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;
import so.n5;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm90/w;", "Lo82/v2;", "<init>", "()V", "cutoutPicker_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class w extends l1 {
    public static final /* synthetic */ int X0 = 0;
    public n5 L0;
    public pb0.d M0;
    public GestaltStaticSearchBar N0;
    public GestaltIconButton O0;
    public GestaltText P0;
    public ComposeView Q0;
    public final androidx.lifecycle.m1 R0;
    public final xk2.v S0;
    public final xk2.k T0;
    public zy.a0 U0;
    public final ParcelableSnapshotMutableState V0;
    public final d4 W0;

    public w() {
        q1 q1Var = new q1(this, 18);
        xk2.n nVar = xk2.n.NONE;
        xk2.k q13 = jq.b.q(19, q1Var, nVar);
        int i13 = 17;
        this.R0 = kh2.a1.s(this, kotlin.jvm.internal.k0.f80436a.b(b1.class), new mq.e0(q13, i13), new mq.f0(null, q13, i13), new mq.g0(this, q13, i13));
        this.S0 = xk2.m.b(new o(this, 2));
        this.T0 = xk2.m.a(nVar, new o(this, 1));
        this.U0 = new zy.a0();
        this.V0 = bs1.c.u1(Boolean.FALSE, y3.f71400a);
        this.W0 = d4.COLLAGE_COMPOSER_ITEM_PICKER;
    }

    public static final void k9(w wVar, i2.o oVar, int i13) {
        wVar.getClass();
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1766352288);
        fc0.n.a(false, null, false, false, q2.i.c(-567970496, new p(wVar, 0), sVar), sVar, 24576, 15);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new j1.t0(wVar, i13, 10);
        }
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(l9().a(), 11);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new mq.z(l9().c(), 21);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        c0.d.A2(adapter, a0.b(), t.f86697j, (o82.y) this.T0.getValue());
        int i13 = 1;
        b3.G(adapter, 4444, new o(this, 3), g1.f86654a, new ns.i(i13), new sc(26), l9(), 32);
        o oVar = new o(this, 4);
        u uVar = new u(this, i13);
        v vVar = v.f86705j;
        wy0 f13 = ((b60.d) getActiveUserManager()).f();
        pb0.d dVar = this.M0;
        if (dVar == null) {
            Intrinsics.r("dateFormatter");
            throw null;
        }
        adapter.E(5555, oVar, new yo0.a(uVar, vVar, f13, dVar, ka2.d.f78955a, (ka2.a) null, 200), t.f86698k);
    }

    @Override // o82.v2
    public final int a9() {
        return 0;
    }

    @Override // o82.v2
    public final int d9() {
        return 0;
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return this.U0.e();
    }

    @Override // o82.v2, sq0.b0
    /* renamed from: getNumColumns */
    public final int getT0() {
        return com.bumptech.glide.d.O(this, "CutoutPickerExtras.CUTOUT_PICKER_KEY_NUM_COLUMNS", f0.a());
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.U0.f();
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getS0() {
        a4 b13;
        Parcelable R = com.bumptech.glide.d.R(this, "CutoutPickerExtras.CUTOUT_PICKER_KEY_PAGE");
        CutoutPickerPage cutoutPickerPage = R instanceof CutoutPickerPage ? (CutoutPickerPage) R : null;
        if (cutoutPickerPage == null || (b13 = ya0.b.b(cutoutPickerPage)) == null) {
            return null;
        }
        return b13;
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF103135g0() {
        return this.W0;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new mq.z(l9().c(), 22);
    }

    public final b1 l9() {
        return (b1) this.R0.getValue();
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(l90.b.fragment_collage_content_browse, l90.a.collage_content_browse_content);
        eVar.b(l90.a.collage_content_browse_loading_state_container);
        eVar.f979c = l90.a.collage_content_browse_empty_state_container;
        return eVar;
    }

    public final void m9(m mVar) {
        kh2.j.x2(l9(), mVar);
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        b1 l93 = l9();
        String Z = com.bumptech.glide.d.Z(this, "CutoutPickerExtras.CUTOUT_PICKER_KEY_SEARCH_QUERY", "");
        int O = com.bumptech.glide.d.O(this, "CutoutPickerExtras.CUTOUT_PICKER_KEY_SEARCH_TYPE", za0.b.All.ordinal());
        za0.b.Companion.getClass();
        za0.b a13 = za0.a.a(O);
        List Y = com.bumptech.glide.d.Y(this, "CutoutPickerExtras.CUTOUT_PICKER_KEY_PIN_IDS", kotlin.collections.q0.f80391a);
        Parcelable R = com.bumptech.glide.d.R(this, "CutoutPickerExtras.CUTOUT_PICKER_KEY_PAGE");
        l93.h(Z, a13, Y, R instanceof CutoutPickerPage ? (CutoutPickerPage) R : null, com.bumptech.glide.d.G(this, "CutoutPickerExtras.CUTOUT_PICKER_IS_ONBOARDING", false), (h32.i0) this.S0.getValue(), this.U0.f());
    }

    @Override // o82.i3, yq0.t, nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        final int i13 = 0;
        this.N0 = ((GestaltStaticSearchBar) onCreateView.findViewById(l90.a.collage_content_browse_search_field)).k0(new gm1.a(this) { // from class: m90.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f86677b;

            {
                this.f86677b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i14 = i13;
                w this$0 = this.f86677b;
                switch (i14) {
                    case 0:
                        int i15 = w.X0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof cn1.s) {
                            this$0.m9(j.f86666a);
                            break;
                        }
                        break;
                    default:
                        int i16 = w.X0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof om1.l) {
                            this$0.m9(c.f86639a);
                            break;
                        }
                        break;
                }
            }
        });
        View findViewById = onCreateView.findViewById(l90.a.collage_content_browse_back_button);
        GestaltIconButton gestaltIconButton = (GestaltIconButton) findViewById;
        final int i14 = 1;
        gestaltIconButton.u(new gm1.a(this) { // from class: m90.n

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f86677b;

            {
                this.f86677b = this;
            }

            @Override // gm1.a
            public final void h3(gm1.c it) {
                int i142 = i14;
                w this$0 = this.f86677b;
                switch (i142) {
                    case 0:
                        int i15 = w.X0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        if (it instanceof cn1.s) {
                            this$0.m9(j.f86666a);
                            break;
                        }
                        break;
                    default:
                        int i16 = w.X0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "event");
                        if (it instanceof om1.l) {
                            this$0.m9(c.f86639a);
                            break;
                        }
                        break;
                }
            }
        });
        bs1.c.X0(gestaltIconButton);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.O0 = gestaltIconButton;
        View findViewById2 = onCreateView.findViewById(l90.a.collage_content_browse_title);
        GestaltText gestaltText = (GestaltText) findViewById2;
        bs1.c.X0(gestaltText);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.P0 = gestaltText;
        View findViewById3 = onCreateView.findViewById(l90.a.collage_content_browse_close_button);
        ComposeView composeView = (ComposeView) findViewById3;
        p pVar = new p(this, i14);
        Object obj = q2.i.f102113a;
        composeView.o(new q2.h(pVar, true, 175760183));
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.Q0 = composeView;
        View findViewById4 = onCreateView.findViewById(l90.a.collage_content_browse_onboarding_view);
        ((ComposeView) findViewById4).o(new q2.h(new p(this, 2), true, -2009933983));
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
        return onCreateView;
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        g9(bs1.c.X(this, eo1.c.bottom_nav_height));
        if (com.bumptech.glide.d.G(this, "CutoutPickerExtras.CUTOUT_PICKER_IS_ONBOARDING", false)) {
            b8(new n90.n((l82.c) l9().c()));
        }
        kh2.b0.D1(this, new s(this, null));
    }

    @Override // nl1.d
    public final String q7() {
        String str;
        x3 x3Var = this.U0.e().f67083c;
        if (x3Var != null && (str = x3Var.f67402f) != null) {
            return str;
        }
        Navigation navigation = this.I;
        if (navigation != null) {
            return navigation.getF49940b();
        }
        return null;
    }
}
