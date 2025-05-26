package nj;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import bk.h;
import bk.i;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.z;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import lb.l0;

/* loaded from: classes3.dex */
public final class f extends i implements Drawable.Callback, z {
    public static final int[] E0 = {R.attr.state_enabled};
    public static final ShapeDrawable F0 = new ShapeDrawable(new OvalShape());
    public float A;
    public TextUtils.TruncateAt A0;
    public float B;
    public boolean B0;
    public ColorStateList C;
    public int C0;
    public float D;
    public boolean D0;
    public ColorStateList E;
    public CharSequence F;
    public boolean G;
    public Drawable H;
    public ColorStateList I;

    /* renamed from: J, reason: collision with root package name */
    public float f90939J;
    public boolean K;
    public boolean L;
    public Drawable M;
    public RippleDrawable N;
    public ColorStateList O;
    public float P;
    public boolean Q;
    public boolean R;
    public Drawable S;
    public ColorStateList T;
    public float U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public float Z;

    /* renamed from: a0, reason: collision with root package name */
    public float f90940a0;

    /* renamed from: b0, reason: collision with root package name */
    public float f90941b0;

    /* renamed from: c0, reason: collision with root package name */
    public final Context f90942c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Paint f90943d0;

    /* renamed from: e0, reason: collision with root package name */
    public final Paint.FontMetrics f90944e0;

    /* renamed from: f0, reason: collision with root package name */
    public final RectF f90945f0;

    /* renamed from: g0, reason: collision with root package name */
    public final PointF f90946g0;

    /* renamed from: h0, reason: collision with root package name */
    public final Path f90947h0;

    /* renamed from: i0, reason: collision with root package name */
    public final a0 f90948i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f90949j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f90950k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f90951l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f90952m0;

    /* renamed from: n0, reason: collision with root package name */
    public int f90953n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f90954o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f90955p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f90956q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f90957r0;

    /* renamed from: s0, reason: collision with root package name */
    public ColorFilter f90958s0;

    /* renamed from: t0, reason: collision with root package name */
    public PorterDuffColorFilter f90959t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorStateList f90960u0;

    /* renamed from: v0, reason: collision with root package name */
    public PorterDuff.Mode f90961v0;

    /* renamed from: w0, reason: collision with root package name */
    public int[] f90962w0;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f90963x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f90964y;

    /* renamed from: y0, reason: collision with root package name */
    public ColorStateList f90965y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f90966z;

    /* renamed from: z0, reason: collision with root package name */
    public WeakReference f90967z0;

