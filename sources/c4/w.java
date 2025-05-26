package c4;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f25661a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25662b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25663c;

    /* renamed from: d, reason: collision with root package name */
    public final TextPaint f25664d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25665e;

    /* renamed from: f, reason: collision with root package name */
    public final TextDirectionHeuristic f25666f;

    /* renamed from: g, reason: collision with root package name */
    public final Layout.Alignment f25667g;

    /* renamed from: h, reason: collision with root package name */
    public final int f25668h;

    /* renamed from: i, reason: collision with root package name */
    public final TextUtils.TruncateAt f25669i;

    /* renamed from: j, reason: collision with root package name */
    public final int f25670j;

    /* renamed from: k, reason: collision with root package name */
    public final float f25671k;

    /* renamed from: l, reason: collision with root package name */
    public final float f25672l;

    /* renamed from: m, reason: collision with root package name */
    public final int f25673m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f25674n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f25675o;

    /* renamed from: p, reason: collision with root package name */
    public final int f25676p;

    /* renamed from: q, reason: collision with root package name */
    public final int f25677q;

    /* renamed from: r, reason: collision with root package name */
    public final int f25678r;

    /* renamed from: s, reason: collision with root package name */
    public final int f25679s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f25680t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f25681u;

    public w(float f13, float f14, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23, int i24, int i25, Layout.Alignment alignment, TextDirectionHeuristic textDirectionHeuristic, TextPaint textPaint, TextUtils.TruncateAt truncateAt, CharSequence charSequence, boolean z13, boolean z14, int[] iArr, int[] iArr2) {
        this.f25661a = charSequence;
        this.f25662b = i13;
        this.f25663c = i14;
        this.f25664d = textPaint;
        this.f25665e = i15;
        this.f25666f = textDirectionHeuristic;
        this.f25667g = alignment;
        this.f25668h = i16;
        this.f25669i = truncateAt;
        this.f25670j = i17;
        this.f25671k = f13;
        this.f25672l = f14;
        this.f25673m = i18;
        this.f25674n = z13;
        this.f25675o = z14;
        this.f25676p = i19;
        this.f25677q = i23;
        this.f25678r = i24;
        this.f25679s = i25;
        this.f25680t = iArr;
        this.f25681u = iArr2;
        if (i13 < 0 || i13 > i14) {
            throw new IllegalArgumentException("invalid start value".toString());
        }
        int length = charSequence.length();
        if (i14 < 0 || i14 > length) {
            throw new IllegalArgumentException("invalid end value".toString());
        }
        if (i16 < 0) {
            throw new IllegalArgumentException("invalid maxLines value".toString());
        }
        if (i15 < 0) {
            throw new IllegalArgumentException("invalid width value".toString());
        }
        if (i17 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value".toString());
        }
        if (f13 < 0.0f) {
            throw new IllegalArgumentException("invalid lineSpacingMultiplier value".toString());
        }
    }
}
