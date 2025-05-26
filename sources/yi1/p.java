package yi1;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.pinterest.api.model.or;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import qa2.c1;

/* loaded from: classes2.dex */
public final class p extends wa2.a {
    public final PorterDuffColorFilter A;
    public c1 B;
    public or C;
    public k D;
    public boolean E;
    public cs.c F;
    public float G;
    public int H;
    public float[] I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f139123J;
    public boolean K;
    public wa2.q L;
    public u50.r M;

    /* renamed from: l, reason: collision with root package name */
    public final View f139124l;

    /* renamed from: m, reason: collision with root package name */
    public final hs1.q f139125m;

    /* renamed from: n, reason: collision with root package name */
    public float f139126n;

    /* renamed from: o, reason: collision with root package name */
    public int f139127o;

    /* renamed from: p, reason: collision with root package name */
    public int f139128p;

    /* renamed from: q, reason: collision with root package name */
    public int f139129q;

    /* renamed from: r, reason: collision with root package name */
    public int f139130r;

    /* renamed from: s, reason: collision with root package name */
    public final RectF f139131s;

    /* renamed from: t, reason: collision with root package name */
    public final Matrix f139132t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f139133u;

    /* renamed from: v, reason: collision with root package name */
    public final qa2.c f139134v;

    /* renamed from: w, reason: collision with root package name */
    public final RectF f139135w;

    /* renamed from: x, reason: collision with root package name */
    public BitmapShader f139136x;

    /* renamed from: y, reason: collision with root package name */
    public Bitmap f139137y;

    /* renamed from: z, reason: collision with root package name */
    public final Paint f139138z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p(com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep r4, hs1.q r5) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "imageCache"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            android.content.Context r0 = r4.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.app.Activity r0 = bs1.c.k0(r0)
            r3.<init>(r0)
            r3.f139124l = r4
            r3.f139125m = r5
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.f139126n = r5
            r0 = -1
            r3.f139127o = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r3.f139131s = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r3.f139132t = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.f139133u = r0
            qa2.c r0 = new qa2.c
            r0.<init>(r4)
            r2 = 0
            r0.f103232a = r2
            r3.f139134v = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r3.f139135w = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            r2 = 1
            r0.setAntiAlias(r2)
            r3.f139138z = r0
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            android.content.Context r4 = r4.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            int r1 = eo1.a.color_background_dark_opacity_100
            int r4 = dl2.b.x0(r4, r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r0.<init>(r4, r1)
            r3.A = r0
            qa2.c1 r4 = qa2.c1.NONE
            r3.B = r4
            yi1.i r4 = yi1.g.f139089a
            r3.D = r4
            cs.c r4 = cs.c.HERO_AND_CHIPS
            r3.F = r4
            r3.G = r5
            r4 = 8
            float[] r4 = new float[r4]
            r4 = {x0084: FILL_ARRAY_DATA , data: [0, 0, 0, 0, 0, 0, 0, 0} // fill-array
            r3.I = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yi1.p.<init>(com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep, hs1.q):void");
    }

    @Override // wa2.l
    public final void c() {
        super.c();
        hs1.m mVar = (hs1.m) this.f139125m;
        qa2.c cVar = this.f139134v;
        mVar.h(cVar);
        this.f139136x = null;
        this.f139137y = null;
        cVar.d();
        this.C = null;
        this.B = c1.NONE;
        this.f139123J = false;
        this.K = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Unit unit;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f128846i) {
            return;
        }
        this.K = true;
        BitmapShader bitmapShader = this.f139136x;
        Bitmap bitmap = this.f139137y;
        if (bitmapShader == null || bitmap == null) {
            unit = null;
        } else {
            Paint paint = this.f139138z;
            paint.setShader(bitmapShader);
            if (bitmap.isRecycled()) {
                k(canvas);
            } else {
                l(canvas, paint, this.f139131s);
                if (!this.f139123J) {
                    this.f139123J = true;
                    u50.r rVar = this.M;
                    if (rVar != null) {
                        qa2.c cVar = this.f139134v;
                        rVar.a(new b0(cVar.f103244m, cVar.f103245n, bitmap.getWidth(), this.f139124l.getWidth()));
                    }
                }
            }
            unit = Unit.f80348a;
        }
        if (unit == null) {
            k(canvas);
        }
    }

    @Override // wa2.a
    public final boolean h() {
        return this.K;
    }

    @Override // wa2.a
    public final void i(int i13) {
        vb0.j.f125466a.F("Background color should come through display state in SBA.", tb0.p.PLATFORM, new Object[0]);
    }

