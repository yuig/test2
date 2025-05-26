package com.pinterest.feature.pincarouselads.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import ao2.m0;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.p2;
import lh0.z3;
import okhttp3.Headers;
import so.jb;
import yq0.c0;

/* loaded from: classes2.dex */
public final class l extends View implements l21.i, af2.c {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f47386x = 0;

    /* renamed from: a, reason: collision with root package name */
    public ye2.o f47387a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f47388b;

    /* renamed from: c, reason: collision with root package name */
    public final int f47389c;

    /* renamed from: d, reason: collision with root package name */
    public final hs1.q f47390d;

    /* renamed from: e, reason: collision with root package name */
    public final p2 f47391e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f47392f;

    /* renamed from: g, reason: collision with root package name */
    public l21.f f47393g;

    /* renamed from: h, reason: collision with root package name */
    public l21.g f47394h;

    /* renamed from: i, reason: collision with root package name */
    public l21.h f47395i;

    /* renamed from: j, reason: collision with root package name */
    public final xk2.v f47396j;

    /* renamed from: k, reason: collision with root package name */
    public String f47397k;

    /* renamed from: l, reason: collision with root package name */
    public String f47398l;

    /* renamed from: m, reason: collision with root package name */
    public float f47399m;

    /* renamed from: n, reason: collision with root package name */
    public float f47400n;

    /* renamed from: o, reason: collision with root package name */
    public float f47401o;

    /* renamed from: p, reason: collision with root package name */
    public float f47402p;

    /* renamed from: q, reason: collision with root package name */
    public final xk2.v f47403q;

    /* renamed from: r, reason: collision with root package name */
    public final xk2.v f47404r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f47405s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f47406t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f47407u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f47408v;

