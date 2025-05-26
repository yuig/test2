package yj;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import ao2.m0;
import e5.n;
import fj.m;
import me.o;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f139191a;

    /* renamed from: b, reason: collision with root package name */
    public final String f139192b;

    /* renamed from: c, reason: collision with root package name */
    public final int f139193c;

    /* renamed from: d, reason: collision with root package name */
    public final int f139194d;

    /* renamed from: e, reason: collision with root package name */
    public final float f139195e;

    /* renamed from: f, reason: collision with root package name */
    public final float f139196f;

    /* renamed from: g, reason: collision with root package name */
    public final float f139197g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f139198h;

    /* renamed from: i, reason: collision with root package name */
    public final float f139199i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f139200j;

    /* renamed from: k, reason: collision with root package name */
    public float f139201k;

    /* renamed from: l, reason: collision with root package name */
    public final int f139202l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f139203m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f139204n;

    public e(Context context, int i13) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i13, m.TextAppearance);
        this.f139201k = obtainStyledAttributes.getDimension(m.TextAppearance_android_textSize, 0.0f);
        this.f139200j = com.bumptech.glide.d.H(context, obtainStyledAttributes, m.TextAppearance_android_textColor);
        com.bumptech.glide.d.H(context, obtainStyledAttributes, m.TextAppearance_android_textColorHint);
        com.bumptech.glide.d.H(context, obtainStyledAttributes, m.TextAppearance_android_textColorLink);
        this.f139193c = obtainStyledAttributes.getInt(m.TextAppearance_android_textStyle, 0);
        this.f139194d = obtainStyledAttributes.getInt(m.TextAppearance_android_typeface, 1);
        int i14 = m.TextAppearance_fontFamily;
        i14 = obtainStyledAttributes.hasValue(i14) ? i14 : m.TextAppearance_android_fontFamily;
        this.f139202l = obtainStyledAttributes.getResourceId(i14, 0);
        this.f139192b = obtainStyledAttributes.getString(i14);
        obtainStyledAttributes.getBoolean(m.TextAppearance_textAllCaps, false);
        this.f139191a = com.bumptech.glide.d.H(context, obtainStyledAttributes, m.TextAppearance_android_shadowColor);
        this.f139195e = obtainStyledAttributes.getFloat(m.TextAppearance_android_shadowDx, 0.0f);
        this.f139196f = obtainStyledAttributes.getFloat(m.TextAppearance_android_shadowDy, 0.0f);
        this.f139197g = obtainStyledAttributes.getFloat(m.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i13, m.MaterialTextAppearance);
        this.f139198h = obtainStyledAttributes2.hasValue(m.MaterialTextAppearance_android_letterSpacing);
        this.f139199i = obtainStyledAttributes2.getFloat(m.MaterialTextAppearance_android_letterSpacing, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f139204n;
        int i13 = this.f139193c;
        if (typeface == null && (str = this.f139192b) != null) {
            this.f139204n = Typeface.create(str, i13);
        }
        if (this.f139204n == null) {
            int i14 = this.f139194d;
            if (i14 == 1) {
                this.f139204n = Typeface.SANS_SERIF;
            } else if (i14 == 2) {
                this.f139204n = Typeface.SERIF;
            } else if (i14 != 3) {
                this.f139204n = Typeface.DEFAULT;
            } else {
                this.f139204n = Typeface.MONOSPACE;
            }
            this.f139204n = Typeface.create(this.f139204n, i13);
        }
    }

    public final Typeface b(Context context) {
        if (this.f139203m) {
            return this.f139204n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a13 = n.a(context, this.f139202l);
                this.f139204n = a13;
                if (a13 != null) {
                    this.f139204n = Typeface.create(a13, this.f139193c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e13) {
                Log.d("TextAppearance", "Error loading font " + this.f139192b, e13);
            }
        }
        a();
        this.f139203m = true;
        return this.f139204n;
    }

    public final void c(Context context, o oVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i13 = this.f139202l;
        if (i13 == 0) {
            this.f139203m = true;
        }
        if (this.f139203m) {
            oVar.e(this.f139204n, true);
            return;
        }
        try {
            c cVar = new c(this, oVar);
            ThreadLocal threadLocal = n.f57243a;
            if (context.isRestricted()) {
                cVar.d(-4);
            } else {
                n.b(context, i13, new TypedValue(), 0, cVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f139203m = true;
            oVar.d(1);
        } catch (Exception e13) {
            Log.d("TextAppearance", "Error loading font " + this.f139192b, e13);
            this.f139203m = true;
            oVar.d(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typeface = null;
        int i13 = this.f139202l;
        if (i13 != 0) {
            ThreadLocal threadLocal = n.f57243a;
            if (!context.isRestricted()) {
                typeface = n.b(context, i13, new TypedValue(), 0, null, false, true);
            }
        }
        return typeface != null;
    }

    public final void e(Context context, TextPaint textPaint, o oVar) {
        f(context, textPaint, oVar);
        ColorStateList colorStateList = this.f139200j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f139191a;
        textPaint.setShadowLayer(this.f139197g, this.f139195e, this.f139196f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, o oVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f139204n);
        c(context, new d(this, context, textPaint, oVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface Y = m0.Y(context.getResources().getConfiguration(), typeface);
        if (Y != null) {
            typeface = Y;
        }
        textPaint.setTypeface(typeface);
        int i13 = (~typeface.getStyle()) & this.f139193c;
        textPaint.setFakeBoldText((i13 & 1) != 0);
        textPaint.setTextSkewX((i13 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f139201k);
        if (this.f139198h) {
            textPaint.setLetterSpacing(this.f139199i);
        }
    }
}