    public final void j() {
        d7.j0 j0Var;
        bb2.f fVar;
        if (this.f128841d == 0 || this.f128842e == 0 || (j0Var = this.f139134v.f103238g) == null) {
            return;
        }
        g(this.H);
        int i13 = j0Var.f53836c;
        int i14 = j0Var.f53835b;
        Rect rect = this.f139133u;
        rect.left = 0;
        rect.top = 0;
        rect.right = i14;
        rect.bottom = i13;
        if (this.E) {
            fVar = bb2.f.FIT;
        } else {
            cs.c cVar = this.F;
            if (cVar == cs.c.TWO_BY_TWO || cVar == cs.c.TWO_BY_THREE) {
                fVar = bb2.f.FILL;
            } else if (this.B == c1.SCALE_TO_FILL) {
                fVar = bb2.f.FILL;
            } else {
                k kVar = this.D;
                j jVar = kVar instanceof j ? (j) kVar : null;
                fVar = jVar != null ? jVar.e() : null;
            }
        }
        int i15 = this.f128841d;
        int i16 = this.f128842e;
        float D = fVar != null ? dl2.b.D(fVar, i14, i13, i15, i16) : i15 / i14;
        this.f139126n = D;
        Matrix matrix = this.f139132t;
        matrix.setScale(D, D);
        or orVar = this.C;
        if (fVar == null) {
            rect.bottom = ml2.c.c(this.f128842e / this.f139126n);
            if (orVar != null) {
                int c13 = ml2.c.c(com.bumptech.glide.c.T(orVar) * i13);
                rect.top = c13;
                rect.bottom += c13;
            }
        }
        int i17 = n.f139120b[(fVar != null ? m.BOTH : orVar != null ? m.VERTICAL : m.NONE).ordinal()];
        if (i17 == 1) {
            dl2.b.V2(i15, i16, i14, i13, matrix, this.f139126n);
        } else if (i17 == 2) {
            float f13 = i13 * this.f139126n;
            Intrinsics.f(orVar);
            matrix.postTranslate(0.0f, (-(com.bumptech.glide.c.T(orVar) * f13)) + this.f128840c);
        } else if (i17 == 3) {
            matrix.postTranslate(0.0f, this.H);
        }
        c1 c1Var = this.B;
        c1 c1Var2 = c1.SCALE_TO_FILL;
        RectF rectF = this.f139131s;
        if (c1Var == c1Var2) {
            rectF.left = 0.0f;
            float f14 = this.H;
            rectF.top = f14;
            rectF.right = this.f128841d;
            rectF.bottom = this.f128842e + f14;
        } else {
            rectF.set(rect);
            matrix.mapRect(rectF);
            float f15 = i15;
            if (rectF.right > f15) {
                rectF.right = f15;
            }
        }
        BitmapShader bitmapShader = this.f139136x;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        wa2.q qVar = this.L;
        if (qVar != null) {
            qVar.a();
        }
    }

    public final void k(Canvas canvas) {
        this.f128843f.setColor(this.f139127o);
        RectF rectF = this.f139135w;
        rectF.set(getBounds());
        Paint fillPaint = this.f128843f;
        Intrinsics.checkNotNullExpressionValue(fillPaint, "fillPaint");
        l(canvas, fillPaint, rectF);
        d();
        u50.r rVar = this.M;
        if (rVar != null) {
            rVar.a(new c0());
        }
    }

    public final void l(Canvas canvas, Paint paint, RectF rectF) {
        if (!(this.D instanceof j)) {
            Path path = new Path();
            path.addRoundRect(rectF, this.I, Path.Direction.CW);
            canvas.drawPath(path, paint);
            return;
        }
        int i13 = this.f128841d;
        int i14 = this.f128842e;
        float f13 = this.H;
        RectF rectF2 = new RectF(0.0f, f13, i13, i14 + f13);
        Path path2 = new Path();
        float[] fArr = this.I;
        Path.Direction direction = Path.Direction.CW;
        path2.addRoundRect(rectF2, fArr, direction);
        if (ml2.c.c(rectF.bottom) >= ml2.c.c(rectF2.bottom) && ml2.c.c(rectF.right) >= ml2.c.c(rectF2.right)) {
            Path path3 = new Path();
            path3.addRoundRect(rectF, this.I, direction);
            canvas.save();
            canvas.clipPath(path2);
            canvas.drawPath(path3, paint);
            canvas.restore();
            return;
        }
        this.f128843f.setColor(this.f139127o);
        Path path4 = new Path();
        path4.addRoundRect(rectF2, this.I, direction);
        canvas.save();
        canvas.clipPath(path2);
        canvas.drawPath(path4, this.f128843f);
        canvas.drawRoundRect(rectF, 0.0f, 0.0f, paint);
        canvas.restore();
    }
}
