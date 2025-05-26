package q21;

import a.m2;
import a11.n;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import ao2.k2;
import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pincells.fixedsize.view.FixedSizePinOverlayView;
import com.pinterest.feature.pincells.fixedsize.view.ProductMetadataView;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import h32.g0;
import h32.u0;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lh0.a4;
import lh0.g1;
import lh0.h1;
import lh0.z3;
import m60.r0;
import net.quikkly.android.utils.BitmapUtils;
import nx.b0;
import nx.d0;
import nx.d1;
import pk.a0;
import qa2.a1;
import rq.n0;
import uj2.q;

/* loaded from: classes5.dex */
public final class d extends i {
    public static final /* synthetic */ int B = 0;
    public k2 A;

    /* renamed from: i, reason: collision with root package name */
    public final d0 f102134i;

    /* renamed from: j, reason: collision with root package name */
    public final p21.b f102135j;

    /* renamed from: k, reason: collision with root package name */
    public final p21.a f102136k;

    /* renamed from: l, reason: collision with root package name */
    public final g f102137l;

    /* renamed from: m, reason: collision with root package name */
    public a1 f102138m;

    /* renamed from: n, reason: collision with root package name */
    public sl1.j f102139n;

    /* renamed from: o, reason: collision with root package name */
    public ic0.b f102140o;

    /* renamed from: p, reason: collision with root package name */
    public ProductMetadataView f102141p;

    /* renamed from: q, reason: collision with root package name */
    public FixedSizePinOverlayView f102142q;

    /* renamed from: r, reason: collision with root package name */
    public final n f102143r;

    /* renamed from: s, reason: collision with root package name */
    public GestaltButton f102144s;

    /* renamed from: t, reason: collision with root package name */
    public int f102145t;

    /* renamed from: u, reason: collision with root package name */
    public uk1.e f102146u;

    /* renamed from: v, reason: collision with root package name */
    public a11.d f102147v;

    /* renamed from: w, reason: collision with root package name */
    public d1 f102148w;

    /* renamed from: x, reason: collision with root package name */
    public b0 f102149x;

    /* renamed from: y, reason: collision with root package name */
    public ur.a f102150y;

