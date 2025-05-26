package e4;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes3.dex */
public final class h implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f57143a;

    /* renamed from: c, reason: collision with root package name */
    public final int f57145c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f57146d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f57147e;

    /* renamed from: f, reason: collision with root package name */
    public final float f57148f;

    /* renamed from: k, reason: collision with root package name */
    public int f57153k;

    /* renamed from: l, reason: collision with root package name */
    public int f57154l;

    /* renamed from: b, reason: collision with root package name */
    public final int f57144b = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f57149g = Integer.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public int f57150h = Integer.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f57151i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public int f57152j = Integer.MIN_VALUE;

    public h(float f13, int i13, boolean z13, boolean z14, float f14) {
        this.f57143a = f13;
        this.f57145c = i13;
        this.f57146d = z13;
        this.f57147e = z14;
        this.f57148f = f14;
        if ((0.0f > f14 || f14 > 1.0f) && f14 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i13, int i14, int i15, int i16, Paint.FontMetricsInt fontMetricsInt) {
        int i17 = fontMetricsInt.descent;
        int i18 = fontMetricsInt.ascent;
        if (i17 - i18 <= 0) {
            return;
        }
        boolean z13 = i13 == this.f57144b;
        boolean z14 = i14 == this.f57145c;
        boolean z15 = this.f57147e;
        boolean z16 = this.f57146d;
        if (z13 && z14 && z16 && z15) {
            return;
        }
        if (this.f57149g == Integer.MIN_VALUE) {
            int i19 = i17 - i18;
            int ceil = (int) Math.ceil(this.f57143a);
            int i23 = ceil - i19;
            float f13 = this.f57148f;
            if (f13 == -1.0f) {
                f13 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            int ceil2 = (int) (i23 <= 0 ? Math.ceil(i23 * f13) : Math.ceil((1.0f - f13) * i23));
            int i24 = fontMetricsInt.descent;
            int i25 = ceil2 + i24;
            this.f57151i = i25;
            int i26 = i25 - ceil;
            this.f57150h = i26;
            if (z16) {
                i26 = fontMetricsInt.ascent;
            }
            this.f57149g = i26;
            if (z15) {
                i25 = i24;
            }
            this.f57152j = i25;
            this.f57153k = fontMetricsInt.ascent - i26;
            this.f57154l = i25 - i24;
        }
        fontMetricsInt.ascent = z13 ? this.f57149g : this.f57150h;
        fontMetricsInt.descent = z14 ? this.f57152j : this.f57151i;
    }
}
