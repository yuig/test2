package c4;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f25685a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25686b;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25688d;

    /* renamed from: e, reason: collision with root package name */
    public d4.g f25689e;

    /* renamed from: f, reason: collision with root package name */
    public final Layout f25690f;

    /* renamed from: g, reason: collision with root package name */
    public final int f25691g;

    /* renamed from: h, reason: collision with root package name */
    public final int f25692h;

    /* renamed from: i, reason: collision with root package name */
    public final int f25693i;

    /* renamed from: j, reason: collision with root package name */
    public final float f25694j;

    /* renamed from: k, reason: collision with root package name */
    public final float f25695k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f25696l;

    /* renamed from: m, reason: collision with root package name */
    public final Paint.FontMetricsInt f25697m;

    /* renamed from: n, reason: collision with root package name */
    public final int f25698n;

    /* renamed from: o, reason: collision with root package name */
    public final e4.h[] f25699o;

    /* renamed from: q, reason: collision with root package name */
    public n f25701q;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25687c = true;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f25700p = new Rect();

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0182, code lost:
    
        if (r11 >= 28) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x017d, code lost:
    
        if (r10 == false) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0274 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public z(java.lang.CharSequence r37, float r38, j4.e r39, int r40, android.text.TextUtils.TruncateAt r41, int r42, boolean r43, int r44, int r45, int r46, int r47, int r48, int r49, c4.o r50) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c4.z.<init>(java.lang.CharSequence, float, j4.e, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, c4.o):void");
    }

    public final int a() {
        boolean z13 = this.f25688d;
        Layout layout = this.f25690f;
        return (z13 ? layout.getLineBottom(this.f25691g - 1) : layout.getHeight()) + this.f25692h + this.f25693i + this.f25698n;
    }

    public final float b(int i13) {
        if (i13 == this.f25691g - 1) {
            return this.f25694j + this.f25695k;
        }
        return 0.0f;
    }

    public final n c() {
        n nVar = this.f25701q;
        if (nVar != null) {
            Intrinsics.f(nVar);
            return nVar;
        }
        n nVar2 = new n(this.f25690f);
        this.f25701q = nVar2;
        return nVar2;
    }

    public final float d(int i13) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f25692h + ((i13 != this.f25691g + (-1) || (fontMetricsInt = this.f25697m) == null) ? this.f25690f.getLineBaseline(i13) : g(i13) - fontMetricsInt.ascent);
    }

    public final float e(int i13) {
        Paint.FontMetricsInt fontMetricsInt;
        int i14 = this.f25691g;
        int i15 = i14 - 1;
        Layout layout = this.f25690f;
        if (i13 != i15 || (fontMetricsInt = this.f25697m) == null) {
            return this.f25692h + layout.getLineBottom(i13) + (i13 == i14 + (-1) ? this.f25693i : 0);
        }
        return layout.getLineBottom(i13 - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i13) {
        Layout layout = this.f25690f;
        return layout.getEllipsisStart(i13) == 0 ? layout.getLineEnd(i13) : layout.getText().length();
    }

    public final float g(int i13) {
        return this.f25690f.getLineTop(i13) + (i13 == 0 ? 0 : this.f25692h);
    }

    public final float h(int i13, boolean z13) {
        return b(this.f25690f.getLineForOffset(i13)) + c().c(i13, true, z13);
    }

    public final float i(int i13, boolean z13) {
        return b(this.f25690f.getLineForOffset(i13)) + c().c(i13, false, z13);
    }

    public final d4.g j() {
        d4.g gVar = this.f25689e;
        if (gVar != null) {
            return gVar;
        }
        Layout layout = this.f25690f;
        d4.g gVar2 = new d4.g(layout.getText(), layout.getText().length(), this.f25685a.getTextLocale());
        this.f25689e = gVar2;
        return gVar2;
    }
}
