package p21;

import a11.n;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import com.pinterest.gestalt.button.view.GestaltButton;
import df.j1;
import h32.c1;
import h32.g0;
import h32.u0;
import h32.x2;
import h32.z1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import jk2.x;
import kh2.g3;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;
import l11.p;
import lh0.a4;
import lh0.g1;
import lh0.h1;
import lh0.z3;
import m60.r0;
import m60.u;
import m60.w;
import net.quikkly.android.utils.BitmapUtils;
import nx.b0;
import nx.d1;
import pm.k;
import pm.l;
import pm.m;
import qa2.d0;
import qa2.k0;
import uj2.q;
import xk2.r;
import xk2.s;
import y01.p1;

/* loaded from: classes5.dex */
public final class f extends yk1.c {
    public final c A;

    /* renamed from: a, reason: collision with root package name */
    public f30 f98692a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98693b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f98694c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f98695d;

    /* renamed from: e, reason: collision with root package name */
    public final d0 f98696e;

    /* renamed from: f, reason: collision with root package name */
    public final w f98697f;

    /* renamed from: g, reason: collision with root package name */
    public final d1 f98698g;

    /* renamed from: h, reason: collision with root package name */
    public final pb0.a f98699h;

    /* renamed from: i, reason: collision with root package name */
    public final String f98700i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f98701j;

    /* renamed from: k, reason: collision with root package name */
    public ze1.a f98702k;

    /* renamed from: l, reason: collision with root package name */
    public final g0 f98703l;

    /* renamed from: m, reason: collision with root package name */
    public final a11.e f98704m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f98705n;

    /* renamed from: o, reason: collision with root package name */
    public final String f98706o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f98707p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f98708q;

    /* renamed from: r, reason: collision with root package name */
    public final String f98709r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f98710s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f98711t;

    /* renamed from: u, reason: collision with root package name */
    public final b0 f98712u;

    /* renamed from: v, reason: collision with root package name */
    public final ur.a f98713v;

    /* renamed from: w, reason: collision with root package name */
    public z1 f98714w;

    /* renamed from: x, reason: collision with root package name */
    public String f98715x;

    /* renamed from: y, reason: collision with root package name */
    public o21.b f98716y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f98717z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(f30 f30Var, int i13, HashMap hashMap, u0 u0Var, d0 d0Var, d1 trackingParamAttacher, String str, boolean z13, ze1.a aVar, g0 g0Var, n nVar, Integer num, String str2, uk1.d presenterPinalytics, q networkStateStream, boolean z14, String str3, boolean z15, boolean z16, b0 pinAuxHelper, ur.a adsCoreDependencies, int i14) {
        super(presenterPinalytics, networkStateStream);
        f30 f30Var2 = (i14 & 1) != 0 ? null : f30Var;
        int i15 = (i14 & 2) != 0 ? 0 : i13;
        w eventManager = u.f85943a;
        Intrinsics.checkNotNullExpressionValue(eventManager, "getInstance(...)");
        pb0.g clock = pb0.g.f99432a;
        String str4 = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? "736x" : str;
        boolean z17 = (i14 & 1024) != 0 ? false : z13;
        ze1.a aVar2 = (i14 & 2048) != 0 ? null : aVar;
        n nVar2 = (i14 & 8192) != 0 ? null : nVar;
        Integer num2 = (i14 & 16384) != 0 ? null : num;
        String str5 = (i14 & 32768) != 0 ? null : str2;
        boolean z18 = (i14 & 524288) != 0 ? false : z14;
        String str6 = (i14 & 1048576) != 0 ? null : str3;
        boolean z19 = (i14 & 2097152) != 0 ? false : z15;
        boolean z23 = (i14 & 4194304) != 0 ? true : z16;
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        Intrinsics.checkNotNullParameter(adsCoreDependencies, "adsCoreDependencies");
        this.f98692a = f30Var2;
        this.f98693b = i15;
        this.f98694c = hashMap;
        this.f98695d = u0Var;
        this.f98696e = d0Var;
        this.f98697f = eventManager;
        this.f98698g = trackingParamAttacher;
        this.f98699h = clock;
        this.f98700i = str4;
        this.f98701j = z17;
        this.f98702k = aVar2;
        this.f98703l = g0Var;
        this.f98704m = nVar2;
        this.f98705n = num2;
        this.f98706o = str5;
        this.f98707p = false;
        this.f98708q = z18;
        this.f98709r = str6;
        this.f98710s = z19;
        this.f98711t = z23;
        this.f98712u = pinAuxHelper;
        this.f98713v = adsCoreDependencies;
        this.A = new c(this);
    }