    public f(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, Chip.f32439u);
        this.B = -1.0f;
        this.f90943d0 = new Paint(1);
        this.f90944e0 = new Paint.FontMetrics();
        this.f90945f0 = new RectF();
        this.f90946g0 = new PointF();
        this.f90947h0 = new Path();
        this.f90957r0 = 255;
        this.f90961v0 = PorterDuff.Mode.SRC_IN;
        this.f90967z0 = new WeakReference(null);
        o(context);
        this.f90942c0 = context;
        a0 a0Var = new a0(this);
        this.f90948i0 = a0Var;
        this.F = "";
        a0Var.f32699a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = E0;
        setState(iArr);
        if (!Arrays.equals(this.f90962w0, iArr)) {
            this.f90962w0 = iArr;
            if (Q()) {
                K(getState(), iArr);
            }
        }
        this.B0 = true;
        int[] iArr2 = zj.a.f142043a;
        F0.setTint(-1);
    }

    public static boolean H(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean I(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void R(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void C(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.M) {
            if (drawable.isStateful()) {
                drawable.setState(this.f90962w0);
            }
            drawable.setTintList(this.O);
            return;
        }
        Drawable drawable2 = this.H;
        if (drawable == drawable2 && this.K) {
            drawable2.setTintList(this.I);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void D(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (P() || O()) {
            float f13 = this.U + this.V;
            Drawable drawable = this.f90955p0 ? this.S : this.H;
            float f14 = this.f90939J;
            if (f14 <= 0.0f && drawable != null) {
                f14 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f15 = rect.left + f13;
                rectF.left = f15;
                rectF.right = f15 + f14;
            } else {
                float f16 = rect.right - f13;
                rectF.right = f16;
                rectF.left = f16 - f14;
            }
            Drawable drawable2 = this.f90955p0 ? this.S : this.H;
            float f17 = this.f90939J;
            if (f17 <= 0.0f && drawable2 != null) {
                f17 = (float) Math.ceil(l0.X(this.f90942c0, 24));
                if (drawable2.getIntrinsicHeight() <= f17) {
                    f17 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f17 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f17;
        }
    }

    public final float E() {
        if (!P() && !O()) {
            return 0.0f;
        }
        float f13 = this.V;
        Drawable drawable = this.f90955p0 ? this.S : this.H;
        float f14 = this.f90939J;
        if (f14 <= 0.0f && drawable != null) {
            f14 = drawable.getIntrinsicWidth();
        }
        return f14 + f13 + this.W;
    }

    public final float F() {
        if (Q()) {
            return this.Z + this.P + this.f90940a0;
        }
        return 0.0f;
    }

    public final float G() {
        return this.D0 ? l() : this.B;
    }

    public final void J() {
        e eVar = (e) this.f90967z0.get();
        if (eVar != null) {
            Chip chip = (Chip) eVar;
            chip.a(chip.f32454p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean K(int[] iArr, int[] iArr2) {
        boolean z13;
        boolean z14;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f90964y;
        int d2 = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f90949j0) : 0);
        boolean z15 = true;
        if (this.f90949j0 != d2) {
            this.f90949j0 = d2;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f90966z;
        int d13 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f90950k0) : 0);
        if (this.f90950k0 != d13) {
            this.f90950k0 = d13;
            onStateChange = true;
        }
        int g13 = f5.c.g(d13, d2);
        if ((this.f90951l0 != g13) | (this.f23052a.f23032c == null)) {
            this.f90951l0 = g13;
            t(ColorStateList.valueOf(g13));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.C;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f90952m0) : 0;
        if (this.f90952m0 != colorForState) {
            this.f90952m0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.f90965y0 == null || !zj.a.d(iArr)) ? 0 : this.f90965y0.getColorForState(iArr, this.f90953n0);
        if (this.f90953n0 != colorForState2) {
            this.f90953n0 = colorForState2;
            if (this.f90963x0) {
                onStateChange = true;
            }
        }
        yj.e eVar = this.f90948i0.f32705g;
        int colorForState3 = (eVar == null || (colorStateList = eVar.f139200j) == null) ? 0 : colorStateList.getColorForState(iArr, this.f90954o0);
        if (this.f90954o0 != colorForState3) {
            this.f90954o0 = colorForState3;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            int length = state.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                if (state[i13] != 16842912) {
                    i13++;
                } else if (this.Q) {
                    z13 = true;
                }
            }
        }
        z13 = false;
        if (this.f90955p0 == z13 || this.S == null) {
            z14 = false;
        } else {
            float E = E();
            this.f90955p0 = z13;
            if (E != E()) {
                onStateChange = true;
                z14 = true;
            } else {
                z14 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f90960u0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f90956q0) : 0;
        if (this.f90956q0 != colorForState4) {
            this.f90956q0 = colorForState4;
            ColorStateList colorStateList6 = this.f90960u0;
            PorterDuff.Mode mode = this.f90961v0;
            this.f90959t0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            z15 = onStateChange;
        }
        if (I(this.H)) {
            z15 |= this.H.setState(iArr);
        }
        if (I(this.S)) {
            z15 |= this.S.setState(iArr);
        }
        if (I(this.M)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z15 |= this.M.setState(iArr3);
        }
        int[] iArr4 = zj.a.f142043a;
        if (I(this.N)) {
            z15 |= this.N.setState(iArr2);
        }
        if (z15) {
            invalidateSelf();
        }
        if (z14) {
            J();
        }
        return z15;
    }

    public final void L(boolean z13) {
        if (this.R != z13) {
            boolean O = O();
            this.R = z13;
            boolean O2 = O();
            if (O != O2) {
                if (O2) {
                    C(this.S);
                } else {
                    R(this.S);
                }
                invalidateSelf();
                J();
            }
        }
    }

    public final void M(boolean z13) {
        if (this.G != z13) {
            boolean P = P();
            this.G = z13;
            boolean P2 = P();
            if (P != P2) {
                if (P2) {
                    C(this.H);
                } else {
                    R(this.H);
                }
                invalidateSelf();
                J();
            }
        }
    }

    public final void N(boolean z13) {
        if (this.L != z13) {
            boolean Q = Q();
            this.L = z13;
            boolean Q2 = Q();
            if (Q != Q2) {
                if (Q2) {
                    C(this.M);
                } else {
                    R(this.M);
                }
                invalidateSelf();
                J();
            }
        }
    }

    public final boolean O() {
        return this.R && this.S != null && this.f90955p0;
    }

    public final boolean P() {
        return this.G && this.H != null;
    }

    public final boolean Q() {
        return this.L && this.M != null;
    }

    @Override // bk.i, com.google.android.material.internal.z
    public final void a() {
        J();
        invalidateSelf();
    }

    @Override // bk.i, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i13;
        RectF rectF;
        int i14;
        int i15;
        int i16;
        RectF rectF2;
        int i17;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i13 = this.f90957r0) == 0) {
            return;
        }
        int saveLayerAlpha = i13 < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i13) : 0;
        boolean z13 = this.D0;
        Paint paint = this.f90943d0;
        RectF rectF3 = this.f90945f0;
        if (!z13) {
            paint.setColor(this.f90949j0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, G(), G(), paint);
        }
        if (!this.D0) {
            paint.setColor(this.f90950k0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f90958s0;
            if (colorFilter == null) {
                colorFilter = this.f90959t0;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, G(), G(), paint);
        }
        if (this.D0) {
            super.draw(canvas);
        }
        if (this.D > 0.0f && !this.D0) {
            paint.setColor(this.f90952m0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.D0) {
                ColorFilter colorFilter2 = this.f90958s0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f90959t0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f13 = bounds.left;
            float f14 = this.D / 2.0f;
            rectF3.set(f13 + f14, bounds.top + f14, bounds.right - f14, bounds.bottom - f14);
            float f15 = this.B - (this.D / 2.0f);
            canvas.drawRoundRect(rectF3, f15, f15, paint);
        }
        paint.setColor(this.f90953n0);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.D0) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.f90947h0;
            h hVar = this.f23052a;
            this.f23069r.a(hVar.f23030a, hVar.f23039j, rectF4, this.f23068q, path);
            f(canvas, paint, path, this.f23052a.f23030a, j());
        } else {
            canvas.drawRoundRect(rectF3, G(), G(), paint);
        }
        if (P()) {
            D(bounds, rectF3);
            float f16 = rectF3.left;
            float f17 = rectF3.top;
            canvas.translate(f16, f17);
            this.H.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.H.draw(canvas);
            canvas.translate(-f16, -f17);
        }
        if (O()) {
            D(bounds, rectF3);
            float f18 = rectF3.left;
            float f19 = rectF3.top;
            canvas.translate(f18, f19);
            this.S.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.S.draw(canvas);
            canvas.translate(-f18, -f19);
        }
        if (!this.B0 || this.F == null) {
            rectF = rectF3;
            i14 = saveLayerAlpha;
            i15 = 0;
            i16 = 255;
        } else {
            PointF pointF = this.f90946g0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.F;
            a0 a0Var = this.f90948i0;
            if (charSequence != null) {
                float E = E() + this.U + this.X;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + E;
                } else {
                    pointF.x = bounds.right - E;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = a0Var.f32699a;
                Paint.FontMetrics fontMetrics = this.f90944e0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.F != null) {
                float E2 = E() + this.U + this.X;
                float F = F() + this.f90941b0 + this.Y;
                if (getLayoutDirection() == 0) {
                    rectF3.left = bounds.left + E2;
                    rectF3.right = bounds.right - F;
                } else {
                    rectF3.left = bounds.left + F;
                    rectF3.right = bounds.right - E2;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            yj.e eVar = a0Var.f32705g;
            TextPaint textPaint2 = a0Var.f32699a;
            if (eVar != null) {
                textPaint2.drawableState = getState();
                a0Var.f32705g.e(this.f90942c0, textPaint2, a0Var.f32700b);
            }
            textPaint2.setTextAlign(align);
            boolean z14 = Math.round(a0Var.a(this.F.toString())) > Math.round(rectF3.width());
            if (z14) {
                i17 = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                i17 = 0;
            }
            CharSequence charSequence2 = this.F;
            if (z14 && this.A0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF3.width(), this.A0);
            }
            CharSequence charSequence3 = charSequence2;
            int length = charSequence3.length();
            float f23 = pointF.x;
            float f24 = pointF.y;
            rectF = rectF3;
            i14 = saveLayerAlpha;
            i15 = 0;
            i16 = 255;
            canvas.drawText(charSequence3, 0, length, f23, f24, textPaint2);
            if (z14) {
                canvas.restoreToCount(i17);
            }
        }
        if (Q()) {
            rectF.setEmpty();
            if (Q()) {
                float f25 = this.f90941b0 + this.f90940a0;
                if (getLayoutDirection() == 0) {
                    float f26 = bounds.right - f25;
                    rectF2 = rectF;
                    rectF2.right = f26;
                    rectF2.left = f26 - this.P;
                } else {
                    rectF2 = rectF;
                    float f27 = bounds.left + f25;
                    rectF2.left = f27;
                    rectF2.right = f27 + this.P;
                }
                float exactCenterY = bounds.exactCenterY();
                float f28 = this.P;
                float f29 = exactCenterY - (f28 / 2.0f);
                rectF2.top = f29;
                rectF2.bottom = f29 + f28;
            } else {
                rectF2 = rectF;
            }
            float f33 = rectF2.left;
            float f34 = rectF2.top;
            canvas.translate(f33, f34);
            this.M.setBounds(i15, i15, (int) rectF2.width(), (int) rectF2.height());
            int[] iArr = zj.a.f142043a;
            this.N.setBounds(this.M.getBounds());
            this.N.jumpToCurrentState();
            this.N.draw(canvas);
            canvas.translate(-f33, -f34);
        }
        if (this.f90957r0 < i16) {
            canvas.restoreToCount(i14);
        }
    }

    @Override // bk.i, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f90957r0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f90958s0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.A;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(F() + this.f90948i0.a(this.F.toString()) + E() + this.U + this.X + this.Y + this.f90941b0), this.C0);
    }

    @Override // bk.i, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // bk.i, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.D0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.A, this.B);
        } else {
            outline.setRoundRect(bounds, this.B);
        }
        outline.setAlpha(this.f90957r0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // bk.i, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        yj.e eVar;
        ColorStateList colorStateList;
        return H(this.f90964y) || H(this.f90966z) || H(this.C) || (this.f90963x0 && H(this.f90965y0)) || (!((eVar = this.f90948i0.f32705g) == null || (colorStateList = eVar.f139200j) == null || !colorStateList.isStateful()) || ((this.R && this.S != null && this.Q) || I(this.H) || I(this.S) || H(this.f90960u0)));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i13) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i13);
        if (P()) {
            onLayoutDirectionChanged |= this.H.setLayoutDirection(i13);
        }
        if (O()) {
            onLayoutDirectionChanged |= this.S.setLayoutDirection(i13);
        }
        if (Q()) {
            onLayoutDirectionChanged |= this.M.setLayoutDirection(i13);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i13) {
        boolean onLevelChange = super.onLevelChange(i13);
        if (P()) {
            onLevelChange |= this.H.setLevel(i13);
        }
        if (O()) {
            onLevelChange |= this.S.setLevel(i13);
        }
        if (Q()) {
            onLevelChange |= this.M.setLevel(i13);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // bk.i, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.D0) {
            super.onStateChange(iArr);
        }
        return K(iArr, this.f90962w0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j13) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j13);
        }
    }

    @Override // bk.i, android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        if (this.f90957r0 != i13) {
            this.f90957r0 = i13;
            invalidateSelf();
        }
    }

    @Override // bk.i, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f90958s0 != colorFilter) {
            this.f90958s0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // bk.i, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f90960u0 != colorStateList) {
            this.f90960u0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // bk.i, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f90961v0 != mode) {
            this.f90961v0 = mode;
            ColorStateList colorStateList = this.f90960u0;
            this.f90959t0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z13, boolean z14) {
        boolean visible = super.setVisible(z13, z14);
        if (P()) {
            visible |= this.H.setVisible(z13, z14);
        }
        if (O()) {
            visible |= this.S.setVisible(z13, z14);
        }
        if (Q()) {
            visible |= this.M.setVisible(z13, z14);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
