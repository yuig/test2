package qa2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* loaded from: classes2.dex */
public final class c implements hs1.a {

    /* renamed from: a, reason: collision with root package name */
    public int f103232a;

    /* renamed from: b, reason: collision with root package name */
    public final View f103233b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f103234c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f103235d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f103236e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f103237f;

    /* renamed from: g, reason: collision with root package name */
    public d7.j0 f103238g;

    /* renamed from: h, reason: collision with root package name */
    public String f103239h;

    /* renamed from: i, reason: collision with root package name */
    public final Paint f103240i;

    /* renamed from: j, reason: collision with root package name */
    public BitmapShader f103241j;

    /* renamed from: k, reason: collision with root package name */
    public lb.l0 f103242k;

    /* renamed from: l, reason: collision with root package name */
    public int f103243l;

    /* renamed from: m, reason: collision with root package name */
    public hs1.x f103244m;

    /* renamed from: n, reason: collision with root package name */
    public Headers f103245n;

    /* renamed from: o, reason: collision with root package name */
    public de.c f103246o;

    public c(View parentView) {
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        this.f103232a = (int) parentView.getResources().getDimension(eo1.c.corner_radius);
        this.f103233b = parentView;
        this.f103243l = 255;
        this.f103234c = new Matrix();
        this.f103235d = new RectF();
        Paint paint = new Paint();
        this.f103240i = paint;
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = new Paint();
        this.f103236e = paint2;
        Context context = parentView.getContext();
        int i13 = m60.q0.pinterest_grid_bg;
        Object obj = d5.a.f53679a;
        paint2.setColor(context.getColor(i13));
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
    }

    @Override // hs1.a
    public final void B0(Bitmap bitmap, hs1.x xVar) {
        f(bitmap);
        if (this.f103238g == null) {
            this.f103238g = new d7.j0(Boolean.valueOf(qb0.b.d(bitmap)), bitmap.getWidth(), bitmap.getHeight(), Boolean.valueOf(xVar == hs1.x.DISK || xVar == hs1.x.MEMORY));
        }
        this.f103243l = xVar == hs1.x.MEMORY ? 255 : 0;
        this.f103244m = xVar;
        this.f103245n = null;
        lb.l0 l0Var = this.f103242k;
        if (l0Var != null) {
            l0Var.P0(bitmap, xVar);
        }
        hs1.t.a().getClass();
    }

    @Override // hs1.a
    public final void J1() {
        d();
    }

    @Override // ee.i
    /* renamed from: K0 */
    public final de.c getE() {
        return this.f103246o;
    }

    @Override // ee.i
    public final void Z(de.c cVar) {
        this.f103246o = cVar;
    }

    public final void a(Canvas canvas, float f13, float f14, float f15, float f16, boolean z13) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Bitmap c13 = c();
        RectF rectF = this.f103235d;
        Matrix matrix = this.f103234c;
        if (c13 == null || this.f103241j == null) {
            matrix.reset();
            matrix.postTranslate(f13, f14);
            rectF.set(0.0f, 0.0f, f15, f16);
            matrix.mapRect(rectF);
            float f17 = this.f103232a;
            canvas.drawRoundRect(rectF, f17, f17, this.f103236e);
            return;
        }
        matrix.reset();
        if (z13) {
            Bitmap c14 = c();
            Intrinsics.f(c14);
            int width = c14.getWidth();
            Bitmap c15 = c();
            Intrinsics.f(c15);
            int height = c15.getHeight();
            float D = dl2.b.D(bb2.f.FIT, width, height, f15, f16);
            matrix.postScale(D, D, 0.0f, 0.0f);
            dl2.b.V2(f15, f16, width, height, matrix, D);
        } else {
            Intrinsics.f(c());
            float width2 = f15 / r6.getWidth();
            Intrinsics.f(c());
            matrix.postScale(width2, f16 / r6.getHeight(), 0.0f, 0.0f);
            matrix.postTranslate(f13, f14);
        }
        BitmapShader bitmapShader = this.f103241j;
        Intrinsics.f(bitmapShader);
        bitmapShader.setLocalMatrix(matrix);
        Bitmap c16 = c();
        Intrinsics.f(c16);
        float width3 = c16.getWidth();
        Intrinsics.f(c());
        rectF.set(0.0f, 0.0f, width3, r3.getHeight());
        matrix.mapRect(rectF);
        float f18 = this.f103232a;
        canvas.drawRoundRect(rectF, f18, f18, this.f103240i);
    }

    public final Bitmap c() {
        Bitmap bitmap = this.f103237f;
        if (bitmap != null && bitmap != null && !bitmap.isRecycled()) {
            return this.f103237f;
        }
        Bitmap bitmap2 = this.f103237f;
        if (bitmap2 != null && bitmap2.isRecycled()) {
            y1();
        }
        return null;
    }

    public final void d() {
        this.f103237f = null;
        this.f103238g = null;
    }

    public final void e(Bitmap bitmap) {
        this.f103237f = bitmap;
    }

    public final void f(Bitmap bitmap) {
        this.f103237f = bitmap;
        try {
            Bitmap c13 = c();
            Paint paint = this.f103240i;
            if (c13 == null) {
                paint.setShader(null);
                this.f103241j = null;
                this.f103238g = null;
            } else {
                Bitmap c14 = c();
                Intrinsics.f(c14);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(c14, tileMode, tileMode);
                this.f103241j = bitmapShader;
                paint.setShader(bitmapShader);
                Bitmap c15 = c();
                Intrinsics.f(c15);
                int width = c15.getWidth();
                Bitmap c16 = c();
                Intrinsics.f(c16);
                this.f103238g = new d7.j0(null, width, c16.getHeight(), null);
            }
            View view = this.f103233b;
            if (view != null) {
                Intrinsics.f(view);
                view.postInvalidateDelayed(1L);
            }
        } catch (Exception e13) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.p(e13);
        }
    }

    @Override // hs1.a
    public final void n1(String str) {
        this.f103239h = str;
    }

    @Override // hs1.a
    public final void p1(boolean z13) {
        d();
    }

    @Override // hs1.a, ee.i
    public final void s(Drawable drawable) {
        lb.l0 l0Var = this.f103242k;
        if (l0Var != null) {
            Intrinsics.f(l0Var);
            l0Var.O0();
        }
    }

    @Override // hs1.a
    public final void y1() {
        f(null);
    }
}
