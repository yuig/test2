package qa2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.ep0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.ro0;
import com.pinterest.api.model.uo0;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.video.core.view.PinterestVideoView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ni1.o2;
import ni1.t2;

/* loaded from: classes4.dex */
public final class k1 extends lu.a0 implements ar0.d, f0, y92.g, c0, nx.v {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f103281v = 0;

    /* renamed from: d, reason: collision with root package name */
    public final wa2.m f103282d;

    /* renamed from: e, reason: collision with root package name */
    public m60.w f103283e;

    /* renamed from: f, reason: collision with root package name */
    public j0 f103284f;

    /* renamed from: g, reason: collision with root package name */
    public t2 f103285g;

    /* renamed from: h, reason: collision with root package name */
    public ni1.d0 f103286h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f103287i;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f103288j;

    /* renamed from: k, reason: collision with root package name */
    public final int f103289k;

    /* renamed from: l, reason: collision with root package name */
    public f30 f103290l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f103291m;

    /* renamed from: n, reason: collision with root package name */
    public final pg1.c f103292n;

    /* renamed from: o, reason: collision with root package name */
    public e21.n f103293o;

    /* renamed from: p, reason: collision with root package name */
    public final int f103294p;

    /* renamed from: q, reason: collision with root package name */
    public final j1 f103295q;

    /* renamed from: r, reason: collision with root package name */
    public final i1 f103296r;

    /* renamed from: s, reason: collision with root package name */
    public final ti1.f f103297s;

    /* renamed from: t, reason: collision with root package name */
    public final o2 f103298t;

    /* renamed from: u, reason: collision with root package name */
    public final xk2.v f103299u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(Context context, nx.d0 pinalytics, wa2.m pinFeatureConfig, ao2.j0 scope) {
        super(context, 15);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        this.f103282d = pinFeatureConfig;
        pg1.c cVar = new pg1.c(context, pinalytics);
        this.f103292n = cVar;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int L = pk.a0.L(resources, 4.0f);
        this.f103294p = L;
        this.f103295q = new j1(this);
        this.f103296r = new i1(this);
        this.f103299u = xk2.m.b(new et1.r0(15, this, pinalytics));
        j0 j0Var = this.f103284f;
        if (j0Var == null) {
            Intrinsics.r("pinGridCellFactory");
            throw null;
        }
        t2 t2Var = this.f103285g;
        if (t2Var == null) {
            Intrinsics.r("pinRepViewModelFactory");
            throw null;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        SbaPinRep sbaPinRep = (SbaPinRep) ((d) j0Var).a(context2, true);
        d0 d0Var = pinFeatureConfig.f128855d0;
        o2 a13 = d0Var != null ? t2.a(t2Var, scope, new zw.a(d0Var), 6) : t2.a(t2Var, scope, null, 14);
        sbaPinRep.setPinalytics(pinalytics);
        sbaPinRep.applyUnMigratedPFCFields(pinFeatureConfig.f128875n0, pinFeatureConfig.f128861g0, pinFeatureConfig.f128855d0, pinFeatureConfig.f128879p0, pinFeatureConfig.M);
        sbaPinRep.setEventIntake(a13.c());
        kotlin.jvm.internal.j.z(scope, null, null, new g1(a13, sbaPinRep, null), 3);
        this.f103297s = sbaPinRep;
        this.f103298t = a13;
        sbaPinRep.addToView(this);
        Paint paint = new Paint();
        this.f103288j = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        Context context3 = getContext();
        int i13 = eo1.b.color_themed_base_red_300;
        Object obj = d5.a.f53679a;
        paint.setColor(context3.getColor(i13));
        paint.setStrokeWidth(L);
        this.f103287i = new RectF();
        this.f103289k = (int) getResources().getDimension(eo1.c.lego_corner_radius_small);
        setWillNotDraw(false);
        addView(cVar);
    }

    public static final void g(k1 k1Var, int i13) {
        wa2.a pinDrawable;
        if (k1Var.f103293o == null) {
            Context context = k1Var.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            e21.n nVar = new e21.n(context, i13);
            k1Var.f103293o = nVar;
            k1Var.addView(nVar);
        }
        e21.n nVar2 = k1Var.f103293o;
        if (nVar2 == null || (pinDrawable = k1Var.f103297s.getPinDrawable()) == null) {
            return;
        }
        nVar2.setLayoutParams(new FrameLayout.LayoutParams(pinDrawable.f128841d, pinDrawable.f128842e));
        nVar2.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.f103291m) {
            RectF rectF = this.f103287i;
            Paint paint = this.f103288j;
            float f13 = this.f103289k;
            canvas.drawRoundRect(rectF, f13, f13, paint);
        }
    }

    @Override // qa2.f0
    public final h0 getInternalCell() {
        return this.f103297s;
    }

    @Override // ar0.d
    /* renamed from: isDragAndDropEnabledForItem */
    public final boolean getF45303h() {
        return false;
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        return this.f103297s.markImpressionEnd();
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        return this.f103297s.markImpressionStart();
    }

    @Override // qa2.c0
    public final void onAttached() {
        this.f103297s.onAttached();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m60.w wVar = this.f103283e;
        if (wVar != null) {
            wVar.h(this.f103296r);
        } else {
            Intrinsics.r("eventManager");
            throw null;
        }
    }

