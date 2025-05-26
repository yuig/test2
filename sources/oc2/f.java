package oc2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.StyleSpan;
import android.util.Size;
import android.util.TypedValue;
import android.view.View;
import bc2.m;
import hc2.q;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import pk.a0;
import xk2.v;

/* loaded from: classes4.dex */
public final class f extends View {

    /* renamed from: a, reason: collision with root package name */
    public final int f94070a;

    /* renamed from: b, reason: collision with root package name */
    public final m f94071b;

    /* renamed from: c, reason: collision with root package name */
    public String f94072c;

    /* renamed from: d, reason: collision with root package name */
    public int f94073d;

    /* renamed from: e, reason: collision with root package name */
    public long f94074e;

    /* renamed from: f, reason: collision with root package name */
    public long f94075f;

    /* renamed from: g, reason: collision with root package name */
    public Size f94076g;

    /* renamed from: h, reason: collision with root package name */
    public String f94077h;

    /* renamed from: i, reason: collision with root package name */
    public String f94078i;

    /* renamed from: j, reason: collision with root package name */
    public String f94079j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f94080k;

    /* renamed from: l, reason: collision with root package name */
    public q f94081l;

    /* renamed from: m, reason: collision with root package name */
    public long f94082m;

    /* renamed from: n, reason: collision with root package name */
    public final v f94083n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, int i13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f94070a = i13;
        this.f94071b = m.GRID;
        this.f94072c = "";
        this.f94073d = -1;
        this.f94077h = "";
        this.f94078i = "";
        this.f94083n = xk2.m.b(e.f94069i);
    }

    public final float a(int i13) {
        Intrinsics.checkNotNullExpressionValue(getResources(), "getResources(...)");
        return a0.K(i13, r0);
    }

    public final boolean b() {
        return ((double) (((float) getHeight()) / ((float) ((Number) this.f94083n.getValue()).intValue()))) > 0.5d;
    }

    public final void c(long j13) {
        this.f94075f = j13;
        invalidate();
    }

    public final void d(long j13) {
        this.f94074e = j13;
        invalidate();
    }

    public final void e(Size size) {
        this.f94076g = size;
        invalidate();
    }

    public final void f(String str) {
        this.f94079j = str;
        invalidate();
    }

    public final void g(int i13) {
        this.f94073d = i13;
        invalidate();
    }

    public final void h(long j13) {
        this.f94082m = j13;
        invalidate();
    }

    public final void i(q qVar) {
        this.f94081l = qVar;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String U;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (z.j(this.f94072c)) {
            return;
        }
        RectF rectF = new RectF();
        float a13 = a(b() ? 10 : 5);
        float a14 = a(b() ? 80 : 5);
        rectF.left = a13;
        rectF.right = getWidth() - a13;
        rectF.top = a14;
        rectF.bottom = getHeight() - a14;
        float a15 = b() ? a(40) : a(10);
        Paint paint = new Paint();
        paint.setColor(1962934272);
        canvas.drawRoundRect(rectF, a15, a15, paint);
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(this.f94080k ? -16711936 : -65536);
        paint2.setStrokeWidth(getResources().getDisplayMetrics().density);
        canvas.drawRoundRect(rectF, a15, a15, paint2);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(a15 * 0.5f, a15);
        String valueOf = String.valueOf(this.f94070a);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(-1);
        Typeface typeface = Typeface.SERIF;
        textPaint.setTypeface(typeface);
        int i13 = b() ? 26 : 20;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Intrinsics.checkNotNullParameter(resources, "<this>");
        textPaint.setTextSize((int) TypedValue.applyDimension(2, i13, resources.getDisplayMetrics()));
        textPaint.getTextBounds(valueOf, 0, valueOf.length(), new Rect());
        canvas.drawText(valueOf, rectF2.right - r9.width(), b() ? rectF2.top : (r9.height() * 0.5f) + rectF2.bottom, textPaint);
        d[] dVarArr = new d[8];
        String str = this.f94079j;
        if (str == null) {
            str = this.f94078i;
        }
        long j13 = this.f94074e;
        long j14 = j13 / 8;
        Size size = this.f94076g;
        String str2 = null;
        if (str == null) {
            U = null;
        } else if (j13 > 0) {
            if (size != null) {
                String U2 = d7.b.U(str);
                String G = d7.b.G(j13);
                String G2 = d7.b.G(j14);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(U2);
                sb3.append(" ");
                sb3.append(size);
                sb3.append(" @");
                sb3.append(G);
                U = a.a.p(sb3, " - scaled ", G2);
            } else {
                U = a.a.D(d7.b.U(str), " @", d7.b.G(j13));
            }
        } else if (size != null) {
            U = d7.b.U(str) + " " + size;
        } else {
            U = d7.b.U(str);
        }
        dVarArr[0] = new d("", U);
        dVarArr[1] = new d("Pin Id: ", d7.b.H(this.f94072c));
        q qVar = this.f94081l;
        long j15 = this.f94082m;
        if (qVar != null) {
            if (j15 > 0) {
                str2 = a.a.D(d7.b.D0(qVar), " ", j15 > 1000 ? (j15 / 1000) + "s" : j15 + "ms");
            } else {
                str2 = d7.b.D0(qVar);
            }
        }
        dVarArr[2] = new d("Prefetched: ", str2);
        dVarArr[3] = new d("Bandwidth: ", d7.b.G(this.f94075f));
        dVarArr[4] = new d("Surface: ", this.f94071b.toString());
        dVarArr[5] = new d("Player: ", String.valueOf(this.f94073d));
        dVarArr[6] = new d("Playback State: ", this.f94077h);
        String str3 = this.f94079j;
        if (str3 == null) {
            str3 = this.f94078i;
        }
        dVarArr[7] = new d("URL: ", str3);
        List<d> j16 = f0.j(dVarArr);
        TextPaint textPaint2 = new TextPaint();
        textPaint2.setColor(-1);
        int i14 = b() ? 25 : 14;
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        Intrinsics.checkNotNullParameter(resources2, "<this>");
        textPaint2.setTextSize((int) TypedValue.applyDimension(2, i14, resources2.getDisplayMetrics()));
        textPaint2.setTypeface(typeface);
        float f13 = rectF2.top;
        for (d dVar : j16) {
            String str4 = dVar.f94067a;
            String str5 = dVar.f94068b;
            if (str5 != null) {
                SpannableString spannableString = new SpannableString(a.a.C(str4, str5));
                spannableString.setSpan(new StyleSpan(1), 0, str4.length(), 33);
                StaticLayout build = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint2, (int) rectF2.width()).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                float f14 = rectF2.left;
                int save = canvas.save();
                canvas.translate(f14, f13);
                try {
                    build.draw(canvas);
                    canvas.restoreToCount(save);
                    f13 += build.getHeight();
                } catch (Throwable th3) {
                    canvas.restoreToCount(save);
                    throw th3;
                }
            }
        }
    }
}
