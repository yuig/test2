package a7;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1061a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f1062b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1063c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f1064d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f1065e;

    static {
        d7.n0.Q(0);
        d7.n0.Q(1);
        d7.n0.Q(3);
        d7.n0.Q(4);
    }

    public h1(c1 c1Var, boolean z13, int[] iArr, boolean[] zArr) {
        int i13 = c1Var.f964a;
        this.f1061a = i13;
        boolean z14 = false;
        bf.b.i(i13 == iArr.length && i13 == zArr.length);
        this.f1062b = c1Var;
        if (z13 && i13 > 1) {
            z14 = true;
        }
        this.f1063c = z14;
        this.f1064d = (int[]) iArr.clone();
        this.f1065e = (boolean[]) zArr.clone();
    }

    public final androidx.media3.common.b a(int i13) {
        return this.f1062b.f967d[i13];
    }

    public final int b() {
        return this.f1062b.f966c;
    }

    public final boolean c() {
        for (boolean z13 : this.f1065e) {
            if (z13) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h1.class != obj.getClass()) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f1063c == h1Var.f1063c && this.f1062b.equals(h1Var.f1062b) && Arrays.equals(this.f1064d, h1Var.f1064d) && Arrays.equals(this.f1065e, h1Var.f1065e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1065e) + ((Arrays.hashCode(this.f1064d) + (((this.f1062b.hashCode() * 31) + (this.f1063c ? 1 : 0)) * 31)) * 31);
    }
}
