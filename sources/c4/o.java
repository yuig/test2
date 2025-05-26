package c4;

import android.os.Build;
import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f25653a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f25654b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25655c;

    /* renamed from: d, reason: collision with root package name */
    public float f25656d = Float.NaN;

    /* renamed from: e, reason: collision with root package name */
    public float f25657e = Float.NaN;

    /* renamed from: f, reason: collision with root package name */
    public BoringLayout.Metrics f25658f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25659g;

    public o(CharSequence charSequence, j4.e eVar, int i13) {
        this.f25653a = charSequence;
        this.f25654b = eVar;
        this.f25655c = i13;
    }

    public final BoringLayout.Metrics a() {
        if (!this.f25659g) {
            TextDirectionHeuristic a13 = a0.a(this.f25655c);
            int i13 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.f25653a;
            TextPaint textPaint = this.f25654b;
            this.f25658f = i13 >= 33 ? c.b(charSequence, textPaint, a13) : d.b(charSequence, textPaint, a13);
            this.f25659g = true;
        }
        return this.f25658f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (f0.h.R(r4, e4.e.class) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float b() {
        /*
            r7 = this;
            float r0 = r7.f25656d
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r0 = r7.f25656d
            goto L57
        Lb:
            android.text.BoringLayout$Metrics r0 = r7.a()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            android.text.TextPaint r3 = r7.f25654b
            java.lang.CharSequence r4 = r7.f25653a
            if (r2 >= 0) goto L2e
            r0 = 0
            int r2 = r4.length()
            float r0 = android.text.Layout.getDesiredWidth(r4, r0, r2, r3)
            double r5 = (double) r0
            double r5 = java.lang.Math.ceil(r5)
            float r0 = (float) r5
        L2e:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 != 0) goto L33
            goto L55
        L33:
            boolean r2 = r4 instanceof android.text.Spanned
            if (r2 == 0) goto L49
            android.text.Spanned r4 = (android.text.Spanned) r4
            java.lang.Class<e4.f> r2 = e4.f.class
            boolean r2 = f0.h.R(r4, r2)
            if (r2 != 0) goto L52
            java.lang.Class<e4.e> r2 = e4.e.class
            boolean r2 = f0.h.R(r4, r2)
            if (r2 != 0) goto L52
        L49:
            float r2 = r3.getLetterSpacing()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L52
            goto L55
        L52:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L55:
            r7.f25656d = r0
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.o.b():float");
    }
}
