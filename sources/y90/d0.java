package y90;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ViewSwitcher;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.ComposeView;
import com.pinterest.collage.effects.components.EffectCategoryTabView;
import com.pinterest.navigation.Navigation;
import com.pinterest.shuffles.composer.ui.effects.PointPicker;
import com.pinterest.shuffles.core.ui.model.MaskModel;
import h32.d4;
import h32.x3;
import i2.f2;
import i2.y3;
import kh2.m2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly90/d0;", "Lnl1/d;", "<init>", "()V", "effects_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d0 extends v1 {

    /* renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ int f138146w0 = 0;

    /* renamed from: c0, reason: collision with root package name */
    public n72.b f138147c0;

    /* renamed from: d0, reason: collision with root package name */
    public n72.m f138148d0;

    /* renamed from: e0, reason: collision with root package name */
    public t62.b f138149e0;

    /* renamed from: f0, reason: collision with root package name */
    public final androidx.lifecycle.m1 f138150f0;

    /* renamed from: g0, reason: collision with root package name */
    public androidx.appcompat.widget.c2 f138151g0;

    /* renamed from: h0, reason: collision with root package name */
    public x72.j f138152h0;

    /* renamed from: i0, reason: collision with root package name */
    public ViewSwitcher f138153i0;

    /* renamed from: j0, reason: collision with root package name */
    public n62.g f138154j0;

    /* renamed from: k0, reason: collision with root package name */
    public q1 f138155k0;

    /* renamed from: l0, reason: collision with root package name */
    public PointPicker f138156l0;

    /* renamed from: m0, reason: collision with root package name */
    public androidx.appcompat.widget.c2 f138157m0;

    /* renamed from: n0, reason: collision with root package name */
    public r1 f138158n0;

    /* renamed from: o0, reason: collision with root package name */
    public final xk2.v f138159o0;

    /* renamed from: p0, reason: collision with root package name */
    public final xk2.v f138160p0;

    /* renamed from: q0, reason: collision with root package name */
    public final c2 f138161q0;

    /* renamed from: r0, reason: collision with root package name */
    public final d1 f138162r0;

    /* renamed from: s0, reason: collision with root package name */
    public final xk2.v f138163s0;

    /* renamed from: t0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f138164t0;

    /* renamed from: u0, reason: collision with root package name */
    public zy.a0 f138165u0;

    /* renamed from: v0, reason: collision with root package name */
    public final d4 f138166v0;

    public d0() {
        int i13 = 1;
        int i14 = 2;
        xk2.k a13 = xk2.m.a(xk2.n.NONE, new w(new w(this, i13), i14));
        int i15 = 3;
        u50.f0 f0Var = null;
        this.f138150f0 = kh2.a1.s(this, kotlin.jvm.internal.k0.f80436a.b(y0.class), new w(a13, i15), new a1(i13, f0Var, a13), new a1(i14, this, a13));
        this.f138159o0 = xk2.m.b(new r(this, i15));
        this.f138160p0 = xk2.m.b(new r(this, i14));
        c2 c2Var = new c2();
        c2Var.E(new x(this));
        this.f138161q0 = c2Var;
        d1 d1Var = new d1();
        d1Var.F(new x(this));
        this.f138162r0 = d1Var;
        this.f138163s0 = xk2.m.b(new r(this, 4));
        this.f138164t0 = bs1.c.u1(new d(f0Var, 15), y3.f71400a);
        this.f138165u0 = new zy.a0();
        this.f138166v0 = d4.COLLAGE_COMPOSER_EFFECT_PICKER;
    }

    public static final void Y7(d0 d0Var, i2.o oVar, int i13) {
        d0Var.getClass();
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1355667656);
        fc0.n.a(false, null, false, false, q2.i.c(-1731337304, new s(d0Var, 0), sVar), sVar, 24576, 15);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new j1.t0(d0Var, i13, 14);
        }
    }

    public static final void Z7(ek.e eVar, boolean z13) {
        View view = eVar.f59129f;
        EffectCategoryTabView effectCategoryTabView = view instanceof EffectCategoryTabView ? (EffectCategoryTabView) view : null;
        if (effectCategoryTabView != null) {
            Object tag = effectCategoryTabView.getTag();
            m62.h hVar = tag instanceof m62.h ? (m62.h) tag : null;
            if (hVar == null) {
                return;
            }
            effectCategoryTabView.q(hVar.a().a() && z13);
        }
    }

    @Override // jl1.a
    public final void N6(String code, Bundle result) {
        MaskModel maskModel;
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(result, "result");
        super.N6(code, result);
        if (Intrinsics.d(code, "CutoutPickerExtras.CUTOUT_MASK_RESULT_CODE") && result.containsKey("CutoutPickerExtras.CUTOUT_MASK_RESULT_KEY") && (maskModel = (MaskModel) kg.t.C("CutoutPickerExtras.CUTOUT_MASK_RESULT_KEY", result)) != null) {
            a8(new o(maskModel));
        }
    }

    @Override // nl1.d
    public final ll1.a T6() {
        return new ll1.a(n7(), String.valueOf(q7()), null, kh2.j1.N(com.bumptech.glide.d.Z(this, "EffectsExtras.EFFECTS_ITEM_ID", "")), 4);
    }

    public final void a8(q qVar) {
        kh2.j.x2((y0) this.f138150f0.getValue(), qVar);
    }

    @Override // nl1.d, com.pinterest.framework.screens.b
    /* renamed from: g */
    public final boolean getF103154e0() {
        a8(e.f138168a);
        return true;
    }

    @Override // nl1.d, nx.a
    public final h32.i0 generateLoggingContext() {
        return this.f138165u0.e();
    }

    @Override // nx.a
    public final String getUniqueScreenKey() {
        return this.f138165u0.f();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF134210i2() {
        return this.f138166v0;
    }

    @Override // nl1.d
    public final u50.r l7() {
        return new mq.z(((y0) this.f138150f0.getValue()).c(), 29);
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = y1.fragment_collage_effects;
        ((y0) this.f138150f0.getValue()).h(com.bumptech.glide.d.i0(null, null, this.f138166v0, ""), com.bumptech.glide.d.Z(this, "EffectsExtras.EFFECTS_ITEM_ID", ""), this.f138165u0.f(), com.bumptech.glide.d.G(this, "EffectsExtras.EFFECTS_FROM_TEXT_ITEM_CLICKED", false));
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        ComposeView composeView = (ComposeView) onCreateView.findViewById(x1.collage_effects_top_bar);
        int i13 = 1;
        s sVar = new s(this, i13);
        Object obj = q2.i.f102113a;
        composeView.o(new q2.h(sVar, true, -182348640));
        x72.b bVar = x72.b.f134124d;
        if (bVar == null) {
            Intrinsics.r("current");
            throw null;
        }
        View findViewById = onCreateView.findViewById(x1.collage_effects_view_stub);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        x72.j p13 = bVar.p((ViewStub) findViewById);
        this.f138152h0 = p13;
        if (p13 == null) {
            Intrinsics.r("effectsView");
            throw null;
        }
        x72.j jVar = this.f138152h0;
        if (jVar == null) {
            Intrinsics.r("effectsView");
            throw null;
        }
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        com.pinterest.shuffles.scene.composer.x0 x0Var = new com.pinterest.shuffles.scene.composer.x0(jVar, bf.b.S(viewLifecycleOwner));
        Context requireContext = requireContext();
        com.pinterest.shuffles.scene.composer.a1 P0 = m2.P0();
        n72.m mVar = this.f138148d0;
        if (mVar == null) {
            Intrinsics.r("logger");
            throw null;
        }
        n72.b bVar2 = this.f138147c0;
        if (bVar2 == null) {
            Intrinsics.r("fontManager");
            throw null;
        }
        Intrinsics.f(requireContext);
        x0Var.e(new com.pinterest.shuffles.scene.composer.q(requireContext, P0, bVar2, mVar));
        n72.m mVar2 = this.f138148d0;
        if (mVar2 == null) {
            Intrinsics.r("logger");
            throw null;
        }
        t62.b bVar3 = this.f138149e0;
        if (bVar3 == null) {
            Intrinsics.r("rendererUtility");
            throw null;
        }
        this.f138151g0 = new androidx.appcompat.widget.c2(p13, x0Var, bVar3, mVar2, new y(this, 2));
        q1 q1Var = new q1(onCreateView);
        q1Var.f138221a.b(new v(u.f138248l, u.f138249m, u.f138246j));
        this.f138155k0 = q1Var;
        View findViewById2 = onCreateView.findViewById(x1.point_picker);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f138156l0 = (PointPicker) findViewById2;
        View findViewById3 = onCreateView.findViewById(x1.effects_panel_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f138153i0 = (ViewSwitcher) findViewById3;
        Context requireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        q1 q1Var2 = this.f138155k0;
        if (q1Var2 == null) {
            Intrinsics.r("effectsPanelView");
            throw null;
        }
        PointPicker pointPicker = this.f138156l0;
        if (pointPicker == null) {
            Intrinsics.r("pointPicker");
            throw null;
        }
        androidx.lifecycle.z viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        this.f138154j0 = new n62.g(requireContext2, q1Var2, pointPicker, bf.b.S(viewLifecycleOwner2), (p1) this.f138159o0.getValue(), (k1) this.f138160p0.getValue(), this.f138161q0, (u1) this.f138163s0.getValue(), this.f138162r0, new z(this), new y(this, 3), new a0(this, 0), new a0(this, 1));
        this.f138158n0 = new r1(onCreateView);
        androidx.lifecycle.z viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        androidx.lifecycle.u S = bf.b.S(viewLifecycleOwner3);
        n72.b bVar4 = this.f138147c0;
        if (bVar4 == null) {
            Intrinsics.r("fontManager");
            throw null;
        }
        r1 r1Var = this.f138158n0;
        if (r1Var == null) {
            Intrinsics.r("effectsTextEditorFacade");
            throw null;
        }
        x72.j jVar2 = this.f138152h0;
        if (jVar2 == null) {
            Intrinsics.r("effectsView");
            throw null;
        }
        androidx.appcompat.widget.c2 c2Var = new androidx.appcompat.widget.c2(S, bVar4, r1Var, jVar2, new y(this, i13));
        c2Var.y(va0.a.a());
        this.f138157m0 = c2Var;
        return onCreateView;
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        kh2.b0.D1(this, new c0(this, null));
    }

    @Override // nl1.d
    public final String q7() {
        String str;
        x3 x3Var = this.f138165u0.e().f67083c;
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
