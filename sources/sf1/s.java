package sf1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.media3.ui.SubtitleView;
import com.pinterest.api.model.iq0;
import com.pinterest.api.model.wz;
import com.pinterest.api.model.zk0;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import kh2.k3;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.z3;

/* loaded from: classes5.dex */
public final class s extends gg0.n0 implements t, sp0.f {
    public static int P;
    public final LinkedHashMap A;
    public r1 B;
    public w0 C;
    public w0 D;
    public RectF E;
    public int F;
    public boolean G;
    public boolean H;
    public hh1.d I;

    /* renamed from: J, reason: collision with root package name */
    public final xk2.k f112696J;
    public FrameLayout K;
    public WebImageView L;
    public v0 M;
    public float N;
    public boolean O;

    /* renamed from: d, reason: collision with root package name */
    public final y92.c f112697d;

    /* renamed from: e, reason: collision with root package name */
    public nx.d0 f112698e;

    /* renamed from: f, reason: collision with root package name */
    public int f112699f;

    /* renamed from: g, reason: collision with root package name */
    public int f112700g;

    /* renamed from: h, reason: collision with root package name */
    public final x1 f112701h;

    /* renamed from: i, reason: collision with root package name */
    public final ImageView.ScaleType f112702i;

    /* renamed from: j, reason: collision with root package name */
    public final w0 f112703j;

    /* renamed from: k, reason: collision with root package name */
    public final String f112704k;

    /* renamed from: l, reason: collision with root package name */
    public zf1.e f112705l;

    /* renamed from: m, reason: collision with root package name */
    public ag1.f f112706m;

    /* renamed from: n, reason: collision with root package name */
    public i92.k f112707n;

    /* renamed from: o, reason: collision with root package name */
    public jo1.c f112708o;

    /* renamed from: p, reason: collision with root package name */
    public m60.w f112709p;

    /* renamed from: q, reason: collision with root package name */
    public nx.d1 f112710q;

    /* renamed from: r, reason: collision with root package name */
    public ac2.m f112711r;

    /* renamed from: s, reason: collision with root package name */
    public gs0.k f112712s;

    /* renamed from: t, reason: collision with root package name */
    public lh0.w1 f112713t;

    /* renamed from: u, reason: collision with root package name */
    public qh1.e f112714u;

    /* renamed from: v, reason: collision with root package name */
    public b60.b f112715v;

    /* renamed from: w, reason: collision with root package name */
    public bc2.e f112716w;

    /* renamed from: x, reason: collision with root package name */
    public x92.b f112717x;

    /* renamed from: y, reason: collision with root package name */
    public lb0.q f112718y;