    public static c1 s3(f fVar, String str, String str2) {
        Object m13;
        Object m14;
        try {
            xk2.q qVar = s.f135225b;
            m13 = str != null ? Long.valueOf(Long.parseLong(str)) : null;
        } catch (Throwable th3) {
            xk2.q qVar2 = s.f135225b;
            m13 = ue.c.m(th3);
        }
        if (m13 instanceof r) {
            m13 = null;
        }
        Long l13 = (Long) m13;
        try {
            m14 = Long.valueOf(Long.parseLong(str2));
        } catch (Throwable th4) {
            xk2.q qVar3 = s.f135225b;
            m14 = ue.c.m(th4);
        }
        if (m14 instanceof r) {
            m14 = null;
        }
        Boolean bool = Boolean.FALSE;
        return new c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new x2(l13, str2, (Long) m14, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // yk1.p, yk1.b
    public final void onUnbind() {
        this.f98697f.j(this.A);
        super.onUnbind();
    }

    public final HashMap q3(HashMap hashMap) {
        f30 pin;
        nx.q qVar;
        String str;
        if ((!this.f98707p && this.f98702k == null && !this.f98701j) || (pin = this.f98692a) == null) {
            return hashMap;
        }
        b0 b0Var = this.f98712u;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (hashMap == null || (str = (String) hashMap.get("commerce_data")) == null) {
            qVar = new nx.q();
        } else {
            Set entrySet = j1.p1(str).i().f91366a.entrySet();
            Intrinsics.checkNotNullExpressionValue(entrySet, "entrySet(...)");
            int a13 = y0.a(kotlin.collections.g0.q(entrySet, 10));
            if (a13 < 16) {
                a13 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(a13);
            Iterator it = ((l) entrySet).iterator();
            while (((m) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((k) it).next();
                linkedHashMap.put(entry.getKey(), ((nm.s) entry.getValue()).p());
            }
            qVar = new nx.q(linkedHashMap);
        }
        HashMap n13 = b0Var.n(pin, this.f98693b, null, hashMap, qVar);
        Intrinsics.g(n13, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ com.pinterest.analytics.AuxDataKt.AuxData }");
        return n13;
    }

    @Override // yk1.p
    public final void r3(o21.d view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        this.f98697f.h(this.A);
        Intrinsics.checkNotNullParameter(this, "listener");
        ((q21.a) view).f102126e = this;
        t3(this.f98692a, this.f98716y, this.f98701j, this.f98702k, this.f98706o);
        uk2.d dVar = gb2.f.f64748b;
        qt.a aVar = new qt.a(13, d.f98687j);
        dVar.getClass();
        int i13 = 2;
        int i14 = 10;
        x xVar = new x(new x(new jk2.u0(pk2.f.j(new jk2.j1(dVar, aVar, 0), new qt.b(13, d.f98688k), 2, "filter(...)"), new wv0.a(25, d.f98689l), 0), new d51.a(9, new p1(this, i14)), i13), new d51.a(i14, d.f98690m), i13);
        Intrinsics.checkNotNullExpressionValue(xVar, "filter(...)");
        addDisposable(nl.b.m(xVar, "Error listening to Pin UI updates", new e(1, this, f.class, "showPinSavedState", "showPinSavedState(Lcom/pinterest/ui/util/UiUpdate$PinOverlayUpdate;)V", 0)));
    }

    public final void t3(f30 pin, o21.b bVar, boolean z13, ze1.a aVar, String buttonText) {
        String y43;
        sr srVar;
        String j13;
        sr srVar2;
        if (!isBound() || pin == null) {
            return;
        }
        q21.d dVar = (q21.d) ((o21.d) getView());
        dVar.e(pin, z13, aVar != null ? g3.f0(pin, aVar) : null, this.f98710s);
        String Y = k0.b(pin) ? b40.Y(pin) : null;
        q21.g gVar = dVar.f102137l;
        gVar.getClass();
        gVar.f102155d.i(new zu0.c(Y, 28));
        bs1.c.R1(gVar.f102154c, !(Y == null || Y.length() == 0));
        f30 f30Var = this.f98692a;
        if (f30Var != null) {
            String str = this.f98700i;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1078030475) {
                    if (hashCode != 1571076) {
                        if (hashCode == 102742843 && str.equals("large")) {
                            y43 = bs1.c.y0(f30Var);
                            this.f98715x = y43;
                        }
                    } else if (str.equals("345x")) {
                        Map A4 = f30Var.A4();
                        y43 = (A4 == null || (srVar2 = (sr) A4.get("345x")) == null) ? null : srVar2.j();
                        this.f98715x = y43;
                    }
                } else if (str.equals("medium")) {
                    y43 = bs1.c.B0(f30Var);
                    this.f98715x = y43;
                }
            }
            Map A42 = f30Var.A4();
            y43 = (A42 == null || (srVar = (sr) A42.get("736x")) == null || (j13 = srVar.j()) == null) ? f30Var.y4() : j13;
            this.f98715x = y43;
        }
        String imageUrl = this.f98715x;
        if (imageUrl != null) {
            String l13 = b40.l(pin);
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            gVar.e4(imageUrl, l13);
        }
        Intrinsics.checkNotNullParameter(pin, "pin");
        yk1.a aVar2 = new yk1.a(dVar.getResources(), dVar.getContext().getTheme());
        h1 h1Var = dVar.f102151z;
        if (h1Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) h1Var.f83378a;
        dVar.A = com.bumptech.glide.c.Y(aVar2, pin, false, false, g1Var.o("android_lift_content_desc", "enabled", z3Var) || g1Var.l("android_lift_content_desc"), new q21.c(dVar, 0), 12);
        Intrinsics.checkNotNullParameter(pin, "pin");
        Integer num = this.f98705n;
        if (num != null) {
            int intValue = num.intValue();
            ImageView imageView = new ImageView(dVar.getContext());
            int dimensionPixelSize = imageView.getResources().getDimensionPixelSize(r0.thumbnail_xsmall_size);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
            int dimensionPixelSize2 = imageView.getResources().getDimensionPixelSize(eo1.c.space_200);
            layoutParams.setMargins(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
            imageView.setLayoutParams(layoutParams);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            Paint paint = shapeDrawable.getPaint();
            Context context = imageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            paint.setColor(dl2.b.x0(context, eo1.a.color_white_mochimalist_0_opacity_80));
            shapeDrawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            imageView.setBackground(shapeDrawable);
            Context context2 = imageView.getContext();
            Object obj = d5.a.f53679a;
            imageView.setImageDrawable(context2.getDrawable(intValue));
            gVar.addView(imageView);
        }
        if (buttonText != null) {
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            GestaltButton gestaltButton = dVar.f102144s;
            if ((gestaltButton != null ? gestaltButton.getParent() : null) != null) {
                dVar.removeView(dVar.f102144s);
            }
            Context context3 = dVar.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            GestaltButton e13 = new GestaltButton.SmallSecondaryButton(6, context3, (AttributeSet) null).d(q21.b.f102129j).e(new p(dVar, 3));
            dVar.addView(e13);
            ViewGroup.LayoutParams layoutParams2 = e13.getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            Resources resources = dVar.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = bs1.c.U(r0.margin_half, resources);
            dVar.f102144s = e13;
        }
        if (bVar != null) {
            dVar.g(bVar.f92799h, bVar.f92800i);
        }
    }
}
