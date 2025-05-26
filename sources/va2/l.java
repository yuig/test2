package va2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextUtils;
import androidx.core.text.PrecomputedTextCompat;
import df.j1;
import hk1.t;
import i1.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.e0;
import kotlin.collections.g0;
import kotlin.collections.u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ql2.s;

/* loaded from: classes2.dex */
public final class l extends wa2.l {

    /* renamed from: x, reason: collision with root package name */
    public static final boolean f125399x;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f125400l;

    /* renamed from: m, reason: collision with root package name */
    public final tn1.c f125401m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f125402n;

    /* renamed from: o, reason: collision with root package name */
    public String f125403o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReference f125404p;

    /* renamed from: q, reason: collision with root package name */
    public xj2.c f125405q;

    /* renamed from: r, reason: collision with root package name */
    public int f125406r;

    /* renamed from: s, reason: collision with root package name */
    public int f125407s;

    /* renamed from: t, reason: collision with root package name */
    public p f125408t;

    /* renamed from: u, reason: collision with root package name */
    public SpannableStringBuilder f125409u;

    /* renamed from: v, reason: collision with root package name */
    public StaticLayout f125410v;

    /* renamed from: w, reason: collision with root package name */
    public float f125411w;

    static {
        String str = Build.MODEL;
        boolean z13 = false;
        boolean z14 = str.equals("2201117TL") || str.equals("2201117TY") || str.equals("2201117TG") || str.equals("2201117TI");
        if (Intrinsics.d(Build.VERSION.RELEASE, "11") && z14) {
            z13 = true;
        }
        f125399x = z13;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f125400l = j1.Y0(context);
        this.f125401m = new tn1.c(context, new tn1.b((vn1.c) null, e0.b(vn1.e.BOLD), (vn1.g) null, 11));
        this.f125402n = !f125399x;
        this.f125403o = "";
        this.f125404p = new AtomicReference();
        this.f125406r = 3;
    }