    /* renamed from: z, reason: collision with root package name */
    public g70.h f112719z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, y92.c cVar, nx.d0 d0Var, int i13, int i14, x1 videoViewModel, ImageView.ScaleType imageScaleType, w0 w0Var, String str) {
        super(context, 5);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoViewModel, "videoViewModel");
        Intrinsics.checkNotNullParameter(imageScaleType, "imageScaleType");
        this.f112697d = cVar;
        this.f112698e = d0Var;
        this.f112699f = i13;
        this.f112700g = i14;
        this.f112701h = videoViewModel;
        this.f112702i = imageScaleType;
        this.f112703j = w0Var;
        this.f112704k = str;
        P++;
        this.A = new LinkedHashMap();
        this.F = -1;
        this.f112696J = xk2.m.a(xk2.n.NONE, new l(context, 2));
        this.N = 0.5625f;
        setId(View.generateViewId());
        setTag("ROOT_TAG");
        setLayoutDirection(0);
    }

    public final void C() {
        PinterestVideoView o13 = o();
        if (o13 == null || !o13.f()) {
            return;
        }
        oc2.i.a(o13);
    }

    public final void D() {
        PinterestVideoView o13 = o();
        if (o13 == null || o13.f()) {
            return;
        }
        o13.play();
    }

    public final void i(zk0 blockStyle, boolean z13, double d2, double d13, String boardId, boolean z14, String str, Integer num) {
        Intrinsics.checkNotNullParameter(blockStyle, "blockStyle");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        j jVar = new j(this, blockStyle);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        sp0.d dVar = new sp0.d(jVar.f112624a, jVar.f112625b);
        sp0.a aVar = new sp0.a(jVar.f112626c, jVar.f112627d);
        sp0.a aVar2 = new sp0.a(this.f112699f, this.f112700g);
        w1.i0 i0Var = new w1.i0(boardId, str, this, num, z13, z14);
        addView(new androidx.appcompat.widget.g(context, new sp0.e(dVar, aVar, aVar2, jVar.f112628e, new sp0.b(d2, d13), i0Var, this), q()));
    }

    public final void j(String str, String str2, String str3, float f13, float f14, int i13, int i14, float f15, String str4, String str5, boolean z13, boolean z14, bc2.q qVar) {
        PinterestVideoView videoView = o();
        Objects.toString(videoView);
        if (this.H && videoView != null) {
            String D = a.a.D(str, "-", str2);
            bc2.k kVar = videoView.L;
            if (Intrinsics.d(kVar != null ? kVar.f22657a : null, D)) {
                r1 r1Var = this.B;
                Intrinsics.checkNotNullParameter(videoView, "videoView");
                if (str3 != null) {
                    videoView.C0.b("story_pin_page_uuid", str3);
                }
                ic2.d dVar = videoView.I0;
                if (dVar instanceof u) {
                    ((u) dVar).f112751e = r1Var;
                } else if (dVar instanceof v) {
                    ((v) dVar).f112764e = r1Var;
                }
                videoView.t0(z14);
                this.H = false;
                return;
            }
            removeView(videoView);
        }
        o oVar = new o(qVar, this, str, str2, z14);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        PinterestVideoView x13 = kh2.w.x(context, this.f112701h, this.f112698e, getId(), this.f112699f, this.f112700g, this.G, this.f112703j, str, str2, str3, f13, f14, i13, i14, f15, str4, str5, z13, z14, qVar, oVar, new l(this, 1));
        addView(x13);
        x13.post(new h(this, 1));
        lh0.w1 t13 = t();
        z3 z3Var = a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) t13.f83496a;
        if (g1Var.o("android_video_disable_scrim", "enabled", z3Var) || g1Var.l("android_video_disable_scrim")) {
            FrameLayout frameLayout = x13.D;
            if (frameLayout != null) {
                bs1.c.X0(frameLayout);
            }
            View view = x13.C;
            if (view != null) {
                bs1.c.X0(view);
            }
            SubtitleView subtitleView = x13.f18942g;
            if (subtitleView != null) {
                bs1.c.X0(subtitleView);
            }
        }
    }

    public final void k(zk0 blockStyle, Long l13, wz productOfferSummary, String str, String str2, boolean z13, int i13, double d2, double d13, rf1.k kVar, rf1.k kVar2, String parentPinId, String str3) {
        SpannableStringBuilder spannableStringBuilder;
        int i14;
        float f13;
        float f14;
        Intrinsics.checkNotNullParameter(blockStyle, "blockStyle");
        Intrinsics.checkNotNullParameter(parentPinId, "parentPinId");
        j jVar = new j(this, blockStyle);
        if (productOfferSummary != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            Resources.Theme theme = getContext().getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
            Intrinsics.checkNotNullParameter(productOfferSummary, "productOfferSummary");
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(theme, "theme");
            spannableStringBuilder = po1.c.d(productOfferSummary, resources.getColor(eo1.b.color_themed_text_default, theme), resources.getColor(eo1.b.color_blue_500, theme), -1);
        } else {
            spannableStringBuilder = null;
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i15 = jVar.f112626c;
        int i16 = jVar.f112627d;
        float f15 = jVar.f112625b;
        float f16 = jVar.f112624a;
        if (kVar != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            sp0.d dVar = new sp0.d(f16, f15);
            sp0.a aVar = new sp0.a(i15, i16);
            sp0.a aVar2 = new sp0.a(this.f112699f, this.f112700g);
            sp0.b bVar = new sp0.b(d2, d13);
            hh1.h hVar = hh1.l.f69184c;
            hh1.p pVar = new hh1.p(str, spannableStringBuilder2, str2, kVar, kVar2);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            hh1.l.a(context2);
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            ve0.d f03 = df.j1.f0(resources2);
            ve0.d config = new ve0.d(f03.f125677a, f03.f125678b, false);
            Intrinsics.checkNotNullParameter(config, "config");
            i14 = i16;
            addView(new androidx.appcompat.widget.g(context, new sp0.e(dVar, aVar, aVar2, jVar.f112628e, bVar, new rc0.c(l13, parentPinId, this, hVar, pVar, z13, new hh1.m(config, 0, 0, 0, 0), str3), this), q()));
            f13 = f16;
            f14 = f15;
        } else {
            i14 = i16;
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            sp0.d dVar2 = new sp0.d(f16, f15);
            sp0.a aVar3 = new sp0.a(i15, i14);
            sp0.a aVar4 = new sp0.a(this.f112699f, this.f112700g);
            sp0.b bVar2 = new sp0.b(d2, d13);
            hh1.j jVar2 = hh1.l.f69183b;
            hh1.q qVar = new hh1.q(str, spannableStringBuilder2, str2);
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            f13 = f16;
            f14 = f15;
            addView(new androidx.appcompat.widget.g(context3, new sp0.e(dVar2, aVar3, aVar4, jVar.f112628e, bVar2, new rc0.c(l13, parentPinId, this, jVar2, qVar, z13, hh1.l.a(context4), str3), this), q()));
        }
        w0 w0Var = this.C;
        if (w0Var != null) {
            w0Var.b(f13, f14, i14, i13);
        }
    }

    public final void l(boolean z13, String text, zk0 blockStyle, iq0 iq0Var) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(blockStyle, "blockStyle");
        j jVar = new j(this, blockStyle);
        float doubleValue = iq0Var != null ? (float) iq0Var.k().doubleValue() : z13 ? 48.0f : 36.0f;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        float s22 = c0.d.s2(doubleValue, this.f112699f, context);
        String m13 = iq0Var != null ? iq0Var.m() : null;
        boolean z14 = !(m13 == null || m13.length() == 0);
        float f13 = s22 / 5;
        float f14 = 2 * f13;
        float f15 = jVar.f112624a;
        if (z14) {
            f15 -= f14;
        }
        int i13 = (int) f13;
        int i14 = jVar.f112626c;
        if (z14) {
            i14 += i13 * 4;
        }
        RectF rectF = this.E;
        float f16 = jVar.f112625b;
        int i15 = jVar.f112627d;
        if (rectF == null || !rectF.intersect(new RectF(f15, f16, i14 + f15, i15 + f16))) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            appCompatTextView.setLayoutParams(new RelativeLayout.LayoutParams(i14, i15));
            ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            c0.d.m2((RelativeLayout.LayoutParams) layoutParams, i14, i15, this.f112699f, this.f112700g);
            appCompatTextView.setX(f15);
            appCompatTextView.setY(f16);
            Context context2 = appCompatTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            zf1.e eVar = this.f112705l;
            if (eVar == null) {
                Intrinsics.r("fontManager");
                throw null;
            }
            kh2.d.i(context2, iq0Var, appCompatTextView, z13, text, eVar, this.A, this.f112698e, this.f112699f);
            addView(appCompatTextView);
        }
    }

    public final void m(sp0.d dVar, hh1.s sVar, hh1.l lVar, boolean z13, qf1.x xVar, Function1 function1, hh1.m mVar) {
        hh1.d dVar2;
        hh1.d dVar3 = this.I;
        if (Intrinsics.d(dVar3 != null ? dVar3.f69156f : null, lVar)) {
            n();
            D();
            return;
        }
        int i13 = 0;
        if (z13) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            dVar2 = new hh1.d(context, dVar, mVar, new hh1.r(bs1.c.f2(this, p92.e.idea_pin_tag_removed)), new m(this, i13), hf0.b.f69002b);
        } else {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            dVar2 = new hh1.d(context2, sVar, dVar, mVar, lVar, new y0(2, this, xVar), new n(3, this, function1), new n(i13, this, xVar), hf0.b.f69002b);
        }
        n();
        this.I = dVar2;
        addView(dVar2);
        z(xVar);
    }

    public final void n() {
        hh1.d dVar = this.I;
        if (dVar != null) {
            dVar.f69157g.invoke(dVar);
        }
        this.I = null;
    }

    public final PinterestVideoView o() {
        Iterator it = d7.b.O(this).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (view instanceof PinterestVideoView) {
                return (PinterestVideoView) view;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.I == null) {
            y92.c cVar = this.f112697d;
            return cVar != null ? cVar.c(event) : super.onTouchEvent(event);
        }
        if (event.getAction() != 1) {
            return true;
        }
        n();
        D();
        return true;
    }

    public final x92.b q() {
        x92.b bVar = this.f112717x;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.r("developerPreferences");
        throw null;
    }

    public final m60.w s() {
        m60.w wVar = this.f112709p;
        if (wVar != null) {
            return wVar;
        }
        Intrinsics.r("eventManager");
        throw null;
    }

    @Override // yk1.n
    public final void setLoadState(yk1.i state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state != yk1.i.LOADING) {
            kh2.s0.w(x(), c.f112520m);
            return;
        }
        lh0.w1 t13 = t();
        z3 z3Var = a4.f83297a;
        lh0.g1 g1Var = (lh0.g1) t13.f83496a;
        if (g1Var.o("android_product_tag_api_migration", "enabled", z3Var) || g1Var.l("android_product_tag_api_migration")) {
            if (this.K == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.setForegroundGravity(17);
                this.K = frameLayout;
                GestaltSpinner x13 = x();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                x13.setLayoutParams(layoutParams);
                FrameLayout frameLayout2 = this.K;
                if (frameLayout2 != null) {
                    frameLayout2.addView(x());
                }
            }
            FrameLayout frameLayout3 = this.K;
            if (frameLayout3 != null) {
                k3.M1(frameLayout3, this);
            }
        } else {
            k3.M1(x(), this);
            GestaltSpinner x14 = x();
            ViewGroup.LayoutParams layoutParams2 = x14.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams2.width = -2;
            layoutParams2.height = -2;
            setGravity(17);
            x14.setLayoutParams(layoutParams2);
        }
        kh2.s0.w(x(), c.f112519l);
    }

    @Override // yk1.r
    public final void setPinalytics(nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f112698e = pinalytics;
    }

    public final lh0.w1 t() {
        lh0.w1 w1Var = this.f112713t;
        if (w1Var != null) {
            return w1Var;
        }
        Intrinsics.r("experiments");
        throw null;
    }

    public final GestaltSpinner x() {
        return (GestaltSpinner) this.f112696J.getValue();
    }

    public final void z(qf1.x sticker) {
        C();
        w0 w0Var = this.C;
        if (w0Var != null) {
            e1 e1Var = w0Var.f112788a;
            e1Var.f112559r.X();
            Intrinsics.checkNotNullParameter(sticker, "sticker");
            j1 j1Var = e1Var.G;
            if (j1Var != null) {
                Intrinsics.checkNotNullParameter(sticker, "sticker");
                ((rf1.p0) j1Var).Y3(sticker.f103775a);
            }
        }
    }
}
