package com.pinterest.shuffles.scene.composer;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Size;
import android.util.SizeF;
import com.google.android.gms.ads.AdSize;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import r72.l2;

/* loaded from: classes4.dex */
public final class c1 extends c {

    /* renamed from: x, reason: collision with root package name */
    public static final ql2.g f52014x = new ql2.g(32.0f, 2048.0f);

    /* renamed from: o, reason: collision with root package name */
    public float f52015o;

    /* renamed from: p, reason: collision with root package name */
    public float f52016p;

    /* renamed from: q, reason: collision with root package name */
    public l2 f52017q;

    /* renamed from: r, reason: collision with root package name */
    public TextPaint f52018r;

    /* renamed from: s, reason: collision with root package name */
    public int f52019s;

    /* renamed from: t, reason: collision with root package name */
    public float f52020t;

    /* renamed from: u, reason: collision with root package name */
    public final xk2.v f52021u = xk2.m.b(new c72.o(this, 5));

    /* renamed from: v, reason: collision with root package name */
    public StaticLayout f52022v;

    /* renamed from: w, reason: collision with root package name */
    public float f52023w;

    @Override // ke2.i
    public final float a() {
        return this.f52016p;
    }

    @Override // ke2.i
    public final float b() {
        return this.f52015o;
    }

    @Override // ke2.i
    public final void d(float f13) {
        Bitmap bitmap = this.f79338f;
        if (bitmap == null) {
            return;
        }
        int height = bitmap.getHeight();
        float width = (bitmap.getWidth() * f13) / bitmap.getHeight();
        ql2.g gVar = f52014x;
        if (gVar.a(Float.valueOf(f13)) && gVar.a(Float.valueOf(width)) && (f13 > height * 2 || f13 < height / 2)) {
            g(f13 / this.f52020t);
            i(this.f52015o, this.f52016p);
        } else {
            this.f52016p = f13;
            this.f52015o = width;
        }
    }

    @Override // ke2.i
    public final void f(float f13) {
    }

    public final void g(float f13) {
        int i13 = z.f52181a;
        float f14 = (this.f52019s / 375.0f) * f13;
        float floatValue = ((Number) this.f52021u.getValue()).floatValue() * f14;
        float f15 = AdSize.MEDIUM_RECTANGLE_WIDTH * f14;
        StaticLayout h10 = h(f15, floatValue);
        int lineCount = h10.getLineCount();
        float f16 = 1.0f;
        for (int i14 = 0; i14 < lineCount; i14++) {
            CharSequence text = h10.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            String obj = StringsKt.i0(text.subSequence(h10.getLineStart(i14), h10.getLineEnd(i14)).toString()).toString();
            TextPaint textPaint = this.f52018r;
            if (textPaint == null) {
                Intrinsics.r("textPaint");
                throw null;
            }
            f16 = Math.max(f16, textPaint.measureText(obj));
        }
        float min = Math.min(f15, f16);
        if (((int) min) < h10.getWidth()) {
            h10 = h(min, floatValue);
        }
        this.f52022v = h10;
        l2 l2Var = this.f52017q;
        if (l2Var == null) {
            Intrinsics.r("textData");
            throw null;
        }
        float f17 = l2Var.f106542c != null ? floatValue * 0.2f : 0.0f;
        this.f52023w = f17;
        this.f52015o = (2 * f17) + min;
        if (h10 == null) {
            Intrinsics.r("textLayout");
            throw null;
        }
        this.f52016p = h10.getHeight();
    }

