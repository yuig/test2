package v42;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.u;
import com.pinterest.api.model.f30;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.ui.grid.LegoPinGridCell;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import h32.z1;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kh2.g3;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.l3;
import lh0.z0;
import lh0.z3;
import net.quikkly.android.utils.BitmapUtils;
import ni1.h1;
import ni1.k1;
import ni1.l1;
import nx.c0;
import nx.q;
import nx.v;
import q5.v0;
import qa2.d0;
import qa2.f0;
import so.jb;
import ti1.o;
import ti1.r;
import u50.h0;
import wa2.s;
import yi1.p;

/* loaded from: classes4.dex */
public final class k extends f implements f0, ar0.d, v, r, d0 {
    public static final /* synthetic */ int P = 0;
    public final LegoPinGridCell A;
    public final ImageView B;
    public final GestaltIconButton C;
    public final GestaltIconButton D;
    public final RoundedCornersLayout E;
    public final int F;
    public final l3 G;
    public final boolean H;
    public final o I;

    /* renamed from: J, reason: collision with root package name */
    public d0 f124150J;
    public final Drawable K;
    public final Drawable L;
    public final s81.g M;
    public final int N;
    public final LegoPinGridCell O;

    /* renamed from: r, reason: collision with root package name */
    public wa2.m f124151r;

    /* renamed from: s, reason: collision with root package name */
    public final WeakReference f124152s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f124153t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f124154u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f124155v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f124156w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f124157x;

    /* renamed from: y, reason: collision with root package name */
    public HashMap f124158y;