    /* renamed from: z, reason: collision with root package name */
    public h1 f102151z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, d0 _pinalytics, q networkStateStream, String str, int i13, g61.a aVar, lv0.g gVar, a91.f fVar, int i14) {
        super(context);
        str = (i14 & 8) != 0 ? null : str;
        i13 = (i14 & 16) != 0 ? eo1.c.lego_corner_radius_medium : i13;
        View.OnClickListener onClickListener = (i14 & 32) != 0 ? null : aVar;
        gVar = (i14 & 64) != 0 ? null : gVar;
        fVar = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : fVar;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(_pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(_pinalytics, "_pinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        a();
        this.f102123b = _pinalytics;
        this.f102124c = networkStateStream;
        this.f102125d = str;
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
        a();
        this.f102134i = _pinalytics;
        this.f102135j = gVar;
        this.f102136k = fVar;
        g gVar2 = new g(context, i13);
        gVar2.setOnClickListener(onClickListener == null ? new com.pinterest.feature.home.view.c(this, 23) : onClickListener);
        gVar2.setOnLongClickListener(new n0(this, 7));
        if (gVar != null) {
            gVar2.setOnTouchListener(new m2(gVar, 14));
        }
        addView(gVar2);
        this.f102137l = gVar2;
        a11.d dVar = this.f102147v;
        if (dVar != null) {
            this.f102143r = dVar.a(_pinalytics);
        } else {
            Intrinsics.r("clickThroughHelperFactory");
            throw null;
        }
    }

    public static void b(d dVar, f30 pin, int i13, HashMap hashMap, u0 u0Var, qa2.d0 d0Var, boolean z13, ze1.a aVar, g0 g0Var, Integer num, String str, boolean z14, String str2, boolean z15, boolean z16, int i14) {
        boolean z17 = (i14 & 64) != 0 ? false : z13;
        ze1.a aVar2 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : aVar;
        g0 g0Var2 = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : g0Var;
        Integer num2 = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : num;
        String str3 = (i14 & 1024) != 0 ? null : str;
        boolean z18 = (i14 & 2048) != 0 ? false : z14;
        String str4 = (i14 & 4096) != 0 ? null : str2;
        boolean z19 = (i14 & 8192) != 0 ? false : z15;
        boolean z23 = (i14 & 16384) != 0 ? true : z16;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        uk1.e eVar = dVar.f102146u;
        if (eVar == null) {
            Intrinsics.r("presenterPinalyticsFactory");
            throw null;
        }
        d0 d0Var2 = dVar.f102123b;
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        uk1.d f13 = ((uk1.a) eVar).f(d0Var2, uid);
        d1 d1Var = dVar.f102148w;
        if (d1Var == null) {
            Intrinsics.r("trackingParamAttacher");
            throw null;
        }
        b0 b0Var = dVar.f102149x;
        if (b0Var == null) {
            Intrinsics.r("pinAuxHelper");
            throw null;
        }
        ur.a aVar3 = dVar.f102150y;
        if (aVar3 == null) {
            Intrinsics.r("adsCoreDependencies");
            throw null;
        }
        yk1.j.a().d(dVar, new p21.f(pin, i13, hashMap, u0Var, d0Var, d1Var, dVar.f102125d, z17, aVar2, g0Var2, dVar.f102143r, num2, str3, f13, dVar.f102124c, z18, str4, z19, z23, b0Var, aVar3, 262464));
        yk1.a aVar4 = new yk1.a(dVar.getResources(), dVar.getContext().getTheme());
        h1 h1Var = dVar.f102151z;
        if (h1Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) h1Var.f83378a;
        dVar.A = com.bumptech.glide.c.Y(aVar4, pin, false, false, g1Var.o("android_lift_content_desc", "enabled", z3Var) || g1Var.l("android_lift_content_desc"), new c(dVar, 1), 12);
        a1 a1Var = dVar.f102138m;
        if (a1Var != null) {
            a1Var.t(pin, i13);
        }
        a1 a1Var2 = dVar.f102138m;
        if (a1Var2 == null) {
            return;
        }
        a1Var2.setVisibility(8);
    }

    public final void e(f30 pin, boolean z13, ze1.b bVar, boolean z14) {
        String str;
        String str2;
        String str3;
        String price;
        Intrinsics.checkNotNullParameter(pin, "pin");
        int i13 = 0;
        int i14 = 1;
        if (z13) {
            sl1.j jVar = this.f102139n;
            ViewParent parent = jVar != null ? jVar.getParent() : null;
            g gVar = this.f102137l;
            if (parent != null) {
                gVar.removeView(this.f102139n);
            }
            if (dl2.b.Y0(pin).length() > 0) {
                price = dl2.b.Y0(pin);
            } else {
                String J5 = pin.J5();
                if (J5 != null && J5.length() > 0) {
                    Double K5 = pin.K5();
                    Intrinsics.checkNotNullExpressionValue(K5, "getPriceValue(...)");
                    if (K5.doubleValue() > 0.0d) {
                        price = a.a.C(pin.J5(), StringsKt.S(".0", String.valueOf(pin.K5().doubleValue())));
                    }
                }
                price = null;
            }
            if (price != null && price.length() != 0) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int dimensionPixelOffset = getResources().getDimensionPixelOffset(eo1.c.lego_grid_cell_indicator_padding);
                sl1.j jVar2 = new sl1.j(context);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                com.bumptech.glide.c.a1(layoutParams, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                jVar2.setLayoutParams(layoutParams);
                Intrinsics.checkNotNullParameter(price, "price");
                jVar2.setText(price);
                bs1.c.R1(jVar2, price.length() > 0);
                this.f102139n = jVar2;
                gVar.addView(jVar2);
            }
        }
        if (bVar != null) {
            if (z14) {
                setOrientation(0);
            }
            ProductMetadataView productMetadataView = this.f102141p;
            if ((productMetadataView != null ? productMetadataView.getParent() : null) != null) {
                removeView(this.f102141p);
            }
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            Intrinsics.checkNotNullParameter(context2, "context");
            ProductMetadataView productMetadataView2 = new ProductMetadataView(context2);
            productMetadataView2.setOrientation(1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            com.bumptech.glide.c.a1(layoutParams2, productMetadataView2.getResources().getDimensionPixelSize(r0.lego_grid_cell_text_padding), productMetadataView2.getResources().getDimensionPixelSize(r0.margin_quarter), productMetadataView2.getResources().getDimensionPixelSize(r0.lego_grid_cell_text_padding), productMetadataView2.getResources().getDimensionPixelSize(r0.margin_half));
            productMetadataView2.setLayoutParams(layoutParams2);
            productMetadataView2.f47445e = this.f102145t;
            productMetadataView2.f47444d = z14;
            if (productMetadataView2.f47441a == null && (str3 = bVar.f141805a) != null && str3.length() != 0) {
                GestaltText a13 = productMetadataView2.a(true);
                a0.p(a13, str3);
                productMetadataView2.addView(a13);
                productMetadataView2.f47441a = a13;
            }
            if (productMetadataView2.f47442b == null && (str2 = bVar.f141806b) != null && str2.length() != 0) {
                GestaltText a14 = productMetadataView2.a(true);
                a14.i(new j(str2, productMetadataView2, i14));
                productMetadataView2.addView(a14);
                productMetadataView2.f47442b = a14;
            }
            if (productMetadataView2.f47443c == null && (str = bVar.f141807c) != null && str.length() != 0) {
                GestaltText a15 = productMetadataView2.a(false);
                a15.i(new j(str, productMetadataView2, i13));
                productMetadataView2.addView(a15);
                productMetadataView2.f47443c = a15;
            }
            this.f102141p = productMetadataView2;
            addView(productMetadataView2);
        }
    }

    public final void g(int i13, int i14) {
        this.f102145t = i14;
        this.f102137l.V(i13, i14);
        a1 a1Var = this.f102138m;
        if (a1Var == null) {
            return;
        }
        a1Var.setLayoutParams(new FrameLayout.LayoutParams(i13, i14));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k2 k2Var = this.A;
        if (k2Var != null) {
            k2Var.cancel((CancellationException) null);
        }
    }
}
