package c7;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import d7.n0;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class b {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;

    /* renamed from: J, reason: collision with root package name */
    public static final String f26674J;

    /* renamed from: r, reason: collision with root package name */
    public static final String f26675r;

    /* renamed from: s, reason: collision with root package name */
    public static final String f26676s;

    /* renamed from: t, reason: collision with root package name */
    public static final String f26677t;

    /* renamed from: u, reason: collision with root package name */
    public static final String f26678u;

    /* renamed from: v, reason: collision with root package name */
    public static final String f26679v;

    /* renamed from: w, reason: collision with root package name */
    public static final String f26680w;

    /* renamed from: x, reason: collision with root package name */
    public static final String f26681x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f26682y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f26683z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f26684a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f26685b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f26686c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f26687d;

    /* renamed from: e, reason: collision with root package name */
    public final float f26688e;

    /* renamed from: f, reason: collision with root package name */
    public final int f26689f;

    /* renamed from: g, reason: collision with root package name */
    public final int f26690g;

    /* renamed from: h, reason: collision with root package name */
    public final float f26691h;

    /* renamed from: i, reason: collision with root package name */
    public final int f26692i;

    /* renamed from: j, reason: collision with root package name */
    public final float f26693j;

    /* renamed from: k, reason: collision with root package name */
    public final float f26694k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f26695l;

    /* renamed from: m, reason: collision with root package name */
    public final int f26696m;

    /* renamed from: n, reason: collision with root package name */
    public final int f26697n;

    /* renamed from: o, reason: collision with root package name */
    public final float f26698o;

    /* renamed from: p, reason: collision with root package name */
    public final int f26699p;

    /* renamed from: q, reason: collision with root package name */
    public final float f26700q;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
        int i13 = n0.f53866a;
        f26675r = Integer.toString(0, 36);
        f26676s = Integer.toString(17, 36);
        f26677t = Integer.toString(1, 36);
        f26678u = Integer.toString(2, 36);
        f26679v = Integer.toString(3, 36);
        f26680w = Integer.toString(18, 36);
        f26681x = Integer.toString(4, 36);
        f26682y = Integer.toString(5, 36);
        f26683z = Integer.toString(6, 36);
        A = Integer.toString(7, 36);
        B = Integer.toString(8, 36);
        C = Integer.toString(9, 36);
        D = Integer.toString(10, 36);
        E = Integer.toString(11, 36);
        F = Integer.toString(12, 36);
        G = Integer.toString(13, 36);
        H = Integer.toString(14, 36);
        I = Integer.toString(15, 36);
        f26674J = Integer.toString(16, 36);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f13, int i13, int i14, float f14, int i15, int i16, float f15, float f16, float f17, boolean z13, int i17, int i18, float f18) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            bf.b.i(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f26684a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f26684a = charSequence.toString();
        } else {
            this.f26684a = null;
        }
        this.f26685b = alignment;
        this.f26686c = alignment2;
        this.f26687d = bitmap;
        this.f26688e = f13;
        this.f26689f = i13;
        this.f26690g = i14;
        this.f26691h = f14;
        this.f26692i = i15;
        this.f26693j = f16;
        this.f26694k = f17;
        this.f26695l = z13;
        this.f26696m = i17;
        this.f26697n = i16;
        this.f26698o = f15;
        this.f26699p = i18;
        this.f26700q = f18;
    }

    public final a a() {
        a aVar = new a();
        aVar.f26657a = this.f26684a;
        aVar.f26658b = this.f26687d;
        aVar.f26659c = this.f26685b;
        aVar.f26660d = this.f26686c;
        aVar.f26661e = this.f26688e;
        aVar.f26662f = this.f26689f;
        aVar.f26663g = this.f26690g;
        aVar.f26664h = this.f26691h;
        aVar.f26665i = this.f26692i;
        aVar.f26666j = this.f26697n;
        aVar.f26667k = this.f26698o;
        aVar.f26668l = this.f26693j;
        aVar.f26669m = this.f26694k;
        aVar.f26670n = this.f26695l;
        aVar.f26671o = this.f26696m;
        aVar.f26672p = this.f26699p;
        aVar.f26673q = this.f26700q;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (TextUtils.equals(this.f26684a, bVar.f26684a) && this.f26685b == bVar.f26685b && this.f26686c == bVar.f26686c) {
            Bitmap bitmap = bVar.f26687d;
            Bitmap bitmap2 = this.f26687d;
            if (bitmap2 != null ? !(bitmap == null || !bitmap2.sameAs(bitmap)) : bitmap == null) {
                if (this.f26688e == bVar.f26688e && this.f26689f == bVar.f26689f && this.f26690g == bVar.f26690g && this.f26691h == bVar.f26691h && this.f26692i == bVar.f26692i && this.f26693j == bVar.f26693j && this.f26694k == bVar.f26694k && this.f26695l == bVar.f26695l && this.f26696m == bVar.f26696m && this.f26697n == bVar.f26697n && this.f26698o == bVar.f26698o && this.f26699p == bVar.f26699p && this.f26700q == bVar.f26700q) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f26684a, this.f26685b, this.f26686c, this.f26687d, Float.valueOf(this.f26688e), Integer.valueOf(this.f26689f), Integer.valueOf(this.f26690g), Float.valueOf(this.f26691h), Integer.valueOf(this.f26692i), Float.valueOf(this.f26693j), Float.valueOf(this.f26694k), Boolean.valueOf(this.f26695l), Integer.valueOf(this.f26696m), Integer.valueOf(this.f26697n), Float.valueOf(this.f26698o), Integer.valueOf(this.f26699p), Float.valueOf(this.f26700q));
    }
}
