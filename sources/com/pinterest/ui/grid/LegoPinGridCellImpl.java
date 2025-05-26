package com.pinterest.ui.grid;

import a11.n;
import ac2.p1;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LruCache;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import ao2.k2;
import bs.b;
import com.pinterest.api.model.b01;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.cc;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.g;
import com.pinterest.api.model.h01;
import com.pinterest.api.model.l30;
import com.pinterest.api.model.ln;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.we0;
import com.pinterest.api.model.wt;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.wz;
import com.pinterest.api.model.z90;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.repository.pin.PinService;
import df.j1;
import ek1.c2;
import es.t;
import ey.g3;
import h32.b1;
import h32.b2;
import h32.c1;
import h32.e4;
import h32.f1;
import h32.g0;
import h32.i0;
import h32.u0;
import h32.x2;
import h32.y1;
import h32.z1;
import hs.e;
import hs1.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import lh0.a4;
import lh0.j;
import lh0.r2;
import lh0.z0;
import lh0.z3;
import m60.q0;
import m60.r0;
import m60.s0;
import m60.w;
import nx.b0;
import nx.d1;
import org.jetbrains.annotations.NotNull;
import qa2.a0;
import qa2.d0;
import qa2.h;
import qa2.l;
import qa2.o;
import qa2.p;
import qa2.s;
import qa2.x;
import so.fa;
import ua2.a1;
import ua2.c0;
import ua2.e0;
import ua2.f0;
import ua2.g1;
import ua2.h0;
import ua2.h1;
import ua2.k0;
import ua2.l0;
import ua2.n0;
import ua2.o0;
import ua2.p0;
import ua2.t0;
import ua2.u;
import ua2.v0;
import ua2.x0;
import ua2.y;
import wa2.m;
import x02.i2;
import xk2.d;
import xk2.k;
import xk2.r;
import xk2.v;
import y32.f;
import y92.c;