    public final StaticLayout h(float f13, float f14) {
        TextPaint textPaint = this.f52018r;
        if (textPaint == null) {
            Intrinsics.r("textPaint");
            throw null;
        }
        textPaint.setTextSize(f14);
        TextPaint textPaint2 = this.f52018r;
        if (textPaint2 == null) {
            Intrinsics.r("textPaint");
            throw null;
        }
        l2 l2Var = this.f52017q;
        if (l2Var == null) {
            Intrinsics.r("textData");
            throw null;
        }
        int[] iArr = b1.f52010a;
        int i13 = iArr[l2Var.f106545f.ordinal()];
        textPaint2.setTextAlign(i13 != 1 ? i13 != 2 ? Paint.Align.CENTER : Paint.Align.RIGHT : Paint.Align.LEFT);
        l2 l2Var2 = this.f52017q;
        if (l2Var2 == null) {
            Intrinsics.r("textData");
            throw null;
        }
        String str = l2Var2.f106540a;
        int length = str.length();
        TextPaint textPaint3 = this.f52018r;
        if (textPaint3 == null) {
            Intrinsics.r("textPaint");
            throw null;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(str, 0, length, textPaint3, (int) f13);
        l2 l2Var3 = this.f52017q;
        if (l2Var3 == null) {
            Intrinsics.r("textData");
            throw null;
        }
        int i14 = iArr[l2Var3.f106545f.ordinal()];
        StaticLayout build = obtain.setAlignment(i14 != 1 ? i14 != 2 ? Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL).setIncludePad(false).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public final void i(float f13, float f14) {
        Integer num;
        RectF rectF;
        String str;
        RectF rectF2;
        String str2;
        int i13;
        int i14;
        float f15;
        float f16;
        RectF rectF3;
        c1 c1Var = this;
        Size n13 = ig1.b.n1(new SizeF(f13, f14));
        if (ig1.b.N(n13) == 0) {
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(n13.getWidth(), n13.getHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(f13 / c1Var.f52015o, f14 / c1Var.f52016p);
        l2 l2Var = c1Var.f52017q;
        String str3 = "textData";
        if (l2Var == null) {
            Intrinsics.r("textData");
            throw null;
        }
        String str4 = l2Var.f106542c;
        Integer valueOf = str4 != null ? Integer.valueOf(Color.parseColor(str4)) : null;
        Paint paint = new Paint();
        paint.setColor(valueOf != null ? valueOf.intValue() : 0);
        paint.setStyle(Paint.Style.FILL);
        Path path = new Path();
        RectF rectF4 = new RectF();
        float f17 = c1Var.f52023w;
        StaticLayout staticLayout = c1Var.f52022v;
        if (staticLayout == null) {
            Intrinsics.r("textLayout");
            throw null;
        }
        int lineCount = staticLayout.getLineCount();
        RectF rectF5 = rectF4;
        int i15 = 0;
        while (i15 < lineCount) {
            StaticLayout staticLayout2 = c1Var.f52022v;
            if (staticLayout2 == null) {
                Intrinsics.r("textLayout");
                throw null;
            }
            CharSequence text = staticLayout2.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            StaticLayout staticLayout3 = c1Var.f52022v;
            if (staticLayout3 == null) {
                Intrinsics.r("textLayout");
                throw null;
            }
            int lineStart = staticLayout3.getLineStart(i15);
            StaticLayout staticLayout4 = c1Var.f52022v;
            if (staticLayout4 == null) {
                Intrinsics.r("textLayout");
                throw null;
            }
            String obj = StringsKt.i0(text.subSequence(lineStart, staticLayout4.getLineEnd(i15)).toString()).toString();
            Rect rect = new Rect();
            StaticLayout staticLayout5 = c1Var.f52022v;
            if (staticLayout5 == null) {
                Intrinsics.r("textLayout");
                throw null;
            }
            staticLayout5.getLineBounds(i15, rect);
            RectF rectF6 = new RectF(rect);
            Rect rect2 = new Rect();
            TextPaint textPaint = c1Var.f52018r;
            if (textPaint == null) {
                Intrinsics.r("textPaint");
                throw null;
            }
            textPaint.setTextAlign(Paint.Align.LEFT);
            TextPaint textPaint2 = c1Var.f52018r;
            if (textPaint2 == null) {
                Intrinsics.r("textPaint");
                throw null;
            }
            Bitmap bitmap = createBitmap;
            textPaint2.getTextBounds(obj, 0, obj.length(), rect2);
            RectF rectF7 = new RectF(rect2);
            if (valueOf == null || obj.length() <= 0) {
                num = valueOf;
                rectF = rectF7;
                str = str3;
                rectF2 = rectF6;
                str2 = obj;
                i13 = i15;
                i14 = lineCount;
                f15 = f17;
                f16 = 0.0f;
                rectF5 = new RectF();
            } else {
                float f18 = rectF6.left;
                l2 l2Var2 = c1Var.f52017q;
                if (l2Var2 == null) {
                    Intrinsics.r(str3);
                    throw null;
                }
                int i16 = b1.f52010a[l2Var2.f106545f.ordinal()];
                float width = f18 + (i16 != 1 ? i16 != 2 ? ((rectF6.width() - rectF7.width()) + rectF7.left) / 2.0f : (rectF6.width() - rectF7.width()) + rectF7.left : rectF6.left);
                float f19 = rectF6.top;
                num = valueOf;
                float width2 = rectF7.width() - rectF7.left;
                rectF = rectF7;
                float f23 = 2;
                RectF rectF8 = new RectF(width, f19, (c1Var.f52023w * f23) + width2 + width, rectF6.height() + f19);
                canvas.drawRoundRect(rectF8, f17, f17, paint);
                if (rectF5.isEmpty()) {
                    str = str3;
                    rectF2 = rectF6;
                    str2 = obj;
                    i13 = i15;
                    i14 = lineCount;
                    f15 = f17;
                    f16 = 0.0f;
                } else {
                    path.reset();
                    float f24 = rectF5.left;
                    float f25 = f24 - rectF8.left;
                    if (f25 == 0.0f) {
                        path.moveTo(f24, rectF5.bottom - f17);
                        path.rLineTo(0.0f, f23 * f17);
                        path.rLineTo(f17, -f17);
                        str = str3;
                        rectF2 = rectF6;
                        str2 = obj;
                        i13 = i15;
                        rectF3 = rectF5;
                        i14 = lineCount;
                        f15 = f17;
                        f16 = 0.0f;
                    } else {
                        boolean z13 = f25 < 0.0f;
                        float abs = Math.abs(f25);
                        float f26 = abs >= f17 * f23 ? f17 : abs / f23;
                        float f27 = f23 * f26;
                        path.moveTo(rectF5.left, rectF5.bottom - f17);
                        float f28 = f17 - f26;
                        path.rLineTo(0.0f, f28);
                        float f29 = rectF5.left;
                        if (!z13) {
                            f29 -= f27;
                        }
                        float f33 = rectF5.left;
                        if (z13) {
                            f33 += f27;
                        }
                        float f34 = f33;
                        float f35 = z13 ? 180.0f : 0.0f;
                        float f36 = z13 ? -90.0f : 90.0f;
                        float f37 = rectF5.bottom;
                        str = str3;
                        f16 = 0.0f;
                        rectF2 = rectF6;
                        str2 = obj;
                        i13 = i15;
                        rectF3 = rectF5;
                        i14 = lineCount;
                        float f38 = f17;
                        path.arcTo(f29, f37 - f27, f34, f37, f35, f36, false);
                        path.rLineTo((abs - f27) * (z13 ? 1 : -1), 0.0f);
                        float f39 = z13 ? 90.0f : -90.0f;
                        float f41 = rectF8.left;
                        if (z13) {
                            f41 -= f27;
                        }
                        float f43 = f41;
                        float f44 = rectF8.left;
                        if (!z13) {
                            f44 += f27;
                        }
                        float f45 = f44;
                        float f46 = rectF8.top;
                        path.arcTo(f43, f46, f45, f46 + f27, 270.0f, f39, false);
                        path.rLineTo(0.0f, f28);
                        f15 = f38;
                        path.rLineTo(f15, -f15);
                        if (z13) {
                            abs = -abs;
                        }
                        path.rLineTo(abs, 0.0f);
                    }
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    RectF rectF9 = rectF3;
                    float f47 = rectF9.right;
                    float f48 = f47 - rectF8.right;
                    if (f48 == f16) {
                        path.moveTo(f47, rectF9.bottom - f15);
                        path.rLineTo(f16, f23 * f15);
                        float f49 = -f15;
                        path.rLineTo(f49, f49);
                    } else {
                        boolean z14 = f48 < f16;
                        float abs2 = Math.abs(f48);
                        float f53 = abs2 >= f15 * f23 ? f15 : abs2 / f23;
                        float f54 = f23 * f53;
                        path.moveTo(rectF9.right, rectF9.bottom - f15);
                        float f55 = f15 - f53;
                        path.rLineTo(f16, f55);
                        float f56 = rectF9.right;
                        if (!z14) {
                            f56 -= f54;
                        }
                        float f57 = rectF9.right;
                        if (z14) {
                            f57 += f54;
                        }
                        float f58 = f57;
                        float f59 = z14 ? 180.0f : f16;
                        float f63 = z14 ? -90.0f : 90.0f;
                        float f64 = rectF9.bottom;
                        path.arcTo(f56, f64 - f54, f58, f64, f59, f63, false);
                        path.rLineTo((abs2 - f54) * (z14 ? 1 : -1), f16);
                        float f65 = z14 ? 90.0f : -90.0f;
                        float f66 = rectF8.right;
                        if (z14) {
                            f66 -= f54;
                        }
                        float f67 = f66;
                        float f68 = rectF8.right;
                        if (!z14) {
                            f68 += f54;
                        }
                        float f69 = f68;
                        float f73 = rectF8.top;
                        path.arcTo(f67, f73, f69, f73 + f54, 270.0f, f65, false);
                        path.rLineTo(f16, f55);
                        float f74 = -f15;
                        path.rLineTo(f74, f74);
                        if (z14) {
                            abs2 = -abs2;
                        }
                        path.rLineTo(abs2, f16);
                    }
                    path.close();
                    canvas.drawPath(path, paint);
                }
                rectF5 = rectF8;
            }
            RectF rectF10 = rectF2;
            RectF rectF11 = rectF;
            float f75 = (rectF10.left - rectF11.left) + this.f52023w;
            float f76 = rectF10.top;
            int save = canvas.save();
            canvas.translate(f75, f76);
            try {
                l2 l2Var3 = this.f52017q;
                if (l2Var3 == null) {
                    Intrinsics.r(str);
                    throw null;
                }
                int i17 = b1.f52010a[l2Var3.f106545f.ordinal()];
                float width3 = i17 != 1 ? i17 != 2 ? (rectF10.width() - rectF11.width()) / 2.0f : rectF10.width() - rectF11.width() : f16;
                float height = ((rectF10.height() + rectF11.height()) / 2.0f) - rectF11.bottom;
                TextPaint textPaint3 = this.f52018r;
                if (textPaint3 == null) {
                    Intrinsics.r("textPaint");
                    throw null;
                }
                canvas.drawText(str2, width3, height, textPaint3);
                canvas.restoreToCount(save);
                i15 = i13 + 1;
                c1Var = this;
                f17 = f15;
                createBitmap = bitmap;
                valueOf = num;
                lineCount = i14;
                str3 = str;
            } catch (Throwable th3) {
                canvas.restoreToCount(save);
                throw th3;
            }
        }
        c1Var.c(createBitmap);
    }

    public final void j(int i13, l2 textData, float f13, Typeface font, Function0 onProcessingComplete) {
        Intrinsics.checkNotNullParameter(textData, "textData");
        Intrinsics.checkNotNullParameter(font, "font");
        Intrinsics.checkNotNullParameter(onProcessingComplete, "onProcessingComplete");
        this.f52017q = textData;
        this.f52019s = i13;
        this.f52012n = false;
        this.f52011m = true;
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(Color.parseColor(textData.f106541b));
        textPaint.setTextSize(textData.f106543d);
        textPaint.setTypeface(font);
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        textPaint.setDither(true);
        textPaint.setStyle(Paint.Style.FILL);
        int i14 = b1.f52010a[textData.f106545f.ordinal()];
        textPaint.setTextAlign(i14 != 1 ? i14 != 2 ? Paint.Align.CENTER : Paint.Align.RIGHT : Paint.Align.LEFT);
        int parseColor = Color.parseColor(textData.f106541b);
        if (textData.f106546g) {
            int i15 = (parseColor >> 16) & 255;
            int i16 = (parseColor >> 8) & 255;
            int i17 = parseColor & 255;
            if (Math.sqrt((i17 * i17) + (i16 * i16) + (i15 * i15)) < 50.0d) {
                textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                textPaint.setStrokeWidth(2.0f);
                textPaint.setShadowLayer(3.0f, 0.0f, 0.0f, -1);
            }
        }
        this.f52018r = textPaint;
        g(1.0f);
        float f14 = this.f52015o;
        this.f52020t = this.f52016p;
        float max = Math.max(f14 / 2048.0f, this.f52016p / 2048.0f);
        if (max > 1.0f) {
            i(this.f52015o / max, this.f52016p / max);
        } else {
            i(this.f52015o, this.f52016p);
        }
        d(this.f52016p * f13);
        this.f52012n = true;
        onProcessingComplete.invoke();
    }
}