    /* renamed from: w, reason: collision with root package name */
    public int f47409w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, int i13, boolean z13, x xVar, int i14) {
        super(context, null, 0);
        xVar = (i14 & 32) != 0 ? null : xVar;
        Intrinsics.checkNotNullParameter(context, "context");
        int i15 = 0;
        int i16 = 1;
        if (!this.f47388b) {
            this.f47388b = true;
            jb jbVar = (jb) ((m) generatedComponent());
            this.f47390d = (hs1.q) jbVar.f113483a.f113875q7.get();
            this.f47391e = jbVar.f();
        }
        this.f47389c = i13;
        p2 p2Var = this.f47391e;
        if (p2Var == null) {
            Intrinsics.r("experiments");
            throw null;
        }
        z3 z3Var = a4.f83298b;
        g1 g1Var = (g1) p2Var.f83457a;
        this.f47392f = g1Var.o("android_load_medium_res_image_in_pdp_closeup", "enabled", z3Var) || g1Var.l("android_load_medium_res_image_in_pdp_closeup");
        this.f47396j = xk2.m.b(new i(this, i15));
        this.f47403q = xk2.m.b(j.f47381j);
        this.f47404r = xk2.m.b(new i(this, i16));
        this.f47409w = -1;
        if (z13) {
            setOnClickListener(new c0(i16, this, context));
            setOnLongClickListener(new h(this, i15));
            setOnTouchListener(xVar);
        }
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    public final qa2.c a() {
        return (qa2.c) this.f47396j.getValue();
    }

    public final hs1.q b() {
        hs1.q qVar = this.f47390d;
        if (qVar != null) {
            return qVar;
        }
        Intrinsics.r("imageCache");
        throw null;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f47387a == null) {
            this.f47387a = new ye2.o(this);
        }
        return this.f47387a;
    }

    public final Paint e() {
        return (Paint) this.f47404r.getValue();
    }

    public final RectF g() {
        return (RectF) this.f47403q.getValue();
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f47387a == null) {
            this.f47387a = new ye2.o(this);
        }
        return this.f47387a.generatedComponent();
    }

    public final void i() {
        hs1.z o13;
        String str;
        hs1.z o14;
        String str2 = this.f47397k;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() <= 0) {
            a().f103239h = "";
            a().f(null);
            return;
        }
        boolean z13 = false;
        if (this.f47409w == 0) {
            l21.h hVar = this.f47395i;
            if (hVar != null) {
                hVar.k1();
            }
            if (this.f47392f && (str = this.f47398l) != null && str.length() > 0 && !((hs1.m) b()).m(str2) && ((hs1.m) b()).m(str)) {
                o14 = ((hs1.m) b()).o(str, false);
                o14.f70086d = true;
                Bitmap.Config config = Bitmap.Config.RGB_565;
                o14.a(a());
                z13 = true;
            }
        }
        o13 = ((hs1.m) b()).o(str2, false);
        if (!z13) {
            o13.f70086d = true;
        }
        if (!this.f47405s) {
            o13.f70087e = (int) this.f47399m;
            o13.f70088f = (int) this.f47400n;
        }
        Bitmap.Config config2 = Bitmap.Config.RGB_565;
        o13.a(a());
    }

    public final void j(String str, String str2) {
        String str3 = this.f47397k;
        if (str3 == null || str3.length() == 0 || !Intrinsics.d(this.f47397k, str)) {
            this.f47397k = str;
            if (this.f47392f) {
                this.f47398l = str2;
            }
            ((hs1.m) b()).h(a());
            a().f(null);
            a().f103239h = null;
            this.f47408v = false;
            invalidate();
            a().f103242k = new k(this, 0);
            String str4 = this.f47397k;
            if (str4 == null || str4.length() == 0) {
                return;
            }
            i();
        }
    }

    public final void k(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float D = dl2.b.D(bb2.f.FIT, width, height, this.f47399m, this.f47400n);
        this.f47401o = width * D;
        this.f47402p = height * D;
    }

    public final void l(Canvas canvas) {
        RectF g13 = g();
        float f13 = this.f47402p;
        float f14 = this.f47400n;
        float f15 = f13 < f14 ? (f14 - f13) / 2 : 0.0f;
        g13.set(0.0f, f15, this.f47401o, f13 + f15);
        int i13 = this.f47389c;
        canvas.drawRoundRect(g13, i13, i13, e());
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        l21.f fVar = this.f47393g;
        if (fVar != null) {
            return fVar.m0();
        }
        return null;
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        l21.f fVar = this.f47393g;
        if (fVar != null) {
            return fVar.T();
        }
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        a().f103232a = this.f47389c;
        a().a(canvas, 0.0f, 0.0f, this.f47399m, this.f47400n, this.f47405s);
        Bitmap c13 = a().c();
        if (c13 != null) {
            if (this.f47406t) {
                k(c13);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.width = Math.min((int) this.f47401o, layoutParams.width);
                if (this.f47407u || qb0.b.d(c13)) {
                    l(canvas);
                }
            } else if (this.f47407u || qb0.b.d(c13)) {
                RectF g13 = g();
                g13.set(0.0f, 0.0f, this.f47399m, this.f47400n);
                canvas.drawRect(g13, e());
            }
            qa2.c a13 = a();
            if (!this.f47408v && m0.f20172b && this.f47409w == 0) {
                s92.c C0 = dl2.b.C0(a13.f103244m, a13.f103245n);
                String str = this.f47397k;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                Headers headers = a13.f103245n;
                Bitmap c14 = a13.c();
                new py.i(str2, C0, headers, c14 != null ? c14.getWidth() : 0, getWidth()).i();
            }
            if (this.f47408v) {
                return;
            }
            this.f47408v = true;
            if (this.f47406t && this.f47401o > 0.0f) {
                ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams2.width = (int) this.f47401o;
                setLayoutParams(layoutParams2);
            }
            if (this.f47409w != 0 || m0.f20172b) {
                return;
            }
            m60.u.f85943a.d(new ky.b());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        this.f47399m = View.MeasureSpec.getSize(i13);
        this.f47400n = View.MeasureSpec.getSize(i14);
        i();
    }
}
