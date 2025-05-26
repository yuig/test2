package l81;

import a.cb;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.c2;
import c71.b0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.search.visual.PinchToZoomTransitionContext;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.navigation.Navigation;
import com.pinterest.repository.pin.PinService;
import com.pinterest.ui.blurView.BlurView;
import com.pinterest.ui.grid.GridPlaceholderLoadingLayout;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.ui.view.MaskedWebImageView;
import com.pinterest.ui.view.TopBottomGradientView;
import df.j1;
import dl1.s;
import h32.a4;
import h32.d4;
import h32.f1;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import lb0.r;
import lh0.f4;
import lh0.k2;
import lh0.o4;
import m60.r0;
import m60.w;
import nx.f0;
import s71.u;
import so.oa;
import uy.d0;
import uy.e0;
import x02.i2;
import xk2.v;
import yq0.z;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00032\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001\u000bB\t\b\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Ll81/l;", "Lwk1/k;", "Ldl1/s;", "Li81/d;", "Lnr0/j;", "Lo80/l;", "Lib2/d;", "Lo80/d;", "Lg81/a;", "<init>", "()V", "kg/p", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class l extends n<s> implements i81.d, o80.l, ib2.d, o80.d, g81.a {
    public static final /* synthetic */ int Q2 = 0;
    public boolean A1;
    public Float A2;
    public View B1;
    public h81.c B2;
    public ViewGroup C1;
    public float C2;
    public FrameLayout D1;
    public float D2;
    public f91.b E1;
    public List E2;
    public FrameLayout F1;
    public List F2;
    public LinearLayout G1;
    public boolean G2;
    public WebImageView H1;
    public int H2;
    public GestaltText I1;
    public float I2;
    public TopBottomGradientView J1;
    public float J2;
    public com.pinterest.feature.search.visual.cropper.m K1;
    public dx.a K2;
    public GestaltIconButton L1;
    public w81.d L2;
    public GestaltIconButton M1;
    public pr0.g M2;
    public Float N1;
    public final k N2;
    public GestaltIconButton O1;
    public ov1.k O2;
    public GestaltIconButton P1;
    public ov1.k P2;
    public GestaltIconButton Q1;
    public i2 R0;
    public GestaltIconButton R1;
    public f0 S0;
    public da2.g S1;
    public wk2.a T0;
    public GestaltText T1;
    public f4 U0;
    public ex.e U1;
    public o4 V0;
    public GestaltText V1;
    public nr0.m W0;
    public FrameLayout W1;
    public zf0.f X0;
    public View X1;
    public r Y0;
    public BlurView Y1;
    public ax.a Z0;
    public View Z1;

    /* renamed from: a1, reason: collision with root package name */
    public PinService f82148a1;

    /* renamed from: a2, reason: collision with root package name */
    public FrameLayout f82149a2;

    /* renamed from: b1, reason: collision with root package name */
    public ni0.e f82150b1;

    /* renamed from: b2, reason: collision with root package name */
    public GridPlaceholderLoadingLayout f82151b2;

    /* renamed from: c1, reason: collision with root package name */
    public i92.k f82152c1;

    /* renamed from: c2, reason: collision with root package name */
    public float f82153c2;

    /* renamed from: d1, reason: collision with root package name */
    public k2 f82154d1;
    public final float d2;

    /* renamed from: e1, reason: collision with root package name */
    public vy.m f82155e1;

    /* renamed from: e2, reason: collision with root package name */
    public float f82156e2;

    /* renamed from: f1, reason: collision with root package name */
    public q f82157f1;

    /* renamed from: f2, reason: collision with root package name */
    public int f82158f2;

    /* renamed from: g1, reason: collision with root package name */
    public wk2.a f82159g1;

    /* renamed from: g2, reason: collision with root package name */
    public float f82160g2;

    /* renamed from: h2, reason: collision with root package name */
    public float f82162h2;

    /* renamed from: i1, reason: collision with root package name */
    public k81.j f82163i1;

    /* renamed from: i2, reason: collision with root package name */
    public float f82164i2;

    /* renamed from: j1, reason: collision with root package name */
    public k81.e f82165j1;

    /* renamed from: j2, reason: collision with root package name */
    public int f82166j2;

    /* renamed from: k2, reason: collision with root package name */
    public int f82168k2;

    /* renamed from: l2, reason: collision with root package name */
    public final int[] f82170l2;

    /* renamed from: m2, reason: collision with root package name */
    public int f82172m2;

    /* renamed from: n2, reason: collision with root package name */
    public RectF f82174n2;

    /* renamed from: o1, reason: collision with root package name */
    public c2 f82175o1;

    /* renamed from: o2, reason: collision with root package name */
    public ca2.e f82176o2;

    /* renamed from: p1, reason: collision with root package name */
    public i81.c f82177p1;

    /* renamed from: p2, reason: collision with root package name */
    public final zd1.o f82178p2;

    /* renamed from: q1, reason: collision with root package name */
    public da2.g f82179q1;

    /* renamed from: q2, reason: collision with root package name */
    public k81.l f82180q2;

    /* renamed from: r1, reason: collision with root package name */
    public s71.q f82181r1;

    /* renamed from: r2, reason: collision with root package name */
    public float f82182r2;

    /* renamed from: s1, reason: collision with root package name */
    public PinchToZoomTransitionContext f82183s1;

    /* renamed from: s2, reason: collision with root package name */
    public int f82184s2;

    /* renamed from: t1, reason: collision with root package name */
    public String f82185t1;

    /* renamed from: t2, reason: collision with root package name */
    public float f82186t2;

    /* renamed from: u1, reason: collision with root package name */
    public String f82187u1;

    /* renamed from: u2, reason: collision with root package name */
    public boolean f82188u2;

    /* renamed from: v2, reason: collision with root package name */
    public boolean f82190v2;

    /* renamed from: w2, reason: collision with root package name */
    public Integer f82192w2;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f82193x1;

    /* renamed from: x2, reason: collision with root package name */
    public Integer f82194x2;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f82195y1;

    /* renamed from: y2, reason: collision with root package name */
    public Float f82196y2;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f82197z1;

    /* renamed from: z2, reason: collision with root package name */
    public Float f82198z2;

    /* renamed from: h1, reason: collision with root package name */
    public final v f82161h1 = xk2.m.b(new f(this, 3));

    /* renamed from: k1, reason: collision with root package name */
    public final v f82167k1 = xk2.m.b(new f(this, 6));

    /* renamed from: l1, reason: collision with root package name */
    public final v f82169l1 = xk2.m.b(new f(this, 7));

    /* renamed from: m1, reason: collision with root package name */
    public final v f82171m1 = xk2.m.b(new f(this, 8));

    /* renamed from: n1, reason: collision with root package name */
    public final v f82173n1 = xk2.m.b(new f(this, 2));

    /* renamed from: v1, reason: collision with root package name */
    public i81.e f82189v1 = i81.e.FLASHLIGHT;

    /* renamed from: w1, reason: collision with root package name */
    public i81.f f82191w1 = i81.f.FLASHLIGHT_ORGANIC;

    public l() {
        float f13 = hf0.b.f69003c;
        this.f82153c2 = f13;
        float f14 = hf0.b.f69002b;
        this.d2 = f14;
        this.f82156e2 = f13;
        this.f82158f2 = (int) f14;
        this.f82160g2 = f13;
        this.f82170l2 = new int[2];
        this.f82178p2 = new zd1.o();
        this.H2 = -1;
        this.I2 = -1.0f;
        this.J2 = -1.0f;
        this.N2 = new k(this);
    }

    public static void l9(l lVar, int i13) {
        int height;
        FrameLayout frameLayout = lVar.F1;
        if (frameLayout == null || (height = frameLayout.getHeight()) == i13) {
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(height, i13);
        ofInt.setDuration(400L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new androidx.media3.ui.c(lVar, 15));
        ofInt.start();
    }

    public final void A9(PinchToZoomTransitionContext pinchToZoomTransitionContext) {
        w81.d dVar;
        Class cls;
        Class cls2;
        this.f82185t1 = pinchToZoomTransitionContext.getF47924a();
        this.f82187u1 = pinchToZoomTransitionContext.getF47925b();
        i81.e eVar = pinchToZoomTransitionContext.getF47933j() ? i81.e.FLASHLIGHT : i81.e.P2Z;
        this.f82189v1 = eVar;
        int[] iArr = d.f82119a;
        int i13 = iArr[eVar.ordinal()];
        if (i13 == 1) {
            dVar = w81.a.f128456a;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = w81.e.f128458a;
        }
        w81.d dVar2 = dVar;
        this.L2 = dVar2;
        ky.d dVar3 = new ky.d(f7());
        w f73 = f7();
        int i14 = iArr[this.f82189v1.ordinal()];
        if (i14 == 1) {
            cls = uy.i.class;
        } else {
            if (i14 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cls = e0.class;
        }
        Class cls3 = cls;
        int i15 = iArr[this.f82189v1.ordinal()];
        if (i15 == 1) {
            cls2 = uy.h.class;
        } else {
            if (i15 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cls2 = d0.class;
        }
        this.M2 = new pr0.g(dVar2, dVar3, null, f73, cls3, cls2, null, null, null, 452);
        this.f82172m2 = pinchToZoomTransitionContext.getF47929f();
        this.f82156e2 = pinchToZoomTransitionContext.getF47928e();
        this.f82197z1 = pinchToZoomTransitionContext.getF47935l();
        Navigation navigation = this.I;
        Object i03 = navigation != null ? navigation.i0("com.pinterest.EXTRA_VISUAL_OBJECT_DATA") : null;
        this.F2 = i03 instanceof List ? (List) i03 : null;
        Navigation navigation2 = this.I;
        this.H2 = navigation2 != null ? navigation2.q1(-1, "com.pinterest.EXTRA_FLASHLIGHT_DOT_INDEX") : -1;
        Navigation navigation3 = this.I;
        this.I2 = navigation3 != null ? navigation3.D1("x") : -1.0f;
        Navigation navigation4 = this.I;
        this.J2 = navigation4 != null ? navigation4.D1("y") : -1.0f;
        Navigation navigation5 = this.I;
        this.A1 = (this.I2 == -1.0f || this.J2 == -1.0f || (navigation5 != null ? navigation5.S("com.pinterest.EXTRA_FROM_IMAGE_CLICK_INTO_IMAGE_SEARCH", false) : false)) ? false : true;
        boolean f47938o = pinchToZoomTransitionContext.getF47938o();
        this.G2 = f47938o;
        if (this.A1 || this.H2 == -1 || this.f82189v1 != i81.e.FLASHLIGHT || f47938o || !s9().d()) {
            return;
        }
        this.H2 = -1;
    }

    @Override // ib2.d
    public final void B0(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "cropBounds");
        if (!x9()) {
            f91.b bVar = this.E1;
            if (bVar != null) {
                bVar.G(rectF);
                return;
            }
            return;
        }
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        if (x9()) {
            MaskedWebImageView t93 = t9();
            if (t93 != null) {
                t93.j3(rectF);
                return;
            }
            return;
        }
        com.pinterest.feature.search.visual.cropper.m mVar = this.K1;
        if (mVar != null) {
            mVar.j(rectF);
        }
    }

    public final boolean B9() {
        View c13;
        ca2.e eVar = this.f82176o2;
        return ((eVar == null || (c13 = eVar.c()) == null) ? 0.0f : c13.getY()) > this.f82153c2 - (((float) this.f82184s2) * 2.5f);
    }

    public final boolean C9() {
        View c13;
        ca2.e eVar = this.f82176o2;
        float y13 = (eVar == null || (c13 = eVar.c()) == null) ? 0.0f : c13.getY();
        return 0.0f <= y13 && y13 <= this.f82153c2 - (((float) this.f82184s2) * 2.5f);
    }

    public final boolean D9() {
        return ((Boolean) this.f82173n1.getValue()).booleanValue();
    }

    public final void E9(float f13, float f14, boolean z13) {
        WebImageView j13;
        BottomSheetBehavior d2;
        ca2.e eVar = this.f82176o2;
        if (eVar != null && (d2 = eVar.d()) != null && d2.M() == 3) {
            eVar.v("background_tapped");
        }
        i81.c cVar = this.f82177p1;
        if (cVar != null) {
            f91.b bVar = this.E1;
            if (bVar != null && (j13 = bVar.j()) != null) {
                int i13 = MaskedWebImageView.f52675x0;
                gi2.b.i0(j13);
            }
            ((k81.l) cVar).U3();
        }
    }

    @Override // ib2.d
    public final void F0() {
        s71.q qVar = this.f82181r1;
        if (qVar == null) {
            Intrinsics.r("flashlightPinalytics");
            throw null;
        }
        nx.d0 d0Var = qVar.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        nx.d0.v(d0Var, f1.FLASHLIGHT_CROPPER_MOVE, this.f82185t1, false, 12);
    }

    public final void F9() {
        if (x9()) {
            MaskedWebImageView t93 = t9();
            if (t93 != null) {
                t93.W2();
                return;
            }
            return;
        }
        com.pinterest.feature.search.visual.cropper.m mVar = this.K1;
        if (mVar != null) {
            mVar.h();
        }
    }

    @Override // ib2.d
    public final void G2(RectF cropBounds) {
        Intrinsics.checkNotNullParameter(cropBounds, "cropBounds");
        f91.b bVar = this.E1;
        if (bVar != null) {
            bVar.G(cropBounds);
        }
        i81.c cVar = this.f82177p1;
        if (cVar != null) {
            ((k81.l) cVar).X3();
        }
    }

    public final void G9(st1.b model) {
        Intrinsics.checkNotNullParameter(model, "model");
        MaskedWebImageView t93 = t9();
        if (t93 != null) {
            t93.X2(model, false, this.I2, this.J2);
        }
    }

    public final void H9(float f13, float f14, float f15, float f16, boolean z13, String str) {
        o80.j A;
        f91.b bVar = this.E1;
        if (bVar == null || (A = bVar.A()) == null) {
            return;
        }
        com.pinterest.feature.search.visual.cropper.m mVar = this.K1;
        if (mVar != null) {
            mVar.b();
        }
        com.pinterest.feature.search.visual.cropper.m mVar2 = this.K1;
        if (mVar2 != null) {
            mVar2.i(false);
        }
        A.p(this.d2, f13, f14, f15, f16, new h(this, f13, f14, f15, f16, z13, str));
    }

    public final void I9(b0 searchParameters) {
        Intrinsics.checkNotNullParameter(searchParameters, "searchParameters");
        ov1.k kVar = this.P2;
        if (kVar != null) {
            kVar.l(new i(this, searchParameters, 0));
        }
        ov1.k kVar2 = this.O2;
        if (kVar2 != null) {
            kVar2.l(new i(this, searchParameters, 1));
        }
    }

    public final void J9() {
        View c13;
        f91.b bVar = this.E1;
        Float f13 = null;
        this.f82196y2 = bVar != null ? Float.valueOf(bVar.y()) : null;
        ca2.e eVar = this.f82176o2;
        if (eVar != null && (c13 = eVar.c()) != null) {
            f13 = Float.valueOf(c13.getY());
        }
        this.A2 = f13;
    }

    @Override // g81.a
    public final void K1(RectF dotBounds, double d2, double d13, double d14, double d15, boolean z13, boolean z14, String str) {
        Intrinsics.checkNotNullParameter(dotBounds, "dotBounds");
        if (d2 < 0.0d || d13 < 0.0d || d14 < 0.0d || d15 < 0.0d) {
            return;
        }
        if (x9() && z14) {
            H9((float) d2, (float) d13, (float) d14, (float) d15, z13, str);
            return;
        }
        com.pinterest.feature.search.visual.cropper.m mVar = this.K1;
        if (mVar != null) {
            mVar.b();
        }
        com.pinterest.feature.search.visual.cropper.m mVar2 = this.K1;
        if (mVar2 != null) {
            mVar2.j(dotBounds);
        }
        boolean z15 = !z14;
        i81.c cVar = this.f82177p1;
        if (cVar != null) {
            ((k81.l) cVar).N3((float) d2, (float) d13, (float) d14, (float) d15, z13, z15, dotBounds);
        }
    }

    public final void K9() {
        View c13;
        f91.b bVar = this.E1;
        Float f13 = null;
        this.f82198z2 = bVar != null ? Float.valueOf(bVar.B()) : null;
        ca2.e eVar = this.f82176o2;
        if (eVar != null && (c13 = eVar.c()) != null) {
            f13 = Float.valueOf(c13.getY());
        }
        this.A2 = f13;
    }

    public final void L9(float f13) {
        if (v9()) {
            return;
        }
        GestaltIconButton gestaltIconButton = this.L1;
        GestaltIconButton gestaltIconButton2 = this.M1;
        if (gestaltIconButton == null || gestaltIconButton2 == null) {
            return;
        }
        float height = (f13 - gestaltIconButton.getHeight()) - getResources().getDimensionPixelSize(r0.margin_half);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        s71.o.k(gestaltIconButton2, height, resources);
    }

    @Override // yq0.t
    public final void M8(boolean z13) {
        if (!v9()) {
            super.M8(z13);
            return;
        }
        GridPlaceholderLoadingLayout gridPlaceholderLoadingLayout = this.f82151b2;
        if (gridPlaceholderLoadingLayout != null) {
            if (!z13) {
                gridPlaceholderLoadingLayout.animate().alpha(0.0f).setDuration(50L).withEndAction(new vs0.b(gridPlaceholderLoadingLayout, 29)).start();
                return;
            }
            gridPlaceholderLoadingLayout.i();
            gridPlaceholderLoadingLayout.setAlpha(0.0f);
            gridPlaceholderLoadingLayout.setVisibility(0);
            gridPlaceholderLoadingLayout.animate().alpha(1.0f).setDuration(50L).start();
        }
    }

    public final void M9(String descriptorText) {
        Intrinsics.checkNotNullParameter(descriptorText, "descriptorText");
        if (this.I1 == null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            GestaltText gestaltText = new GestaltText(6, requireContext, (AttributeSet) null);
            gestaltText.i(new b31.f(descriptorText, 27));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMarginStart(20);
            layoutParams.gravity = 16;
            gestaltText.setLayoutParams(layoutParams);
            gestaltText.setAlpha(0.0f);
            LinearLayout linearLayout = this.G1;
            if (linearLayout != null) {
                linearLayout.addView(gestaltText);
            }
            this.I1 = gestaltText;
        }
        GestaltText gestaltText2 = this.I1;
        if (gestaltText2 != null) {
            gestaltText2.i(new b31.f(descriptorText, 28));
        }
        if (descriptorText.length() > 0) {
            GestaltText gestaltText3 = this.I1;
            if (gestaltText3 != null) {
                bs1.c.U1(gestaltText3);
                return;
            }
            return;
        }
        GestaltText gestaltText4 = this.I1;
        if (gestaltText4 != null) {
            bs1.c.X0(gestaltText4);
        }
    }

    public final void N9(boolean z13) {
        GestaltIconButton gestaltIconButton;
        GestaltIconButton gestaltIconButton2;
        GestaltIconButton gestaltIconButton3 = this.Q1;
        if (gestaltIconButton3 != null) {
            gestaltIconButton3.t(new i31.a(z13, 27));
        }
        GestaltIconButton gestaltIconButton4 = this.Q1;
        if (gestaltIconButton4 != null) {
            gestaltIconButton4.u(new g61.c(z13, this));
        }
        if (!v9() && (gestaltIconButton = this.Q1) != null && bs1.c.j1(gestaltIconButton) && (gestaltIconButton2 = this.Q1) != null) {
            gestaltIconButton2.t(e.f82129r);
        }
        i81.c cVar = this.f82177p1;
        if (cVar != null) {
            ((k81.l) cVar).Z3(z13);
        }
    }

    @Override // ib2.d
    public final void O2(RectF cropBounds) {
        Intrinsics.checkNotNullParameter(cropBounds, "cropBounds");
    }

    public final void O9(float f13) {
        i81.f fVar = i81.f.FLASHLIGHT_ORGANIC;
        float u93 = w9() ? u9() : v9() ? Math.min(this.f82160g2, u9()) : Math.min(f13, u9());
        this.f82164i2 = u93;
        int dimensionPixelSize = this.G2 ? getResources().getDimensionPixelSize(uc2.b.flashlight_bottom_sheet_stl_collapsed_height) : (int) (this.f82153c2 - u93);
        ca2.e eVar = this.f82176o2;
        if (eVar != null) {
            eVar.n(dimensionPixelSize);
        }
        ca2.e eVar2 = this.f82176o2;
        if (eVar2 != null) {
            eVar2.o(v9() ? bs1.c.a0(uc2.b.visual_search_bottom_sheet_dismissed_size) : bs1.c.a0(uc2.b.flashlight_bottom_sheet_dismissed_size));
        }
        ca2.e eVar3 = this.f82176o2;
        if (eVar3 != null) {
            eVar3.x((int) this.f82153c2);
        }
    }

    @Override // nl1.d
    public final void P7() {
        i81.c cVar;
        ov1.k kVar;
        GestaltIconButton gestaltIconButton;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator animate2;
        ViewPropertyAnimator alpha2;
        ViewPropertyAnimator duration2;
        if (!v9() || !x9() || this.G2 || (!((cVar = this.f82177p1) == null || ((k81.l) cVar).D3()) || this.f82190v2)) {
            super.P7();
            return;
        }
        int i13 = 1;
        this.f82190v2 = true;
        TopBottomGradientView topBottomGradientView = this.J1;
        if (topBottomGradientView != null) {
            topBottomGradientView.d();
        }
        GestaltIconButton gestaltIconButton2 = this.Q1;
        if (gestaltIconButton2 != null && (animate2 = gestaltIconButton2.animate()) != null && (alpha2 = animate2.alpha(0.0f)) != null && (duration2 = alpha2.setDuration(200L)) != null) {
            duration2.start();
        }
        if (this.f82189v1 == i81.e.FLASHLIGHT && (gestaltIconButton = this.M1) != null && (animate = gestaltIconButton.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(200L)) != null) {
            duration.start();
        }
        if (D9() && (kVar = this.P2) != null) {
            kVar.e();
        }
        ca2.e eVar = this.f82176o2;
        Unit unit = null;
        o oVar = eVar instanceof o ? (o) eVar : null;
        if (oVar != null) {
            ca2.e.i(oVar, "close_button_tapped", 0.0f, new androidx.appcompat.widget.q(this, i13), 2);
            unit = Unit.f80348a;
        }
        if (unit == null) {
            super.P7();
        }
    }

    @Override // sq0.e, yq0.b0
    public final void Q8(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        super.Q8(adapter);
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHOPPING_BRAND_PACKAGE_GRID_MODULE, new f(this, 4));
        adapter.G(91, new f(this, 5));
    }

    @Override // nl1.d
    public final void R7(Navigation navigation) {
        super.R7(navigation);
        Object i03 = navigation != null ? navigation.i0("com.pinterest.PINCH_TO_ZOOM_TRANSITION") : null;
        PinchToZoomTransitionContext pinchToZoomTransitionContext = i03 instanceof PinchToZoomTransitionContext ? (PinchToZoomTransitionContext) i03 : null;
        if (pinchToZoomTransitionContext != null) {
            A9(pinchToZoomTransitionContext);
        } else {
            pinchToZoomTransitionContext = null;
        }
        this.f82183s1 = pinchToZoomTransitionContext;
        String v03 = navigation != null ? navigation.v0("com.pinterest.EXTRA_PIN_ID") : null;
        if (v03 == null) {
            return;
        }
        this.f82193x1 = navigation.S("com.pinterest.EXTRA_IS_DEEPLINK", false);
        if (this.f82183s1 == null && j1.U0(v03) && this.f82193x1) {
            PinchToZoomTransitionContext pinchToZoomTransitionContext2 = new PinchToZoomTransitionContext(v03, null, 1.0f, 0, r9, r9, false, null, null, true, false, false, false, false, false, 15744);
            A9(pinchToZoomTransitionContext2);
            this.f82183s1 = pinchToZoomTransitionContext2;
        }
    }

    @Override // sq0.e
    public final qa2.n T8(nr0.b pinActionHandler) {
        Intrinsics.checkNotNullParameter(pinActionHandler, "pinActionHandler");
        nx.d0 s73 = s7();
        y32.f fVar = y32.f.PINCH_TO_ZOOM;
        int i13 = eo1.b.color_themed_background_elevation_floating;
        if (this.X0 == null) {
            Intrinsics.r("educationHelper");
            throw null;
        }
        qa2.n a13 = new i81.a(s73, fVar, pinActionHandler, zf0.f.h(), i13).a(new yk1.a(getResources(), requireContext().getTheme()));
        wa2.i iVar = a13.f103320a;
        iVar.Y = true;
        iVar.V = v9();
        return a13;
    }

    @Override // ib2.d
    public final void V5() {
        s71.q qVar = this.f82181r1;
        if (qVar == null) {
            Intrinsics.r("flashlightPinalytics");
            throw null;
        }
        nx.d0 d0Var = qVar.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        nx.d0.v(d0Var, f1.FLASHLIGHT_CROPPER_RESIZE, this.f82185t1, false, 12);
    }

    @Override // yk1.k
    public final yk1.m V7() {
        String f47924a;
        String g23;
        String g24;
        String g25;
        String str = this.f82185t1;
        String r93 = r9();
        f0 f0Var = this.S0;
        if (f0Var == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        PinchToZoomTransitionContext pinchToZoomTransitionContext = this.f82183s1;
        this.f82181r1 = new s71.q(str, r93, f0Var, pinchToZoomTransitionContext != null ? pinchToZoomTransitionContext.getF47937n() : false, getF111142k1());
        i81.f fVar = this.f82191w1;
        i81.f fVar2 = i81.f.P2Z_UNIFIED_FEED;
        this.f82195y1 = fVar == fVar2 || v9();
        O9(m9());
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        Context context = kb0.a.f79058b;
        oa oaVar = (oa) ((wk1.a) cb.e(wk1.a.class));
        wk1.b bVar = new wk1.b(new yk1.a(requireContext.getResources(), requireContext.getTheme()), oaVar.u2(), ((uk1.a) oaVar.x2()).g(), oaVar.F2(), oaVar.m2(), oaVar.o2(), oaVar.n2(), oaVar.S2());
        bVar.d(W8());
        s71.q qVar = this.f82181r1;
        if (qVar == null) {
            Intrinsics.r("flashlightPinalytics");
            throw null;
        }
        bVar.g(qVar);
        i2 i2Var = this.R0;
        if (i2Var == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        bVar.f(i2Var);
        wk1.c a13 = bVar.a();
        Navigation navigation = this.I;
        String str2 = (navigation == null || (g25 = navigation.g2("search_query", "")) == null) ? "" : g25;
        Navigation navigation2 = this.I;
        String str3 = (navigation2 == null || (g24 = navigation2.g2("source", "")) == null) ? "" : g24;
        int i13 = d.f82119a[this.f82189v1.ordinal()];
        if (i13 == 1) {
            fVar2 = i81.f.FLASHLIGHT_UNIFIED_FEED;
        } else {
            if (i13 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (!s9().c()) {
                fVar2 = i81.f.P2Z_ORGANIC;
            }
        }
        this.f82191w1 = fVar2;
        Navigation navigation3 = this.I;
        String str4 = (navigation3 == null || (g23 = navigation3.g2("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", "")) == null) ? "" : g23;
        i2 i2Var2 = this.R0;
        if (i2Var2 == null) {
            Intrinsics.r("pinRepository");
            throw null;
        }
        PinchToZoomTransitionContext pinchToZoomTransitionContext2 = this.f82183s1;
        String str5 = (pinchToZoomTransitionContext2 == null || (f47924a = pinchToZoomTransitionContext2.getF47924a()) == null) ? "" : f47924a;
        PinchToZoomTransitionContext pinchToZoomTransitionContext3 = this.f82183s1;
        Float valueOf = pinchToZoomTransitionContext3 != null ? Float.valueOf(pinchToZoomTransitionContext3.getF47926c()) : null;
        float f13 = this.f82164i2;
        i81.e eVar = this.f82189v1;
        i81.f fVar3 = this.f82191w1;
        boolean v93 = v9();
        boolean x93 = x9();
        boolean D9 = D9();
        float f14 = hf0.b.f69002b;
        float f15 = hf0.b.f69003c;
        w81.d dVar = this.L2;
        String r94 = r9();
        boolean z13 = this.f82197z1;
        nr0.m mVar = this.W0;
        if (mVar == null) {
            Intrinsics.r("dynamicGridViewBinderDelegateFactory");
            throw null;
        }
        f0 f0Var2 = this.S0;
        if (f0Var2 == null) {
            Intrinsics.r("pinalyticsFactory");
            throw null;
        }
        sq0.f d2 = a13.d();
        boolean z14 = this.A1;
        f4 f4Var = this.U0;
        if (f4Var == null) {
            Intrinsics.r("structuredFeedExperiments");
            throw null;
        }
        o4 s93 = s9();
        r rVar = this.Y0;
        if (rVar == null) {
            Intrinsics.r("prefsManagerUser");
            throw null;
        }
        ax.a q93 = q9();
        boolean z15 = this.G2;
        boolean z16 = this.f82193x1;
        PinService pinService = this.f82148a1;
        if (pinService == null) {
            Intrinsics.r("pinService");
            throw null;
        }
        ni0.e eVar2 = this.f82150b1;
        if (eVar2 == null) {
            Intrinsics.r("adsCarouselPresenterFactory");
            throw null;
        }
        k81.l lVar = new k81.l(a13, i2Var2, str5, valueOf, f13, eVar, fVar3, v93, x93, D9, f14, f15, dVar, r94, this.f82178p2, z13, q93, z15, z16, pinService, s93, str4, f4Var, mVar, f0Var2, d2, z14, str2, str3, rVar, eVar2);
        this.f82163i1 = lVar.z3();
        this.f82165j1 = lVar.x3();
        this.f82180q2 = lVar;
        this.f82178p2.d(lVar);
        return lVar;
    }

    @Override // sq0.e
    /* renamed from: a9 */
    public final String getE2() {
        return "flashlight";
    }

    @Override // yq0.t
    public final se0.c f8() {
        return this.f139735i0;
    }

    @Override // uk1.c
    /* renamed from: getViewParameterType */
    public final a4 getF111142k1() {
        if (this.A1) {
            return a4.SHOPPING_STELA_PRODUCTS_FEED;
        }
        int i13 = d.f82119a[this.f82189v1.ordinal()];
        if (i13 == 1) {
            return a4.PIN_FLASHLIGHT_RESULTS;
        }
        if (i13 == 2) {
            return a4.FLASHLIGHT_PINCH_TO_ZOOM;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType */
    public final d4 getK0() {
        int i13 = d.f82119a[this.f82189v1.ordinal()];
        if (i13 == 1) {
            return d4.FLASHLIGHT;
        }
        if (i13 == 2) {
            return d4.PINCH_TO_ZOOM;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void k9() {
        com.pinterest.feature.search.visual.cropper.m mVar;
        f91.b bVar = this.E1;
        if (bVar != null && bVar.getParent() == null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
            float f13 = this.f82164i2;
            int i13 = this.f82158f2;
            s71.q qVar = this.f82181r1;
            if (qVar == null) {
                Intrinsics.r("flashlightPinalytics");
                throw null;
            }
            uj2.q p73 = p7();
            boolean z13 = this.f82189v1 == i81.e.FLASHLIGHT;
            PinchToZoomTransitionContext pinchToZoomTransitionContext = this.f82183s1;
            com.pinterest.feature.search.visual.cropper.m mVar2 = new com.pinterest.feature.search.visual.cropper.m(requireContext, bVar, f13, i13, this, qVar, p73, this, z13, pinchToZoomTransitionContext != null ? pinchToZoomTransitionContext.getF47926c() : 1.0f, Integer.valueOf(getResources().getDimensionPixelSize(uc2.b.flashlight_top_navigation_button_size) / 2), !this.G2, x9());
            this.K1 = mVar2;
            FrameLayout frameLayout = this.D1;
            if (frameLayout == null) {
                Intrinsics.r("zoomableImageRootContainer");
                throw null;
            }
            frameLayout.addView(mVar2, -1, y9());
            RectF rectF = this.f82174n2;
            if (rectF != null && (mVar = this.K1) != null) {
                mVar.m(rectF);
            }
            GestaltIconButton gestaltIconButton = this.O1;
            if (gestaltIconButton != null) {
                gestaltIconButton.bringToFront();
            }
            GestaltIconButton gestaltIconButton2 = this.P1;
            if (gestaltIconButton2 != null) {
                gestaltIconButton2.bringToFront();
            }
            TopBottomGradientView topBottomGradientView = this.J1;
            if (topBottomGradientView != null) {
                topBottomGradientView.bringToFront();
            }
        }
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(v9() ? uc2.f.fragment_visual_search : uc2.f.fragment_unified_ptz_flashlight, uc2.d.bottom_sheet_recycler_view);
        eVar.b(uc2.d.bottom_sheet_loading_layout);
        return eVar;
    }

    public final float m9() {
        this.f82160g2 = this.f82183s1 != null ? r0.getF47929f() : this.f82153c2;
        PinchToZoomTransitionContext pinchToZoomTransitionContext = this.f82183s1;
        Float valueOf = pinchToZoomTransitionContext != null ? Float.valueOf(pinchToZoomTransitionContext.getF47926c()) : null;
        PinchToZoomTransitionContext pinchToZoomTransitionContext2 = this.f82183s1;
        Float f47932i = pinchToZoomTransitionContext2 != null ? pinchToZoomTransitionContext2.getF47932i() : null;
        if (valueOf == null || f47932i == null) {
            return 0.0f;
        }
        float floatValue = valueOf.floatValue() * this.f82160g2;
        return f47932i.floatValue() < 0.0f ? f47932i.floatValue() + floatValue : floatValue;
    }

    public final void n9(boolean z13) {
        View c13;
        float f13;
        o80.j A;
        f91.b bVar = this.E1;
        if (bVar != null) {
            float B = bVar.B();
            f91.b bVar2 = this.E1;
            if (bVar2 != null) {
                float z14 = bVar2.z();
                ca2.e eVar = this.f82176o2;
                if (eVar == null || (c13 = eVar.c()) == null) {
                    return;
                }
                float y13 = c13.getY();
                Float f14 = this.f82198z2;
                if (f14 != null) {
                    float floatValue = f14.floatValue();
                    if (z13) {
                        Float f15 = this.A2;
                        if (f15 == null) {
                            return;
                        } else {
                            f13 = f15.floatValue();
                        }
                    } else {
                        f13 = this.f82153c2 - this.f82184s2;
                    }
                    float f16 = f13 - this.f82186t2;
                    float f17 = f16 == 0.0f ? 0.0f : (f13 - y13) / f16;
                    float f18 = 2;
                    float min = Math.min(this.f82162h2, (this.f82164i2 - z14) / f18);
                    float f19 = min + z14;
                    float f23 = this.f82164i2;
                    if (f19 > f23) {
                        min = (f23 - z14) / f18;
                    }
                    float f24 = floatValue - ((floatValue - min) * f17);
                    float f25 = f24 - B;
                    if (f24 >= floatValue || B < 0.0f) {
                        return;
                    }
                    f91.b bVar3 = this.E1;
                    if (bVar3 != null && (A = bVar3.A()) != null) {
                        A.d(f25);
                    }
                    i81.c cVar = this.f82177p1;
                    if (cVar != null) {
                        ((k81.l) cVar).W3(f25);
                    }
                }
            }
        }
    }

    public final void o9() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        View view = this.X1;
        if (view == null || (animate = view.animate()) == null || (alpha = animate.alpha(0.0f)) == null || (duration = alpha.setDuration(50L)) == null) {
            return;
        }
        duration.start();
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String g23;
        String g24;
        String g25;
        if (s9().b()) {
            Navigation navigation = this.I;
            String str = (navigation == null || (g25 = navigation.g2("search_query", "")) == null) ? "" : g25;
            Navigation navigation2 = this.I;
            String str2 = (navigation2 == null || (g24 = navigation2.g2("source", "")) == null) ? "" : g24;
            Navigation navigation3 = this.I;
            String str3 = (navigation3 == null || (g23 = navigation3.g2("com.pinterest.STRUCTURED_FEED_REQUEST_PARAMS", "")) == null) ? "" : g23;
            String str4 = this.f82185t1;
            String str5 = str4 == null ? "" : str4;
            f4 f4Var = this.U0;
            if (f4Var == null) {
                Intrinsics.r("structuredFeedExperiments");
                throw null;
            }
            i81.e eVar = i81.e.FLASHLIGHT;
            String k13 = a.a.k("visual_search/flashlight/pin/", str4, "/unified/");
            boolean v93 = v9();
            r rVar = this.Y0;
            if (rVar == null) {
                Intrinsics.r("prefsManagerUser");
                throw null;
            }
            j81.e eVar2 = new j81.e(str5, null, null, null, null, null, null, null, null, f4Var, eVar, false, str, str2, k13, str3, v93, rVar, true, 510);
            eVar2.u0(Float.valueOf(0.1f));
            eVar2.v0(Float.valueOf(0.1f));
            eVar2.s0(Float.valueOf(0.79999995f));
            eVar2.h0(Float.valueOf(0.79999995f));
            eVar2.r0(u.VISUAL_SOURCE_FLASHLIGHT);
            eVar2.g0(Integer.valueOf(g42.c.DEFAULT_CROP.getValue()));
            eVar2.n();
        }
        this.f82153c2 = hf0.b.f69003c;
        PinchToZoomTransitionContext pinchToZoomTransitionContext = bundle != null ? (PinchToZoomTransitionContext) bundle.getParcelable("transition_context") : null;
        if (pinchToZoomTransitionContext != null) {
            this.f82183s1 = pinchToZoomTransitionContext;
            A9(pinchToZoomTransitionContext);
            O9(m9());
        }
        super.onCreate(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x0378  */
    @Override // yq0.t, nl1.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r24, android.view.ViewGroup r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 1224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l81.l.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ca2.e eVar = this.f82176o2;
        if (eVar != null) {
            eVar.l();
        }
        super.onDestroyView();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onPause() {
        pe.i.p1(this, false, 3);
        f7().d(new ls1.l(ls1.k.ENABLE));
        MaskedWebImageView t93 = t9();
        if (t93 != null) {
            t93.h3();
        }
        super.onPause();
    }

    @Override // nl1.d, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        pe.i.Y0(this);
        f7().d(new ls1.l(ls1.k.DISABLE));
        MaskedWebImageView t93 = t9();
        if (t93 != null) {
            t93.g3();
        }
    }

    @Override // sq0.e, yq0.t, yk1.k, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        PinchToZoomTransitionContext pinchToZoomTransitionContext = this.f82183s1;
        if (pinchToZoomTransitionContext != null) {
            outState.putParcelable("transition_context", pinchToZoomTransitionContext);
        }
    }

    @Override // sq0.e, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        pr0.g gVar = this.M2;
        if (gVar != null) {
            addRecyclerViewEventListener(gVar);
        }
    }

    public final void p9() {
        ViewPropertyAnimator animate;
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator duration;
        GestaltText gestaltText = this.T1;
        if (gestaltText != null && (animate = gestaltText.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(200L)) != null) {
            duration.start();
        }
        TopBottomGradientView topBottomGradientView = this.J1;
        if (topBottomGradientView != null) {
            topBottomGradientView.c();
        }
    }

    public final ax.a q9() {
        ax.a aVar = this.Z0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("adsStlCache");
        throw null;
    }

    @Override // ib2.d
    public final void r2(RectF cropBounds) {
        f91.b bVar;
        Intrinsics.checkNotNullParameter(cropBounds, "cropBounds");
        i81.c cVar = this.f82177p1;
        if (cVar != null) {
            ((k81.l) cVar).r2(cropBounds);
        }
        if (x9() || (bVar = this.E1) == null) {
            return;
        }
        bVar.G(cropBounds);
    }

    public final String r9() {
        return this.A1 ? "closeup_dot" : this.f82189v1 == i81.e.FLASHLIGHT ? "flashlight" : "";
    }

    public final o4 s9() {
        o4 o4Var = this.V0;
        if (o4Var != null) {
            return o4Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    public final MaskedWebImageView t9() {
        f91.b bVar = this.E1;
        WebImageView j13 = bVar != null ? bVar.j() : null;
        if (j13 instanceof MaskedWebImageView) {
            return (MaskedWebImageView) j13;
        }
        return null;
    }

    public final float u9() {
        int i13 = d.f82120b[this.f82191w1.ordinal()];
        float f13 = 0.35f;
        if (i13 != 1) {
            if (i13 == 2) {
                f13 = 0.23f;
            } else if (i13 != 3) {
                if (i13 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                f13 = 0.3f;
            }
        }
        return (1 - f13) * this.f82153c2;
    }

    @Override // nl1.d
    public final y32.f v7() {
        return y32.f.PINCH_TO_ZOOM;
    }

    public final boolean v9() {
        return ((Boolean) this.f82167k1.getValue()).booleanValue();
    }

    public final boolean w9() {
        return ((Boolean) this.f82169l1.getValue()).booleanValue();
    }

    public final boolean x9() {
        return ((Boolean) this.f82171m1.getValue()).booleanValue();
    }

    public final int y9() {
        int i13 = this.f82172m2;
        if (i13 > this.f82153c2) {
            return i13;
        }
        return -1;
    }

    public final void z9() {
        if (v9() && D9() && this.P2 == null) {
            int i13 = uc2.d.descriptors_one_bar_container;
            View view = this.B1;
            if (view == null) {
                Intrinsics.r("mainView");
                throw null;
            }
            if (view.findViewById(i13) == null) {
                return;
            }
            Context requireContext = requireContext();
            View view2 = this.B1;
            if (view2 == null) {
                Intrinsics.r("mainView");
                throw null;
            }
            ov1.f fVar = new ov1.f(i13, null, 6);
            String str = this.f82185t1;
            if (str == null) {
                str = "";
            }
            uk1.d dVar = new uk1.d(new e3.a(5), ((nx.m) b7()).a(new c(this, 1)), str);
            uj2.q p73 = p7();
            w f73 = f7();
            int hashCode = hashCode();
            k2 k2Var = this.f82154d1;
            if (k2Var == null) {
                Intrinsics.r("oneBarLibraryExperiments");
                throw null;
            }
            vy.m mVar = this.f82155e1;
            if (mVar == null) {
                Intrinsics.r("analyticsApi");
                throw null;
            }
            b60.b activeUserManager = getActiveUserManager();
            q qVar = this.f82157f1;
            if (qVar == null) {
                Intrinsics.r("prefsManagerPersisted");
                throw null;
            }
            ov1.e eVar = ov1.e.SINGLE_DESELECTABLE;
            de1.r0 r0Var = de1.r0.FLASHLIGHT;
            Integer num = this.f82192w2;
            int intValue = num != null ? num.intValue() : bs1.c.C(this, eo1.b.color_themed_background_default);
            int i14 = uc2.d.flashlight_coordinator_layout;
            Intrinsics.f(requireContext);
            ov1.k kVar = new ov1.k(requireContext, view2, fVar, dVar, p73, f73, false, hashCode, mVar, activeUserManager, qVar, k2Var, eVar, false, r0Var, true, Integer.valueOf(intValue), Integer.valueOf(i14));
            int C = bs1.c.C(this, eo1.b.color_themed_transparent);
            kVar.i(C);
            kVar.f(C);
            kVar.j(vc2.a.one_bar_descriptor_item_height + eo1.c.sema_space_800);
            I9(new b0(h61.h.PINS, "", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -4, 2097151));
            k81.e eVar2 = this.f82165j1;
            if (eVar2 != null) {
                kVar.k(eVar2);
            }
            this.P2 = kVar;
        }
    }
}
