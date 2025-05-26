package wa2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import ao2.m0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.or;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.n1;
import lh0.z0;
import lh0.z3;
import okhttp3.Headers;
import qa2.c1;
import qa2.d1;

/* loaded from: classes2.dex */
public final class s extends a {

    /* renamed from: l0, reason: collision with root package name */
    public static final int f128899l0 = ml2.c.c(420.0f * hf0.b.f69001a);

    /* renamed from: m0, reason: collision with root package name */
    public static final int f128900m0 = ml2.c.c(hf0.b.f69002b * 1.25f);

    /* renamed from: n0, reason: collision with root package name */
    public static final int f128901n0 = ml2.c.c(hf0.b.f69002b * 2.8f);

    /* renamed from: o0, reason: collision with root package name */
    public static final int f128902o0 = ml2.c.c(hf0.b.f69002b * 1.12f);
    public final int A;
    public final int B;
    public final int C;
    public final RectF D;
    public final Matrix E;
    public final Rect F;
    public Boolean G;
    public final PorterDuffColorFilter H;
    public String I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f128903J;
    public c1 K;
    public or L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public cs.c V;
    public Float W;
    public int X;
    public final RectF Y;
    public final RectF Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f128904a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f128905b0;

    /* renamed from: c0, reason: collision with root package name */
    public bb2.e f128906c0;

    /* renamed from: d0, reason: collision with root package name */
    public final tn1.c f128907d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f128908e0;

    /* renamed from: f0, reason: collision with root package name */
    public final n1 f128909f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f128910g0;

    /* renamed from: h0, reason: collision with root package name */
    public float f128911h0;

    /* renamed from: i0, reason: collision with root package name */
    public final m60.w f128912i0;

    /* renamed from: j0, reason: collision with root package name */
    public q f128913j0;

    /* renamed from: k0, reason: collision with root package name */
    public Integer f128914k0;

    /* renamed from: l, reason: collision with root package name */
    public final View f128915l;

    /* renamed from: m, reason: collision with root package name */
    public final es.h f128916m;

    /* renamed from: n, reason: collision with root package name */
    public final es.a f128917n;

    /* renamed from: o, reason: collision with root package name */
    public final hs1.q f128918o;

    /* renamed from: p, reason: collision with root package name */
    public float f128919p;

    /* renamed from: q, reason: collision with root package name */
    public int f128920q;

    /* renamed from: r, reason: collision with root package name */
    public int f128921r;

    /* renamed from: s, reason: collision with root package name */
    public int f128922s;

    /* renamed from: t, reason: collision with root package name */
    public final qa2.c f128923t;

    /* renamed from: u, reason: collision with root package name */
    public final RectF f128924u;

    /* renamed from: v, reason: collision with root package name */
    public BitmapShader f128925v;

    /* renamed from: w, reason: collision with root package name */
    public final Paint f128926w;