    @Override // wa2.l
    public final void c() {
        super.c();
        o("");
        this.f125406r = 3;
        this.f125407s = 0;
        this.f125409u = null;
        this.f125408t = null;
        this.f125410v = null;
        xj2.c cVar = this.f125405q;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f125405q = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint.Align textAlign = this.f125401m.getTextAlign();
        Paint.Align align = Paint.Align.CENTER;
        boolean z13 = this.f125400l;
        Number valueOf = (textAlign != align || (z13 && this.f125411w != 0.0f)) ? (!z13 || this.f125411w <= 0.0f) ? Integer.valueOf(getBounds().left) : Float.valueOf(getBounds().centerX() - this.f125411w) : Integer.valueOf(getBounds().centerX());
        canvas.save();
        canvas.translate(valueOf.floatValue(), getBounds().top);
        StaticLayout staticLayout = this.f125410v;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    public final Rect h() {
        Object obj;
        String str;
        StaticLayout staticLayout = this.f125410v;
        if (staticLayout != null) {
            IntRange q13 = s.q(0, staticLayout.getLineCount());
            ArrayList arrayList = new ArrayList(g0.q(q13, 10));
            Iterator it = q13.iterator();
            while (it.hasNext()) {
                int b13 = ((u0) it).b();
                StaticLayout staticLayout2 = this.f125410v;
                String str2 = "";
                if (staticLayout2 != null) {
                    int lineStart = staticLayout2.getLineStart(b13);
                    int lineVisibleEnd = staticLayout2.getLineVisibleEnd(b13);
                    if (lineStart < 0 || lineVisibleEnd > staticLayout2.getText().length()) {
                        str = "";
                    } else {
                        str = staticLayout2.getText().toString().substring(lineStart, lineVisibleEnd);
                        Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                    }
                    if (str != null) {
                        str2 = str;
                    }
                }
                Rect rect = new Rect();
                this.f125401m.getTextBounds(str2, 0, str2.length(), rect);
                arrayList.add(rect);
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                if (it2.hasNext()) {
                    int width = ((Rect) next).width();
                    do {
                        Object next2 = it2.next();
                        int width2 = ((Rect) next2).width();
                        if (width < width2) {
                            next = next2;
                            width = width2;
                        }
                    } while (it2.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            Rect rect2 = (Rect) obj;
            if (rect2 != null) {
                return rect2;
            }
        }
        return new Rect();
    }

    public final SpannableString i() {
        p pVar = this.f125408t;
        if (pVar == null) {
            return new SpannableString(this.f125403o);
        }
        SpannableString spannableString = new SpannableString(this.f125403o);
        spannableString.setSpan(pVar.c(), pVar.b(), pVar.a(), 33);
        return spannableString;
    }

    public final Rect j() {
        StaticLayout staticLayout = this.f125410v;
        String valueOf = String.valueOf(staticLayout != null ? staticLayout.getText() : null);
        float width = this.f125410v != null ? r1.getWidth() : 0.0f;
        tn1.c cVar = this.f125401m;
        String a13 = wa2.l.a(valueOf, cVar, width);
        Rect rect = new Rect();
        cVar.getTextBounds(a13, 0, a13.length(), rect);
        return rect;
    }

    public final void k() {
        if (this.f125400l) {
            tn1.c cVar = this.f125401m;
            if (cVar.getTextAlign() == Paint.Align.CENTER) {
                this.f125411w = (this.f125410v != null ? r1.getWidth() : 0) - cVar.measureText(this.f125403o);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        SpannableString spannableString;
        PrecomputedTextCompat precomputedTextCompat = (PrecomputedTextCompat) this.f125404p.get();
        SpannableString spannableString2 = null;
        if (this.f125402n && precomputedTextCompat != 0 && this.f125409u == null && this.f125408t == null) {
            String obj = precomputedTextCompat.f17941a.toString();
            Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
            spannableString = precomputedTextCompat;
            if (!Intrinsics.d(obj, this.f125403o)) {
                SpannableStringBuilder spannableStringBuilder = this.f125409u;
                if (spannableStringBuilder != null) {
                    String spannableStringBuilder2 = spannableStringBuilder.toString();
                    Intrinsics.checkNotNullExpressionValue(spannableStringBuilder2, "toString(...)");
                    o(spannableStringBuilder2);
                    spannableString2 = new SpannableString(spannableStringBuilder);
                }
                if (spannableString2 == null) {
                    spannableString = i();
                }
                spannableString = spannableString2;
            }
        } else {
            SpannableStringBuilder spannableStringBuilder3 = this.f125409u;
            if (spannableStringBuilder3 != null) {
                String spannableStringBuilder4 = spannableStringBuilder3.toString();
                Intrinsics.checkNotNullExpressionValue(spannableStringBuilder4, "toString(...)");
                o(spannableStringBuilder4);
                spannableString2 = new SpannableString(spannableStringBuilder3);
            }
            if (spannableString2 == null) {
                spannableString = i();
            }
            spannableString = spannableString2;
        }
        SpannableString spannableString3 = spannableString;
        int length = this.f125403o.length();
        int i13 = this.f125407s;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        int i14 = this.f125406r;
        boolean z13 = this.f125400l;
        tn1.c cVar = this.f125401m;
        TextDirectionHeuristic textDirectionHeuristic = (z13 && cVar.getTextAlign() == Paint.Align.CENTER) ? TextDirectionHeuristics.FIRSTSTRONG_RTL : z13 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        Intrinsics.f(textDirectionHeuristic);
        StaticLayout y13 = com.bumptech.glide.d.y(spannableString3, length, cVar, i13, alignment, truncateAt, i13, i14, textDirectionHeuristic);
        this.f125410v = y13;
        e(y13 != null ? y13.getHeight() : 0);
    }

    public final void m(vn1.b alignment) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        tn1.c cVar = this.f125401m;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        cVar.a(new t(alignment, 14));
    }

    public final void n(List style) {
        Intrinsics.checkNotNullParameter(style, "style");
        tn1.c cVar = this.f125401m;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(style, "style");
        cVar.a(new y(style, 7));
    }

    public final void o(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f125403o = value;
        if (this.f125402n) {
            if (value.length() <= 0) {
                this.f125404p.set(null);
                return;
            }
            PrecomputedTextCompat.Params params = new PrecomputedTextCompat.Params(this.f125401m, TextDirectionHeuristics.FIRSTSTRONG_LTR, 1, 1);
            Intrinsics.checkNotNullExpressionValue(params, "build(...)");
            this.f125405q = tk2.e.f118016b.b(new h6.o(this, value, params, 14));
        }
    }

    public final void p(vn1.g variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        tn1.c cVar = this.f125401m;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(variant, "variant");
        cVar.a(new t(variant, 16));
    }
}
