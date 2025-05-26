package bk;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class i extends Drawable implements a0 {

    /* renamed from: x, reason: collision with root package name */
    public static final Paint f23051x;

    /* renamed from: a, reason: collision with root package name */
    public h f23052a;

    /* renamed from: b, reason: collision with root package name */
    public final y[] f23053b;

    /* renamed from: c, reason: collision with root package name */
    public final y[] f23054c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f23055d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f23056e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f23057f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f23058g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f23059h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f23060i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f23061j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f23062k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f23063l;

    /* renamed from: m, reason: collision with root package name */
    public o f23064m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f23065n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f23066o;

    /* renamed from: p, reason: collision with root package name */
    public final ak.a f23067p;

    /* renamed from: q, reason: collision with root package name */
    public final rd.j f23068q;

    /* renamed from: r, reason: collision with root package name */
    public final r f23069r;

    /* renamed from: s, reason: collision with root package name */
    public PorterDuffColorFilter f23070s;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuffColorFilter f23071t;

    /* renamed from: u, reason: collision with root package name */
    public int f23072u;

    /* renamed from: v, reason: collision with root package name */
    public final RectF f23073v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f23074w;

    static {
        Paint paint = new Paint(1);
        f23051x = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public i() {
        this(new o());
    }

    public final boolean A() {
        PorterDuffColorFilter porterDuffColorFilter = this.f23070s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f23071t;
        h hVar = this.f23052a;
        this.f23070s = c(hVar.f23035f, hVar.f23036g, this.f23065n, true);
        h hVar2 = this.f23052a;
        this.f23071t = c(hVar2.f23034e, hVar2.f23036g, this.f23066o, false);
        h hVar3 = this.f23052a;
        if (hVar3.f23049t) {
            this.f23067p.a(hVar3.f23035f.getColorForState(getState(), 0));
        }
        return (Objects.equals(porterDuffColorFilter, this.f23070s) && Objects.equals(porterDuffColorFilter2, this.f23071t)) ? false : true;
    }

    public final void B() {
        h hVar = this.f23052a;
        float f13 = hVar.f23043n + hVar.f23044o;
        hVar.f23046q = (int) Math.ceil(0.75f * f13);
        this.f23052a.f23047r = (int) Math.ceil(f13 * 0.25f);
        A();
        super.invalidateSelf();
    }

    @Override // bk.a0
    public final void Y0(o oVar) {
        this.f23052a.f23030a = oVar;
        invalidateSelf();
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        h hVar = this.f23052a;
        this.f23069r.a(hVar.f23030a, hVar.f23039j, rectF, this.f23068q, path);
        if (this.f23052a.f23038i != 1.0f) {
            Matrix matrix = this.f23057f;
            matrix.reset();
            float f13 = this.f23052a.f23038i;
            matrix.setScale(f13, f13, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f23073v, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z13) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z13) {
                colorForState = d(colorForState);
            }
            this.f23072u = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z13) {
            int color = paint.getColor();
            int d2 = d(color);
            this.f23072u = d2;
            if (d2 != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(d2, PorterDuff.Mode.SRC_IN);
                return porterDuffColorFilter;
            }
        }
        porterDuffColorFilter = null;
        return porterDuffColorFilter;
    }

    public final int d(int i13) {
        h hVar = this.f23052a;
        float f13 = hVar.f23043n + hVar.f23044o + hVar.f23042m;
        rj.a aVar = hVar.f23031b;
        return aVar != null ? aVar.b(i13, f13) : i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0155  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.i.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas) {
        if (this.f23055d.cardinality() > 0) {
            Log.w("i", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i13 = this.f23052a.f23047r;
        Path path = this.f23058g;
        ak.a aVar = this.f23067p;
        if (i13 != 0) {
            canvas.drawPath(path, aVar.f15450a);
        }
        for (int i14 = 0; i14 < 4; i14++) {
            y yVar = this.f23053b[i14];
            int i15 = this.f23052a.f23046q;
            Matrix matrix = y.f23138b;
            yVar.a(matrix, aVar, i15, canvas);
            this.f23054c[i14].a(matrix, aVar, this.f23052a.f23046q, canvas);
        }
        if (this.f23074w) {
            h hVar = this.f23052a;
            int sin = (int) (Math.sin(Math.toRadians(hVar.f23048s)) * hVar.f23047r);
            int k13 = k();
            canvas.translate(-sin, -k13);
            canvas.drawPath(path, f23051x);
            canvas.translate(sin, k13);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, o oVar, RectF rectF) {
        if (!oVar.g(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a13 = oVar.f23096f.a(rectF) * this.f23052a.f23039j;
            canvas.drawRoundRect(rectF, a13, a13, paint);
        }
    }

    public void g(Canvas canvas) {
        Paint paint = this.f23066o;
        Path path = this.f23059h;
        o oVar = this.f23064m;
        RectF rectF = this.f23061j;
        rectF.set(j());
        float strokeWidth = n() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        f(canvas, paint, path, oVar, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f23052a.f23041l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f23052a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f23052a.f23045p == 2) {
            return;
        }
        if (p()) {
            outline.setRoundRect(getBounds(), l() * this.f23052a.f23039j);
        } else {
            RectF j13 = j();
            Path path = this.f23058g;
            b(j13, path);
            d7.b.w0(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f23052a.f23037h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f23062k;
        region.set(bounds);
        RectF j13 = j();
        Path path = this.f23058g;
        b(j13, path);
        Region region2 = this.f23063l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        return this.f23052a.f23030a.f23098h.a(j());
    }

    public final float i() {
        return this.f23052a.f23030a.f23097g.a(j());
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f23056e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f23052a.f23035f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f23052a.f23034e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f23052a.f23033d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f23052a.f23032c) != null && colorStateList4.isStateful())));
    }

    public final RectF j() {
        RectF rectF = this.f23060i;
        rectF.set(getBounds());
        return rectF;
    }

    public final int k() {
        h hVar = this.f23052a;
        return (int) (Math.cos(Math.toRadians(hVar.f23048s)) * hVar.f23047r);
    }

    public final float l() {
        return this.f23052a.f23030a.f23095e.a(j());
    }

    public final float m() {
        return this.f23052a.f23030a.f23096f.a(j());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f23052a = new h(this.f23052a);
        return this;
    }

    public final boolean n() {
        Paint.Style style = this.f23052a.f23050u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f23066o.getStrokeWidth() > 0.0f;
    }

    public final void o(Context context) {
        this.f23052a.f23031b = new rj.a(context);
        B();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f23056e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z13 = z(iArr) || A();
        if (z13) {
            invalidateSelf();
        }
        return z13;
    }

    public final boolean p() {
        return this.f23052a.f23030a.g(j());
    }

    public final void q(Canvas canvas) {
        h hVar = this.f23052a;
        canvas.translate((int) (Math.sin(Math.toRadians(hVar.f23048s)) * hVar.f23047r), k());
    }

    public final boolean r() {
        return (p() || this.f23058g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    public final void s(float f13) {
        h hVar = this.f23052a;
        if (hVar.f23043n != f13) {
            hVar.f23043n = f13;
            B();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i13) {
        h hVar = this.f23052a;
        if (hVar.f23041l != i13) {
            hVar.f23041l = i13;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f23052a.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i13) {
        setTintList(ColorStateList.valueOf(i13));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f23052a.f23035f = colorStateList;
        A();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        h hVar = this.f23052a;
        if (hVar.f23036g != mode) {
            hVar.f23036g = mode;
            A();
            super.invalidateSelf();
        }
    }

    public final void t(ColorStateList colorStateList) {
        h hVar = this.f23052a;
        if (hVar.f23032c != colorStateList) {
            hVar.f23032c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void u(float f13) {
        h hVar = this.f23052a;
        if (hVar.f23039j != f13) {
            hVar.f23039j = f13;
            this.f23056e = true;
            invalidateSelf();
        }
    }

    public final void v(Paint.Style style) {
        this.f23052a.f23050u = style;
        super.invalidateSelf();
    }

    public final void w() {
        this.f23067p.a(-12303292);
        this.f23052a.f23049t = false;
        super.invalidateSelf();
    }

    public final void x(int i13) {
        h hVar = this.f23052a;
        if (hVar.f23045p != i13) {
            hVar.f23045p = i13;
            super.invalidateSelf();
        }
    }

    public final void y(ColorStateList colorStateList) {
        h hVar = this.f23052a;
        if (hVar.f23033d != colorStateList) {
            hVar.f23033d = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean z(int[] iArr) {
        boolean z13;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f23052a.f23032c == null || color2 == (colorForState2 = this.f23052a.f23032c.getColorForState(iArr, (color2 = (paint2 = this.f23065n).getColor())))) {
            z13 = false;
        } else {
            paint2.setColor(colorForState2);
            z13 = true;
        }
        if (this.f23052a.f23033d == null || color == (colorForState = this.f23052a.f23033d.getColorForState(iArr, (color = (paint = this.f23066o).getColor())))) {
            return z13;
        }
        paint.setColor(colorForState);
        return true;
    }

    public i(o oVar) {
        this(new h(oVar));
    }

    public i(h hVar) {
        r rVar;
        this.f23053b = new y[4];
        this.f23054c = new y[4];
        this.f23055d = new BitSet(8);
        this.f23057f = new Matrix();
        this.f23058g = new Path();
        this.f23059h = new Path();
        this.f23060i = new RectF();
        this.f23061j = new RectF();
        this.f23062k = new Region();
        this.f23063l = new Region();
        Paint paint = new Paint(1);
        this.f23065n = paint;
        Paint paint2 = new Paint(1);
        this.f23066o = paint2;
        this.f23067p = new ak.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            rVar = p.f23103a;
        } else {
            rVar = new r();
        }
        this.f23069r = rVar;
        this.f23073v = new RectF();
        this.f23074w = true;
        this.f23052a = hVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        A();
        z(getState());
        this.f23068q = new rd.j(this, 15);
    }

    public i(Context context, AttributeSet attributeSet, int i13, int i14) {
        this(o.b(i13, i14, context, attributeSet).a());
    }
}
