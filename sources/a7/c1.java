package a7;

import a.cb;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a */
    public final int f964a;

    /* renamed from: b */
    public final String f965b;

    /* renamed from: c */
    public final int f966c;

    /* renamed from: d */
    public final androidx.media3.common.b[] f967d;

    /* renamed from: e */
    public int f968e;

    static {
        d7.n0.Q(0);
        d7.n0.Q(1);
    }

    public c1(androidx.media3.common.b... bVarArr) {
        this("", bVarArr);
    }

    public static void c(String str, int i13, String str2, String str3) {
        StringBuilder w13 = a.a.w("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        w13.append(str3);
        w13.append("' (track ");
        w13.append(i13);
        w13.append(")");
        d7.u.d("TrackGroup", "", new IllegalStateException(w13.toString()));
    }

    public final androidx.media3.common.b a() {
        return this.f967d[0];
    }

    public final int b(androidx.media3.common.b bVar) {
        int i13 = 0;
        while (true) {
            androidx.media3.common.b[] bVarArr = this.f967d;
            if (i13 >= bVarArr.length) {
                return -1;
            }
            if (bVar == bVarArr[i13]) {
                return i13;
            }
            i13++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c1.class != obj.getClass()) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f965b.equals(c1Var.f965b) && Arrays.equals(this.f967d, c1Var.f967d);
    }

    public final int hashCode() {
        if (this.f968e == 0) {
            this.f968e = Arrays.hashCode(this.f967d) + cb.d(this.f965b, 527, 31);
        }
        return this.f968e;
    }

    public final String toString() {
        return this.f965b + ": " + Arrays.toString(this.f967d);
    }

    public c1(String str, androidx.media3.common.b... bVarArr) {
        bf.b.i(bVarArr.length > 0);
        this.f965b = str;
        this.f967d = bVarArr;
        this.f964a = bVarArr.length;
        int j13 = o0.j(bVarArr[0].f18765o);
        this.f966c = j13 == -1 ? o0.j(bVarArr[0].f18764n) : j13;
        String str2 = bVarArr[0].f18754d;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i13 = bVarArr[0].f18756f | 16384;
        for (int i14 = 1; i14 < bVarArr.length; i14++) {
            String str3 = bVarArr[i14].f18754d;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                c("languages", i14, bVarArr[0].f18754d, bVarArr[i14].f18754d);
                return;
            } else {
                if (i13 != (bVarArr[i14].f18756f | 16384)) {
                    c("role flags", i14, Integer.toBinaryString(bVarArr[0].f18756f), Integer.toBinaryString(bVarArr[i14].f18756f));
                    return;
                }
            }
        }
    }
}