@d
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0002\u0010\u0011B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0014²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002"}, d2 = {"Lcom/pinterest/ui/grid/LegoPinGridCellImpl;", "Lcom/pinterest/ui/grid/LegoPinGridCell;", "Lua2/g1;", "Lua2/h1;", "Lqa2/o;", "Lua2/e0;", "Lua2/a1;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "gi2/b", "qi0/b", "", "hideTitleForAdsTest", "pinGridCellLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class LegoPinGridCellImpl extends h implements g1, h1, o, e0, a1 {
    public static final int Z2 = ViewConfiguration.getTapTimeout();

    /* renamed from: a3, reason: collision with root package name */
    public static final int f52388a3 = ViewConfiguration.getPressedStateDuration();
    public boolean A;
    public d0 A0;
    public zs1.a A1;
    public final k A2;
    public boolean B;
    public c B0;
    public b B1;
    public final k B2;
    public boolean C;
    public f30 C0;
    public es.h C1;
    public final k C2;
    public boolean D;
    public f30 D0;
    public fs.c D1;
    public final k D2;
    public boolean E;
    public z1 E0;
    public z0 E1;
    public final k E2;
    public Integer F;
    public f F0;
    public es.a F1;
    public final k F2;
    public final boolean G;
    public boolean G0;
    public vr.a G1;
    public final x0 G2;
    public boolean H;
    public boolean H0;
    public jv.a H1;
    public final x0 H2;
    public g0 I;
    public boolean I0;
    public kv.a I1;
    public final x0 I2;

    /* renamed from: J, reason: collision with root package name */
    public boolean f52389J;
    public int J0;
    public yr.a J1;
    public final x0 J2;
    public boolean K;
    public int K0;
    public b0 K1;
    public final x0 K2;
    public boolean L;
    public int L0;
    public ur.a L1;
    public final int L2;
    public String M;
    public int M0;
    public q M1;
    public final int M2;
    public Boolean N;
    public int N0;
    public e N1;
    public final x0 N2;
    public boolean O;
    public boolean O0;
    public nm.o O1;
    public final x0 O2;
    public boolean P;
    public qa2.a P0;
    public Integer P1;
    public final k P2;
    public boolean Q;
    public int Q0;
    public Integer Q1;
    public final k Q2;
    public boolean R;
    public bb2.e R0;
    public Float R1;
    public final k R2;
    public boolean S;
    public xj2.c S0;
    public long S1;
    public final k S2;
    public boolean T;
    public xj2.c T0;
    public boolean T1;
    public boolean T2;
    public boolean U;
    public h0 U0;
    public Rect U1;
    public final k U2;
    public boolean V;
    public pi1.b V0;
    public final s V1;
    public wa2.g0 V2;
    public boolean W;
    public tb0.h W0;
    public nx.d0 W1;
    public final n W2;
    public fa X0;
    public HashMap X1;
    public final LegoPinGridCellImpl X2;
    public aa2.a Y0;
    public final int Y1;
    public final boolean Y2;
    public w Z0;
    public final int Z1;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f52390a0;

    /* renamed from: a1, reason: collision with root package name */
    public g3 f52391a1;

    /* renamed from: a2, reason: collision with root package name */
    public final Paint f52392a2;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f52393b0;

    /* renamed from: b1, reason: collision with root package name */
    public d1 f52394b1;

    /* renamed from: b2, reason: collision with root package name */
    public final k f52395b2;

    /* renamed from: c, reason: collision with root package name */
    public m f52396c;

    /* renamed from: c0, reason: collision with root package name */
    public String f52397c0;

    /* renamed from: c1, reason: collision with root package name */
    public m60.q f52398c1;

    /* renamed from: c2, reason: collision with root package name */
    public final k f52399c2;

    /* renamed from: d, reason: collision with root package name */
    public final qa2.d1 f52400d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f52401d0;

    /* renamed from: d1, reason: collision with root package name */
    public r2 f52402d1;
    public final k d2;

    /* renamed from: e, reason: collision with root package name */
    public boolean f52403e;

    /* renamed from: e0, reason: collision with root package name */
    public final int f52404e0;

    /* renamed from: e1, reason: collision with root package name */
    public lh0.d f52405e1;

    /* renamed from: e2, reason: collision with root package name */
    public final k f52406e2;

    /* renamed from: f, reason: collision with root package name */
    public boolean f52407f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f52408f0;

    /* renamed from: f1, reason: collision with root package name */
    public j f52409f1;

    /* renamed from: f2, reason: collision with root package name */
    public final k f52410f2;

    /* renamed from: g, reason: collision with root package name */
    public boolean f52411g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f52412g0;

    /* renamed from: g1, reason: collision with root package name */
    public ip1.b f52413g1;

    /* renamed from: g2, reason: collision with root package name */
    public final k f52414g2;

    /* renamed from: h, reason: collision with root package name */
    public boolean f52415h;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f52416h0;

    /* renamed from: h1, reason: collision with root package name */
    public a11.d f52417h1;

    /* renamed from: h2, reason: collision with root package name */
    public final k f52418h2;

    /* renamed from: i, reason: collision with root package name */
    public boolean f52419i;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f52420i0;

    /* renamed from: i1, reason: collision with root package name */
    public i2 f52421i1;

    /* renamed from: i2, reason: collision with root package name */
    public final k f52422i2;

    /* renamed from: j, reason: collision with root package name */
    public boolean f52423j;

    /* renamed from: j0, reason: collision with root package name */
    public ArrayList f52424j0;

    /* renamed from: j1, reason: collision with root package name */
    public m60.g0 f52425j1;

    /* renamed from: j2, reason: collision with root package name */
    public final k f52426j2;

    /* renamed from: k, reason: collision with root package name */
    public boolean f52427k;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f52428k0;

    /* renamed from: k1, reason: collision with root package name */
    public jq.c f52429k1;

    /* renamed from: k2, reason: collision with root package name */
    public final k f52430k2;

    /* renamed from: l, reason: collision with root package name */
    public boolean f52431l;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f52432l0;

    /* renamed from: l1, reason: collision with root package name */
    public jo1.c f52433l1;

    /* renamed from: l2, reason: collision with root package name */
    public final k f52434l2;

    /* renamed from: m, reason: collision with root package name */
    public boolean f52435m;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f52436m0;

    /* renamed from: m1, reason: collision with root package name */
    public PinService f52437m1;

    /* renamed from: m2, reason: collision with root package name */
    public final k f52438m2;

    /* renamed from: n, reason: collision with root package name */
    public boolean f52439n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f52440n0;

    /* renamed from: n1, reason: collision with root package name */
    public i92.k f52441n1;

    /* renamed from: n2, reason: collision with root package name */
    public final k f52442n2;

    /* renamed from: o, reason: collision with root package name */
    public boolean f52443o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f52444o0;

    /* renamed from: o1, reason: collision with root package name */
    public ps.k f52445o1;

    /* renamed from: o2, reason: collision with root package name */
    public final k f52446o2;

    /* renamed from: p, reason: collision with root package name */
    public boolean f52447p;

    /* renamed from: p0, reason: collision with root package name */
    public int f52448p0;

    /* renamed from: p1, reason: collision with root package name */
    public fv.d f52449p1;

    /* renamed from: p2, reason: collision with root package name */
    public final k f52450p2;

    /* renamed from: q, reason: collision with root package name */
    public boolean f52451q;

    /* renamed from: q0, reason: collision with root package name */
    public vn1.c f52452q0;

    /* renamed from: q1, reason: collision with root package name */
    public qc2.a f52453q1;

    /* renamed from: q2, reason: collision with root package name */
    public final k f52454q2;

    /* renamed from: r, reason: collision with root package name */
    public boolean f52455r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f52456r0;

    /* renamed from: r1, reason: collision with root package name */
    public ni1.d f52457r1;

    /* renamed from: r2, reason: collision with root package name */
    public final k f52458r2;

    /* renamed from: s, reason: collision with root package name */
    public boolean f52459s;

    /* renamed from: s0, reason: collision with root package name */
    public k2 f52460s0;

    /* renamed from: s1, reason: collision with root package name */
    public q12.b f52461s1;

    /* renamed from: s2, reason: collision with root package name */
    public final k f52462s2;

    /* renamed from: t, reason: collision with root package name */
    public boolean f52463t;

    /* renamed from: t0, reason: collision with root package name */
    public Function1 f52464t0;

    /* renamed from: t1, reason: collision with root package name */
    public ac2.m f52465t1;

    /* renamed from: t2, reason: collision with root package name */
    public final k f52466t2;

    /* renamed from: u, reason: collision with root package name */
    public boolean f52467u;

    /* renamed from: u0, reason: collision with root package name */
    public k0 f52468u0;

    /* renamed from: u1, reason: collision with root package name */
    public j80.b f52469u1;

    /* renamed from: u2, reason: collision with root package name */
    public final v0 f52470u2;

    /* renamed from: v, reason: collision with root package name */
    public boolean f52471v;

    /* renamed from: v0, reason: collision with root package name */
    public final v f52472v0;

    /* renamed from: v1, reason: collision with root package name */
    public b60.b f52473v1;

    /* renamed from: v2, reason: collision with root package name */
    public final k f52474v2;

    /* renamed from: w, reason: collision with root package name */
    public boolean f52475w;

    /* renamed from: w0, reason: collision with root package name */
    public final v f52476w0;

    /* renamed from: w1, reason: collision with root package name */
    public oc.c f52477w1;

    /* renamed from: w2, reason: collision with root package name */
    public final k f52478w2;

    /* renamed from: x, reason: collision with root package name */
    public boolean f52479x;

    /* renamed from: x0, reason: collision with root package name */
    public final int f52480x0;

    /* renamed from: x1, reason: collision with root package name */
    public bc2.e f52481x1;

    /* renamed from: x2, reason: collision with root package name */
    public final k f52482x2;

    /* renamed from: y, reason: collision with root package name */
    public boolean f52483y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f52484y0;

    /* renamed from: y1, reason: collision with root package name */
    public xr.a f52485y1;

    /* renamed from: y2, reason: collision with root package name */
    public final k f52486y2;

    /* renamed from: z, reason: collision with root package name */
    public boolean f52487z;

    /* renamed from: z0, reason: collision with root package name */
    public Drawable f52488z0;

    /* renamed from: z1, reason: collision with root package name */
    public p1 f52489z1;

    /* renamed from: z2, reason: collision with root package name */
    public final k f52490z2;

    static {
        new Date(1643673600000L);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoPinGridCellImpl(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        if (getId() == -1) {
            setId(wy1.d.lego_pin_grid_cell_id);
        }
        this.f52396c = new m(-1, -1, 1023, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        this.f52400d = new qa2.d1();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f52403e = j1.Y0(context2);
        this.f52407f = true;
        this.f52411g = true;
        this.f52419i = true;
        this.f52431l = true;
        this.f52439n = true;
        this.f52487z = true;
        this.E = true;
        this.G = true;
        this.L = true;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f52404e0 = j1.Q(context3, 200);
        this.f52424j0 = new ArrayList();
        this.f52448p0 = q0.contextual_bg;
        this.f52452q0 = vn1.c.DEFAULT;
        this.f52472v0 = xk2.m.b(new x(this, 9));
        this.f52476w0 = xk2.m.b(new x(this, 8));
        this.f52480x0 = getContext().getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_small_to_medium);
        this.P0 = qa2.a.UNDEFINED;
        this.Q0 = -1;
        this.T1 = true;
        this.V1 = new s(this);
        nx.d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        this.W1 = a13;
        this.Z1 = getContext().getResources().getDimensionPixelSize(eo1.c.lego_grid_cell_indicator_padding);
        getResources().getDimensionPixelSize(r0.margin_half);
        Paint paint = new Paint();
        Context context4 = getContext();
        int i13 = eo1.b.color_themed_background_default;
        Object obj = d5.a.f53679a;
        paint.setColor(context4.getColor(i13));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f52392a2 = paint;
        setClickable(true);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        c cVar = new c(context5, new qi0.b(this, 4));
        cVar.f138290e = 200;
        this.B0 = cVar;
        int dimensionPixelSize = getResources().getDimensionPixelSize(fk1.c.f62343a);
        this.Y1 = dimensionPixelSize;
        xk2.n nVar = xk2.n.NONE;
        this.f52395b2 = pk2.f.l(this, 4, nVar);
        this.f52399c2 = pk2.f.l(this, 19, nVar);
        this.d2 = pk2.f.l(this, 21, nVar);
        this.f52406e2 = pk2.f.l(this, 12, nVar);
        this.f52410f2 = pk2.f.l(this, 20, nVar);
        this.f52414g2 = pk2.f.v(this, 3, nVar);
        this.f52418h2 = pk2.f.v(this, 0, nVar);
        this.f52422i2 = pk2.f.l(this, 29, nVar);
        this.f52426j2 = pk2.f.l(this, 25, nVar);
        this.f52430k2 = pk2.f.l(this, 28, nVar);
        this.f52434l2 = pk2.f.l(this, 23, nVar);
        this.f52438m2 = pk2.f.l(this, 13, nVar);
        this.f52442n2 = pk2.f.l(this, 11, nVar);
        this.f52446o2 = pk2.f.v(this, 2, nVar);
        this.f52450p2 = pk2.f.v(this, 1, nVar);
        this.f52454q2 = pk2.f.v(this, 17, nVar);
        this.f52458r2 = pk2.f.v(this, 15, nVar);
        this.f52462s2 = pk2.f.v(this, 16, nVar);
        this.f52466t2 = pk2.f.l(this, 7, nVar);
        this.f52470u2 = new v0(this, dimensionPixelSize, this, this, this);
        this.f52474v2 = pk2.f.l(this, 6, nVar);
        this.f52478w2 = pk2.f.l(this, 8, nVar);
        this.f52482x2 = pk2.f.l(this, 10, nVar);
        this.f52486y2 = pk2.f.l(this, 27, nVar);
        this.f52490z2 = pk2.f.l(this, 26, nVar);
        this.A2 = pk2.f.l(this, 24, nVar);
        this.B2 = pk2.f.v(this, 4, nVar);
        this.C2 = pk2.f.l(this, 16, nVar);
        this.D2 = pk2.f.v(this, 20, nVar);
        this.E2 = pk2.f.l(this, 17, nVar);
        pk2.f.l(this, 5, nVar);
        this.F2 = pk2.f.l(this, 18, nVar);
        this.G2 = new x0(this, dimensionPixelSize);
        this.H2 = new x0(this, getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_inner_padding));
        this.I2 = new x0(this, getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_call_to_action_spacing));
        this.J2 = new x0(this, getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_chips_spacing));
        this.K2 = new x0(this, getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_inner_small_padding));
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(eo1.c.sema_space_200);
        this.L2 = dimensionPixelSize2;
        this.M2 = dimensionPixelSize2;
        this.N2 = new x0(this, dimensionPixelSize2);
        this.O2 = new x0(this, getContext().getResources().getDimensionPixelSize(wy1.b.pharma_ad_disclosure_extra_bottom_padding));
        this.P2 = pk2.f.l(this, 9, nVar);
        this.Q2 = pk2.f.l(this, 0, nVar);
        this.R2 = pk2.f.l(this, 1, nVar);
        this.S2 = pk2.f.l(this, 22, nVar);
        this.U2 = pk2.f.l(this, 15, nVar);
        a11.d dVar = this.f52417h1;
        if (dVar == null) {
            Intrinsics.r("clickThroughHelperFactory");
            throw null;
        }
        this.W2 = dVar.a(this.W1);
        this.X2 = this;
        this.Y2 = true;
    }

    public static void J1(LegoPinGridCellImpl legoPinGridCellImpl, f1 f1Var, u0 u0Var, g0 g0Var, String str, HashMap hashMap, int i13) {
        LegoPinGridCellImpl legoPinGridCellImpl2;
        HashMap hashMap2;
        f1 f1Var2 = (i13 & 1) != 0 ? f1.TAP : f1Var;
        String str2 = (i13 & 8) != 0 ? null : str;
        if ((i13 & 64) != 0) {
            legoPinGridCellImpl2 = legoPinGridCellImpl;
            hashMap2 = null;
        } else {
            legoPinGridCellImpl2 = legoPinGridCellImpl;
            hashMap2 = hashMap;
        }
        legoPinGridCellImpl2.W1.h0((r18 & 1) != 0 ? f1.TAP : f1Var2, (r18 & 2) != 0 ? null : u0Var, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : str2, (r18 & 32) != 0 ? null : hashMap2, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    public static int P0(LegoPinGridCellImpl legoPinGridCellImpl) {
        Rect rect = new Rect();
        legoPinGridCellImpl.getGlobalVisibleRect(rect);
        int i13 = (rect.right + rect.left) / 2;
        float f13 = hf0.b.f69002b;
        int i14 = hf0.b.f69004d;
        int i15 = (int) (f13 / i14);
        for (int i16 = 0; i16 < i14; i16++) {
            if (i13 < i15) {
                return i16;
            }
            i15 += i15;
        }
        return -1;
    }

    public static final void a(LegoPinGridCellImpl legoPinGridCellImpl, f30 f30Var, MotionEvent motionEvent, boolean z13) {
        z1 z1Var;
        Integer num;
        cc J3;
        List d2;
        String t13;
        cc J32;
        List d13;
        String t14;
        String str;
        List d14;
        l30 l30Var;
        legoPinGridCellImpl.getClass();
        if (f30Var.R3() != null) {
            oo1.j jVar = oo1.j.f96854a;
            String R3 = f30Var.R3();
            if (R3 == null) {
                R3 = "";
            }
            String T3 = f30Var.T3();
            if (T3 == null) {
                T3 = "";
            }
            String S3 = f30Var.S3();
            if (S3 == null) {
                S3 = "";
            }
            oc.c cVar = legoPinGridCellImpl.f52477w1;
            if (cVar == null) {
                Intrinsics.r("apolloClient");
                throw null;
            }
            oo1.j.v(R3, T3, S3, cVar).l(tk2.e.f118017c).h(wj2.c.a()).i(new i01.r0(23), new e82.b(28, l.f103301k));
        }
        e30 R6 = f30Var.R6();
        d1 d1Var = legoPinGridCellImpl.f52394b1;
        if (d1Var == null) {
            Intrinsics.r("trackingParamAttacher");
            throw null;
        }
        R6.v2(d1Var.d(legoPinGridCellImpl.W1, f30Var));
        legoPinGridCellImpl.C0 = R6.a();
        z1 source = legoPinGridCellImpl.E0;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            List list = source.G;
            ArrayList H0 = list != null ? CollectionsKt.H0(list) : new ArrayList();
            H0.add(new b2(Integer.valueOf((int) motionEvent.getRawX()), Integer.valueOf((int) motionEvent.getRawY()), ep.b.f(1000000L)));
            z1Var = new z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, source.f67490g, source.f67492h, source.f67494i, source.f67496j, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, source.f67506q, source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, H0, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0);
        } else {
            z1Var = null;
        }
        legoPinGridCellImpl.E0 = z1Var;
        i0 p13 = legoPinGridCellImpl.W1.p();
        nx.d0 d0Var = legoPinGridCellImpl.W1;
        i0 p14 = d0Var != null ? d0Var.p() : null;
        if (p14 == null || com.bumptech.glide.c.c1(p14)) {
            HashMap o13 = ep.b.o("closeup_navigation_type", SbaPinRep.CLOSEUP_NAVIGATION_TYPE_CLICK);
            int i13 = legoPinGridCellImpl.Q0;
            if (i13 >= 0) {
                o13.put("grid_index", String.valueOf(i13));
            }
            if ((legoPinGridCellImpl.f52440n0 || legoPinGridCellImpl.f52444o0) && (num = legoPinGridCellImpl.P1) != null) {
                o13.put("index", String.valueOf(num));
            }
            if (legoPinGridCellImpl.t1()) {
                Integer num2 = legoPinGridCellImpl.Q1;
                o13.put("collection_pin_click_position", String.valueOf(num2 != null ? num2.intValue() : 0));
            }
            if (legoPinGridCellImpl.f52440n0) {
                String str2 = legoPinGridCellImpl.M;
                if (str2 != null) {
                    o13.put("story_type", str2);
                }
                Boolean bool = legoPinGridCellImpl.N;
                if (bool != null) {
                    o13.put("is_multiple_advertiser", String.valueOf(bool.booleanValue()));
                }
            }
            if (((es.c) legoPinGridCellImpl.getAdFormats()).K(f30Var)) {
                String f03 = com.bumptech.glide.d.f0(f30Var);
                o13.put(SbaPinRep.AUXDATA_LEADAD_FORM_ID, f03 != null ? f03 : "");
                o13.put(SbaPinRep.AUXDATA_IS_LEAD_AD, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
            }
            Boolean O5 = f30Var.O5();
            Intrinsics.checkNotNullExpressionValue(O5, "getPromotedIsCatalogCarouselAd(...)");
            String str3 = "0";
            if (O5.booleanValue()) {
                cc J33 = f30Var.J3();
                if (J33 == null || (d14 = J33.d()) == null || (l30Var = (l30) d14.get(b40.z(f30Var))) == null || (str = l30Var.t()) == null) {
                    str = "0";
                }
                o13.put("internal_item_id", str);
            }
            ((vr.b) legoPinGridCellImpl.getAdsCommonAnalytics()).c(f30Var, o13);
            legoPinGridCellImpl.getPinAuxHelper().a(f30Var, legoPinGridCellImpl.L(), o13);
            legoPinGridCellImpl.getPinAuxHelper().c(f30Var, o13);
            if (z13) {
                if (((es.c) legoPinGridCellImpl.getAdFormats()).l0(f30Var)) {
                    legoPinGridCellImpl.L().a(f30Var, true);
                }
                o13.put("click_type", "clickthrough");
            }
            if (((es.c) legoPinGridCellImpl.getAdFormats()).C(f30Var)) {
                o13.put("clickthrough_source", "u'grid");
                o13.put(SbaPinRep.AUX_DATA_IS_MDL_AD, "true");
                ni1.d deepLinkHelper = legoPinGridCellImpl.getDeepLinkHelper();
                String uid = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                Intrinsics.checkNotNullParameter(uid, "uid");
                Object orDefault = deepLinkHelper.f90636i.getOrDefault(uid, Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(orDefault, "getOrDefault(...)");
                o13.put("mdl_did_succeed", String.valueOf(((Boolean) orDefault).booleanValue()));
                o13.put("is_third_party_ad", String.valueOf(f30Var.i5().booleanValue()));
            }
            o13.put("pin_column_index", String.valueOf(P0(legoPinGridCellImpl.X2) + 1));
            o13.put("number_of_columns", String.valueOf(hf0.b.f69004d));
            if (b40.p0(f30Var) || b40.S0(f30Var)) {
                g t33 = f30Var.t3();
                o13.put("shopping_integration_type", t33 != null ? String.valueOf(t33.k0()) : "0");
            }
            legoPinGridCellImpl.m(o13);
            ViewParent parent = legoPinGridCellImpl.getParent();
            if (parent != null) {
                parent.getParent();
            }
            if (((es.c) legoPinGridCellImpl.getAdFormats()).J(f30Var)) {
                legoPinGridCellImpl.getPinAuxHelper();
                b0.i(f30Var, o13);
            }
            if (n60.o.B(f30Var, "getIsPromoted(...)")) {
                r2 experiments = legoPinGridCellImpl.getExperiments();
                z3 z3Var = a4.f83297a;
                lh0.g1 g1Var = (lh0.g1) experiments.f83469a;
                if (g1Var.o("android_ads_analytics_improvements", "enabled", z3Var) || g1Var.l("android_ads_analytics_improvements")) {
                    ((vr.b) legoPinGridCellImpl.getAdsCommonAnalytics()).a(f30Var, o13);
                }
            }
            d1 d1Var2 = legoPinGridCellImpl.f52394b1;
            if (d1Var2 == null) {
                Intrinsics.r("trackingParamAttacher");
                throw null;
            }
            String b13 = d1Var2.b(f30Var);
            r2 experiments2 = legoPinGridCellImpl.getExperiments();
            z3 z3Var2 = a4.f83298b;
            lh0.g1 g1Var2 = (lh0.g1) experiments2.f83469a;
            if (g1Var2.o("android_carousel_pc_vt_fix", "enabled", z3Var2) || g1Var2.l("android_carousel_pc_vt_fix")) {
                String uid2 = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                g0 Y = legoPinGridCellImpl.H ? legoPinGridCellImpl.Y() : null;
                c1 t15 = legoPinGridCellImpl.t(uid2);
                f30 f30Var2 = legoPinGridCellImpl.C0;
                if (f30Var2 != null && Intrinsics.d(f30Var2.O5(), Boolean.TRUE)) {
                    f30 f30Var3 = legoPinGridCellImpl.C0;
                    if (f30Var3 != null && (J3 = f30Var3.J3()) != null && (d2 = J3.d()) != null) {
                        f30 f30Var4 = legoPinGridCellImpl.C0;
                        l30 l30Var2 = (l30) d2.get(f30Var4 != null ? b40.z(f30Var4) : 0);
                        if (l30Var2 != null && (t13 = l30Var2.t()) != null) {
                            str3 = t13;
                        }
                    }
                    o13.put("internal_item_id", str3);
                }
                legoPinGridCellImpl.W1.L(p13, uid2, o13, b13, Y, t15, legoPinGridCellImpl.T());
                return;
            }
            String uid3 = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
            g0 Y2 = legoPinGridCellImpl.H ? legoPinGridCellImpl.Y() : null;
            c1 t16 = legoPinGridCellImpl.t(uid3);
            f30 f30Var5 = legoPinGridCellImpl.C0;
            if (f30Var5 != null && Intrinsics.d(f30Var5.O5(), Boolean.TRUE)) {
                f30 f30Var6 = legoPinGridCellImpl.C0;
                if (f30Var6 != null && (J32 = f30Var6.J3()) != null && (d13 = J32.d()) != null) {
                    f30 f30Var7 = legoPinGridCellImpl.C0;
                    l30 l30Var3 = (l30) d13.get(f30Var7 != null ? b40.z(f30Var7) : 0);
                    if (l30Var3 != null && (t14 = l30Var3.t()) != null) {
                        str3 = t14;
                    }
                }
                o13.put("internal_item_id", str3);
            }
            legoPinGridCellImpl.W1.n(uid3, o13, b13, Y2, t16, legoPinGridCellImpl.T());
        }
    }

    public static String a0(f30 f30Var) {
        return a.a.j("LOG_OVERLAY_IMPRESSION:", f30Var.getUid());
    }

    public static final boolean l2(v vVar) {
        return ((Boolean) vVar.getValue()).booleanValue();
    }

    public final void A2(bb2.e eVar) {
        this.R0 = eVar;
        if (eVar != null) {
            Float valueOf = Float.valueOf(eVar.f22604a);
            qa2.d1 d1Var = this.f52400d;
            d1Var.f103250c = valueOf;
            d1Var.f103251d = eVar.f22605b;
        }
    }

    public final y B0() {
        return (y) this.F2.getValue();
    }

    public final j C() {
        j jVar = this.f52409f1;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.r("adsLibraryExperiments");
        throw null;
    }

    public final fs.c D() {
        fs.c cVar = this.D1;
        if (cVar != null) {
            return cVar;
        }
        Intrinsics.r("adsSalesDealsDisplay");
        throw null;
    }

    public final void D2(n0 n0Var, String str) {
        n0Var.G(((es.v) getAdsCommonDisplay()).w(str));
        n0Var.f121583k.f125406r = Integer.MAX_VALUE;
    }

    public final void E2(f30 pin, n0 n0Var) {
        String Z22;
        getAdsCommonDisplay();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int x03 = dl2.b.x0(context, vn1.c.DEFAULT.getColorRes());
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int x04 = dl2.b.x0(context2, vn1.c.SUBTLE.getColorRes());
        Intrinsics.checkNotNullParameter(pin, "pin");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        wy0 N = b40.N(pin);
        if (N != null && (Z22 = N.Z2()) != null) {
            spannableStringBuilder.append((CharSequence) Z22);
            spannableStringBuilder.append(" · ");
            spannableStringBuilder.setSpan(new ForegroundColorSpan(x03), 0, spannableStringBuilder.length(), 17);
        }
        String u13 = es.v.u(pin);
        if (u13 != null) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) u13);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(x04), length, spannableStringBuilder.length(), 17);
        }
        n0Var.F(spannableStringBuilder);
        n0Var.f121583k.f125406r = 2;
    }

    public final ua2.b0 F0() {
        return (ua2.b0) this.f52399c2.getValue();
    }

    public final n0 G0() {
        return (n0) this.f52450p2.getValue();
    }

    public final boolean G2(f30 f30Var) {
        if (f30Var.u3() == null) {
            return false;
        }
        ps0.y yVar = ro1.c.f108967f;
        if (ps0.y.e(f30Var.u3()) != ro1.b.WEB) {
            return false;
        }
        r2 experiments = getExperiments();
        z3 z3Var = a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) experiments.f83469a;
        return g1Var.o("android_video_block_browser_pin_warmup", "enabled", z3Var) || g1Var.l("android_video_block_browser_pin_warmup");
    }

    public final n0 H0() {
        return (n0) this.f52446o2.getValue();
    }

    /* renamed from: H1, reason: from getter */
    public final boolean getF52444o0() {
        return this.f52444o0;
    }

    public final boolean H2(f30 pin, boolean z13, boolean z14) {
        boolean z15;
        boolean z16;
        if (pin == null) {
            return false;
        }
        boolean f03 = ((es.v) getAdsCommonDisplay()).f0(pin, this.R && !this.T, this.S, this.f52444o0, this.f52440n0);
        fs.c D = D();
        boolean z17 = this.f52440n0;
        boolean z18 = this.f52444o0;
        Intrinsics.checkNotNullParameter(pin, "pin");
        lh0.d dVar = D.f62827a;
        boolean n13 = D.n(pin, z17, z18, dVar.a(), z13, new fs.b(dVar, 6));
        es.h adsCommonDisplay = getAdsCommonDisplay();
        boolean z19 = this.f52440n0;
        boolean z23 = this.f52444o0;
        es.v vVar = (es.v) adsCommonDisplay;
        Intrinsics.checkNotNullParameter(pin, "pin");
        lh0.d dVar2 = vVar.f60008a;
        dVar2.getClass();
        z3 z3Var = a4.f83297a;
        lh0.g1 g1Var = (lh0.g1) dVar2.f83323a;
        boolean X = vVar.X(pin, z19, z23, g1Var.o("android_handshake_show_price", "enabled", z3Var) || g1Var.l("android_handshake_show_price"), new t(vVar, 3));
        f30 f30Var = this.C0;
        if (f30Var != null) {
            z15 = ((es.v) getAdsCommonDisplay()).G(f30Var, this.R, this.S, this.f52444o0, this.f52440n0);
        } else {
            z15 = false;
        }
        if (((es.c) getAdFormats()).A(pin) && z13) {
            fs.c D2 = D();
            boolean z24 = this.f52440n0;
            boolean z25 = this.f52444o0;
            Intrinsics.checkNotNullParameter(pin, "pin");
            lh0.d dVar3 = D2.f62827a;
            if (!D2.n(pin, z24, z25, dVar3.a(), true, new fs.b(dVar3, 6))) {
                z16 = true;
                return (!z14 || ((((es.v) getAdsCommonDisplay()).e0(pin) && n60.o.y(pin, "getIsThirdPartyAd(...)")) || f03 || n13 || X || z15)) && !z16;
            }
        }
        z16 = false;
        if (z14) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0101, code lost:
    
        if (r1 != null) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.HashMap I0() {
        /*
            Method dump skipped, instructions count: 619
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.grid.LegoPinGridCellImpl.I0():java.util.HashMap");
    }

    public final ps.k K0() {
        ps.k kVar = this.f52445o1;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.r("pinChipLooper");
        throw null;
    }

    public final void K1(View view) {
        m mVar = this.f52396c;
        boolean z13 = mVar.C;
        if (!mVar.E) {
            ((es.c) getAdFormats()).O(this.C0);
        }
        boolean z14 = this.f52396c.f128893x;
        if (!z13 && z14) {
            q5.v0.a(view, getResources().getString(bz1.c.overflow_menu_accessibility_label), new yq1.d1(this, 8));
        }
    }

    public final xr.a L() {
        xr.a aVar = this.f52485y1;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("attributionReporting");
        throw null;
    }

    public final ArrayList L0() {
        f30 f30Var;
        if (((es.c) getAdFormats()).S(this.C0) || (f30Var = this.C0) == null) {
            return null;
        }
        es.h adsCommonDisplay = getAdsCommonDisplay();
        lh0.d dVar = this.f52405e1;
        if (dVar != null) {
            return ((es.v) adsCommonDisplay).A(f30Var, dVar, Boolean.valueOf(t1()));
        }
        Intrinsics.r("adFormatsLibraryExperiments");
        throw null;
    }

    public final void M1(f30 f30Var, ArrayList arrayList) {
        String text;
        if (((es.c) getAdFormats()).L(f30Var)) {
            arrayList.add(this.N2);
            f0 f0Var = (f0) this.S2.getValue();
            g t33 = f30Var.t3();
            if (t33 == null || (text = t33.Y()) == null) {
                text = "";
            }
            f0Var.getClass();
            Intrinsics.checkNotNullParameter(text, "text");
            va2.o oVar = f0Var.f121491k;
            oVar.f125432n.f125406r = Integer.MAX_VALUE;
            oVar.n(text);
            arrayList.add(f0Var);
            arrayList.add(this.O2);
            nx.d0 d0Var = this.W1;
            i0 t23 = t2();
            d0Var.U(t23 != null ? com.bumptech.glide.d.z0(t23, l.f103302l) : null, f1.VIEW, f30Var.getUid(), null, null, false);
        }
    }

    public final boolean M2(f30 pin) {
        boolean z13;
        if (pin == null) {
            return false;
        }
        boolean h03 = ((es.v) getAdsCommonDisplay()).h0(pin, this.R && !this.T, this.S, this.f52444o0, this.f52440n0);
        es.h adsCommonDisplay = getAdsCommonDisplay();
        boolean z14 = this.f52440n0;
        boolean z15 = this.f52444o0;
        es.v vVar = (es.v) adsCommonDisplay;
        Intrinsics.checkNotNullParameter(pin, "pin");
        lh0.d dVar = vVar.f60008a;
        dVar.getClass();
        z3 z3Var = a4.f83297a;
        lh0.g1 g1Var = (lh0.g1) dVar.f83323a;
        boolean Y = vVar.Y(pin, z14, z15, g1Var.o("android_handshake_show_rating", "enabled", z3Var) || g1Var.l("android_handshake_show_rating"), new t(vVar, 4));
        f30 f30Var = this.C0;
        if (f30Var != null) {
            z13 = ((es.v) getAdsCommonDisplay()).H(f30Var, this.R, this.S, this.f52444o0, this.f52440n0);
        } else {
            z13 = false;
        }
        return h03 || Y || z13;
    }

    public final void O1(f30 pin, ArrayList arrayList, boolean z13) {
        fs.c D = D();
        boolean z14 = this.f52440n0;
        boolean z15 = this.f52444o0;
        Intrinsics.checkNotNullParameter(pin, "pin");
        fs.a aVar = fs.a.METADATA;
        lh0.d dVar = D.f62827a;
        dVar.getClass();
        z3 z3Var = a4.f83297a;
        lh0.g1 g1Var = (lh0.g1) dVar.f83323a;
        boolean z16 = false;
        boolean g13 = D.g(pin, z14, z15, aVar, g1Var.o("personalized_deal_indicator", "enabled", z3Var) || g1Var.l("personalized_deal_indicator"), new fs.b(dVar, 5));
        x0 x0Var = this.H2;
        if (g13) {
            ua2.q qVar = (ua2.q) this.d2.getValue();
            String text = ((es.c) getAdFormats()).i(pin);
            if (text != null) {
                qVar.getClass();
                Intrinsics.checkNotNullParameter(text, "text");
                c0 c0Var = qVar.f121594k;
                c0Var.f121451o.f125406r = 2;
                Intrinsics.checkNotNullParameter(text, "text");
                c0Var.f121451o.o(text);
            }
            arrayList.add(qVar);
            arrayList.add(x0Var);
        }
        String str = "";
        if (z13) {
            fs.c D2 = D();
            boolean z17 = this.f52440n0;
            boolean z18 = this.f52444o0;
            wa2.g0 g0Var = this.V2;
            Boolean valueOf = g0Var != null ? Boolean.valueOf(g0Var.f128738t) : null;
            Intrinsics.checkNotNullParameter(pin, "pin");
            lh0.d dVar2 = D2.f62827a;
            if (D2.o(pin, z17, z18, valueOf, dVar2.a(), new fs.b(dVar2, 7))) {
                p0 p0Var = (p0) this.f52442n2.getValue();
                String a13 = D().a(pin);
                String b13 = D().b(pin);
                if (a13 != null) {
                    str = a13;
                } else if (b13 != null) {
                    str = b13;
                }
                p0Var.G(str);
                p0Var.H(vn1.c.INFO);
                p0Var.I(tn1.c.f118618j);
                p0Var.E(false);
                arrayList.add(p0Var);
                arrayList.add(x0Var);
                return;
            }
        }
        fs.c D3 = D();
        boolean z19 = this.f52440n0;
        boolean z23 = this.f52444o0;
        wa2.g0 g0Var2 = this.V2;
        if (g0Var2 != null && g0Var2.f128738t) {
            z16 = true;
        }
        if (D3.j(pin, z19, z23, z16) && ((es.v) getAdsCommonDisplay()).M(pin)) {
            String a14 = D().a(pin);
            String b14 = D().b(pin);
            if (a14 != null) {
                str = a14;
            } else if (b14 != null) {
                str = b14;
            }
            n0 n0Var = new n0(this, this.Y1);
            n0Var.G(str);
            n0Var.H(vn1.c.INFO);
            n0Var.I(kotlin.collections.e0.b(vn1.e.REGULAR));
            arrayList.add(n0Var);
            arrayList.add(x0Var);
        }
    }

    public final boolean O2(f30 f30Var) {
        boolean z13 = false;
        if (f30Var != null && f30Var.d5().booleanValue()) {
            wz j13 = po1.c.j(f30Var);
            String h10 = j13 != null ? po1.c.h(j13) : null;
            if (h10 != null && h10.length() != 0) {
                wa2.g0 g0Var = this.V2;
                boolean z14 = g0Var != null && g0Var.f128738t;
                if (g0Var != null && g0Var.f128719a) {
                    z13 = true;
                }
                return H2(f30Var, z14, z13);
            }
        }
        return false;
    }

    public final void R1(f30 f30Var, ua2.c1 c1Var, ArrayList arrayList, wa2.g0 g0Var, int i13) {
        SpannableStringBuilder d2;
        SpannableStringBuilder d13;
        boolean H2 = dl2.b.H2(f30Var, g0Var.f128729k);
        k kVar = this.f52434l2;
        x0 x0Var = this.H2;
        boolean z13 = g0Var.f128742x;
        if (H2) {
            String string = getResources().getString(m60.x0.shopping_grid_pdp_lite_oos);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            n0 n0Var = (n0) kVar.getValue();
            Y0(string, z13, n0Var);
            arrayList.add(n0Var);
            arrayList.add(x0Var);
            return;
        }
        if (dl2.b.J2(f30Var, g0Var.f128730l)) {
            String string2 = getResources().getString(m60.x0.shopping_grid_pdp_lite_stale);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            n0 n0Var2 = (n0) kVar.getValue();
            Y0(string2, z13, n0Var2);
            arrayList.add(n0Var2);
            arrayList.add(x0Var);
            return;
        }
        if (H2(f30Var, g0Var.f128738t, g0Var.f128719a)) {
            Boolean O5 = f30Var.O5();
            Intrinsics.checkNotNullExpressionValue(O5, "getPromotedIsCatalogCarouselAd(...)");
            SpannableStringBuilder spannableStringBuilder = null;
            if (O5.booleanValue()) {
                wz i14 = po1.c.i(i13, f30Var);
                if (i14 != null) {
                    if (this.f52479x) {
                        Context context = getContext();
                        int i15 = eo1.b.color_gray_500;
                        Object obj = d5.a.f53679a;
                        int color = context.getColor(i15);
                        Context context2 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        d13 = po1.c.d(i14, color, dl2.b.x0(context2, vn1.c.INFO.getColorRes()), this.f52479x ? eo1.b.color_themed_text_light : eo1.b.color_themed_text_default);
                    } else if (this.Q) {
                        Context context3 = getContext();
                        int i16 = eo1.b.sema_color_background_wash_dark_opacity_65;
                        Object obj2 = d5.a.f53679a;
                        d13 = po1.c.d(i14, context3.getColor(i16), getContext().getColor(eo1.b.color_text_default), -1);
                    } else {
                        Context context4 = getContext();
                        int i17 = eo1.b.color_gray_500;
                        Object obj3 = d5.a.f53679a;
                        int color2 = context4.getColor(i17);
                        Context context5 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                        d13 = po1.c.d(i14, color2, dl2.b.x0(context5, vn1.c.INFO.getColorRes()), -1);
                    }
                    spannableStringBuilder = d13;
                }
                if (spannableStringBuilder != null) {
                    arrayList.add(T0(c1Var, spannableStringBuilder, z13));
                    arrayList.add(x0Var);
                    return;
                }
                return;
            }
            wz j13 = po1.c.j(f30Var);
            if (j13 != null) {
                if (!this.P) {
                    Boolean M4 = f30Var.M4();
                    Intrinsics.checkNotNullExpressionValue(M4, "getIsEligibleForPdp(...)");
                    if ((!M4.booleanValue() || f30Var.d5().booleanValue()) && !g0Var.f128740v) {
                        if (this.f52479x) {
                            Context context6 = getContext();
                            int i18 = eo1.b.color_gray_500;
                            Object obj4 = d5.a.f53679a;
                            int color3 = context6.getColor(i18);
                            Context context7 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
                            d2 = po1.c.d(j13, color3, dl2.b.x0(context7, vn1.c.INFO.getColorRes()), this.f52479x ? eo1.b.color_themed_text_light : eo1.b.color_themed_text_default);
                        } else if (this.Q) {
                            Context context8 = getContext();
                            int i19 = eo1.b.sema_color_background_wash_dark_opacity_65;
                            Object obj5 = d5.a.f53679a;
                            d2 = po1.c.d(j13, context8.getColor(i19), getContext().getColor(eo1.b.color_text_default), -1);
                        } else {
                            r2 experiments = getExperiments();
                            z3 z3Var = a4.f83298b;
                            lh0.g1 g1Var = (lh0.g1) experiments.f83469a;
                            if (g1Var.o("android_ads_should_render_black_price", "enabled", z3Var) || g1Var.l("android_ads_should_render_black_price")) {
                                Context context9 = getContext();
                                int i23 = eo1.b.sema_color_background_wash_dark_opacity_65;
                                Object obj6 = d5.a.f53679a;
                                d2 = po1.c.d(j13, context9.getColor(i23), getContext().getColor(eo1.b.color_text_default), -1);
                            } else {
                                Context context10 = getContext();
                                int i24 = eo1.b.color_gray_500;
                                Object obj7 = d5.a.f53679a;
                                int color4 = context10.getColor(i24);
                                Context context11 = getContext();
                                Intrinsics.checkNotNullExpressionValue(context11, "getContext(...)");
                                d2 = po1.c.d(j13, color4, dl2.b.x0(context11, vn1.c.INFO.getColorRes()), -1);
                            }
                        }
                        spannableStringBuilder = d2;
                    }
                }
                Context context12 = getContext();
                int i25 = eo1.b.color_gray_500;
                Object obj8 = d5.a.f53679a;
                d2 = po1.c.d(j13, context12.getColor(i25), getContext().getColor(eo1.b.color_text_default), -1);
                spannableStringBuilder = d2;
            }
            if (spannableStringBuilder != null) {
                arrayList.add(T0(c1Var, spannableStringBuilder, z13));
                if (this.f52408f0) {
                    arrayList.add(this.K2);
                } else {
                    arrayList.add(x0Var);
                }
            }
        }
    }

    public final boolean R2(f30 f30Var) {
        if (f30Var == null || !f30Var.d5().booleanValue()) {
            return false;
        }
        wa2.g0 g0Var = this.f52396c.f128851b0;
        return (g0Var != null && g0Var.f128722d) || (((es.v) getAdsCommonDisplay()).j0(f30Var) && n60.o.y(f30Var, "getIsThirdPartyAd(...)")) || M2(f30Var);
    }

    public final int S0() {
        return ((Number) this.f52476w0.getValue()).intValue();
    }

    public final u0 T() {
        if (!((es.c) getAdFormats()).M(this.C0)) {
            return null;
        }
        h0 h0Var = this.U0;
        return h0Var instanceof ua2.q ? u0.AD_CLICKTHROUGH_HEADER : h0Var instanceof k0 ? u0.AD_CLICKTHROUGH_MEDIA : h0Var instanceof v0 ? u0.AD_CLICKTHROUGH_PROMOTER_NAME : h0Var instanceof ua2.n ? u0.AD_CLICKTHROUGH_CHIN_CTA : h0Var instanceof y ? u0.AD_CLICKTHROUGH_EXPAND : h0Var instanceof p0 ? u0.AD_CLICKTHROUGH_PROMO_METADATA : h0Var instanceof f0 ? u0.AD_CLICKTHROUGH_DISCLOSURE : u0.AD_CLICKTHROUGH_TITLE;
    }

    public final n0 T0(ua2.c1 c1Var, SpannableStringBuilder spannableStringBuilder, boolean z13) {
        n0 n0Var = (n0) this.f52426j2.getValue();
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder2, "toString(...)");
        n0Var.G(spannableStringBuilder2);
        n0Var.F(spannableStringBuilder);
        wz j13 = po1.c.j(c1Var.f121454c);
        n0Var.f121583k.f125406r = j13 != null ? (!po1.c.k(j13) || j13.s() == null) ? c1Var.a() : 2 : c1Var.a();
        n0Var.E(false);
        if (this.f52479x) {
            n0Var.H(vn1.c.LIGHT);
        }
        if (z1() || z13 || this.f52412g0) {
            n0Var.I(tn1.c.f118617i);
        }
        return n0Var;
    }

    public final void U1(ua2.c1 c1Var, ArrayList arrayList, wa2.g0 g0Var) {
        if (g0Var.f128721c) {
            if (!c1Var.f121472u || this.f52444o0) {
                i(c1Var, arrayList);
                arrayList.add(this.H2);
            }
        }
    }

    public final void V1(f30 f30Var, ua2.c1 c1Var, wa2.g0 g0Var, ArrayList arrayList) {
        if (g0Var.f128720b && (!z.j(c1Var.f121466o))) {
            if (!((es.v) getAdsCommonDisplay()).E(f30Var, Y()) || ((es.v) getAdsCommonDisplay()).h(f30Var)) {
                j(f30Var, c1Var, arrayList);
                if (this.f52408f0) {
                    arrayList.add(this.K2);
                } else {
                    arrayList.add(this.H2);
                }
            }
        }
    }

    public final boolean W2() {
        f30 f30Var;
        f30 f30Var2;
        f30 f30Var3;
        if (Intrinsics.d(X(), "messages") || n() || (f30Var = this.C0) == null || b40.e0(f30Var) <= 0) {
            return false;
        }
        f30 f30Var4 = this.C0;
        return (f30Var4 != null && b40.c(f30Var4)) || !((f30Var2 = this.C0) == null || !b40.b(f30Var2) || (f30Var3 = this.C0) == null || b40.P0(f30Var3));
    }

    public final String X() {
        String str = this.f52396c.f128875n0;
        nl1.d coreFragment = getCoreFragment();
        if (coreFragment == null) {
            return str;
        }
        if (str.length() != 0 && !Intrinsics.d(str, "unknown")) {
            return str;
        }
        if (this.f52429k1 == null) {
            Intrinsics.r("pinTrafficSourceMapper");
            throw null;
        }
        String name = coreFragment.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return jq.c.a(name);
    }

    public final void X1(f30 f30Var, ArrayList arrayList, wa2.g0 g0Var, Integer num, int i13) {
        if (g0Var.f128720b && (!z.j(b40.j(i13, f30Var)))) {
            n0 n0Var = (n0) this.f52418h2.getValue();
            String j13 = b40.j(i13, f30Var);
            n0Var.F(new SpannableStringBuilder(j13));
            n0Var.G(j13);
            yr.a aVar = this.J1;
            if (aVar == null) {
                Intrinsics.r("adsDebugDeveloperPreferences");
                throw null;
            }
            ((m60.d) aVar.f140102a).g();
            yr.a aVar2 = this.J1;
            if (aVar2 == null) {
                Intrinsics.r("adsDebugDeveloperPreferences");
                throw null;
            }
            ((m60.d) aVar2.f140102a).g();
            n0Var.H(bs1.c.T0(f30Var, j13, false, false, getExperiments().T(), this.f52479x));
            n0Var.f121583k.f125406r = num.intValue();
            n0Var.E(true);
            c2(f30Var, n0Var);
            arrayList.add(n0Var);
            if (this.f52412g0) {
                return;
            }
            arrayList.add(this.H2);
        }
    }

    public final boolean X2(f30 f30Var, wa2.g0 g0Var) {
        if (y1(f30Var) || !this.f52411g) {
            return false;
        }
        if (!b40.I0(f30Var)) {
            if (g0Var == null) {
                return false;
            }
            if (!dl2.b.H2(f30Var, g0Var.f128729k) && !dl2.b.J2(f30Var, g0Var.f128730l)) {
                return false;
            }
        }
        return true;
    }

    public final g0 Y() {
        g0 g0Var;
        g0 g0Var2 = this.I;
        if (g0Var2 != null) {
            Intrinsics.f(g0Var2);
            return g0Var2;
        }
        if (this.f52396c.f128870l) {
            return g0.RELATED_PIN;
        }
        if (this.f52440n0) {
            return g0.ADS_ONLY_CAROUSEL;
        }
        wa2.g0 g0Var3 = this.V2;
        if (g0Var3 != null && (g0Var = g0Var3.f128727i) != null) {
            return g0Var;
        }
        i0 p13 = this.W1.p();
        g0 g0Var4 = p13 != null ? p13.f67084d : null;
        return g0Var4 == null ? g0.FLOWED_PIN : g0Var4;
    }

    public final void Y0(String str, boolean z13, n0 n0Var) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Context context = getContext();
        int i13 = fk1.c.f62344b;
        Object obj = d5.a.f53679a;
        spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getColor(i13)), 0, str.length(), 17);
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder2, "toString(...)");
        n0Var.G(spannableStringBuilder2);
        n0Var.F(spannableStringBuilder);
        n0Var.f121583k.f125406r = 1;
        n0Var.E(false);
        if (z13) {
            n0Var.I(tn1.c.f118617i);
        }
    }

    public final m60.q Z() {
        m60.q qVar = this.f52398c1;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.r("developerOptions");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean Z2(com.pinterest.api.model.f30 r7) {
        /*
            r6 = this;
            java.lang.Boolean r0 = r7.n5()
            java.lang.String r1 = "getIsVirtualTryOn(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = r0.booleanValue()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L34
            java.lang.Boolean r0 = r7.m5()
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L34
            b60.b r0 = r6.f52473v1
            if (r0 == 0) goto L2d
            b60.d r0 = (b60.d) r0
            com.pinterest.api.model.wy0 r0 = r0.f()
            boolean r0 = d7.b.i0(r0)
            if (r0 == 0) goto L34
            r0 = r2
            goto L35
        L2d:
            java.lang.String r7 = "activeUserManager"
            kotlin.jvm.internal.Intrinsics.r(r7)
            r7 = 0
            throw r7
        L34:
            r0 = r1
        L35:
            java.lang.String r3 = "getIsPromoted(...)"
            boolean r3 = n60.o.B(r7, r3)
            if (r3 == 0) goto L61
            f42.j r3 = f42.l.Companion
            java.lang.Integer r4 = r7.P6()
            java.lang.String r5 = "getVirtualTryOnType(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            int r4 = r4.intValue()
            r3.getClass()
            f42.l r3 = f42.j.a(r4)
            f42.l r4 = f42.l.PRODUCT
            if (r3 != r4) goto L7d
            boolean r7 = com.pinterest.api.model.b40.J0(r7)
            if (r7 == 0) goto L7d
            if (r0 == 0) goto L7d
        L5f:
            r1 = r2
            goto L7d
        L61:
            if (r0 == 0) goto L7d
            lh0.r2 r7 = r6.getExperiments()
            lh0.z3 r0 = lh0.a4.f83298b
            lh0.z0 r7 = r7.f83469a
            lh0.g1 r7 = (lh0.g1) r7
            java.lang.String r3 = "android_vto_indicator_removal"
            java.lang.String r4 = "enabled"
            boolean r0 = r7.o(r3, r4, r0)
            if (r0 != 0) goto L7d
            boolean r7 = r7.l(r3)
            if (r7 == 0) goto L5f
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.grid.LegoPinGridCellImpl.Z2(com.pinterest.api.model.f30):boolean");
    }

    public final void a2(Function0 function0) {
        g.b m13 = ((es.v) getAdsCommonDisplay()).m(this.C0, true);
        int i13 = m13 == null ? -1 : qa2.q.f103333a[m13.ordinal()];
        int i14 = 0;
        if (i13 == 1 || i13 == 2) {
            postDelayed(new p(this, i14), 1000L);
            function0.invoke();
        } else {
            if (i13 != 3) {
                function0.invoke();
                return;
            }
            f30 pin = this.C0;
            if (pin != null) {
                Intrinsics.checkNotNullParameter(pin, "pin");
                i2(pin, false);
            }
            postDelayed(new p4.a(9, function0), 300L);
        }
    }

    @Override // qa2.b
    public final void addVisibilityEvent(e4 visibleEvent) {
        Intrinsics.checkNotNullParameter(visibleEvent, "visibleEvent");
        k0 k0Var = this.f52468u0;
        z1 z1Var = null;
        if (k0Var == null) {
            Intrinsics.r("primaryMediaPiece");
            throw null;
        }
        z1 source = k0Var.H;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            Collection collection = source.f67506q;
            if (collection == null) {
                collection = kotlin.collections.q0.f80391a;
            }
            z1Var = new z1(source.f67478a, source.f67480b, source.f67482c, source.f67484d, source.f67486e, source.f67488f, source.f67490g, source.f67492h, source.f67494i, source.f67496j, source.f67498k, source.f67500l, source.f67502m, source.f67503n, source.f67504o, source.f67505p, CollectionsKt.m0(visibleEvent, collection), source.f67507r, source.f67508s, source.f67509t, source.f67510u, source.f67511v, source.f67512w, source.f67513x, source.f67514y, source.f67515z, source.A, source.B, source.C, source.D, source.E, source.F, source.G, source.H, source.I, source.f67477J, source.K, source.L, source.M, source.N, source.O, source.P, source.Q, source.R, source.S, source.T, source.U, source.V, source.W, source.X, source.Y, source.Z, source.f67479a0, source.f67481b0, source.f67483c0, source.f67485d0, source.f67487e0, source.f67489f0, source.f67491g0, source.f67493h0, source.f67495i0, source.f67497j0, source.f67499k0, source.f67501l0);
        }
        k0Var.H = z1Var;
    }

    public final void b(f30 f30Var, ua2.c1 updatedPinCellMetadata, ArrayList arrayList) {
        x0 x0Var;
        wy0 N;
        String Z22;
        wy0 N2;
        String Z23;
        wy0 N3;
        String Z24;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String c23 = bs1.c.c2(this.f52408f0 ? wy1.f.sponsored : wy1.f.promoted, resources);
        qa2.a aVar = updatedPinCellMetadata.f121465n;
        boolean z13 = updatedPinCellMetadata.f121472u;
        v0 v0Var = this.f52470u2;
        if (z13) {
            u22.c f13 = ((es.v) getAdsCommonDisplay()).f(f30Var, this.f52408f0, this.f52444o0, j1.Z0(C()));
            if (this.f52408f0) {
                G0().H(vn1.c.SUBTLE);
                boolean R0 = j1.R0(f30Var);
                x0Var = this.H2;
                if (R0 && getExperiments().U()) {
                    if (!this.f52412g0 && (N3 = b40.N(f30Var)) != null && (Z24 = N3.Z2()) != null) {
                        b1().G(Z24);
                        b1().f121583k.f125406r = 1;
                        arrayList.add(b1());
                        arrayList.add(x0Var);
                    }
                    arrayList.add(G0());
                    M1(f30Var, arrayList);
                    return;
                }
            } else {
                x0Var = this.J2;
            }
            u22.c cVar = u22.c.SHORT;
            k kVar = this.f52458r2;
            if (f13 == cVar) {
                if (!this.f52412g0 && (N2 = b40.N(f30Var)) != null && (Z23 = N2.Z2()) != null) {
                    if (((es.c) getAdFormats()).L(f30Var)) {
                        D2(H0(), Z23);
                    } else if (n1(f30Var)) {
                        E2(f30Var, H0());
                    } else {
                        H0().G(Z23);
                        if (this.f52408f0 && j1.R0(f30Var) && getExperiments().Q(z3.ACTIVATE_EXPERIMENT)) {
                            H0().f121583k.f125406r = 1;
                        }
                    }
                    arrayList.add(H0());
                    arrayList.add(x0Var);
                }
                n0 G0 = ((((es.v) getAdsCommonDisplay()).M(f30Var) || !(((es.c) getAdFormats()).N(f30Var) || ((es.c) getAdFormats()).E(f30Var))) && !t1()) ? (((es.v) getAdsCommonDisplay()).Z(f30Var, this.f52444o0, this.f52440n0) && (((es.c) getAdFormats()).C(f30Var) || ((es.c) getAdFormats()).G(f30Var))) ? (o0) this.f52462s2.getValue() : G0() : (o0) kVar.getValue();
                G0.G(c23);
                arrayList.add(G0);
            } else if (f13 == u22.c.MINIMAL) {
                if (!this.f52412g0 && (N = b40.N(f30Var)) != null && (Z22 = N.Z2()) != null) {
                    if (((es.c) getAdFormats()).L(f30Var)) {
                        D2(H0(), Z22);
                    } else if (n1(f30Var)) {
                        E2(f30Var, H0());
                    } else {
                        H0().G(Z22);
                    }
                    arrayList.add(H0());
                }
            } else if (f13 != u22.c.GONE) {
                if (this.f52444o0) {
                    arrayList.add((o0) kVar.getValue());
                } else {
                    v0Var.f121617n.f125419p = this.f52440n0;
                    Intrinsics.checkNotNullParameter(updatedPinCellMetadata, "pinCellMetadata");
                    v0Var.f121618o = aVar;
                    v0Var.f121617n.f125418o = updatedPinCellMetadata;
                    v0Var.E();
                    arrayList.add(v0Var);
                }
            }
            M1(f30Var, arrayList);
        } else {
            boolean e13 = updatedPinCellMetadata.e();
            k kVar2 = this.f52474v2;
            if (e13) {
                if (this.f52444o0) {
                    arrayList.add(G0());
                } else {
                    v0Var.getClass();
                    Intrinsics.checkNotNullParameter(updatedPinCellMetadata, "pinCellMetadata");
                    v0Var.f121618o = aVar;
                    va2.n nVar = v0Var.f121617n;
                    nVar.f125418o = updatedPinCellMetadata;
                    v0Var.E();
                    nVar.f125419p = this.f52440n0 || y1(f30Var);
                    nVar.f125420q = !getExperiments().R("enabled_text_only", a4.f83297a);
                    arrayList.add(v0Var);
                    if (p1() && this.f52471v) {
                        ua2.j jVar = (ua2.j) kVar2.getValue();
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(updatedPinCellMetadata, "pinCellMetadata");
                        va2.e eVar = jVar.f121509m;
                        eVar.getClass();
                        Intrinsics.checkNotNullParameter(updatedPinCellMetadata, "updatedPinCellMetadata");
                        eVar.f125338m = updatedPinCellMetadata;
                        arrayList.add(jVar);
                    }
                }
            } else if (this.f52444o0 && this.V) {
                G0().G("");
                arrayList.add(G0());
            } else if (p1() && this.f52471v) {
                ua2.j jVar2 = (ua2.j) kVar2.getValue();
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(updatedPinCellMetadata, "pinCellMetadata");
                va2.e eVar2 = jVar2.f121509m;
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(updatedPinCellMetadata, "updatedPinCellMetadata");
                eVar2.f125338m = updatedPinCellMetadata;
                arrayList.add(jVar2);
            }
        }
        if (this.f52479x) {
            vn1.c textColor = vn1.c.LIGHT;
            v0Var.getClass();
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            va2.n nVar2 = v0Var.f121617n;
            nVar2.getClass();
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            nVar2.f125423t.a(new sp.a(27, textColor));
            nVar2.f125424u.a(new sp.a(28, textColor));
        }
    }

    public final o0 b1() {
        return (o0) this.f52454q2.getValue();
    }

    public final void b2(ua2.c1 c1Var) {
        f30 f30Var;
        if (this.f52475w && (f30Var = this.C0) != null && j1.F1(f30Var)) {
            f30 f30Var2 = this.C0;
            if (f30Var2 == null || !Intrinsics.d(f30Var2.d5(), Boolean.TRUE)) {
                n0 n0Var = (n0) this.f52418h2.getValue();
                String str = "* " + c1Var.f121466o;
                int W = bs1.c.W(this, eo1.c.space_300);
                Drawable f03 = bs1.c.f0(this, wy1.c.ic_tag_outline, null, null, 6);
                f03.setBounds(0, 0, W, W);
                f03.setTint(bs1.c.B(this, this.f52479x ? eo1.b.color_themed_text_light : eo1.b.color_themed_text_default));
                ImageSpan imageSpan = new ImageSpan(f03, 2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(imageSpan, 0, 1, 33);
                n0Var.F(spannableStringBuilder);
                f30 f30Var3 = this.C0;
                if (f30Var3 != null) {
                    c2(f30Var3, n0Var);
                }
            }
        }
    }

    public final void b3(f30 f30Var) {
        ArrayList L0;
        ps.k K0 = K0();
        if (K0.f101239b || (L0 = L0()) == null) {
            return;
        }
        ps.k.d(K0, L0.size(), true, new qa2.w((u) this.C2.getValue(), 4), new j1.v0(K0, this, L0, f30Var, 19), 4);
    }

    public final void c2(f30 f30Var, n0 n0Var) {
        u22.c f13 = ((es.v) getAdsCommonDisplay()).f(f30Var, this.f52408f0, this.f52444o0, j1.Z0(C()));
        if (!this.f52412g0 || f13 == u22.c.DEFAULT || f13 == u22.c.GONE) {
            return;
        }
        vn1.g variant = vn1.g.BODY_100;
        Intrinsics.checkNotNullParameter(variant, "variant");
        n0Var.f121583k.p(variant);
        n0Var.I(tn1.c.f118617i);
    }

    @Override // qy.a
    public final String coexistId() {
        String pinUid = getPinUid();
        return pinUid == null ? "" : pinUid;
    }

    public final e d0() {
        e eVar = this.N1;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.r("dlAdCloseupPinOverlayVisibilityStore");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d2(com.pinterest.api.model.f30 r19) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.grid.LegoPinGridCellImpl.d2(com.pinterest.api.model.f30):int");
    }

    public final void d3(boolean z13) {
        if (getParent() == null || !j1.G1(this.C0, C(), getAdFormats())) {
            return;
        }
        f30 f30Var = this.C0;
        if (f30Var != null && this.E0 != null && z13) {
            this.O = ro1.c.f108967f.i(f30Var, getAdsCommonDisplay(), getAdFormats());
        }
        fv.d dVar = this.f52449p1;
        if (dVar == null) {
            Intrinsics.r("adIdeaPinStaticPlaytimeTracker");
            throw null;
        }
        ((fv.c) dVar).g(this.C0, z13, this.E0);
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent event) {
        boolean z13;
        Intrinsics.checkNotNullParameter(event, "event");
        c cVar = this.B0;
        if (cVar == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            cVar = new c(context, new qi0.b(this, 4));
            cVar.f138290e = 200;
            this.B0 = cVar;
        }
        if (event.getAction() == 3) {
            if (!cVar.b()) {
                w2();
            }
            z13 = super.dispatchTouchEvent(event);
        } else {
            z13 = false;
        }
        return cVar.c(event) | z13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r8 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
    
        if (r8 == null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(com.pinterest.api.model.f30 r8, java.util.ArrayList r9, boolean r10) {
        /*
            r7 = this;
            boolean r0 = com.pinterest.api.model.b40.w0(r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L24
            lh0.r2 r0 = r7.getExperiments()
            lh0.z3 r3 = lh0.a4.f83298b
            lh0.z0 r0 = r0.f83469a
            lh0.g1 r0 = (lh0.g1) r0
            java.lang.String r4 = "ads_sponsored_label_cleanup"
            java.lang.String r5 = "enabled"
            boolean r3 = r0.o(r4, r5, r3)
            if (r3 != 0) goto L22
            boolean r0 = r0.l(r4)
            if (r0 == 0) goto L24
        L22:
            r0 = r2
            goto L25
        L24:
            r0 = r1
        L25:
            lh0.r2 r3 = r7.getExperiments()
            u50.k0 r10 = mi1.e.c(r8, r10, r0, r3)
            r0 = 0
            if (r10 == 0) goto L44
            android.content.Context r3 = r7.getContext()
            java.lang.String r4 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.CharSequence r10 = r10.a(r3)
            if (r10 == 0) goto L44
            java.lang.String r10 = r10.toString()
            goto L45
        L44:
            r10 = r0
        L45:
            java.lang.String r3 = ""
            if (r10 != 0) goto L4a
            r10 = r3
        L4a:
            boolean r4 = df.j1.U0(r10)
            if (r4 == 0) goto Lba
            xk2.k r4 = r7.f52438m2
            java.lang.Object r4 = r4.getValue()
            ua2.n0 r4 = (ua2.n0) r4
            qa2.g0 r5 = mi1.e.b(r8)
            int[] r6 = qa2.q.f103334b
            int r5 = r5.ordinal()
            r5 = r6[r5]
            r6 = 2
            if (r5 == r2) goto L7b
            if (r5 == r6) goto L6a
            goto L8f
        L6a:
            com.pinterest.api.model.wy0 r8 = r8.a6()
            if (r8 == 0) goto L75
            java.lang.String r8 = dl2.b.j1(r8)
            goto L76
        L75:
            r8 = r0
        L76:
            if (r8 != 0) goto L79
            goto L8f
        L79:
            r3 = r8
            goto L8f
        L7b:
            com.pinterest.api.model.rj0 r8 = r8.u6()
            if (r8 == 0) goto L8c
            com.pinterest.api.model.wy0 r8 = r8.e()
            if (r8 == 0) goto L8c
            java.lang.String r8 = dl2.b.j1(r8)
            goto L8d
        L8c:
            r8 = r0
        L8d:
            if (r8 != 0) goto L79
        L8f:
            r8 = 6
            int r8 = kotlin.text.StringsKt.L(r10, r3, r1, r1, r8)
            r5 = -1
            if (r8 <= r5) goto Lab
            int r3 = r3.length()
            if (r3 <= 0) goto Lab
            va2.p r0 = new va2.p
            int r3 = r10.length()
            android.text.style.StyleSpan r5 = new android.text.style.StyleSpan
            r5.<init>(r2)
            r0.<init>(r8, r3, r5)
        Lab:
            r4.G(r10)
            va2.l r8 = r4.f121583k
            r8.f125406r = r6
            r8.f125408t = r0
            r4.E(r1)
            r9.add(r4)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.grid.LegoPinGridCellImpl.e(com.pinterest.api.model.f30, java.util.ArrayList, boolean):void");
    }

    public final void e3(String str) {
        f30 f30Var = this.C0;
        if (f30Var == null) {
            return;
        }
        ua2.b0 F0 = F0();
        f30 f30Var2 = this.C0;
        int i13 = 0;
        boolean b13 = f30Var2 != null ? b40.b1(f30Var2) : false;
        if (b13) {
            int i14 = wy1.a.shuffles_icon_color_primary;
            va2.j E = F0.E();
            E.f125389t.setColor(bs1.c.A(E.f125381l, i14));
        }
        boolean z13 = !b13;
        va2.j E2 = F0.E();
        if (z13 != E2.f125380J) {
            E2.f125380J = z13;
            rm1.q qVar = E2.K;
            if (qVar != null) {
                E2.j(qVar);
            }
        }
        f30 f30Var3 = this.C0;
        F0.f121433t = (f30Var3 == null || !b40.b1(f30Var3)) ? null : rm1.q.SHUFFLES;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        F0.f121434u = str;
        F0.f121435v = 0;
        if (F0.f121433t != null && j1.F1(f30Var)) {
            i13 = getResources().getDimensionPixelSize(r0.lego_grid_cell_product_indicator_icon_size);
        } else if ((F0.f121433t != null && b40.Q0(f30Var) && !this.E) || b13) {
            i13 = getResources().getDimensionPixelSize(r0.lego_grid_cell_story_pin_pages_icon_size);
        }
        F0.f121436w = i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0283, code lost:
    
        if (r15.R4().booleanValue() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0292, code lost:
    
        if (com.pinterest.api.model.b40.U0(r15) != false) goto L133;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f2() {
        /*
            Method dump skipped, instructions count: 919
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.grid.LegoPinGridCellImpl.f2():boolean");
    }

    public final void g(NavigationImpl navigation) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        String X = X();
        nl1.d coreFragment = getCoreFragment();
        ph.a.h(navigation, X, this.G, coreFragment != null ? coreFragment.getF47730r2() : null);
    }

    public final ua2.f g0() {
        return (ua2.f) this.f52395b2.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a5 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g2(ps.a r19, h32.g0 r20, boolean r21, com.pinterest.api.model.f30 r22) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.grid.LegoPinGridCellImpl.g2(ps.a, h32.g0, boolean, com.pinterest.api.model.f30):void");
    }

    public final es.a getAdFormats() {
        es.a aVar = this.F1;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("adFormats");
        throw null;
    }

    public final vr.a getAdsCommonAnalytics() {
        vr.a aVar = this.G1;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.r("adsCommonAnalytics");
        throw null;
    }

    public final es.h getAdsCommonDisplay() {
        es.h hVar = this.C1;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.r("adsCommonDisplay");
        throw null;
    }

    @Override // y92.g
    public final int getAllowedHeightChange(int i13) {
        if (!resizable()) {
            return 0;
        }
        f30 f30Var = this.C0;
        boolean d2 = f30Var != null ? Intrinsics.d(f30Var.d5(), Boolean.TRUE) : false;
        Intrinsics.checkNotNullParameter(this, "<this>");
        int pinDrawableHeight = getPinDrawableHeight() - i13;
        int i14 = wa2.s.f128899l0;
        if (pinDrawableHeight < bk.f.R(false, d2)) {
            return i13;
        }
        Intrinsics.checkNotNullParameter(this, "<this>");
        return getPinDrawableHeight() - bk.f.R(false, d2);
    }

    @Override // qa2.u1
    public final int getAnchorHeight() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        return getPinDrawableHeight();
    }

    @Override // qa2.u1
    public final View getAnchorView() {
        return this;
    }

    @Override // qa2.b
    public final boolean getBottomVisible() {
        return this.G0;
    }

    public final nl1.d getCoreFragment() {
        Activity m03 = bs1.c.m0(this);
        if (m03 instanceof cp1.p) {
            return ((cp1.p) m03).getF52740f();
        }
        return null;
    }

    @Override // qa2.b
    public final int getCornerRadius() {
        return S0();
    }

    public final ni1.d getDeepLinkHelper() {
        ni1.d dVar = this.f52457r1;
        if (dVar != null) {
            return dVar;
        }
        Intrinsics.r("deepLinkHelper");
        throw null;
    }

    public final w getEventManager() {
        w wVar = this.Z0;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    public final r2 getExperiments() {
        r2 r2Var = this.f52402d1;
        if (r2Var != null) {
            return r2Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    @Override // qa2.b
    public final Rect getFavoriteButtonRect() {
        ArrayList arrayList = this.f52424j0;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof ua2.x) {
                arrayList2.add(obj);
            }
        }
        ua2.x xVar = (ua2.x) CollectionsKt.firstOrNull(arrayList2);
        if (xVar == null) {
            return null;
        }
        Rect bounds = xVar.f121627p.f125376q.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        return bounds;
    }

    public final q getImageCache() {
        q qVar = this.M1;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.r("imageCache");
        throw null;
    }

    @Override // qa2.f0
    public final qa2.h0 getInternalCell() {
        return this.X2;
    }

    @Override // qa2.b
    public final Rect getOverflowIconRect() {
        ArrayList arrayList = this.f52424j0;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof ua2.d0) {
                arrayList2.add(obj);
            }
        }
        ua2.d0 d0Var = (ua2.d0) CollectionsKt.firstOrNull(arrayList2);
        if (d0Var == null) {
            return null;
        }
        Rect bounds = d0Var.f121480m.f125398n.getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
        return bounds;
    }

    @Override // qy.a
    public final int getPWTImageHeight() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        wa2.a pinDrawable = getPinDrawable();
        if (pinDrawable != null) {
            return pinDrawable.f128842e;
        }
        return 0;
    }

    @Override // qy.a
    public final int getPWTImageWidth() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        wa2.a pinDrawable = getPinDrawable();
        if (pinDrawable != null) {
            return pinDrawable.f128841d;
        }
        return 0;
    }

    @Override // qy.a
    public final int getPWTImageX() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        wa2.a pinDrawable = getPinDrawable();
        if (pinDrawable != null) {
            return pinDrawable.f128839b;
        }
        return 0;
    }

    @Override // qy.a
    public final int getPWTImageY() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        wa2.a pinDrawable = getPinDrawable();
        if (pinDrawable != null) {
            return pinDrawable.f128840c;
        }
        return 0;
    }

    @Override // qa2.b
    public final int getPercentageVisible() {
        return this.N0;
    }

    @Override // qa2.b
    /* renamed from: getPin, reason: from getter */
    public final f30 getDeprecatedPin() {
        return this.C0;
    }

    public final b0 getPinAuxHelper() {
        b0 b0Var = this.K1;
        if (b0Var != null) {
            return b0Var;
        }
        Intrinsics.r("pinAuxHelper");
        throw null;
    }

    @Override // qa2.b
    public final wa2.a getPinDrawable() {
        k0 k0Var = this.f52468u0;
        if (k0Var != null) {
            return k0Var.f121531J;
        }
        return null;
    }

    @Override // qa2.b
    public final int getPinDrawableHeight() {
        k0 k0Var = this.f52468u0;
        if (k0Var != null) {
            return k0Var.f121531J.f128842e;
        }
        Intrinsics.r("primaryMediaPiece");
        throw null;
    }

    @Override // qa2.b
    /* renamed from: getPinImpression, reason: from getter */
    public final z1 getE0() {
        return this.E0;
    }

    @Override // qa2.b
    public final String getPinUid() {
        f30 f30Var = this.C0;
        if (f30Var != null) {
            return f30Var.getUid();
        }
        return null;
    }

    @Override // qy.a
    public final boolean getShouldTrackPWT() {
        return this.Y2;
    }

    @Override // qa2.b
    public final boolean getTopVisible() {
        return this.H0;
    }

    public final void i(ua2.c1 c1Var, ArrayList arrayList) {
        n0 n0Var = (n0) this.f52422i2.getValue();
        String str = c1Var.f121467p;
        n0Var.G(str);
        int i13 = !z.j(str) ? 1 : 0;
        va2.l lVar = n0Var.f121583k;
        lVar.f125406r = i13;
        lVar.f125408t = null;
        n0Var.E(false);
        if (this.f52479x) {
            n0Var.H(vn1.c.LIGHT);
        }
        arrayList.add(n0Var);
    }

    public final boolean i2(f30 f30Var, boolean z13) {
        Boolean bool;
        boolean a13;
        if (f30Var == null) {
            return false;
        }
        es.h adsCommonDisplay = getAdsCommonDisplay();
        boolean S = getExperiments().S();
        r2 experiments = getExperiments();
        z3 z3Var = a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) experiments.f83469a;
        boolean b03 = ((es.v) adsCommonDisplay).b0(f30Var, S, g1Var.o("android_collage_ads_beta", "enabled", z3Var) || g1Var.l("android_collage_ads_beta"), new x(this, 6), new x(this, 7));
        boolean U = ((es.c) getAdFormats()).U(f30Var);
        n nVar = this.W2;
        if (U || b03) {
            String D = com.bumptech.glide.c.D(f30Var);
            if (D == null) {
                D = "";
            }
            a11.e.b(nVar, f30Var, D, true, -1, null, null, null, null, null, 496);
        }
        if (!t1()) {
            if (this.A0 == null) {
                return false;
            }
            ip1.b bVar = this.f52413g1;
            if (bVar == null) {
                Intrinsics.r("prefetchManager");
                throw null;
            }
            bVar.a();
            d0 d0Var = this.A0;
            Intrinsics.f(d0Var);
            d0Var.onOpenPinCloseup(f30Var);
            return true;
        }
        f30 f30Var2 = this.C0;
        if (f30Var2 != null) {
            bool = Boolean.valueOf(!((es.v) getAdsCommonDisplay()).M(f30Var2) || (t1() && ((es.v) getAdsCommonDisplay()).L(f30Var2, ((es.v) getAdsCommonDisplay()).M(f30Var2))));
        } else {
            bool = null;
        }
        if (!z13) {
            b bVar2 = this.B1;
            if (bVar2 == null) {
                Intrinsics.r("adsHandshakeQuarantine");
                throw null;
            }
            if (!bVar2.b(f30Var) && Intrinsics.d(bool, Boolean.TRUE)) {
                ni1.d deepLinkHelper = getDeepLinkHelper();
                f30 f30Var3 = this.C0;
                a13 = deepLinkHelper.a(f30Var, f30Var3 != null ? f30Var3.getUid() : null, x(f30Var), this.Q1, null, (r19 & 32) != 0 ? false : O2(this.C0), (r19 & 64) != 0 ? false : R2(this.C0), getAdFormats());
                if (a13) {
                    return true;
                }
            }
        }
        fa faVar = this.X0;
        if (faVar != null) {
            g2(faVar.a(nVar), Y(), false, f30Var);
            return true;
        }
        Intrinsics.r("adEventHandlerFactory");
        throw null;
    }

    @Override // ar0.d
    /* renamed from: isDragAndDropEnabledForItem */
    public final boolean getF45303h() {
        return false;
    }

    @Override // qa2.b
    /* renamed from: isHideSupported, reason: from getter */
    public final boolean getIsHideSupported() {
        return this.G;
    }

    @Override // qy.a
    public final boolean isPWTImageDrawn() {
        Intrinsics.checkNotNullParameter(this, "<this>");
        wa2.a pinDrawable = getPinDrawable();
        return pinDrawable != null && ((wa2.s) pinDrawable).f128928y;
    }

    public final boolean isPinMediaHalfVisible() {
        float f13;
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            qc2.a aVar = this.f52453q1;
            if (aVar == null) {
                Intrinsics.r("viewabilityCalculator");
                throw null;
            }
            f13 = ((qc2.d) aVar).c(this, 0, 0, this.L0, this.M0, view);
        } else {
            f13 = 0.0f;
        }
        return f13 >= 50.0f;
    }

    public final void j(f30 f30Var, ua2.c1 c1Var, ArrayList arrayList) {
        int a13;
        n0 n0Var = (n0) this.f52418h2.getValue();
        String str = c1Var.f121466o;
        n0Var.F(new SpannableStringBuilder(str));
        n0Var.G(str);
        yr.a aVar = this.J1;
        if (aVar == null) {
            Intrinsics.r("adsDebugDeveloperPreferences");
            throw null;
        }
        ((m60.d) aVar.f140102a).g();
        yr.a aVar2 = this.J1;
        if (aVar2 == null) {
            Intrinsics.r("adsDebugDeveloperPreferences");
            throw null;
        }
        ((m60.d) aVar2.f140102a).g();
        n0Var.H(bs1.c.T0(f30Var, c1Var.f121466o, false, false, getExperiments().T(), this.f52479x));
        if (c1Var.f121474w) {
            n0Var.I(tn1.c.f118617i);
        }
        es.h adsCommonDisplay = getAdsCommonDisplay();
        z0 z0Var = this.E1;
        if (z0Var == null) {
            Intrinsics.r("experimentsActivator");
            throw null;
        }
        es.w k03 = ((es.v) adsCommonDisplay).k0(z0Var);
        if (((es.c) getAdFormats()).L(f30Var)) {
            a13 = 2;
        } else {
            if (!((es.v) getAdsCommonDisplay()).Z(f30Var, this.f52444o0, this.f52440n0)) {
                if (((es.v) getAdsCommonDisplay()).E(f30Var, Y())) {
                    a13 = ((es.v) getAdsCommonDisplay()).v(f30Var);
                } else if ((!n60.o.B(f30Var, "getIsPromoted(...)") || !b40.w0(f30Var) || !k03.f60016b || this.f52440n0) && (f30Var.d5().booleanValue() || !k03.f60015a)) {
                    a13 = c1Var.a();
                }
            }
            a13 = 1;
        }
        n0Var.f121583k.f125406r = a13;
        n0Var.E(true);
        c2(f30Var, n0Var);
        arrayList.add(n0Var);
    }

    public final void k(f30 f30Var, ua2.c1 c1Var, ArrayList arrayList) {
        wy0 N;
        String Z22;
        String Z23;
        String Z24;
        n0 H0 = H0();
        vn1.g variant = vn1.g.UI_100;
        H0.getClass();
        Intrinsics.checkNotNullParameter(variant, "variant");
        H0.f121583k.p(variant);
        o0 b13 = b1();
        b13.getClass();
        Intrinsics.checkNotNullParameter(variant, "variant");
        b13.f121583k.p(variant);
        if (c1Var.f121472u) {
            u22.c f13 = ((es.v) getAdsCommonDisplay()).f(f30Var, this.f52408f0, this.f52444o0, j1.Z0(C()));
            if (this.f52408f0 && j1.R0(f30Var) && getExperiments().U()) {
                wy0 N2 = b40.N(f30Var);
                if (N2 == null || (Z24 = N2.Z2()) == null) {
                    return;
                }
                b1().G(Z24);
                b1().f121583k.f125406r = 1;
                arrayList.add(b1());
                return;
            }
            if (f13 != u22.c.SHORT) {
                if (f13 != u22.c.MINIMAL || (N = b40.N(f30Var)) == null || (Z22 = N.Z2()) == null) {
                    return;
                }
                if (((es.c) getAdFormats()).L(f30Var)) {
                    D2(H0(), Z22);
                } else if (n1(f30Var)) {
                    E2(f30Var, H0());
                } else {
                    H0().G(Z22);
                }
                arrayList.add(H0());
                return;
            }
            wy0 N3 = b40.N(f30Var);
            if (N3 == null || (Z23 = N3.Z2()) == null) {
                return;
            }
            if (((es.c) getAdFormats()).L(f30Var)) {
                D2(H0(), Z23);
            } else if (n1(f30Var)) {
                E2(f30Var, H0());
            } else {
                H0().G(Z23);
                if (this.f52408f0 && j1.R0(f30Var) && getExperiments().Q(z3.ACTIVATE_EXPERIMENT)) {
                    H0().f121583k.f125406r = 1;
                }
            }
            arrayList.add(H0());
        }
    }

    public final ua2.n k0() {
        return (ua2.n) this.f52478w2.getValue();
    }

    public final void k2() {
        String D;
        f30 pin = this.C0;
        if (pin != null) {
            if (t1()) {
                this.Q1 = 0;
                fa faVar = this.X0;
                if (faVar != null) {
                    g2(faVar.a(this.W2), Y(), !t1(), pin);
                    return;
                } else {
                    Intrinsics.r("adEventHandlerFactory");
                    throw null;
                }
            }
            J1(this, null, u0.PIN_GRID_CLICKTHROUGH_BUTTON, Y(), null, null, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL);
            HashMap I0 = I0();
            es.c cVar = (es.c) getAdFormats();
            Intrinsics.checkNotNullParameter(pin, "pin");
            String b13 = cVar.b(((j80.b) cVar.f59979a).a(pin), pin);
            if (b13 != null) {
                String str = z.j(b13) ^ true ? b13 : null;
                if (str != null) {
                    D = str;
                    Intrinsics.f(D);
                    this.S0 = a11.e.c(this.W2, D, pin, true, 0, 0, t(getPinUid()), false, false, t2(), I0, null, false, false, null, t1(), false, false, 113880);
                }
            }
            D = com.bumptech.glide.c.D(pin);
            Intrinsics.f(D);
            this.S0 = a11.e.c(this.W2, D, pin, true, 0, 0, t(getPinUid()), false, false, t2(), I0, null, false, false, null, t1(), false, false, 113880);
        }
    }

    public final void l(ua2.c1 c1Var, ArrayList arrayList) {
        z90 Z5;
        List f13;
        n0 n0Var = (n0) this.f52414g2.getValue();
        es.c cVar = (es.c) c1Var.f121463l;
        f30 f30Var = c1Var.f121454c;
        int i13 = 0;
        if (cVar.P(f30Var) && (Z5 = f30Var.Z5()) != null && (f13 = Z5.f()) != null) {
            i13 = f13.size();
        }
        n0Var.G(i13 + " " + getContext().getString(m60.x0.quiz_questions));
        n0Var.H(vn1.c.SUBTLE);
        arrayList.add(n0Var);
    }

    public final void m(HashMap hashMap) {
        f30 f30Var = this.C0;
        hashMap.put("is_third_party_ad", String.valueOf(f30Var != null ? Intrinsics.d(f30Var.i5(), Boolean.TRUE) : false));
    }

    @Override // com.pinterest.ui.grid.LegoPinGridCell, nx.v
    public final nx.c0 markImpressionEnd() {
        f30 f30Var;
        Long l13;
        String str;
        k0 k0Var;
        String str2;
        f30 f30Var2;
        f30 f30Var3;
        wa2.g0 g0Var;
        f30 pin = this.C0;
        z1 z1Var = null;
        if (pin == null) {
            Log.d("LegoPinGridCellImpl", "Logging null pin impression end");
            bs1.c.r1(this.W1);
            return null;
        }
        d3(false);
        int i13 = this.K0;
        int i14 = this.J0;
        boolean z13 = this.f52428k0;
        boolean z14 = true;
        boolean z15 = (this.f52439n || ((g0Var = this.V2) != null && g0Var.f128722d)) && (f30Var = this.C0) != null && b40.m0(f30Var);
        String str3 = this.f52397c0;
        Integer valueOf = Integer.valueOf(P0(this.X2) + 1);
        boolean z16 = this.O;
        if (!this.f52416h0 && !this.f52420i0 && !X2(pin, this.V2)) {
            z14 = false;
        }
        ua2.c impressionData = new ua2.c(i13, i14, z13, z15, str3, valueOf, z16, null, null, Boolean.valueOf(z14), 384);
        k0 k0Var2 = this.f52468u0;
        if (k0Var2 == null) {
            Intrinsics.r("primaryMediaPiece");
            throw null;
        }
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        z1 z1Var2 = k0Var2.H;
        if (z1Var2 != null && ((l13 = z1Var2.f67480b) == null || l13.longValue() != -1)) {
            y1 y1Var = new y1(z1Var2);
            y1Var.f67439e = ep.b.f(1000000L);
            r2 r2Var = k0Var2.f121547y;
            r2Var.getClass();
            z3 z3Var = a4.f83298b;
            lh0.g1 g1Var = (lh0.g1) r2Var.f83469a;
            if (g1Var.o("android_ads_mrc_btr_1px1s", "enabled", z3Var) || g1Var.l("android_ads_mrc_btr_1px1s")) {
                y1Var.Y = Boolean.valueOf(impressionData.f121444g);
            }
            String str4 = k0Var2.E;
            long j13 = k0Var2.G;
            boolean z17 = k0Var2.D;
            ur.b bVar = (ur.b) k0Var2.f121548z;
            str = "pin";
            k0Var = k0Var2;
            str2 = "LegoPinGridCellImpl";
            f30Var2 = pin;
            bs1.c.Q1(y1Var, pin, str4, j13, i13, i14, k0Var2.f121538p, k0Var2.f121543u, valueOf, z17, z13, z15, str3, es.h.c(bVar.f123060c, pin), ((es.c) k0Var2.A).j0(pin) ? new h32.f() : null, null, ((vr.b) bVar.f123059b).g(pin), ((es.v) bVar.f123060c).o(pin), null, impressionData.f121447j, 294912);
            z1Var = y1Var.a();
        } else {
            k0Var = k0Var2;
            str = "pin";
            str2 = "LegoPinGridCellImpl";
            f30Var2 = pin;
        }
        if (z1Var != null) {
            LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) k0Var.f121541s;
            legoPinGridCellImpl.getClass();
            f30Var3 = f30Var2;
            Intrinsics.checkNotNullParameter(f30Var3, str);
            if (legoPinGridCellImpl.A1 == null) {
                Intrinsics.r("impressionDebugUtils");
                throw null;
            }
        } else {
            f30Var3 = f30Var2;
        }
        k0Var.I = -1L;
        k0Var.H = null;
        this.E0 = null;
        this.O = false;
        if (z1Var == null) {
            Log.d(str2, "Got null impression when ending for pin " + bs1.c.p0(f30Var3));
            return null;
        }
        Log.d(str2, "Ending grid impression for pin " + bs1.c.p0(f30Var3));
        getPinAuxHelper();
        b0.f(f30Var3, this.X1);
        g0 Y = Y();
        HashMap hashMap = this.X1;
        return new nx.c0(z1Var, new nx.c(Y, hashMap != null ? bs1.c.o2(hashMap) : null, t(getPinUid()), null, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e4  */
    @Override // com.pinterest.ui.grid.LegoPinGridCell, nx.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final nx.c0 markImpressionStart() {
        /*
            Method dump skipped, instructions count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.grid.LegoPinGridCellImpl.markImpressionStart():nx.c0");
    }

    public final boolean n() {
        f30 f30Var;
        v7 D3;
        if (this.f52463t) {
            return true;
        }
        if (p1() && (f30Var = this.C0) != null && (D3 = f30Var.D3()) != null && kh2.w.i0(D3)) {
            b60.b bVar = this.f52473v1;
            if (bVar == null) {
                Intrinsics.r("activeUserManager");
                throw null;
            }
            wy0 f13 = ((b60.d) bVar).f();
            if (f13 != null && dl2.b.P0(f13)) {
                return true;
            }
        }
        return false;
    }

    public final boolean n1(f30 pin) {
        es.h adsCommonDisplay = getAdsCommonDisplay();
        boolean z13 = this.f52444o0;
        boolean z14 = this.f52440n0;
        es.v vVar = (es.v) adsCommonDisplay;
        Intrinsics.checkNotNullParameter(pin, "pin");
        lh0.d dVar = vVar.f60008a;
        dVar.getClass();
        z3 z3Var = a4.f83297a;
        lh0.g1 g1Var = (lh0.g1) dVar.f83323a;
        return vVar.W(pin, z13, z14, g1Var.o("android_handshake_show_shipping", "enabled", z3Var) || g1Var.l("android_handshake_show_shipping"), new t(vVar, 2));
    }

    public final void o(b1 b1Var) {
        b01 M6;
        h01 W;
        b1Var.V = es.h.c(getAdsCommonDisplay(), this.C0);
        if (((es.c) getAdFormats()).j0(this.C0)) {
            b1Var.Y = new h32.f();
        }
        Short o13 = ((es.v) getAdsCommonDisplay()).o(this.C0);
        if (o13 != null) {
            b1Var.f66857d0 = Short.valueOf(o13.shortValue());
        }
        f30 f30Var = this.C0;
        Double m13 = (f30Var == null || (M6 = f30Var.M6()) == null || (W = d7.b.W(M6)) == null) ? null : W.m();
        if (m13 == null || m13.doubleValue() <= 0.0d) {
            return;
        }
        b1Var.f66872q = new h32.g3(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Long.valueOf((long) m13.doubleValue()), null, null, null, null, null);
    }

    public final ua2.o o0() {
        return (ua2.o) this.f52482x2.getValue();
    }

    @Override // qa2.b, qa2.c0
    public final void onAttached() {
        if (this.T2) {
            t0().F(false);
            f30 f30Var = this.C0;
            if (f30Var != null) {
                if (Intrinsics.d(((hs.c) d0()).a(f30Var.getUid()), Boolean.TRUE)) {
                    return;
                }
                e d03 = d0();
                String a03 = a0(f30Var);
                LruCache lruCache = ((hs.c) d03).f70027d;
                if (a03 == null) {
                    return;
                }
                lruCache.remove(a03);
            }
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getEventManager().h(this.V1);
    }

    @Override // qa2.c0
    public final void onDeactivated() {
    }

    @Override // qa2.c0
    public final void onDetached() {
        qa2.c cVar;
        k0 k0Var = this.f52468u0;
        if (k0Var != null && (cVar = k0Var.f121531J.f128923t) != null) {
            ((hs1.m) hs1.t.a()).h(cVar);
        }
        xj2.c cVar2 = this.S0;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.S0 = null;
        xj2.c cVar3 = this.T0;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        this.T0 = null;
        K0().e();
        K0().f101240c = 0;
        this.D0 = null;
        k2 k2Var = this.f52460s0;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
        if (this.T2) {
            t0().F(true);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        getEventManager().j(this.V1);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.C0 != null) {
            int i13 = 0;
            for (h0 h0Var : this.f52424j0) {
                boolean z13 = h0Var instanceof f0;
                h0Var.r(canvas, (!z13 && this.f52403e) ? i13 : 0, 0, z13 ? this.K0 : this.f52403e ? this.K0 : this.K0 - i13, this.J0);
                boolean z14 = h0Var instanceof ua2.d0;
                int i14 = this.Y1;
                if (z14) {
                    Rect bounds = ((ua2.d0) h0Var).f121480m.f125398n.getBounds();
                    Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
                    i13 = bounds.width() + i14;
                }
                if (h0Var instanceof ua2.x) {
                    i13 = h0Var.s() + i14;
                }
            }
            qb0.b.l(canvas);
            if (this.A1 == null) {
                Intrinsics.r("impressionDebugUtils");
                throw null;
            }
            Intrinsics.checkNotNullParameter(canvas, "canvas");
        }
        super.onDraw(canvas);
    }

    @Override // qa2.b, qa2.c0
    public final void onInitialized() {
        f30 f30Var;
        f30 f30Var2;
        if (!this.T2 || (f30Var = this.C0) == null) {
            return;
        }
        Object a13 = ((hs.c) d0()).a(f30Var.getUid());
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.d(a13, bool)) {
            if (!Intrinsics.d(((hs.c) d0()).a(a0(f30Var)), bool) || (f30Var2 = this.C0) == null) {
                return;
            }
            this.W1.u(f1.DL_AD_CLOSEUP_OVERLAY_IMPRESSION, f30Var2.getUid(), t(getPinUid()), I0(), false);
            e d03 = d0();
            String a03 = a0(f30Var2);
            Boolean bool2 = Boolean.FALSE;
            LruCache lruCache = ((hs.c) d03).f70027d;
            if (a03 == null) {
                return;
            }
            lruCache.put(a03, bool2);
        }
    }

    @Override // ar0.d
    public final void onItemDragEnd(int i13) {
        setBackground(this.f52488z0);
    }

    @Override // ar0.d
    public final void onItemDragStart() {
        this.f52488z0 = getBackground();
        Context context = getContext();
        int i13 = s0.lego_pin_rounded_rect;
        Object obj = d5.a.f53679a;
        setBackground(context.getDrawable(i13));
    }

    @Override // android.view.View
    public final void onLayout(boolean z13, int i13, int i14, int i15, int i16) {
        Integer num;
        g t33;
        ln e03;
        cc J3;
        List d2;
        String t13;
        String str;
        f30 f30Var;
        super.onLayout(z13, i13, i14, i15, i16);
        if (r1() && isPinMediaHalfVisible() && (f30Var = this.C0) != null) {
            b3(f30Var);
        }
        k0().getClass();
        ((ua2.s) this.Q2.getValue()).n();
        ((t0) this.R2.getValue()).n();
        if (r1() || j1.G1(this.C0, C(), getAdFormats())) {
            ViewParent parent = getParent();
            while (!(parent instanceof PinterestRecyclerView)) {
                parent = parent.getParent();
            }
            ((PinterestRecyclerView) parent).b(new cc1.c(this, 8));
        }
        HashMap f13 = this.W1.f();
        if (f13 == null) {
            f13 = new HashMap();
        }
        f13.put("pin_column_index", String.valueOf(P0(this.X2) + 1));
        f13.put("number_of_columns", String.valueOf(hf0.b.f69004d));
        f30 f30Var2 = this.C0;
        String str2 = "0";
        if (f30Var2 != null) {
            if (!((es.c) getAdFormats()).H(f30Var2)) {
                f30Var2 = null;
            }
            if (f30Var2 != null) {
                r2 experiments = getExperiments();
                z3 z3Var = a4.f83297a;
                lh0.g1 g1Var = (lh0.g1) experiments.f83469a;
                f13.put("is_third_party_ad_asin_enabled", (g1Var.o("ads_amazon_native_video_new_chin", "enabled", z3Var) || g1Var.l("ads_amazon_native_video_new_chin")) ? SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE : "0");
            }
        }
        f30 f30Var3 = this.C0;
        if (f30Var3 != null) {
            Boolean d53 = f30Var3.d5();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.d(d53, bool)) {
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    parent2.getParent();
                }
                if ((this.f52440n0 || this.f52444o0) && (num = this.P1) != null) {
                    f13.put("index", String.valueOf(num));
                }
                if (this.f52440n0) {
                    String str3 = this.M;
                    if (str3 != null) {
                        f13.put("story_type", str3);
                    }
                    Boolean bool2 = this.N;
                    if (bool2 != null) {
                        f13.put("is_multiple_advertiser", String.valueOf(bool2.booleanValue()));
                    }
                }
                if (((es.c) getAdFormats()).K(this.C0)) {
                    f30 f30Var4 = this.C0;
                    if (f30Var4 == null || (str = com.bumptech.glide.d.f0(f30Var4)) == null) {
                        str = "";
                    }
                    f13.put(SbaPinRep.AUXDATA_LEADAD_FORM_ID, str);
                    f13.put(SbaPinRep.AUXDATA_IS_LEAD_AD, SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
                }
                f30 f30Var5 = this.C0;
                if (f30Var5 != null && Intrinsics.d(f30Var5.O5(), bool)) {
                    f30 f30Var6 = this.C0;
                    if (f30Var6 != null && (J3 = f30Var6.J3()) != null && (d2 = J3.d()) != null) {
                        f30 f30Var7 = this.C0;
                        l30 l30Var = (l30) d2.get(f30Var7 != null ? b40.z(f30Var7) : 0);
                        if (l30Var != null && (t13 = l30Var.t()) != null) {
                            str2 = t13;
                        }
                    }
                    f13.put("internal_item_id", str2);
                }
                ((vr.b) getAdsCommonAnalytics()).c(this.C0, f13);
                getPinAuxHelper().a(this.C0, L(), f13);
                m(f13);
                f30 f30Var8 = this.C0;
                if (f30Var8 != null && (t33 = f30Var8.t3()) != null && (e03 = t33.e0()) != null) {
                    f13.put("promo_ad_type", String.valueOf(e03.i().intValue()));
                }
            }
        }
        getPinAuxHelper().c(this.C0, f13);
        this.X1 = f13;
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        this.K0 = View.MeasureSpec.getSize(i13);
        f30 f30Var = this.C0;
        if (f30Var == null || this.f52424j0.isEmpty()) {
            super.onMeasure(i13, i14);
            setMeasuredDimension(this.K0, this.J0);
            return;
        }
        int d2 = d2(f30Var);
        if (dl2.b.M1(f30Var)) {
            ViewParent parent = getParent();
            while (!(parent instanceof PinterestRecyclerView)) {
                parent = parent.getParent();
            }
            float height = ((PinterestRecyclerView) parent).getHeight() * 0.8f;
            if (height < this.J0) {
                this.R1 = Float.valueOf((height - (r3 - this.M0)) / this.K0);
                d2 = d2(f30Var);
            }
        }
        this.J0 = Math.max(this.J0, d2);
        super.onMeasure(i13, i14);
        setMeasuredDimension(this.K0, this.J0);
    }

    @Override // qa2.u1
    public final void onPulsarHide() {
    }

    @Override // qa2.u1
    public final void onPulsarShow() {
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i13) {
        boolean z13 = i13 == 1;
        if (this.f52403e != z13) {
            this.f52403e = z13;
            Iterator it = this.f52424j0.iterator();
            while (it.hasNext()) {
                ((h0) it.next()).f121494c = z13;
            }
        }
        super.onRtlPropertiesChanged(i13);
    }

    @Override // qa2.c0
    public final void onScrollStarted() {
        this.U0 = null;
        w2();
        invalidate();
    }

    @Override // qa2.f0, y92.i
    public final void onViewRecycled() {
        Iterator it = this.f52424j0.iterator();
        while (it.hasNext()) {
            wa2.l k13 = ((h0) it.next()).k();
            if (k13 != null) {
                k13.c();
            }
        }
        this.L0 = 0;
        this.M0 = 0;
    }

    public final boolean p1() {
        return Intrinsics.d(X(), "board") && Y() == g0.FLOWED_PIN;
    }

    public final void q(b1 b1Var, String str) {
        String str2;
        Object m13;
        Object m14;
        if (!this.f52393b0 || (str2 = this.f52397c0) == null) {
            return;
        }
        try {
            xk2.q qVar = xk2.s.f135225b;
            m13 = str != null ? Long.valueOf(Long.parseLong(str)) : null;
        } catch (Throwable th3) {
            xk2.q qVar2 = xk2.s.f135225b;
            m13 = ue.c.m(th3);
        }
        if (m13 instanceof r) {
            m13 = null;
        }
        Long l13 = (Long) m13;
        try {
            m14 = Long.valueOf(Long.parseLong(str2));
        } catch (Throwable th4) {
            xk2.q qVar3 = xk2.s.f135225b;
            m14 = ue.c.m(th4);
        }
        if (m14 instanceof r) {
            m14 = null;
        }
        b1Var.H = new x2(l13, str2, (Long) m14, null);
    }

    public final ua2.r r0() {
        return (ua2.r) this.f52406e2.getValue();
    }

    public final boolean r1() {
        return ((es.c) getAdFormats()).w(this.C0, new qa2.r(this, 2));
    }

    public final void r2(f30 f30Var, ua2.c1 metadata, wa2.g0 shoppingGridConfigModel, ArrayList arrayList) {
        String X0;
        this.T = shoppingGridConfigModel.f128743y;
        if (shoppingGridConfigModel.f128724f && (X0 = dl2.b.X0(f30Var)) != null) {
            ua2.b0 F0 = F0();
            F0.getClass();
            Intrinsics.checkNotNullParameter(X0, "<set-?>");
            F0.f121434u = X0;
            F0.f121435v = 0;
            arrayList.add(F0);
        }
        Boolean N4 = f30Var.N4();
        Intrinsics.checkNotNullExpressionValue(N4, "getIsEligibleForPreLovedGoodsLabel(...)");
        boolean booleanValue = N4.booleanValue();
        x0 x0Var = this.H2;
        if (booleanValue) {
            n0 n0Var = (n0) this.A2.getValue();
            n0Var.I(tn1.c.f118617i);
            n0Var.H(vn1.c.DEFAULT);
            String string = getResources().getString(wy1.f.pre_owned);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            n0Var.G(string);
            arrayList.add(n0Var);
            arrayList.add(x0Var);
        }
        boolean z13 = this.f52412g0;
        boolean z14 = metadata.f121472u;
        if (z13) {
            k(f30Var, metadata, arrayList);
            wa2.g0 a13 = wa2.g0.a(shoppingGridConfigModel, null, true, 25165823);
            V1(f30Var, metadata, a13, arrayList);
            U1(metadata, arrayList, a13);
            R1(f30Var, metadata, arrayList, a13, 0);
        } else if (z1() || (shoppingGridConfigModel.f128736r && !z14)) {
            V1(f30Var, metadata, shoppingGridConfigModel, arrayList);
            U1(metadata, arrayList, shoppingGridConfigModel);
            R1(f30Var, metadata, arrayList, shoppingGridConfigModel, 0);
        } else {
            R1(f30Var, metadata, arrayList, shoppingGridConfigModel, 0);
            V1(f30Var, metadata, shoppingGridConfigModel, arrayList);
            U1(metadata, arrayList, shoppingGridConfigModel);
        }
        boolean M2 = M2(f30Var);
        if (dl2.b.E2(f30Var, shoppingGridConfigModel, ((es.v) getAdsCommonDisplay()).j0(f30Var) && n60.o.y(f30Var, "getIsThirdPartyAd(...)"), M2)) {
            k kVar = this.f52490z2;
            if (M2) {
                l0 l0Var = (l0) kVar.getValue();
                l0Var.getClass();
                float W = b40.W(f30Var);
                Integer V = b40.V(f30Var);
                l0Var.f121561l.i(W, Integer.valueOf(V != null ? V.intValue() : 0), l0Var.f121560k);
                arrayList.add(l0Var);
            } else {
                l0 l0Var2 = (l0) kVar.getValue();
                l0Var2.getClass();
                float W2 = b40.W(f30Var);
                Integer X = b40.X(f30Var);
                l0Var2.f121561l.i(W2, Integer.valueOf(X != null ? X.intValue() : 0), l0Var2.f121560k);
                arrayList.add(l0Var2);
            }
            arrayList.add(x0Var);
        }
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(shoppingGridConfigModel, "shoppingGridConfigModel");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        if (dl2.b.F2(f30Var, shoppingGridConfigModel, z14)) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            String d13 = dl2.b.d1(f30Var, resources, null, null, 14);
            if (d13 != null) {
                n0 n0Var2 = (n0) this.f52430k2.getValue();
                Y0(d13, shoppingGridConfigModel.f128742x, n0Var2);
                arrayList.add(n0Var2);
                arrayList.add(x0Var);
            }
        }
        b(f30Var, metadata, arrayList);
        arrayList.add(this.G2);
    }

    @Override // y92.g
    public final boolean resizable() {
        return bs1.c.m1(this.C0, getAdFormats());
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0127, code lost:
    
        if ((r1 != null ? r1.f128727i : null) == h32.g0.SHOP_YOUR_SAVES_STL) goto L103;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(wa2.i r7) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.grid.LegoPinGridCellImpl.s(wa2.i):void");
    }

    public final boolean s1(f30 f30Var) {
        return ((es.c) getAdFormats()).w(f30Var, new qa2.r(this, 3)) && this.D0 != null;
    }

    public final void s2(f30 f30Var, ua2.c1 c1Var, wa2.g0 g0Var, ArrayList arrayList) {
        wt s13;
        List d2;
        int z13 = b40.z(f30Var);
        if (b40.k(f30Var).size() <= z13) {
            return;
        }
        if (g0Var.f128724f) {
            Intrinsics.checkNotNullParameter(f30Var, "<this>");
            Intrinsics.checkNotNullParameter(f30Var, "<this>");
            se0 M = b40.M(z13, f30Var);
            String str = null;
            List y13 = M != null ? M.y() : null;
            if (y13 == null) {
                y13 = kotlin.collections.q0.f80391a;
            }
            we0 we0Var = (we0) CollectionsKt.firstOrNull(y13);
            if (we0Var != null && (s13 = we0Var.s()) != null && (d2 = s13.d()) != null) {
                str = (String) CollectionsKt.firstOrNull(d2);
            }
            if (str != null) {
                ua2.b0 F0 = F0();
                F0.getClass();
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                F0.f121434u = str;
                F0.f121435v = 0;
                arrayList.add(F0);
            }
        }
        if (this.f52412g0) {
            k(f30Var, c1Var, arrayList);
        }
        boolean D2 = dl2.b.D2(f30Var, g0Var, ((es.v) getAdsCommonDisplay()).j0(f30Var), z13);
        int i13 = D2 ? 1 : 2;
        if (this.f52412g0) {
            X1(f30Var, arrayList, g0Var, Integer.valueOf(i13), z13);
            R1(f30Var, c1Var, arrayList, g0Var, z13);
        } else {
            R1(f30Var, c1Var, arrayList, g0Var, z13);
            X1(f30Var, arrayList, g0Var, Integer.valueOf(i13), z13);
        }
        x0 x0Var = this.H2;
        if (D2) {
            l0 l0Var = (l0) this.f52490z2.getValue();
            l0Var.getClass();
            float L = b40.L(z13, f30Var);
            Integer K = b40.K(z13, f30Var);
            l0Var.f121561l.i(L, Integer.valueOf(K != null ? K.intValue() : 0), l0Var.f121560k);
            arrayList.add(l0Var);
            arrayList.add(x0Var);
        }
        b(f30Var, c1Var, arrayList);
        arrayList.add(this.G2);
        if (D2) {
            return;
        }
        arrayList.add((n0) this.f52466t2.getValue());
        arrayList.add(x0Var);
    }

    @Override // qa2.b
    public final void setBottomVisible(boolean z13) {
        this.G0 = z13;
    }

    @Override // qa2.b
    public final void setPercentageVisible(int i13) {
        this.N0 = i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02c1, code lost:
    
        r7 = r52.V2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02c3, code lost:
    
        if (r7 == null) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02c8, code lost:
    
        if (r7.f128736r != true) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x02d1, code lost:
    
        r31 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02d6, code lost:
    
        r9 = new ua2.c1(r2, r18, r19, r20, r53, r3, r4, r0, r25, r26, r6, r5, r8, r30, r31, r32, r10, r11, getAdFormats(), getAdsCommonDisplay());
        r6 = r9.f121472u;
        r52.f52416h0 = r6;
        r52.f52420i0 = r9.e();
        r0 = r52.f52444o0;
        r2 = r52.f52440n0;
        r3 = mi1.e.e(r53, r5);
        r4 = C();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, "adFormatsExperiments");
        r7 = df.j1.Z0(r4);
        r8 = new is1.b(r4, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, "activateExperiments");
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0323, code lost:
    
        if (r3 != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0325, code lost:
    
        if (r0 != false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0327, code lost:
    
        if (r2 == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x032a, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0332, code lost:
    
        r52.f52408f0 = com.pinterest.api.model.b40.y0(r53, r0, ((es.c) getAdFormats()).L(r53));
        r0 = (es.v) getAdsCommonDisplay();
        r2 = r0.f60008a;
        r2.getClass();
        r11 = lh0.a4.f83297a;
        r2 = (lh0.g1) r2.f83323a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0359, code lost:
    
        if (r2.o("ads_android_brand_name_reorder", "enabled", r11) != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x035f, code lost:
    
        if (r2.l("ads_android_brand_name_reorder") == false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0362, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0365, code lost:
    
        r52.f52412g0 = r0.F(r53, r2, new es.t(r0, 0));
        r0 = r52.Y1;
        r10 = r52.G2;
        r10.f121632j = r0;
        r0 = r52.C0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0379, code lost:
    
        if (r0 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x037b, code lost:
    
        r0 = com.pinterest.api.model.b40.b1(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0383, code lost:
    
        if (r0 == false) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0385, code lost:
    
        r0 = bs1.c.T1(mi1.a.SHUFFLES, getExperiments());
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0391, code lost:
    
        if (r0.f87214b == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0393, code lost:
    
        getExperiments().D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x039c, code lost:
    
        if (r0.f87213a == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x039e, code lost:
    
        r0 = new kotlin.Pair(java.lang.Boolean.FALSE, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x03a5, code lost:
    
        r41 = r5;
        r18 = r10;
        r21 = r11;
        r10 = false;
        r11 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x05b4, code lost:
    
        r22 = ((java.lang.Boolean) r0.f80346a).booleanValue();
        r7 = (java.lang.String) r0.f80347b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x05c1, code lost:
    
        if (r6 != false) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x05c3, code lost:
    
        r0 = r53.u6();
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x05c9, code lost:
    
        if (r52.f52389J == false) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x05cb, code lost:
    
        if (r0 == null) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x05cd, code lost:
    
        r0 = r0.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x05d6, code lost:
    
        if (r0 != com.pinterest.api.model.rj0.a.APPROVED) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x05d2, code lost:
    
        r0 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x05d9, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x05dc, code lost:
    
        r6 = r9.f121476y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x05de, code lost:
    
        if (r6 != false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x05e0, code lost:
    
        if (r0 == false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x05e3, code lost:
    
        r23 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x05e8, code lost:
    
        r0 = L0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x05ec, code lost:
    
        if (r0 == null) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x05f2, code lost:
    
        if (r0.isEmpty() == false) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x05f7, code lost:
    
        if (r52.T1 == false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x05f9, code lost:
    
        r24 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x05fe, code lost:
    
        if (r24 == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x060a, code lost:
    
        if (((es.c) getAdFormats()).y(r53) != false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x060c, code lost:
    
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0611, code lost:
    
        r0 = D();
        r1 = r52.f52440n0;
        r2 = r52.f52444o0;
        r3 = r52.V2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x061b, code lost:
    
        if (r3 == null) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x061d, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0620, code lost:
    
        if (r3.f128738t != true) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0622, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x062c, code lost:
    
        if (r0.j(r53, r1, r2, r3) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0638, code lost:
    
        if (((es.v) getAdsCommonDisplay()).M(r53) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x063a, code lost:
    
        r17 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x063f, code lost:
    
        r0 = getAdsCommonDisplay();
        r4 = r52.L;
        r3 = r52.f52440n0;
        r2 = r52.f52444o0;
        r1 = (es.v) r0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r53, "pin");
        r19 = r1.f60008a.h();
        r20 = es.g.f59982k;
        r0 = new es.t(r1, r11);
        r11 = r5;
        r52.f52432l0 = r1.a0(r53, r3, r2, r4, null, r1.I(r53, r3, r2, false, r19, r20, r0), r1.Z(r53, r2, r3), false, r17);
        r7 = getAdsCommonDisplay();
        r1 = C();
        r2 = r52.f52440n0;
        r3 = r52.f52444o0;
        r0 = r52.f52489z1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x06a6, code lost:
    
        if (r0 == null) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x06a8, code lost:
    
        r4 = ((ac2.f) r0).c();
        r6 = r52.I1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x06b0, code lost:
    
        if (r6 == null) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x06b2, code lost:
    
        r52.O0 = df.j1.M1(r53, r1, r2, r3, r4, ((es.c) getAdFormats()).G(r53), r6, r7, getAdFormats());
        r9 = new java.util.ArrayList();
        r0 = D().m(r53, r52.f52440n0, r52.f52444o0);
        r52.f52436m0 = r0;
        r8 = r52.I2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x06dd, code lost:
    
        if (r0 == false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x06df, code lost:
    
        r0 = (ua2.q) r52.d2.getValue();
        r1 = ((es.c) getAdFormats()).i(r53);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x06f1, code lost:
    
        if (r1 == null) goto L343;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x06f3, code lost:
    
        r0.getClass();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "text");
        r3 = r0.f121594k;
        r3.f121451o.f125406r = 2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, "text");
        r3.f121451o.o(r1);
        r1 = kotlin.Unit.f80348a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x070e, code lost:
    
        r9.add(r0);
        r9.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0716, code lost:
    
        r2 = new qa2.x(r52, 10);
        r3 = new qa2.x(r52, 11);
        r4 = new qa2.x(r52, 12);
        r5 = new qa2.x(r52, 13);
        r6 = new qa2.x(r52, 14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0739, code lost:
    
        if (r16 != false) goto L352;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x073d, code lost:
    
        if (r52.f52432l0 == false) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0740, code lost:
    
        r16 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0745, code lost:
    
        r0 = r52.V2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0747, code lost:
    
        if (r0 == null) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0749, code lost:
    
        r17 = r0.f128726h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0750, code lost:
    
        if (r0 == null) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0752, code lost:
    
        r26 = r53.E6();
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x075b, code lost:
    
        r1 = r52.f52436m0;
        r0 = r52.f52391a1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x075f, code lost:
    
        if (r0 == null) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0761, code lost:
    
        r14 = r52.f52425j1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0763, code lost:
    
        if (r14 == null) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0765, code lost:
    
        r27 = getExperiments();
        r14 = r52.L1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x076d, code lost:
    
        if (r14 == null) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x076f, code lost:
    
        r46 = r18;
        r48 = r21;
        r15 = new ua2.k0(r52, r2, r3, r4, r5, r6, r16, r54, r52, r52, r52, r17, r26, r1, r0, r14, r27, r14, getImageCache(), getAdFormats());
        r52.f52468u0 = r15;
        r15.G(S0());
        r15.C = r52.f52484y0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x07c0, code lost:
    
        if (com.pinterest.api.model.b40.s0(r53) == false) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x07c2, code lost:
    
        r10 = r52.f52404e0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x07c6, code lost:
    
        r15.K = r10;
        r1 = r1();
        r8 = r52.C2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x07ce, code lost:
    
        if (r1 == false) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x07d0, code lost:
    
        r14 = r52.D0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x07d2, code lost:
    
        if (r14 != null) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x07d4, code lost:
    
        r14 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x07d6, code lost:
    
        ((ua2.u) r8.getValue()).F();
        r15.F(r14);
        r1 = kotlin.Unit.f80348a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x07e8, code lost:
    
        if (s1(r53) == false) goto L378;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x07ea, code lost:
    
        r15.H = r52.E0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x07ee, code lost:
    
        r9 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x07f9, code lost:
    
        r9.add(r15);
        r0 = D();
        r2 = r52.f52440n0;
        r3 = r52.f52444o0;
        r1 = r52.V2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0806, code lost:
    
        if (r1 == null) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0808, code lost:
    
        r4 = java.lang.Boolean.valueOf(r1.f128738t);
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0815, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "pin");
        r1 = r0.f62827a;
        r0 = r0.o(r53, r2, r3, r4, r1.a(), new fs.b(r1, 7));
        r1 = r52.f52472v0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x082e, code lost:
    
        if (r0 == false) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0830, code lost:
    
        r6 = 0;
        r0 = new ua2.p(r52, java.lang.Integer.valueOf(((java.lang.Number) r1.getValue()).intValue()), 0);
        r3 = bs1.c.f2(r52, wy1.f.deal);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "<set-?>");
        r0.f121434u = r3;
        r9.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x085e, code lost:
    
        if (((es.v) getAdsCommonDisplay()).c0(r9) == false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0860, code lost:
    
        r0 = ((es.v) getAdsCommonDisplay()).x(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x086a, code lost:
    
        if (r0 == null) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x086c, code lost:
    
        r12 = true;
        r3 = new ua2.p(r52, java.lang.Integer.valueOf(((java.lang.Number) r1.getValue()).intValue()), 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, "<set-?>");
        r3.f121434u = r0;
        r9.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x088c, code lost:
    
        if (r52.O0 == false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x088e, code lost:
    
        r0 = B0();
        r0.G();
        r0.H(r6);
        r9.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x089b, code lost:
    
        r0 = ((es.c) getAdFormats()).d(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x08a5, code lost:
    
        if (r0 == null) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x08ab, code lost:
    
        if (r52.f52396c.f128881q0 == false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x08b1, code lost:
    
        if (com.pinterest.api.model.b40.p0(r53) == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x08c5, code lost:
    
        if (((es.v) getAdsCommonDisplay()).U(r9, getF52444o0(), getF52440n0()) == false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x095b, code lost:
    
        if (r22 == false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x095f, code lost:
    
        if (r52.V2 != null) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0965, code lost:
    
        if (Z2(r53) != false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0967, code lost:
    
        e3(r7);
        r9.add(F0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0973, code lost:
    
        r0 = r53.v6();
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0977, code lost:
    
        if (r0 == null) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0983, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0.o(), java.lang.Boolean.TRUE) == false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0985, code lost:
    
        r9.add(r0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x098e, code lost:
    
        if (r52.f52435m == false) goto L436;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0990, code lost:
    
        r0 = o0();
        r2 = r52.f52468u0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0996, code lost:
    
        if (r2 == null) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0998, code lost:
    
        r0.E(r2.f121531J);
        r0.F(r9);
        r9.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x09a4, code lost:
    
        kotlin.jvm.internal.Intrinsics.r("primaryMediaPiece");
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x09a9, code lost:
    
        throw r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x09ac, code lost:
    
        if (r52.f52443o == false) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x09b2, code lost:
    
        if (com.pinterest.api.model.b40.V0(r53) == false) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x09b8, code lost:
    
        if (r53.L6() == null) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x09ba, code lost:
    
        r0 = (ua2.y0) r52.B2.getValue();
        r0.F(r53.L6());
        r0.E(((java.lang.Number) r1.getValue()).intValue());
        r9.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x09d9, code lost:
    
        if (r24 == false) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x09db, code lost:
    
        r52.f52428k0 = r12;
        r0 = (ua2.j0) r52.P2.getValue();
        r0.E(S0());
        r1 = L0();
        kotlin.jvm.internal.Intrinsics.f(r1);
        r0.G(kotlin.collections.CollectionsKt.F0(r1));
        r0.F();
        r9.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0a07, code lost:
    
        if (r1() == false) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x0a09, code lost:
    
        r0 = (ua2.u) r8.getValue();
        r1 = getResources().getString(m60.x0.watch_again);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "getString(...)");
        r0.H(r1);
        r0.G(S0(), r52.f52480x0);
        r9.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0a2f, code lost:
    
        if (r52.f52415h == false) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0a31, code lost:
    
        if (r23 != false) goto L453;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0dc7, code lost:
    
        r52.f52424j0 = r9;
        requestLayout();
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0dd2, code lost:
    
        if (com.pinterest.api.model.b40.X0(r52.C0) == false) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0dd4, code lost:
    
        setImportantForAccessibility(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0dd8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0a39, code lost:
    
        if (r52.f52432l0 != false) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0a3b, code lost:
    
        r9.add(r46);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0a40, code lost:
    
        if (r52.f52432l0 == false) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0a42, code lost:
    
        r0 = k0();
        r0.E(r9, getF52440n0(), getF52444o0());
        r9.add(r0);
        r9.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0a5b, code lost:
    
        if (r6 == false) goto L465;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0a5d, code lost:
    
        r1 = (ua2.d0) r52.f52410f2.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0a69, code lost:
    
        if (n60.o.y(r9, "getIsThirdPartyAd(...)") == false) goto L464;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0a6b, code lost:
    
        r1.E(getContext().getString(wy1.f.third_party_overflow_title));
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0a78, code lost:
    
        r9.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0aaf, code lost:
    
        K1(r52);
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0abe, code lost:
    
        if (((es.c) getAdFormats()).P(r9) == false) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0ac0, code lost:
    
        l(r9, r9);
        r9.add(r52.J2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0ac8, code lost:
    
        r1 = r52.V2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0aca, code lost:
    
        if (r1 == null) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0acc, code lost:
    
        r1 = r1.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0ad2, code lost:
    
        O1(r9, r9, r1);
        r1 = ((es.v) getAdsCommonDisplay()).m(r9, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0adf, code lost:
    
        if (r1 != com.pinterest.api.model.g.b.ENABLED_OVERLAY) goto L486;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0ae3, code lost:
    
        if (r52.f52432l0 == false) goto L484;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0ae5, code lost:
    
        r1 = t0();
        r2 = S0();
        r1 = r1.E();
        r1.getClass();
        r1.f125305u = r2;
        r1.f125306v = (float) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0b14, code lost:
    
        t0().G(r9);
        r9.add(t0());
        r52.T2 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0afb, code lost:
    
        r1 = t0();
        r2 = S0();
        r3 = S0();
        r1 = r1.E();
        r1.getClass();
        r1.f125305u = r2;
        r1.f125306v = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0b26, code lost:
    
        if (r52.V2 != null) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0b32, code lost:
    
        if (((es.v) getAdsCommonDisplay()).B(r9) == false) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0b38, code lost:
    
        if (n60.o.y(r9, "getIsThirdPartyAd(...)") == false) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0b3a, code lost:
    
        r52.V2 = new wa2.g0(((es.v) getAdsCommonDisplay()).e0(r9), false, false, ((es.v) getAdsCommonDisplay()).j0(r9), false, false, null, null, null, false, false, false, false, 0, false, false, false, false, false, false, false, false, 33554422);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0b95, code lost:
    
        if (((es.v) getAdsCommonDisplay()).J(r9, getF52444o0(), getF52440n0()) == false) goto L533;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0bb1, code lost:
    
        if (((es.v) getAdsCommonDisplay()).f0(r53, r52.R, r52.S, getF52444o0(), getF52440n0()) != false) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0bb3, code lost:
    
        r0 = getAdsCommonDisplay();
        r2 = getF52440n0();
        r3 = getF52444o0();
        r0 = (es.v) r0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "pin");
        r1 = r0.f60008a;
        r1.getClass();
        r1 = (lh0.g1) r1.f83323a;
        r14 = "enabled";
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0bd7, code lost:
    
        if (r1.o("android_handshake_show_price", r14, r48) != false) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0bdd, code lost:
    
        if (r1.l("android_handshake_show_price") == false) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0be0, code lost:
    
        r4 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0be3, code lost:
    
        r12 = r48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0bf2, code lost:
    
        if (r0.X(r53, r2, r3, r4, new es.t(r0, 3)) != false) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0bf4, code lost:
    
        r2 = r52.C0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0bf6, code lost:
    
        if (r2 == null) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0c0b, code lost:
    
        if (((es.v) getAdsCommonDisplay()).G(r2, r52.R, r52.S, r52.f52444o0, r52.f52440n0) == false) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0c0e, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0c2d, code lost:
    
        if (((es.v) getAdsCommonDisplay()).h0(r53, r52.R, r52.S, getF52444o0(), getF52440n0()) != false) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0c2f, code lost:
    
        r0 = getAdsCommonDisplay();
        r2 = getF52440n0();
        r3 = getF52444o0();
        r0 = (es.v) r0;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, "pin");
        r1 = r0.f60008a;
        r1.getClass();
        r1 = (lh0.g1) r1.f83323a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0c4f, code lost:
    
        if (r1.o("android_handshake_show_rating", r14, r12) != false) goto L522;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0c55, code lost:
    
        if (r1.l("android_handshake_show_rating") == false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0c58, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x0c67, code lost:
    
        if (r0.Y(r53, r2, r3, r4, new es.t(r0, 4)) != false) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0c69, code lost:
    
        r0 = r52.C0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x0c6b, code lost:
    
        if (r0 == null) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0c8b, code lost:
    
        if (((es.v) getAdsCommonDisplay()).H(r0, r52.R, r52.S, r52.f52444o0, r52.f52440n0) == false) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0c8e, code lost:
    
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0c93, code lost:
    
        r52.V2 = new wa2.g0(r6, false, false, r18, false, false, null, null, null, false, false, false, false, 0, false, false, false, false, false, false, false, false, 33554422);
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0c5a, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x0c91, code lost:
    
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0c14, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0be2, code lost:
    
        r4 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0c10, code lost:
    
        r12 = r48;
        r14 = "enabled";
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0cc7, code lost:
    
        r0 = r53.N4();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "getIsEligibleForPreLovedGoodsLabel(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0cd4, code lost:
    
        if (r0.booleanValue() == false) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0cd6, code lost:
    
        r52.V2 = new wa2.g0(false, false, false, false, false, false, null, null, null, false, false, false, false, 0, false, false, false, false, false, false, false, false, 33554422);
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0d0e, code lost:
    
        if (r52.V2 == null) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0d10, code lost:
    
        r0 = r53.O5();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "getPromotedIsCatalogCarouselAd(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0d1d, code lost:
    
        if (r0.booleanValue() == false) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0d1f, code lost:
    
        r0 = r52.V2;
        kotlin.jvm.internal.Intrinsics.f(r0);
        s2(r9, r9, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0d29, code lost:
    
        r0 = r52.V2;
        kotlin.jvm.internal.Intrinsics.f(r0);
        r2(r9, r9, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0d33, code lost:
    
        r0 = r52.D;
        r1 = r52.H2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0d37, code lost:
    
        if (r0 != false) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0d3d, code lost:
    
        if (W2() == false) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0d43, code lost:
    
        if (W2() == false) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0d45, code lost:
    
        r0 = (ua2.m0) r52.f52486y2.getValue();
        r0.E(r9);
        r9.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0d53, code lost:
    
        r9.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0d56, code lost:
    
        r11 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0d5c, code lost:
    
        if (mi1.e.e(r9, r11) == false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0d5e, code lost:
    
        e(r9, r9, r11);
        r9.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0d64, code lost:
    
        r0 = xk2.m.b(new qa2.y(r52, r9, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0d70, code lost:
    
        if (r52.f52412g0 == false) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0d72, code lost:
    
        k(r9, r9, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0d79, code lost:
    
        if (r9.d() == false) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0d7f, code lost:
    
        if (l2(r0) != false) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0d81, code lost:
    
        j(r9, r9, r9);
        b2(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0d89, code lost:
    
        if (r52.f52408f0 == false) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0d8b, code lost:
    
        r9.add(r52.K2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0d91, code lost:
    
        r9.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x0d98, code lost:
    
        if (r9.c() == false) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0d9a, code lost:
    
        i(r9, r9);
        r9.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0da0, code lost:
    
        b(r9, r9, r9);
        r9.add(r46);
        Z();
        r0 = c0.d.I(r9, ff0.a.f62099a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0daf, code lost:
    
        if (r0 == null) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0db1, code lost:
    
        r1 = r52.D2;
        ((sa2.c) r1.getValue()).F(r0);
        r9.add((sa2.c) r1.getValue());
        r0 = kotlin.Unit.f80348a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0ad1, code lost:
    
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0a80, code lost:
    
        if (n() == false) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0a82, code lost:
    
        r1 = z0();
        r2 = r53.o4();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "getFavoritedByMe(...)");
        r1.F(r2.booleanValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0a98, code lost:
    
        if (r52.f52467u == false) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0a9a, code lost:
    
        r2 = r53.n4();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "getFavoriteUserCount(...)");
        r2 = r2.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0aa9, code lost:
    
        r1.E(r2);
        r9.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x0aa8, code lost:
    
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0a01, code lost:
    
        r52.f52428k0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x08c7, code lost:
    
        r2 = g0();
        r2.F(r0);
        r9.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x08d7, code lost:
    
        if (Z2(r53) == false) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x08d9, code lost:
    
        r0 = F0();
        r0.f121433t = rm1.q.FACE_TRYON;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "<set-?>");
        r0.f121434u = "";
        r0.f121436w = getResources().getDimensionPixelSize(m60.r0.lego_grid_cell_ar_indicator_icon_size);
        r9.add(r0);
        r0 = r52.W1.h0((r18 & 1) != 0 ? h32.f1.TAP : h32.f1.RENDER, (r18 & 2) != 0 ? null : h32.u0.VIRTUAL_TRY_ON_ICON, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & com.pinterest.feature.core.view.RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0915, code lost:
    
        if (r52.f52401d0 == false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0917, code lost:
    
        r0 = F0();
        r4 = eo1.b.color_icon_dark;
        r5 = r0.E();
        r5.f125389t.setColor(bs1.c.A(r5.f125381l, r4));
        ua2.b0.F(r0, rm1.c.LIGHT);
        r4 = r53.a5();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, "getIsOwnedByViewer(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x093e, code lost:
    
        if (r4.booleanValue() == false) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0940, code lost:
    
        r4 = rm1.q.ANGLED_PIN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0945, code lost:
    
        r0.f121433t = r4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("", "<set-?>");
        r0.f121434u = "";
        r0.f121436w = getResources().getDimensionPixelSize(m60.r0.lego_grid_cell_ar_indicator_icon_size);
        r9.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0943, code lost:
    
        r4 = rm1.q.DOWNLOAD;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0889, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0853, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0812, code lost:
    
        r4 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x07f3, code lost:
    
        r9 = r53;
        r15.E(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x07c5, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0dd9, code lost:
    
        kotlin.jvm.internal.Intrinsics.r("adsCoreDependencies");
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0ddf, code lost:
    
        throw r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0de0, code lost:
    
        kotlin.jvm.internal.Intrinsics.r("pageSizeProvider");
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0de6, code lost:
    
        throw r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x0de7, code lost:
    
        kotlin.jvm.internal.Intrinsics.r("perfLogApplicationUtils");
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0ded, code lost:
    
        throw r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0759, code lost:
    
        r26 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x074e, code lost:
    
        r17 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0743, code lost:
    
        r16 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0dee, code lost:
    
        kotlin.jvm.internal.Intrinsics.r("adsAudioOverlayPowerscoreExperimentManager");
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0df4, code lost:
    
        throw r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0df5, code lost:
    
        kotlin.jvm.internal.Intrinsics.r("videoManagerUtil");
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0dfb, code lost:
    
        throw r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x063d, code lost:
    
        r17 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0624, code lost:
    
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0626, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x060f, code lost:
    
        r16 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x05fc, code lost:
    
        r24 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x05e6, code lost:
    
        r23 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x05db, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x03af, code lost:
    
        r0 = new kotlin.Pair(java.lang.Boolean.TRUE, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x03b9, code lost:
    
        if (r52.f52401d0 == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x03bb, code lost:
    
        r0 = new kotlin.Pair(java.lang.Boolean.FALSE, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x03c5, code lost:
    
        if (r52.f52407f == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x03cb, code lost:
    
        if (dl2.b.M1(r53) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x03dd, code lost:
    
        if (com.pinterest.api.model.b40.X0(r53) == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x03ec, code lost:
    
        if (((long) java.lang.Float.parseFloat(com.pinterest.api.model.b40.g0(r53))) <= 0) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x03f2, code lost:
    
        if (n60.o.B(r53, "getIsPromoted(...)") == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x03f4, code lost:
    
        r0 = D();
        r2 = r52.f52440n0;
        r3 = r52.f52444o0;
        r1 = r52.V2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x03fe, code lost:
    
        if (r1 == null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0403, code lost:
    
        if (r1.f128738t != true) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0405, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0408, code lost:
    
        r1 = r0.f62827a;
        r16 = r1.a();
        r17 = r5;
        r5 = (lh0.g1) r1.f83323a;
        r18 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x041c, code lost:
    
        if (r5.o("ads_android_deal_ads_expansion_video_remove_timestamp", "enabled", r11) != false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0422, code lost:
    
        if (r5.l("ads_android_deal_ads_expansion_video_remove_timestamp") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0425, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0428, code lost:
    
        r21 = r11;
        r5 = new fs.b(r1, 0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r53, "pin");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "activateExperiment");
        r11 = 5;
        r41 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0445, code lost:
    
        if (r0.c(r53, r2, r3, r4, r16) != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0448, code lost:
    
        r5.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x044b, code lost:
    
        if (r10 == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x045d, code lost:
    
        if (r53.d5().booleanValue() != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x045f, code lost:
    
        r0 = (lh0.g1) getExperiments().f83469a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x046d, code lost:
    
        if (r0.o("android_organic_video_time_stamp_removal", "enabled", r40) != false) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0473, code lost:
    
        if (r0.l("android_organic_video_time_stamp_removal") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0491, code lost:
    
        r0 = new kotlin.Pair(java.lang.Boolean.FALSE, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x048e, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0476, code lost:
    
        r0 = new kotlin.Pair(java.lang.Boolean.TRUE, ac2.d.a((long) java.lang.Float.parseFloat(com.pinterest.api.model.b40.g0(r53)), ac2.q1.VIDEO_HOME_FEED, ac2.e1.ROUND));
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0427, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x0407, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x044e, code lost:
    
        r41 = r5;
        r18 = r10;
        r21 = r11;
        r11 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:454:0x0499, code lost:
    
        r41 = r5;
        r18 = r10;
        r21 = r11;
        r2 = r40;
        r11 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x04a6, code lost:
    
        if (com.pinterest.api.model.b40.D0(r53) == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x04a8, code lost:
    
        r0 = bs1.c.T1(mi1.a.GIF, getExperiments());
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x04b4, code lost:
    
        if (r0.f87214b == false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x04b6, code lost:
    
        getExperiments().D();
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x04bf, code lost:
    
        if (r0.f87213a == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x04c1, code lost:
    
        r0 = new kotlin.Pair(java.lang.Boolean.FALSE, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x04c9, code lost:
    
        r0 = new kotlin.Pair(java.lang.Boolean.TRUE, getContext().getString(m60.x0.lego_grid_gif_indicator));
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x04df, code lost:
    
        if (com.pinterest.api.model.b40.Q0(r53) == false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x04e3, code lost:
    
        if (r52.E == false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x04e9, code lost:
    
        if (com.pinterest.api.model.b40.Q0(r53) == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x04ef, code lost:
    
        if (n60.o.B(r53, "getIsPromoted(...)") == false) goto L239;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x04f3, code lost:
    
        r0 = r53.v6();
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x04f7, code lost:
    
        if (r0 == null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x04f9, code lost:
    
        r0 = r0.u();
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0504, code lost:
    
        r0 = r0.intValue();
        r3 = r53.v6();
        r4 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x050d, code lost:
    
        if (r3 == null) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x050f, code lost:
    
        r3 = r3.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0513, code lost:
    
        if (r3 == null) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0515, code lost:
    
        r3 = java.lang.Float.parseFloat(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:480:0x051d, code lost:
    
        if (r0 > 1) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x0521, code lost:
    
        if (r3 <= 0.0f) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x053d, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0573, code lost:
    
        if (com.pinterest.api.model.b40.P0(r53) != false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0579, code lost:
    
        if (r0.length() <= 0) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x057b, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x057e, code lost:
    
        r0 = new kotlin.Pair(java.lang.Boolean.valueOf(r1), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x057d, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0527, code lost:
    
        if (n60.o.B(r53, "getIsPromoted(...)") != false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0529, code lost:
    
        r0 = (lh0.g1) getExperiments().f83469a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0535, code lost:
    
        if (r0.o("android_organic_video_time_stamp_removal", "enabled", r2) != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x053b, code lost:
    
        if (r0.l("android_organic_video_time_stamp_removal") == false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0543, code lost:
    
        if (com.pinterest.api.model.b40.Q0(r53) == false) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0545, code lost:
    
        r0 = r53.v6();
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0549, code lost:
    
        if (r0 == null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x054b, code lost:
    
        r0 = r0.v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x054f, code lost:
    
        if (r0 == null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0551, code lost:
    
        r0 = java.lang.Float.parseFloat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0557, code lost:
    
        r1 = r53.v6();
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x055b, code lost:
    
        if (r1 == null) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x055d, code lost:
    
        r4 = com.pinterest.api.model.jl0.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0562, code lost:
    
        r4 = r4 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0556, code lost:
    
        r0 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0563, code lost:
    
        r0 = ac2.d.a((long) r4, ac2.q1.VIDEO_HOME_FEED, ac2.e1.ROUND);
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x051b, code lost:
    
        r3 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x04ff, code lost:
    
        r10 = false;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x056d, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0589, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x058c, code lost:
    
        if (r52.f52447p == false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x058e, code lost:
    
        r0 = po1.c.b(r53);
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0592, code lost:
    
        if (r0 == null) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0594, code lost:
    
        r0 = new kotlin.Pair(java.lang.Boolean.TRUE, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x059d, code lost:
    
        r0 = new kotlin.Pair(java.lang.Boolean.FALSE, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x05a5, code lost:
    
        r0 = new kotlin.Pair(java.lang.Boolean.FALSE, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x03cd, code lost:
    
        r41 = r5;
        r18 = r10;
        r21 = r11;
        r10 = false;
        r11 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x05ad, code lost:
    
        r0 = new kotlin.Pair(java.lang.Boolean.FALSE, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0380, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0364, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x032c, code lost:
    
        r8.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x032f, code lost:
    
        if (r7 != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0331, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x02cf, code lost:
    
        if (z1() == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x02d4, code lost:
    
        r31 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x02a2, code lost:
    
        r9 = r52.C0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x02a4, code lost:
    
        if (r9 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x02aa, code lost:
    
        if (df.j1.F1(r9) != r7) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x02ac, code lost:
    
        r7 = r52.C0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x02ae, code lost:
    
        if (r7 == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x02ba, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r7.d5(), java.lang.Boolean.TRUE) != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x02bc, code lost:
    
        r30 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0257, code lost:
    
        if (com.pinterest.api.model.b40.X0(r53) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0296, code lost:
    
        if (r9.f128735q == true) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x02a0, code lost:
    
        if (z1() == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02bf, code lost:
    
        r30 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0291  */
    /* JADX WARN: Type inference failed for: r0v210, types: [java.lang.Object, ua2.y] */
    /* JADX WARN: Type inference failed for: r37v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v25 */
    @Override // qa2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setPin(com.pinterest.api.model.f30 r53, int r54) {
        /*
            Method dump skipped, instructions count: 3580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.ui.grid.LegoPinGridCellImpl.setPin(com.pinterest.api.model.f30, int):void");
    }

    @Override // qa2.b
    public final void setPinActionHandler(d0 d0Var) {
        this.A0 = d0Var;
    }

    @Override // qa2.b
    public final void setPinalytics(nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.W1 = pinalytics;
    }

    @Override // android.view.View
    public final void setPressed(boolean z13) {
        super.setPressed(z13);
        if (z13) {
            return;
        }
        this.U0 = null;
        w2();
        invalidate();
    }

    @Override // qa2.b
    public final void setTopVisible(boolean z13) {
        this.H0 = z13;
    }

    public final c1 t(String str) {
        Short o13;
        b1 b1Var = new b1();
        q(b1Var, str);
        o(b1Var);
        x32.b z13 = z();
        if (z13 != null) {
            b1Var.Z = z13;
        }
        f30 f30Var = this.C0;
        if (f30Var != null && (o13 = ((es.v) getAdsCommonDisplay()).o(f30Var)) != null) {
            b1Var.f66857d0 = o13;
        }
        f30 f30Var2 = this.C0;
        if (f30Var2 != null) {
            b1Var.f66859e0 = c2.f(f30Var2, getAdFormats(), getAdsCommonAnalytics(), O2(f30Var2), R2(f30Var2), getExperiments().V());
        }
        return b1Var.a();
    }

    public final ua2.l t0() {
        return (ua2.l) this.U2.getValue();
    }

    public final boolean t1() {
        f30 f30Var;
        if (this.T1 && (f30Var = this.C0) != null) {
            es.h adsCommonDisplay = getAdsCommonDisplay();
            lh0.d dVar = this.f52405e1;
            if (dVar == null) {
                Intrinsics.r("adFormatsLibraryExperiments");
                throw null;
            }
            ArrayList A = ((es.v) adsCommonDisplay).A(f30Var, dVar, Boolean.TRUE);
            if (A != null && !A.isEmpty()) {
                if (!((es.c) getAdFormats()).S(this.C0)) {
                    if (((es.c) getAdFormats()).y(this.C0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final i0 t2() {
        i0 p13 = this.W1.p();
        int i13 = 0;
        if (this.f52440n0) {
            if (p13 != null) {
                return com.bumptech.glide.d.z0(p13, new qa2.z(this, i13));
            }
            return null;
        }
        if (this.f52444o0) {
            if (p13 != null) {
                return com.bumptech.glide.d.z0(p13, new a0(this, p13, i13));
            }
            return null;
        }
        if (p13 != null) {
            return com.bumptech.glide.d.z0(p13, new a0(this, p13, 1));
        }
        return null;
    }

    @Override // y92.g
    /* renamed from: uid */
    public final String getUniqueId() {
        f30 f30Var = this.C0;
        if (f30Var != null) {
            return f30Var.getUid();
        }
        return null;
    }

    /* renamed from: w1, reason: from getter */
    public final boolean getF52440n0() {
        return this.f52440n0;
    }

    public final void w2() {
        try {
            kg.a.e(this);
        } catch (Exception e13) {
            vb0.j.f125466a.E("Animation error resetting tap state", e13);
        }
    }

    public final c1 x(f30 f30Var) {
        String uid;
        b1 b1Var = new b1();
        q(b1Var, f30Var.getUid());
        if (t1()) {
            String uid2 = f30Var.getUid();
            Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
            Long h03 = StringsKt.h0(uid2);
            String z43 = f30Var.z4();
            wy0 a63 = f30Var.a6();
            Long h04 = (a63 == null || (uid = a63.getUid()) == null) ? null : StringsKt.h0(uid);
            Short valueOf = Short.valueOf((short) (this.Q1 != null ? r2.intValue() - 1 : 0));
            f30 f30Var2 = this.C0;
            String uid3 = f30Var2 != null ? f30Var2.getUid() : null;
            String r53 = f30Var.r5();
            b1Var.A = new h32.a0(h03, z43, h04, valueOf, uid3, r53 != null ? StringsKt.h0(r53) : null);
        }
        o(b1Var);
        b1Var.f66859e0 = c2.f(f30Var, getAdFormats(), getAdsCommonAnalytics(), O2(f30Var), R2(f30Var), getExperiments().V());
        return b1Var.a();
    }

    public final void x2(qa2.a attributionReason) {
        Intrinsics.checkNotNullParameter(attributionReason, "attributionReason");
        this.P0 = attributionReason;
    }

    public final boolean y1(f30 f30Var) {
        return me.o.c(getExperiments().W(), getExperiments().R("enabled_pwt", z3.DO_NOT_ACTIVATE_EXPERIMENT)) && me.o.g(getExperiments(), f30Var);
    }

    public final x32.b z() {
        es.h adsCommonDisplay = getAdsCommonDisplay();
        f30 f30Var = this.C0;
        boolean z13 = this.f52444o0;
        boolean z14 = this.f52440n0;
        es.v vVar = (es.v) adsCommonDisplay;
        lh0.d dVar = vVar.f60008a;
        dVar.getClass();
        z3 z3Var = a4.f83297a;
        z0 z0Var = dVar.f83323a;
        lh0.g1 g1Var = (lh0.g1) z0Var;
        lh0.g1 g1Var2 = (lh0.g1) z0Var;
        lh0.g1 g1Var3 = (lh0.g1) z0Var;
        lh0.g1 g1Var4 = (lh0.g1) z0Var;
        x32.e y13 = vVar.y(f30Var, z13, z14, g1Var.o("android_handshake_show_shipping", "enabled", z3Var) || g1Var.l("android_handshake_show_shipping"), g1Var2.o("android_handshake_show_rating", "enabled", z3Var) || g1Var2.l("android_handshake_show_rating"), g1Var3.o("android_handshake_show_price", "enabled", z3Var) || g1Var3.l("android_handshake_show_price"), g1Var4.o("android_handshake_show_badge", "enabled", z3Var) || g1Var4.l("android_handshake_show_badge"));
        f30 f30Var2 = this.C0;
        if (f30Var2 != null) {
            return ((es.v) getAdsCommonDisplay()).r(f30Var2, y13, ((es.v) getAdsCommonDisplay()).l(y13, f30Var2), Boolean.valueOf(((es.v) getAdsCommonDisplay()).D()), Boolean.valueOf(((es.v) getAdsCommonDisplay()).P()));
        }
        return null;
    }

    public final ua2.x z0() {
        return (ua2.x) this.E2.getValue();
    }

    public final boolean z1() {
        return this.f52390a0 || this.f52444o0 || Y() == g0.SHOP_TAB_UPSELL || Y() == g0.STELA_PRODUCTS;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoPinGridCellImpl(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        if (getId() == -1) {
            setId(wy1.d.lego_pin_grid_cell_id);
        }
        this.f52396c = new m(-1, -1, 1023, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        this.f52400d = new qa2.d1();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f52403e = j1.Y0(context2);
        this.f52407f = true;
        this.f52411g = true;
        this.f52419i = true;
        this.f52431l = true;
        this.f52439n = true;
        this.f52487z = true;
        this.E = true;
        this.G = true;
        this.L = true;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f52404e0 = j1.Q(context3, 200);
        this.f52424j0 = new ArrayList();
        this.f52448p0 = q0.contextual_bg;
        this.f52452q0 = vn1.c.DEFAULT;
        this.f52472v0 = xk2.m.b(new x(this, 9));
        this.f52476w0 = xk2.m.b(new x(this, 8));
        this.f52480x0 = getContext().getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_small_to_medium);
        this.P0 = qa2.a.UNDEFINED;
        this.Q0 = -1;
        this.T1 = true;
        this.V1 = new s(this);
        nx.d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        this.W1 = a13;
        this.Z1 = getContext().getResources().getDimensionPixelSize(eo1.c.lego_grid_cell_indicator_padding);
        getResources().getDimensionPixelSize(r0.margin_half);
        Paint paint = new Paint();
        Context context4 = getContext();
        int i13 = eo1.b.color_themed_background_default;
        Object obj = d5.a.f53679a;
        paint.setColor(context4.getColor(i13));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f52392a2 = paint;
        setClickable(true);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        c cVar = new c(context5, new qi0.b(this, 4));
        cVar.f138290e = 200;
        this.B0 = cVar;
        int dimensionPixelSize = getResources().getDimensionPixelSize(fk1.c.f62343a);
        this.Y1 = dimensionPixelSize;
        xk2.n nVar = xk2.n.NONE;
        this.f52395b2 = pk2.f.l(this, 4, nVar);
        this.f52399c2 = pk2.f.l(this, 19, nVar);
        this.d2 = pk2.f.l(this, 21, nVar);
        this.f52406e2 = pk2.f.l(this, 12, nVar);
        this.f52410f2 = pk2.f.l(this, 20, nVar);
        this.f52414g2 = pk2.f.v(this, 3, nVar);
        this.f52418h2 = pk2.f.v(this, 0, nVar);
        this.f52422i2 = pk2.f.l(this, 29, nVar);
        this.f52426j2 = pk2.f.l(this, 25, nVar);
        this.f52430k2 = pk2.f.l(this, 28, nVar);
        this.f52434l2 = pk2.f.l(this, 23, nVar);
        this.f52438m2 = pk2.f.l(this, 13, nVar);
        this.f52442n2 = pk2.f.l(this, 11, nVar);
        this.f52446o2 = pk2.f.v(this, 2, nVar);
        this.f52450p2 = pk2.f.v(this, 1, nVar);
        this.f52454q2 = pk2.f.v(this, 17, nVar);
        this.f52458r2 = pk2.f.v(this, 15, nVar);
        this.f52462s2 = pk2.f.v(this, 16, nVar);
        this.f52466t2 = pk2.f.l(this, 7, nVar);
        this.f52470u2 = new v0(this, dimensionPixelSize, this, this, this);
        this.f52474v2 = pk2.f.l(this, 6, nVar);
        this.f52478w2 = pk2.f.l(this, 8, nVar);
        this.f52482x2 = pk2.f.l(this, 10, nVar);
        this.f52486y2 = pk2.f.l(this, 27, nVar);
        this.f52490z2 = pk2.f.l(this, 26, nVar);
        this.A2 = pk2.f.l(this, 24, nVar);
        this.B2 = pk2.f.v(this, 4, nVar);
        this.C2 = pk2.f.l(this, 16, nVar);
        this.D2 = pk2.f.v(this, 20, nVar);
        this.E2 = pk2.f.l(this, 17, nVar);
        pk2.f.l(this, 5, nVar);
        this.F2 = pk2.f.l(this, 18, nVar);
        this.G2 = new x0(this, dimensionPixelSize);
        this.H2 = new x0(this, getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_inner_padding));
        this.I2 = new x0(this, getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_call_to_action_spacing));
        this.J2 = new x0(this, getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_chips_spacing));
        this.K2 = new x0(this, getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_inner_small_padding));
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(eo1.c.sema_space_200);
        this.L2 = dimensionPixelSize2;
        this.M2 = dimensionPixelSize2;
        this.N2 = new x0(this, dimensionPixelSize2);
        this.O2 = new x0(this, getContext().getResources().getDimensionPixelSize(wy1.b.pharma_ad_disclosure_extra_bottom_padding));
        this.P2 = pk2.f.l(this, 9, nVar);
        this.Q2 = pk2.f.l(this, 0, nVar);
        this.R2 = pk2.f.l(this, 1, nVar);
        this.S2 = pk2.f.l(this, 22, nVar);
        this.U2 = pk2.f.l(this, 15, nVar);
        a11.d dVar = this.f52417h1;
        if (dVar != null) {
            this.W2 = dVar.a(this.W1);
            this.X2 = this;
            this.Y2 = true;
            return;
        }
        Intrinsics.r("clickThroughHelperFactory");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegoPinGridCellImpl(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        if (getId() == -1) {
            setId(wy1.d.lego_pin_grid_cell_id);
        }
        this.f52396c = new m(-1, -1, 1023, null, null, null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false);
        this.f52400d = new qa2.d1();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f52403e = j1.Y0(context2);
        this.f52407f = true;
        this.f52411g = true;
        this.f52419i = true;
        this.f52431l = true;
        this.f52439n = true;
        this.f52487z = true;
        this.E = true;
        this.G = true;
        this.L = true;
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f52404e0 = j1.Q(context3, 200);
        this.f52424j0 = new ArrayList();
        this.f52448p0 = q0.contextual_bg;
        this.f52452q0 = vn1.c.DEFAULT;
        this.f52472v0 = xk2.m.b(new x(this, 9));
        this.f52476w0 = xk2.m.b(new x(this, 8));
        this.f52480x0 = getContext().getResources().getDimensionPixelSize(eo1.c.lego_corner_radius_small_to_medium);
        this.P0 = qa2.a.UNDEFINED;
        this.Q0 = -1;
        this.T1 = true;
        this.V1 = new s(this);
        nx.d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        this.W1 = a13;
        this.Z1 = getContext().getResources().getDimensionPixelSize(eo1.c.lego_grid_cell_indicator_padding);
        getResources().getDimensionPixelSize(r0.margin_half);
        Paint paint = new Paint();
        Context context4 = getContext();
        int i14 = eo1.b.color_themed_background_default;
        Object obj = d5.a.f53679a;
        paint.setColor(context4.getColor(i14));
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f52392a2 = paint;
        setClickable(true);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
        c cVar = new c(context5, new qi0.b(this, 4));
        cVar.f138290e = 200;
        this.B0 = cVar;
        int dimensionPixelSize = getResources().getDimensionPixelSize(fk1.c.f62343a);
        this.Y1 = dimensionPixelSize;
        xk2.n nVar = xk2.n.NONE;
        this.f52395b2 = pk2.f.l(this, 4, nVar);
        this.f52399c2 = pk2.f.l(this, 19, nVar);
        this.d2 = pk2.f.l(this, 21, nVar);
        this.f52406e2 = pk2.f.l(this, 12, nVar);
        this.f52410f2 = pk2.f.l(this, 20, nVar);
        this.f52414g2 = pk2.f.v(this, 3, nVar);
        this.f52418h2 = pk2.f.v(this, 0, nVar);
        this.f52422i2 = pk2.f.l(this, 29, nVar);
        this.f52426j2 = pk2.f.l(this, 25, nVar);
        this.f52430k2 = pk2.f.l(this, 28, nVar);
        this.f52434l2 = pk2.f.l(this, 23, nVar);
        this.f52438m2 = pk2.f.l(this, 13, nVar);
        this.f52442n2 = pk2.f.l(this, 11, nVar);
        this.f52446o2 = pk2.f.v(this, 2, nVar);
        this.f52450p2 = pk2.f.v(this, 1, nVar);
        this.f52454q2 = pk2.f.v(this, 17, nVar);
        this.f52458r2 = pk2.f.v(this, 15, nVar);
        this.f52462s2 = pk2.f.v(this, 16, nVar);
        this.f52466t2 = pk2.f.l(this, 7, nVar);
        this.f52470u2 = new v0(this, dimensionPixelSize, this, this, this);
        this.f52474v2 = pk2.f.l(this, 6, nVar);
        this.f52478w2 = pk2.f.l(this, 8, nVar);
        this.f52482x2 = pk2.f.l(this, 10, nVar);
        this.f52486y2 = pk2.f.l(this, 27, nVar);
        this.f52490z2 = pk2.f.l(this, 26, nVar);
        this.A2 = pk2.f.l(this, 24, nVar);
        this.B2 = pk2.f.v(this, 4, nVar);
        this.C2 = pk2.f.l(this, 16, nVar);
        this.D2 = pk2.f.v(this, 20, nVar);
        this.E2 = pk2.f.l(this, 17, nVar);
        pk2.f.l(this, 5, nVar);
        this.F2 = pk2.f.l(this, 18, nVar);
        this.G2 = new x0(this, dimensionPixelSize);
        this.H2 = new x0(this, getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_inner_padding));
        this.I2 = new x0(this, getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_call_to_action_spacing));
        this.J2 = new x0(this, getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_chips_spacing));
        this.K2 = new x0(this, getContext().getResources().getDimensionPixelSize(r0.lego_grid_cell_inner_small_padding));
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(eo1.c.sema_space_200);
        this.L2 = dimensionPixelSize2;
        this.M2 = dimensionPixelSize2;
        this.N2 = new x0(this, dimensionPixelSize2);
        this.O2 = new x0(this, getContext().getResources().getDimensionPixelSize(wy1.b.pharma_ad_disclosure_extra_bottom_padding));
        this.P2 = pk2.f.l(this, 9, nVar);
        this.Q2 = pk2.f.l(this, 0, nVar);
        this.R2 = pk2.f.l(this, 1, nVar);
        this.S2 = pk2.f.l(this, 22, nVar);
        this.U2 = pk2.f.l(this, 15, nVar);
        a11.d dVar = this.f52417h1;
        if (dVar != null) {
            this.W2 = dVar.a(this.W1);
            this.X2 = this;
            this.Y2 = true;
            return;
        }
        Intrinsics.r("clickThroughHelperFactory");
        throw null;
    }
}