    /* renamed from: x, reason: collision with root package name */
    public int f128927x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f128928y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f128929z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s(android.view.View r4, es.h r5, es.a r6, hs1.q r7) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "adsCommonDisplay"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "adFormats"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "imageCache"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.app.Activity r0 = bs1.c.k0(r0)
            r3.<init>(r0)
            r3.f128915l = r4
            r3.f128916m = r5
            r3.f128917n = r6
            r3.f128918o = r7
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.f128919p = r5
            r5 = -1
            r3.f128920q = r5
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r3.D = r5
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r3.E = r5
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r3.F = r5
            r5 = 1
            r3.f128903J = r5
            qa2.c1 r6 = qa2.c1.NONE
            r3.K = r6
            cs.c r6 = cs.c.HERO_AND_CHIPS
            r3.V = r6
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>()
            r3.Y = r6
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>()
            r3.Z = r6
            m60.w r6 = m60.u.f85943a
            r3.f128912i0 = r6
            android.content.Context r6 = r4.getContext()
            android.content.res.Resources r7 = r6.getResources()
            vb0.i r0 = lh0.n1.f83436b
            lh0.n1 r0 = r0.c()
            r3.f128909f0 = r0
            qa2.c r0 = new qa2.c
            r0.<init>(r4)
            r3.f128923t = r0
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r3.f128924u = r4
            android.graphics.Paint r4 = new android.graphics.Paint
            r4.<init>()
            r3.f128926w = r4
            r4.setAntiAlias(r5)
            int r4 = m60.r0.corner_radius_large
            int r4 = r7.getDimensionPixelOffset(r4)
            r3.f128927x = r4
            int r4 = eo1.a.color_gray_roboflow_500
            int r4 = dl2.b.x0(r6, r4)
            r3.A = r4
            int r4 = eo1.a.base_color_grayscale_0
            int r4 = dl2.b.x0(r6, r4)
            r3.B = r4
            int r4 = eo1.a.sema_color_background_secondary_default
            int r4 = dl2.b.x0(r6, r4)
            r3.C = r4
            android.graphics.PorterDuffColorFilter r4 = new android.graphics.PorterDuffColorFilter
            int r5 = eo1.a.color_background_dark_opacity_100
            int r5 = dl2.b.x0(r6, r5)
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r4.<init>(r5, r7)
            r3.H = r4
            tn1.c r4 = new tn1.c
            vn1.g r5 = vn1.g.BODY_300
            vn1.c r7 = vn1.c.SUBTLE
            java.util.List r0 = tn1.c.f118618j
            tn1.b r1 = new tn1.b
            r2 = 2
            r1.<init>(r7, r0, r5, r2)
            r4.<init>(r6, r1)
            r3.f128907d0 = r4
            r4.ascent()
            r4.descent()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wa2.s.<init>(android.view.View, es.h, es.a, hs1.q):void");
    }

    @Override // wa2.l
    public final void c() {
        super.c();
        qa2.c cVar = this.f128923t;
        Intrinsics.f(cVar);
        ((hs1.m) this.f128918o).h(cVar);
        this.f128925v = null;
        this.f128928y = false;
        this.f128929z = false;
        this.G = null;
        cVar.d();
        this.f128903J = true;
        this.L = null;
        this.M = false;
        this.N = false;
        this.K = c1.NONE;
        this.P = false;
        this.f128910g0 = 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap c13;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f128846i) {
            return;
        }
        RectF rectF = this.f128924u;
        Unit unit = null;
        qa2.c cVar = this.f128923t;
        if (cVar != null && (c13 = cVar.c()) != null) {
            int i13 = cVar.f103243l;
            View view = this.f128915l;
            if (i13 < 255) {
                int i14 = this.f128920q;
                if (i14 != this.B) {
                    this.f128843f.setColor(i14);
                    rectF.set(getBounds());
                    Paint fillPaint = this.f128843f;
                    Intrinsics.checkNotNullExpressionValue(fillPaint, "fillPaint");
                    n(canvas, fillPaint, rectF);
                    d();
                }
                cVar.f103243l = i13 + 67;
                view.postInvalidateDelayed(56L);
            }
            if (this.f128925v != null) {
                if (this.G == null) {
                    this.G = Boolean.valueOf(qb0.b.d(c13));
                }
                Boolean bool = this.G;
                Paint paint = this.f128926w;
                if (bool == null || !bool.booleanValue()) {
                    paint.setColorFilter(null);
                } else {
                    paint.setColorFilter(this.H);
                }
                paint.setShader(this.f128925v);
                n(canvas, paint, this.D);
            }
            if (!this.f128928y) {
                s92.c C0 = dl2.b.C0(cVar.f103244m, cVar.f103245n);
                String str = this.I;
                if (str != null) {
                    Headers headers = cVar.f103245n;
                    Bitmap c14 = cVar.c();
                    new py.i(str, C0, headers, c14 != null ? c14.getWidth() : 0, view.getWidth()).i();
                }
            }
            if (!this.f128928y) {
                this.f128928y = true;
                if (!m0.f20172b) {
                    this.f128912i0.d(new ky.b());
                }
            }
            unit = Unit.f80348a;
        }
        if (unit == null) {
            this.f128843f.setColor(this.f128908e0 ? this.C : qb0.b.n(this.f128920q) ? this.A : this.f128920q);
            rectF.set(getBounds());
            Paint fillPaint2 = this.f128843f;
            Intrinsics.checkNotNullExpressionValue(fillPaint2, "fillPaint");
            n(canvas, fillPaint2, rectF);
            d();
            if (!this.f128929z) {
                this.f128929z = true;
                String pinUid = this.I;
                if (pinUid != null) {
                    Intrinsics.checkNotNullParameter(pinUid, "pinUid");
                    new py.b(pinUid).i();
                }
            }
        }
        int i15 = this.X;
        if (i15 == 1) {
            m(canvas, 1, rm1.q.HEART, om1.f.DEFAULT_LIGHT_GRAY);
        } else {
            if (i15 != 2) {
                return;
            }
            m(canvas, 2, rm1.q.THUMBS_UP, om1.f.DEFAULT_LIGHT_GRAY);
        }
    }

    @Override // wa2.a
    public final boolean h() {
        return this.f128928y;
    }

    @Override // wa2.a
    public final void i(int i13) {
        this.f128914k0 = Integer.valueOf(i13);
    }

    public final void j(Canvas canvas, Paint paint, RectF rectF) {
        RectF rectF2 = this.Z;
        rectF2.top = rectF.top + this.f128927x;
        rectF2.bottom = rectF.bottom;
        rectF2.right = rectF.right;
        canvas.drawRect(rectF2, paint);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(bb2.e r11, boolean r12) {
        /*
            r10 = this;
            qa2.c r0 = r10.f128923t
            if (r0 == 0) goto L8f
            d7.j0 r1 = r0.f103238g
            if (r1 != 0) goto La
            goto L8f
        La:
            r2 = 0
            r10.f128903J = r2
            qa2.c1 r3 = qa2.c1.NONE
            r10.K = r3
            int r7 = r1.f53836c
            int r6 = r1.f53835b
            int r1 = r10.f128841d
            float r4 = (float) r1
            if (r12 == 0) goto L1f
            int r1 = r10.f128842e
            float r1 = (float) r1
        L1d:
            r5 = r1
            goto L37
        L1f:
            java.lang.Float r1 = r10.W
            java.lang.Float r1 = bs1.c.S0(r4, r1)
            if (r1 == 0) goto L2c
            float r1 = r1.floatValue()
            goto L1d
        L2c:
            float r1 = r11.c()
            float r1 = r1 * r4
            float r3 = r11.d()
            float r3 = r3 + r1
            r5 = r3
        L37:
            int r1 = (int) r5
            r10.e(r1)
            android.graphics.Rect r1 = r10.F
            r1.left = r2
            r1.top = r2
            r1.right = r6
            r1.bottom = r7
            android.graphics.RectF r2 = r10.D
            r2.set(r1)
            if (r12 == 0) goto L4f
            bb2.f r11 = bb2.f.FILL
            goto L5e
        L4f:
            boolean r12 = r10.P
            if (r12 == 0) goto L5a
            boolean r12 = r10.Q
            if (r12 != 0) goto L5a
            bb2.f r11 = bb2.f.FIT
            goto L5e
        L5a:
            bb2.f r11 = r11.b()
        L5e:
            float r11 = dl2.b.D(r11, r6, r7, r4, r5)
            r10.f128919p = r11
            android.graphics.Matrix r12 = r10.E
            r12.setScale(r11, r11)
            float r9 = r10.f128919p
            r8 = r12
            dl2.b.V2(r4, r5, r6, r7, r8, r9)
            int r11 = r10.f128910g0
            float r11 = (float) r11
            r1 = 0
            r12.postTranslate(r1, r11)
            r12.mapRect(r2)
            android.graphics.Bitmap r11 = r0.c()
            if (r11 == 0) goto L8f
            android.graphics.BitmapShader r0 = r10.f128925v
            if (r0 != 0) goto L8f
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            r0.<init>(r11, r1, r1)
            r10.f128925v = r0
            r0.setLocalMatrix(r12)
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wa2.s.k(bb2.e, boolean):void");
    }

    public final void l() {
        d7.j0 j0Var;
        if (this.f128841d == 0 || this.f128842e == 0) {
            return;
        }
        g(this.f128910g0);
        qa2.c cVar = this.f128923t;
        if (cVar == null || (j0Var = cVar.f103238g) == null || cVar.c() == null) {
            return;
        }
        boolean z13 = this.S && this.O;
        RectF rectF = this.D;
        Matrix matrix = this.E;
        float f13 = 0.0f;
        Rect rect = this.F;
        if (z13 && cVar.f103238g != null && cVar.c() != null) {
            d7.j0 j0Var2 = cVar.f103238g;
            if (j0Var2 != null && cVar.c() != null) {
                int i13 = j0Var2.f53836c;
                int i14 = j0Var2.f53835b;
                this.f128919p = this.f128842e / i13;
                rect.left = 0;
                rect.top = 0;
                rect.right = i14;
                rect.bottom = i13;
                rectF.set(rect);
                float f14 = this.f128919p;
                matrix.setScale(f14, f14);
                int c13 = ml2.c.c(i14 * this.f128919p);
                float f15 = (this.f128841d - c13) / 2.0f;
                this.f128911h0 = f15;
                matrix.postTranslate(f15, 0.0f);
                matrix.mapRect(rectF);
                rectF.right = c13 + this.f128911h0;
                rectF.bottom = this.f128842e;
                Bitmap c14 = cVar.c();
                if (c14 != null && this.f128925v == null) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(c14, tileMode, tileMode);
                    bitmapShader.setLocalMatrix(matrix);
                    this.f128925v = bitmapShader;
                }
            }
            q qVar = this.f128913j0;
            if (qVar != null) {
                qVar.a();
                return;
            }
            return;
        }
        if (this.U) {
            d7.j0 j0Var3 = cVar.f103238g;
            if (j0Var3 != null) {
                this.K = c1.NONE;
                int i15 = j0Var3.f53836c;
                int i16 = j0Var3.f53835b;
                float f16 = this.f128841d;
                float f17 = this.f128842e;
                rect.left = 0;
                rect.top = 0;
                rect.right = i16;
                rect.bottom = i15;
                rectF.set(rect);
                float D = dl2.b.D(bb2.f.FIT, i16, i15, f16, f17);
                this.f128919p = D;
                matrix.setScale(D, D);
                dl2.b.V2(f16, f17, i16, i15, matrix, this.f128919p);
                matrix.mapRect(rectF);
                Bitmap c15 = cVar.c();
                if (c15 != null && this.f128925v == null) {
                    Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader2 = new BitmapShader(c15, tileMode2, tileMode2);
                    this.f128925v = bitmapShader2;
                    bitmapShader2.setLocalMatrix(matrix);
                }
            }
            q qVar2 = this.f128913j0;
            if (qVar2 != null) {
                qVar2.a();
                return;
            }
            return;
        }
        bb2.e eVar = this.f128906c0;
        if (eVar != null) {
            if (this.V == cs.c.TWO_BY_TWO) {
                k(eVar, true);
                q qVar3 = this.f128913j0;
                if (qVar3 != null) {
                    qVar3.a();
                    return;
                }
                return;
            }
            if (!this.R) {
                k(eVar, false);
                q qVar4 = this.f128913j0;
                if (qVar4 != null) {
                    qVar4.a();
                    return;
                }
                return;
            }
        }
        if (this.T) {
            k(new bb2.e(f13, (bb2.f) null, 7), true);
            q qVar5 = this.f128913j0;
            if (qVar5 != null) {
                qVar5.a();
                return;
            }
            return;
        }
        d7.j0 j0Var4 = cVar.f103238g;
        if (j0Var4 == null || cVar.c() == null || this.K != c1.SCALE_TO_FILL) {
            int i17 = j0Var.f53836c;
            int i18 = j0Var.f53835b;
            float f18 = this.f128841d;
            float f19 = f18 / i18;
            this.f128919p = f19;
            rect.left = 0;
            rect.top = 0;
            rect.right = i18;
            rect.bottom = ml2.c.c(this.f128842e / f19);
            if (this.N) {
                or orVar = this.L;
                Intrinsics.f(orVar);
                int c16 = ml2.c.c(com.bumptech.glide.c.T(orVar) * i17);
                rect.top = c16;
                rect.bottom += c16;
            }
            rectF.set(rect);
            float f23 = this.f128919p;
            matrix.setScale(f23, f23);
            or orVar2 = this.L;
            if (!this.N || orVar2 == null) {
                matrix.postTranslate(0.0f, this.f128840c);
            } else {
                matrix.postTranslate(0.0f, (-(com.bumptech.glide.c.T(orVar2) * i17 * this.f128919p)) + this.f128840c);
            }
            matrix.mapRect(rectF);
            rectF.right = f18;
            Bitmap c17 = cVar.c();
            if (c17 != null && this.f128925v == null) {
                Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader3 = new BitmapShader(c17, tileMode3, tileMode3);
                this.f128925v = bitmapShader3;
                bitmapShader3.setLocalMatrix(matrix);
            }
            q qVar6 = this.f128913j0;
            if (qVar6 != null) {
                qVar6.a();
                return;
            }
            return;
        }
        if (this.f128903J && this.f128922s > bk.f.R(this.O, this.P)) {
            this.f128922s = bk.f.R(this.O, this.P);
        }
        matrix.reset();
        int i19 = j0Var4.f53836c;
        int i23 = j0Var4.f53835b;
        e(this.f128922s);
        rect.left = 0;
        rect.top = 0;
        rect.right = i23;
        rect.bottom = i19;
        rectF.left = 0.0f;
        float f24 = this.f128910g0;
        rectF.top = f24;
        rectF.right = this.f128841d;
        rectF.bottom = this.f128922s + f24;
        matrix.mapRect(rectF);
        float f25 = this.f128841d;
        float f26 = this.f128922s;
        float D2 = dl2.b.D(bb2.f.FILL, i23, i19, f25, f26);
        matrix.postScale(D2, D2, 0.0f, 0.0f);
        dl2.b.V2(f25, f26, i23, i19, matrix, D2);
        int i24 = this.f128910g0;
        if (i24 > 0) {
            matrix.postTranslate(0.0f, i24);
        }
        Bitmap c18 = cVar.c();
        if (c18 != null) {
            if (this.f128925v == null) {
                Shader.TileMode tileMode4 = Shader.TileMode.CLAMP;
                this.f128925v = new BitmapShader(c18, tileMode4, tileMode4);
            }
            BitmapShader bitmapShader4 = this.f128925v;
            Intrinsics.f(bitmapShader4);
            bitmapShader4.setLocalMatrix(matrix);
        }
        q qVar7 = this.f128913j0;
        if (qVar7 != null) {
            qVar7.a();
        }
    }

    public final void m(Canvas canvas, int i13, rm1.q qVar, om1.f fVar) {
        View view = this.f128915l;
        Context context = view.getContext();
        this.X = i13;
        om1.c cVar = new om1.c(qVar, om1.e.SM, fVar, null, null, false, 0, 1016);
        Intrinsics.f(context);
        BitmapDrawable b13 = pm1.a.b(context, cVar);
        Resources resources = view.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(eo1.c.space_200);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(eo1.c.space_1000);
        int i14 = this.f128841d;
        int i15 = dimensionPixelSize2 + dimensionPixelSize;
        int i16 = this.f128840c + this.f128842e;
        b13.setBounds(i14 - i15, i16 - i15, i14 - dimensionPixelSize, i16 - dimensionPixelSize);
        b13.draw(canvas);
    }

    public final void n(Canvas canvas, Paint paint, RectF rectF) {
        int intValue;
        qa2.c cVar;
        Bitmap c13;
        if (!(paint.getShader() instanceof BitmapShader) || (cVar = this.f128923t) == null || (c13 = cVar.c()) == null || !c13.isRecycled()) {
            bb2.e eVar = this.f128906c0;
            if (eVar == null) {
                float f13 = this.f128927x;
                canvas.drawRoundRect(rectF, f13, f13, paint);
                if (this.f128904a0) {
                    RectF rectF2 = this.Y;
                    rectF2.top = rectF.top;
                    rectF2.bottom = rectF.bottom - this.f128927x;
                    rectF2.right = rectF.right;
                    canvas.drawRect(rectF2, paint);
                }
                if (this.f128905b0) {
                    j(canvas, paint, rectF);
                    return;
                }
                return;
            }
            Integer num = this.f128914k0;
            if (num != null && (intValue = num.intValue()) != this.B) {
                this.f128843f.setColor(intValue);
            }
            float f14 = this.f128841d;
            float f15 = eVar.f22605b + (eVar.f22604a * f14);
            float f16 = this.f128910g0;
            Float S0 = bs1.c.S0(f14, this.W);
            if (S0 != null) {
                f15 = S0.floatValue();
            }
            RectF rectF3 = new RectF(0.0f, f16, f14, f15 + f16);
            float f17 = this.f128927x;
            canvas.drawRoundRect(rectF3, f17, f17, this.f128843f);
            if (this.f128905b0) {
                Paint fillPaint = this.f128843f;
                Intrinsics.checkNotNullExpressionValue(fillPaint, "fillPaint");
                j(canvas, fillPaint, rectF3);
                if (ml2.c.c(rectF.right) >= ml2.c.c(rectF3.right)) {
                    j(canvas, paint, rectF);
                }
            }
            int i13 = (rectF3.bottom > rectF.bottom || rectF3.right > rectF.right) ? 0 : this.f128927x;
            int save = canvas.save();
            Path path = new Path();
            path.reset();
            float f18 = this.f128927x;
            Path.Direction direction = Path.Direction.CW;
            path.addRoundRect(rectF3, f18, f18, direction);
            if (this.f128905b0) {
                RectF rectF4 = this.Z;
                rectF4.top = rectF3.top + this.f128927x;
                rectF4.bottom = rectF3.bottom;
                rectF4.right = rectF3.right;
                path.addRect(rectF4, direction);
            }
            path.close();
            canvas.clipPath(path);
            float f19 = i13;
            canvas.drawRoundRect(rectF, f19, f19, paint);
            canvas.restoreToCount(save);
        }
    }

    public final void o() {
        int i13 = this.f128921r;
        int i14 = this.f128922s;
        boolean z13 = this.S;
        if (z13 && this.O) {
            this.N = false;
            e(f128902o0);
        } else {
            int R = (!this.f128903J || z13) ? Integer.MAX_VALUE : bk.f.R(this.O, this.P);
            int ceil = ((int) Math.ceil((i14 / i13) * this.f128841d)) + 1;
            or orVar = this.L;
            if (this.K == c1.NONE && this.M && orVar != null) {
                ceil = (int) ((com.bumptech.glide.c.Q(orVar) - com.bumptech.glide.c.T(orVar)) * ceil);
                this.N = true;
            } else {
                this.N = false;
            }
            if (!this.U) {
                i14 = ceil > R ? R : ceil;
            }
            e(i14);
        }
        l();
        Rect rect = new Rect();
        this.f128907d0.getTextBounds("0", 0, 1, rect);
        rect.height();
    }

    public final void p(f30 f30Var, d1 pinSpec, boolean z13) {
        Map A4;
        int i13;
        Intrinsics.checkNotNullParameter(pinSpec, "pinSpec");
        if (f30Var == null) {
            return;
        }
        int b13 = pinSpec.b();
        int a13 = pinSpec.a();
        int b14 = ml2.c.b(b40.k0(f30Var));
        int b15 = ml2.c.b(b40.h0(f30Var));
        this.f128921r = b13;
        n1 n1Var = this.f128909f0;
        if (b14 > 0 && b15 > 0) {
            bb2.e eVar = this.f128906c0;
            if (eVar != null) {
                n1Var.getClass();
                z3 z3Var = a4.f83298b;
                z0 z0Var = n1Var.f83439a;
                g1 g1Var = (g1) z0Var;
                if (!g1Var.o("android_deal_module_hf_video_killswitch", "enabled", z3Var) && !g1Var.l("android_deal_module_hf_video_killswitch")) {
                    g1 g1Var2 = (g1) z0Var;
                    if (g1Var2.o("android_deal_module_hf_video_gate", "enabled", z3Var) || g1Var2.l("android_deal_module_hf_video_gate")) {
                        i13 = (int) (eVar.d() + (eVar.c() * b13));
                        a13 = i13 - 1;
                    }
                }
            }
            i13 = (int) (((b15 * 1.0d) / b14) * b13);
            a13 = i13 - 1;
        }
        this.f128922s = a13;
        n1Var.getClass();
        z3 z3Var2 = a4.f83297a;
        g1 g1Var3 = (g1) n1Var.f83439a;
        boolean z14 = b40.a1(f30Var, g1Var3.o("android_ads_ttd_video_mp4_rendering", "enabled", z3Var2) || g1Var3.l("android_ads_ttd_video_mp4_rendering")) && ((A4 = f30Var.A4()) == null || A4.isEmpty());
        this.f128908e0 = z14;
        if (z14) {
            this.f128921r = b14;
            this.f128922s = b15 - 1;
        }
        if (((es.v) this.f128916m).S(f30Var)) {
            this.f128921r = b14;
            this.f128922s = b14;
        }
        String l13 = b40.s0(f30Var) ? null : b40.l(f30Var);
        this.f128920q = (l13 == null || l13.length() == 0) ? -1 : Color.parseColor(l13);
        this.K = pinSpec.c();
        this.I = f30Var.getUid();
        this.f128903J = !b40.X0(f30Var);
        or x43 = f30Var.x4();
        this.L = x43;
        this.M = this.f128903J && x43 != null && (com.bumptech.glide.c.T(x43) > 0.0f || com.bumptech.glide.c.Q(x43) < 1.0f);
        this.P = n60.o.B(f30Var, "getIsPromoted(...)");
        this.Q = z13;
        Boolean Q5 = f30Var.Q5();
        Intrinsics.checkNotNullExpressionValue(Q5, "getPromotedIsMaxVideo(...)");
        this.R = Q5.booleanValue() && !dl2.b.M1(f30Var);
        this.S = b40.Q0(f30Var);
        this.T = b40.X0(f30Var) && this.P && !b40.E0(f30Var);
        this.U = b40.s0(f30Var);
        c72.o oVar = new c72.o(this, 19);
        es.a aVar = this.f128917n;
        this.W = ((es.c) aVar).q(f30Var, oVar);
        this.V = ((es.c) aVar).a(f30Var);
    }
}
