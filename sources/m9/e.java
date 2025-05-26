package m9;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class e {
    public static final boolean[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;

    /* renamed from: v, reason: collision with root package name */
    public static final int f86570v = c(2, 2, 2, 0);

    /* renamed from: w, reason: collision with root package name */
    public static final int f86571w;

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f86572x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f86573y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f86574z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f86575a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f86576b = new SpannableStringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f86577c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f86578d;

    /* renamed from: e, reason: collision with root package name */
    public int f86579e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f86580f;

    /* renamed from: g, reason: collision with root package name */
    public int f86581g;

    /* renamed from: h, reason: collision with root package name */
    public int f86582h;

    /* renamed from: i, reason: collision with root package name */
    public int f86583i;

    /* renamed from: j, reason: collision with root package name */
    public int f86584j;

    /* renamed from: k, reason: collision with root package name */
    public int f86585k;

    /* renamed from: l, reason: collision with root package name */
    public int f86586l;

    /* renamed from: m, reason: collision with root package name */
    public int f86587m;

    /* renamed from: n, reason: collision with root package name */
    public int f86588n;

    /* renamed from: o, reason: collision with root package name */
    public int f86589o;

    /* renamed from: p, reason: collision with root package name */
    public int f86590p;

    /* renamed from: q, reason: collision with root package name */
    public int f86591q;

    /* renamed from: r, reason: collision with root package name */
    public int f86592r;

    /* renamed from: s, reason: collision with root package name */
    public int f86593s;

    /* renamed from: t, reason: collision with root package name */
    public int f86594t;

    /* renamed from: u, reason: collision with root package name */
    public int f86595u;

    static {
        int c13 = c(0, 0, 0, 0);
        f86571w = c13;
        int c14 = c(0, 0, 0, 3);
        f86572x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f86573y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f86574z = new int[]{3, 3, 3, 3, 3, 3, 1};
        A = new boolean[]{false, false, false, true, true, true, false};
        B = new int[]{c13, c14, c13, c13, c14, c13, c13};
        C = new int[]{0, 1, 2, 3, 4, 3, 4};
        D = new int[]{0, 0, 0, 0, 0, 3, 3};
        E = new int[]{c13, c13, c13, c13, c13, c14, c14};
    }

    public e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            bf.b.m(r4, r0)
            bf.b.m(r5, r0)
            bf.b.m(r6, r0)
            bf.b.m(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L1b
            if (r7 == r1) goto L1b
            r3 = 2
            if (r7 == r3) goto L1f
            r3 = 3
            if (r7 == r3) goto L1d
        L1b:
            r7 = r2
            goto L21
        L1d:
            r7 = r0
            goto L21
        L1f:
            r7 = 127(0x7f, float:1.78E-43)
        L21:
            if (r4 <= r1) goto L25
            r4 = r2
            goto L26
        L25:
            r4 = r0
        L26:
            if (r5 <= r1) goto L2a
            r5 = r2
            goto L2b
        L2a:
            r5 = r0
        L2b:
            if (r6 <= r1) goto L2e
            r0 = r2
        L2e:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.e.c(int, int, int, int):int");
    }

    public final void a(char c13) {
        SpannableStringBuilder spannableStringBuilder = this.f86576b;
        if (c13 != '\n') {
            spannableStringBuilder.append(c13);
            return;
        }
        ArrayList arrayList = this.f86575a;
        arrayList.add(b());
        spannableStringBuilder.clear();
        if (this.f86589o != -1) {
            this.f86589o = 0;
        }
        if (this.f86590p != -1) {
            this.f86590p = 0;
        }
        if (this.f86591q != -1) {
            this.f86591q = 0;
        }
        if (this.f86593s != -1) {
            this.f86593s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f86584j && arrayList.size() < 15) {
                this.f86595u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f86576b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f86589o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f86589o, length, 33);
            }
            if (this.f86590p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f86590p, length, 33);
            }
            if (this.f86591q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f86592r), this.f86591q, length, 33);
            }
            if (this.f86593s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f86594t), this.f86593s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.f86575a.clear();
        this.f86576b.clear();
        this.f86589o = -1;
        this.f86590p = -1;
        this.f86591q = -1;
        this.f86593s = -1;
        this.f86595u = 0;
        this.f86577c = false;
        this.f86578d = false;
        this.f86579e = 4;
        this.f86580f = false;
        this.f86581g = 0;
        this.f86582h = 0;
        this.f86583i = 0;
        this.f86584j = 15;
        this.f86585k = 0;
        this.f86586l = 0;
        this.f86587m = 0;
        int i13 = f86571w;
        this.f86588n = i13;
        this.f86592r = f86570v;
        this.f86594t = i13;
    }

    public final void e(boolean z13, boolean z14) {
        int i13 = this.f86589o;
        SpannableStringBuilder spannableStringBuilder = this.f86576b;
        if (i13 != -1) {
            if (!z13) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f86589o, spannableStringBuilder.length(), 33);
                this.f86589o = -1;
            }
        } else if (z13) {
            this.f86589o = spannableStringBuilder.length();
        }
        if (this.f86590p == -1) {
            if (z14) {
                this.f86590p = spannableStringBuilder.length();
            }
        } else {
            if (z14) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f86590p, spannableStringBuilder.length(), 33);
            this.f86590p = -1;
        }
    }

    public final void f(int i13, int i14) {
        int i15 = this.f86591q;
        SpannableStringBuilder spannableStringBuilder = this.f86576b;
        if (i15 != -1 && this.f86592r != i13) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f86592r), this.f86591q, spannableStringBuilder.length(), 33);
        }
        if (i13 != f86570v) {
            this.f86591q = spannableStringBuilder.length();
            this.f86592r = i13;
        }
        if (this.f86593s != -1 && this.f86594t != i14) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f86594t), this.f86593s, spannableStringBuilder.length(), 33);
        }
        if (i14 != f86571w) {
            this.f86593s = spannableStringBuilder.length();
            this.f86594t = i14;
        }
    }
}
