package va;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import ao2.m0;
import java.util.ArrayDeque;
import lb.l0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class p extends g {

    /* renamed from: j, reason: collision with root package name */
    public static final PorterDuff.Mode f125093j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public n f125094b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f125095c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f125096d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f125097e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f125098f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f125099g;

    /* renamed from: h, reason: collision with root package name */
    public final Matrix f125100h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f125101i;

    public p() {
        this.f125098f = true;
        this.f125099g = new float[9];
        this.f125100h = new Matrix();
        this.f125101i = new Rect();
        this.f125094b = new n();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f125036a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f125101i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f125096d;
        if (colorFilter == null) {
            colorFilter = this.f125095c;
        }
        Matrix matrix = this.f125100h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f125099g;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        this.f125094b.b(min, min2);
        if (!this.f125098f) {
            this.f125094b.g(min, min2);
        } else if (!this.f125094b.a()) {
            this.f125094b.g(min, min2);
            this.f125094b.f();
        }
        this.f125094b.c(canvas, colorFilter, rect);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.getAlpha() : this.f125094b.f125081b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f125094b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.getColorFilter() : this.f125096d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f125036a != null) {
            return new o(this.f125036a.getConstantState());
        }
        this.f125094b.f125080a = getChangingConfigurations();
        return this.f125094b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f125094b.f125081b.f125073i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f125094b.f125081b.f125072h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i13;
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f125094b;
        nVar.f125081b = new m();
        TypedArray d03 = m0.d0(resources, theme, attributeSet, a.f125017a);
        n nVar2 = this.f125094b;
        m mVar = nVar2.f125081b;
        int D = m0.D(d03, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i14 = 3;
        if (D == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (D != 5) {
            if (D != 9) {
                switch (D) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.f125083d = mode;
        ColorStateList B = m0.B(d03, xmlPullParser, theme);
        if (B != null) {
            nVar2.f125082c = B;
        }
        boolean z13 = nVar2.f125084e;
        if (m0.N(xmlPullParser, "autoMirrored")) {
            z13 = d03.getBoolean(5, z13);
        }
        nVar2.f125084e = z13;
        float f13 = mVar.f125074j;
        if (m0.N(xmlPullParser, "viewportWidth")) {
            f13 = d03.getFloat(7, f13);
        }
        mVar.f125074j = f13;
        float f14 = mVar.f125075k;
        if (m0.N(xmlPullParser, "viewportHeight")) {
            f14 = d03.getFloat(8, f14);
        }
        mVar.f125075k = f14;
        if (mVar.f125074j <= 0.0f) {
            throw new XmlPullParserException(d03.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f14 <= 0.0f) {
            throw new XmlPullParserException(d03.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        mVar.f125072h = d03.getDimension(3, mVar.f125072h);
        int i15 = 2;
        float dimension = d03.getDimension(2, mVar.f125073i);
        mVar.f125073i = dimension;
        if (mVar.f125072h <= 0.0f) {
            throw new XmlPullParserException(d03.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(d03.getPositionDescription() + "<vector> tag requires height > 0");
        }
        float alpha = mVar.getAlpha();
        if (m0.N(xmlPullParser, "alpha")) {
            alpha = d03.getFloat(4, alpha);
        }
        mVar.setAlpha(alpha);
        String string = d03.getString(0);
        if (string != null) {
            mVar.f125077m = string;
            mVar.f125079o.put(string, mVar);
        }
        d03.recycle();
        nVar.f125080a = getChangingConfigurations();
        int i16 = 1;
        nVar.f125090k = true;
        n nVar3 = this.f125094b;
        m mVar2 = nVar3.f125081b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(mVar2.f125071g);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z14 = true;
        while (eventType != i16 && (xmlPullParser.getDepth() >= depth || eventType != i14)) {
            if (eventType == i15) {
                String name = xmlPullParser.getName();
                j jVar = (j) arrayDeque.peek();
                boolean equals = "path".equals(name);
                g1.g gVar = mVar2.f125079o;
                if (equals) {
                    i iVar = new i();
                    iVar.c(resources, xmlPullParser, attributeSet, theme);
                    jVar.f125049b.add(iVar);
                    if (iVar.getPathName() != null) {
                        gVar.put(iVar.getPathName(), iVar);
                    }
                    nVar3.f125080a = iVar.f125063d | nVar3.f125080a;
                    z14 = false;
                } else if ("clip-path".equals(name)) {
                    h hVar = new h();
                    hVar.c(resources, xmlPullParser, attributeSet, theme);
                    jVar.f125049b.add(hVar);
                    if (hVar.getPathName() != null) {
                        gVar.put(hVar.getPathName(), hVar);
                    }
                    nVar3.f125080a = hVar.f125063d | nVar3.f125080a;
                } else if ("group".equals(name)) {
                    j jVar2 = new j();
                    jVar2.c(resources, xmlPullParser, attributeSet, theme);
                    jVar.f125049b.add(jVar2);
                    arrayDeque.push(jVar2);
                    if (jVar2.getGroupName() != null) {
                        gVar.put(jVar2.getGroupName(), jVar2);
                    }
                    nVar3.f125080a = jVar2.f125058k | nVar3.f125080a;
                }
                i13 = 3;
            } else {
                i13 = i14;
                if (eventType == i13 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            i14 = i13;
            i16 = 1;
            i15 = 2;
        }
        if (z14) {
            throw new XmlPullParserException("no path defined");
        }
        this.f125095c = a(nVar.f125082c, nVar.f125083d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.isAutoMirrored() : this.f125094b.f125084e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        n nVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((nVar = this.f125094b) != null && (nVar.d() || ((colorStateList = this.f125094b.f125082c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f125097e && super.mutate() == this) {
            this.f125094b = new n(this.f125094b);
            this.f125097e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z13;
        PorterDuff.Mode mode;
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f125094b;
        ColorStateList colorStateList = nVar.f125082c;
        if (colorStateList == null || (mode = nVar.f125083d) == null) {
            z13 = false;
        } else {
            this.f125095c = a(colorStateList, mode);
            invalidateSelf();
            z13 = true;
        }
        if (!nVar.d() || !nVar.e(iArr)) {
            return z13;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j13) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j13);
        } else {
            super.scheduleSelf(runnable, j13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i13) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.setAlpha(i13);
        } else if (this.f125094b.f125081b.getRootAlpha() != i13) {
            this.f125094b.f125081b.setRootAlpha(i13);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z13) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.setAutoMirrored(z13);
        } else {
            this.f125094b.f125084e = z13;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f125096d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i13) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            l0.m1(drawable, i13);
        } else {
            setTintList(ColorStateList.valueOf(i13));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.f125094b;
        if (nVar.f125082c != colorStateList) {
            nVar.f125082c = colorStateList;
            this.f125095c = a(colorStateList, nVar.f125083d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.f125094b;
        if (nVar.f125083d != mode) {
            nVar.f125083d = mode;
            this.f125095c = a(nVar.f125082c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z13, boolean z14) {
        Drawable drawable = this.f125036a;
        return drawable != null ? drawable.setVisible(z13, z14) : super.setVisible(z13, z14);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public p(n nVar) {
        this.f125098f = true;
        this.f125099g = new float[9];
        this.f125100h = new Matrix();
        this.f125101i = new Rect();
        this.f125094b = nVar;
        this.f125095c = a(nVar.f125082c, nVar.f125083d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f125036a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}