    @Override // qa2.c0
    public final void onDeactivated() {
        this.f103297s.onDeactivated();
    }

    @Override // qa2.c0
    public final void onDetached() {
        this.f103297s.onDetached();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m60.w wVar = this.f103283e;
        if (wVar == null) {
            Intrinsics.r("eventManager");
            throw null;
        }
        wVar.j(this.f103296r);
        super.onDetachedFromWindow();
    }

    @Override // qa2.c0
    public final void onInitialized() {
        this.f103297s.onInitialized();
    }

    @Override // ar0.d
    public final void onItemDragEnd(int i13) {
        this.f103298t.c().a(new ni1.k1(i13));
    }

    @Override // ar0.d
    public final void onItemDragStart() {
        this.f103298t.c().a(ni1.l1.f90735a);
        this.f103291m = true;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int L = pk.a0.L(resources, 6.0f);
        setPaddingRelative(L, L, L, L);
        invalidate();
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        RectF rectF = this.f103287i;
        int i15 = this.f103294p;
        rectF.set(i15, i15, getMeasuredWidth() - i15, getMeasuredHeight() - i15);
    }

    @Override // qa2.c0
    public final void onScrollStarted() {
        this.f103297s.onScrollStarted();
    }

    @Override // qa2.f0, y92.i
    public final void onViewRecycled() {
        super.onViewRecycled();
        this.f103292n.onViewRecycled();
    }

    @Override // y92.g
    public final boolean resizable() {
        return false;
    }

    @Override // qa2.e0
    public final void setPin(f30 pin, int i13) {
        List t13;
        uo0 uo0Var;
        Unit unit;
        String c13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        this.f103290l = pin;
        o2 o2Var = this.f103298t;
        u50.r c14 = o2Var.c();
        pg1.c cVar = this.f103292n;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        cVar.f100113w = c14;
        cVar.f100112v = pin;
        cVar.f100111u = n60.o.B(pin, "getIsPromoted(...)");
        cVar.D.clear();
        cVar.E.clear();
        cVar.F.clear();
        cVar.G.clear();
        ArrayList arrayList = cVar.A;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            k3.J1((TextView) it.next());
        }
        arrayList.clear();
        cVar.H = null;
        cVar.C = false;
        PinterestVideoView pinterestVideoView = cVar.f100116z;
        pinterestVideoView.K0.loadUrl(bs1.c.B0(pin));
        dl0 v63 = pin.v6();
        if (v63 != null && (t13 = v63.t()) != null && (uo0Var = (uo0) t13.get(0)) != null) {
            cVar.K = a.a.C(pin.getUid(), "-0");
            pinterestVideoView.F0 = pin.getUid();
            List o13 = uo0Var.o();
            if (o13 != null) {
                Iterator it2 = o13.iterator();
                while (it2.hasNext()) {
                    ((ro0) it2.next()).a(cVar.L);
                }
            }
            if (bs1.c.o1(cVar.B)) {
                HashMap hashMap = new HashMap();
                hashMap.put("is_my_pin", String.valueOf(rl2.g0.W(pin)));
                hashMap.put("is_closeup", "false");
                cVar.f100100j.g(h32.f1.IDEA_PIN_VIDEO_STILL_PROCESSING_DISPLAYED, pin.getUid(), hashMap, false);
            }
            ep0 u13 = uo0Var.u();
            if (u13 == null || (c13 = u13.c()) == null) {
                unit = null;
            } else {
                cVar.k(Color.parseColor(c13));
                unit = Unit.f80348a;
            }
            if (unit == null) {
                cVar.k(0);
            }
            if (((es.c) cVar.T()).U(pin)) {
                pinterestVideoView.G0 = false;
                pinterestVideoView.u0(new ps.b(pin, cVar.f100100j, pinterestVideoView, new ed1.m(c14, pinterestVideoView, cVar, 11), new ca0.j0(c14, 3)));
                pinterestVideoView.N0 = new px0.g(pin, cVar, c14, 17);
            } else {
                pinterestVideoView.u0(new pg1.a(0, cVar, c14));
            }
        }
        ti1.f fVar = this.f103297s;
        fVar.setPinVideoGridCellControlsListener(cVar);
        fVar.bindDisplayState(o2Var.b(((ni1.c0) this.f103299u.getValue()).a(i13, pin), false));
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        wa2.a pinDrawable = fVar.getPinDrawable();
        yi1.p pVar = pinDrawable instanceof yi1.p ? (yi1.p) pinDrawable : null;
        if (pVar != null) {
            j1 listener = this.f103295q;
            Intrinsics.checkNotNullParameter(listener, "listener");
            pVar.L = listener;
        }
        dl0 v64 = pin.v6();
        if (v64 == null || !Intrinsics.d(v64.o(), Boolean.TRUE)) {
            return;
        }
        o2Var.c().a(new ni1.e1(true, false));
    }

    @Override // android.view.View
    public final void setTag(int i13, Object obj) {
        super.setTag(i13, obj);
        this.f103297s.setTag(i13, obj);
    }

    @Override // y92.g
    /* renamed from: uid */
    public final String getUniqueId() {
        f30 f30Var = this.f103290l;
        if (f30Var == null) {
            Intrinsics.r("pin");
            throw null;
        }
        String uid = f30Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return uid;
    }
}