    /* renamed from: z, reason: collision with root package name */
    public final h f124159z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, nx.d0 pinalytics, u scope, wa2.m pinFeatureConfig, WeakReference weakReference, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, h hVar, int i13) {
        super(context, null);
        Context context2;
        GestaltIconButton gestaltIconButton;
        WeakReference weakReference2 = (i13 & 16) != 0 ? null : weakReference;
        boolean z18 = (i13 & 32) != 0 ? false : z13;
        boolean z19 = (i13 & 64) != 0 ? false : z14;
        boolean z23 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? true : z15;
        boolean z24 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? true : z16;
        boolean z25 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? false : z17;
        nx.d impressionAuxData = bs1.c.p(new Pair[0]);
        h hVar2 = (i13 & 2048) != 0 ? null : hVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(impressionAuxData, "impressionAuxData");
        if (!this.f124141q) {
            this.f124141q = true;
            jb jbVar = (jb) ((l) generatedComponent());
            jbVar.getClass();
            this.G = new l3((z0) jbVar.f113483a.D0.get());
        }
        this.f124151r = pinFeatureConfig;
        this.f124152s = weakReference2;
        this.f124153t = z18;
        this.f124154u = z19;
        this.f124155v = z23;
        this.f124156w = z24;
        this.f124157x = z25;
        this.f124158y = impressionAuxData;
        this.f124159z = hVar2;
        l3 l3Var = this.G;
        if (l3Var == null) {
            Intrinsics.r("experiment");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) l3Var.f83418a;
        this.H = g1Var.o("android_pgc_sba_select_pins_grid_cell", "enabled", z3Var) || g1Var.l("android_pgc_sba_select_pins_grid_cell");
        o oVar = new o(context, pinalytics, scope, null, this, null, this, RecyclerViewTypes.VIEW_TYPE_SHOPPING_COLOR_LIST_FILTER_ITEM);
        this.I = oVar;
        this.f124150J = this.f124151r.f128855d0;
        em1.b bVar = em1.b.CHECKED;
        h0 h0Var = h0.f120562a;
        this.K = oe.f.r(context, new em1.d(bVar, null, null, h0Var, null, 0, false, 1014));
        Drawable r13 = oe.f.r(context, new em1.d(null, null, null, h0Var, null, 0, false, 1015));
        this.L = r13;
        this.M = new s81.g(this, 15);
        int W = bs1.c.W(this, eo1.c.space_200);
        this.N = W;
        oVar.b();
        ti1.e a13 = oVar.a();
        a13.getView().setImportantForAccessibility(4);
        qa2.b a14 = a13.a();
        this.A = (LegoPinGridCell) a14;
        bk.l lVar = new bk.l();
        bk.l lVar2 = new bk.l();
        bk.l lVar3 = new bk.l();
        bk.l lVar4 = new bk.l();
        bk.a aVar = new bk.a(0.0f);
        bk.a aVar2 = new bk.a(0.0f);
        boolean z26 = z19;
        bk.a aVar3 = new bk.a(0.0f);
        boolean z27 = z18;
        bk.a aVar4 = new bk.a(0.0f);
        bk.f fVar = new bk.f();
        bk.f fVar2 = new bk.f();
        bk.f fVar3 = new bk.f();
        h hVar3 = hVar2;
        bk.f fVar4 = new bk.f();
        float W2 = bs1.c.W(this, eo1.c.image_corner_radius_xl);
        bk.m mVar = new bk.m();
        mVar.f23078a = lVar;
        mVar.f23079b = lVar2;
        mVar.f23080c = lVar3;
        mVar.f23081d = lVar4;
        mVar.f23082e = aVar;
        mVar.f23083f = aVar2;
        mVar.f23084g = aVar3;
        mVar.f23085h = aVar4;
        mVar.f23086i = fVar;
        mVar.f23087j = fVar2;
        mVar.f23088k = fVar3;
        mVar.f23089l = fVar4;
        mVar.c(W2);
        Y0(mVar.a());
        l(0.0f);
        a14.setPinalytics(pinalytics);
        int W3 = (W * 2) + bs1.c.W(this, s42.g.lego_board_pin_select_icon_size);
        this.F = W3;
        if (hVar3 != null) {
            context2 = context;
            gestaltIconButton = new GestaltIconButton(context2, hVar3.f124147b);
            gestaltIconButton.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        } else {
            context2 = context;
            gestaltIconButton = null;
        }
        this.C = gestaltIconButton;
        if (gestaltIconButton != null) {
            g3.y(gestaltIconButton, g.f124142j);
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(W3, W3));
        imageView.setPadding(W, W, W, W);
        imageView.setImageDrawable(r13);
        imageView.setElevation(imageView.getResources().getDimension(s42.g.lego_board_pin_select_elevation));
        imageView.setImportantForAccessibility(2);
        this.B = imageView;
        RoundedCornersLayout roundedCornersLayout = new RoundedCornersLayout(context2);
        int i14 = eo1.b.color_black_900;
        Object obj = d5.a.f53679a;
        roundedCornersLayout.a(context2.getColor(i14));
        roundedCornersLayout.setAlpha(0.4f);
        LegoPinGridCell legoPinGridCell = (LegoPinGridCell) a14;
        Intrinsics.checkNotNullParameter(legoPinGridCell, "<this>");
        int i15 = 6;
        ef0.a cornerSettings = new ef0.a(legoPinGridCell.getCornerRadius(), i15);
        Intrinsics.checkNotNullParameter(cornerSettings, "cornerSettings");
        roundedCornersLayout.f44944e = cornerSettings;
        roundedCornersLayout.setVisibility(8);
        this.E = roundedCornersLayout;
        a14.addToView(this);
        addView(roundedCornersLayout);
        if (gestaltIconButton != null) {
            int W4 = bs1.c.W(this, eo1.c.space_100);
            Intrinsics.checkNotNullParameter(this, "<this>");
            s(W4, W4, W4, W4);
            addView(gestaltIconButton);
        } else {
            addView(imageView);
        }
        if (z27) {
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            GestaltIconButton t13 = new GestaltIconButton(i15, context3, (AttributeSet) null).t(g.f124144l);
            yv1.i onTouchDownListener = new yv1.i(this, 18);
            t13.getClass();
            Intrinsics.checkNotNullParameter(onTouchDownListener, "onTouchDownListener");
            t13.f49394z = onTouchDownListener;
            t13.A();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            com.bumptech.glide.c.b1(layoutParams, 0, bs1.c.W(t13, eo1.c.space_200), bs1.c.W(t13, eo1.c.space_300), 0, 9);
            layoutParams.gravity = 8388661;
            t13.setLayoutParams(layoutParams);
            this.D = t13;
            addView(t13);
        }
        if (z26) {
            X(bs1.c.W(this, s42.g.pin_selected_border_width));
            int W5 = bs1.c.W(this, eo1.c.space_100);
            Intrinsics.checkNotNullParameter(this, "<this>");
            s(W5, W5, W5, W5);
        }
        v0.o(this, new kj.d(this, 7));
        this.O = legoPinGridCell;
    }

    public final c0 Y(c0 c0Var) {
        nx.c cVar = c0Var.f92384b;
        q qVar = cVar.f92380b;
        nx.c attributionData = nx.c.a(cVar, new q(qVar != null ? kotlin.collections.z0.j(qVar, this.f124158y) : this.f124158y));
        z1 impression = c0Var.f92383a;
        Intrinsics.checkNotNullParameter(impression, "impression");
        Intrinsics.checkNotNullParameter(attributionData, "attributionData");
        return new c0(impression, attributionData);
    }

    public final void Z(wa2.m pinFeatureConfig) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        o oVar = this.I;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        ti1.e eVar = oVar.f117735i;
        if (eVar == null) {
            Intrinsics.r("innerCell");
            throw null;
        }
        if (eVar instanceof ti1.c) {
            LegoPinGridCellImpl legoPinGridCellImpl = ((ti1.c) eVar).f117707a;
            legoPinGridCellImpl.getClass();
            Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
            legoPinGridCellImpl.s(pinFeatureConfig.e());
        } else if (eVar instanceof ti1.d) {
            ((ti1.d) eVar).f117709b.c().a(new h1(pinFeatureConfig));
        }
        this.f124151r = pinFeatureConfig;
        this.f124150J = pinFeatureConfig.f128855d0;
    }

    public final void a0(boolean z13) {
        ImageView imageView = this.B;
        int i13 = 8;
        boolean z14 = this.f124154u;
        GestaltIconButton gestaltIconButton = this.C;
        boolean z15 = this.f124153t;
        int i14 = 0;
        if (z13) {
            if (z15) {
                GestaltIconButton gestaltIconButton2 = this.D;
                if (gestaltIconButton2 == null) {
                    Intrinsics.r("pinReorderHandleBar");
                    throw null;
                }
                com.bumptech.glide.c.d0(gestaltIconButton2);
            }
            if (gestaltIconButton != null) {
                gestaltIconButton.t(new i(this, 1));
            }
            bs1.c.U1(imageView);
            imageView.setImageDrawable(this.K);
            if (z14) {
                T(bs1.c.B(this, eo1.b.color_background_inverse_base));
            }
        } else {
            if (gestaltIconButton != null) {
                gestaltIconButton.t(new i(this, i14));
            }
            if (z15) {
                bs1.c.X0(imageView);
                GestaltIconButton gestaltIconButton3 = this.D;
                if (gestaltIconButton3 == null) {
                    Intrinsics.r("pinReorderHandleBar");
                    throw null;
                }
                com.bumptech.glide.c.u1(gestaltIconButton3);
            } else {
                imageView.setVisibility(this.f124156w ? 0 : 8);
                imageView.setImageDrawable(this.L);
            }
            if (z14) {
                T(bs1.c.B(this, eo1.b.color_background_default));
            }
        }
        RoundedCornersLayout roundedCornersLayout = this.E;
        if (z13 && this.f124155v) {
            i13 = 0;
        }
        roundedCornersLayout.setVisibility(i13);
        setSelected(z13);
    }

    public final void d0(s42.d listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setOnClickListener(new wq1.a(listener, 19));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.pinterest.ui.grid.LegoPinGridCell, qa2.h0] */
    @Override // qa2.f0
    public final qa2.h0 getInternalCell() {
        return this.O;
    }

    @Override // ar0.d
    /* renamed from: isDragAndDropEnabledForItem */
    public final boolean getF45303h() {
        return this.f124153t;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        c0 markImpressionEnd;
        if (!this.f124157x || (markImpressionEnd = this.A.markImpressionEnd()) == null) {
            return null;
        }
        return Y(markImpressionEnd);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        c0 markImpressionStart;
        if (!this.f124157x || (markImpressionStart = this.A.markImpressionStart()) == null) {
            return null;
        }
        return Y(markImpressionStart);
    }

    @Override // ti1.r
    public final boolean o() {
        return this.H;
    }

    @Override // ar0.d
    public final void onItemDragEnd(int i13) {
        ti1.e eVar = this.I.f117735i;
        if (eVar == null) {
            Intrinsics.r("innerCell");
            throw null;
        }
        if (eVar instanceof ti1.c) {
            ((ti1.c) eVar).f117707a.onItemDragEnd(i13);
        } else if (eVar instanceof ti1.d) {
            ((ti1.d) eVar).f117709b.c().a(new k1(i13));
        }
        L(false);
        l(0.0f);
    }

    @Override // ar0.d
    public final void onItemDragStart() {
        ti1.e eVar = this.I.f117735i;
        if (eVar == null) {
            Intrinsics.r("innerCell");
            throw null;
        }
        if (eVar instanceof ti1.c) {
            ((ti1.c) eVar).f117707a.onItemDragStart();
        } else if (eVar instanceof ti1.d) {
            ((ti1.d) eVar).f117709b.c().a(l1.f90735a);
        }
        L(true);
    }

    @Override // qa2.d0
    public final void onOpenPinCloseup(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        d0 d0Var = this.f124150J;
        if (d0Var != null) {
            d0Var.onOpenPinCloseup(pin);
        }
    }

    @Override // qa2.e0
    public final void setPin(f30 pin, int i13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        o oVar = this.I;
        ti1.e a13 = oVar.a();
        if (a13 instanceof ti1.d) {
            oVar.d(pin, i13, this.f124151r, g.f124143k);
        } else if (a13 instanceof ti1.c) {
            oVar.setPin(pin, i13);
        }
        j receiveOverlayDimensions = new j(2, this, k.class, "updateViewWhenImageLoads", "updateViewWhenImageLoads(II)V", 0);
        Intrinsics.checkNotNullParameter(receiveOverlayDimensions, "receiveOverlayDimensions");
        ti1.e eVar = oVar.f117735i;
        if (eVar == null) {
            Intrinsics.r("innerCell");
            throw null;
        }
        if (eVar instanceof ti1.c) {
            wa2.a T = com.bumptech.glide.d.T(((ti1.c) eVar).f117707a);
            s sVar = T instanceof s ? (s) T : null;
            if (sVar != null) {
                ti1.l listener = new ti1.l(sVar, receiveOverlayDimensions, 0);
                Intrinsics.checkNotNullParameter(listener, "listener");
                sVar.f128913j0 = listener;
            }
        } else if (eVar instanceof ti1.d) {
            wa2.a T2 = com.bumptech.glide.d.T(((ti1.d) eVar).f117708a);
            p pVar = T2 instanceof p ? (p) T2 : null;
            if (pVar != null) {
                ti1.l listener2 = new ti1.l(pVar, receiveOverlayDimensions, 1);
                Intrinsics.checkNotNullParameter(listener2, "listener");
                pVar.L = listener2;
            }
        }
        i onContentDescReady = new i(this, 2);
        Intrinsics.checkNotNullParameter(onContentDescReady, "onContentDescReady");
        ti1.e eVar2 = oVar.f117735i;
        if (eVar2 == null) {
            Intrinsics.r("innerCell");
            throw null;
        }
        if (eVar2 instanceof ti1.c) {
            ((ti1.c) eVar2).f117707a.f52464t0 = onContentDescReady;
        } else {
            if (!(eVar2 instanceof ti1.d)) {
                throw new NoWhenBranchMatchedException();
            }
            onContentDescReady.invoke(((ti1.d) eVar2).f117708a.getContentDescription());
        }
    }
}
