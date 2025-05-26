package k8;

import a7.c1;
import android.os.SystemClock;
import d7.n0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c implements t {

    /* renamed from: a, reason: collision with root package name */
    public final c1 f78494a;

    /* renamed from: b, reason: collision with root package name */
    public final int f78495b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f78496c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.media3.common.b[] f78497d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f78498e;

    /* renamed from: f, reason: collision with root package name */
    public int f78499f;

    public c(c1 c1Var, int[] iArr) {
        int i13 = 0;
        bf.b.t(iArr.length > 0);
        c1Var.getClass();
        this.f78494a = c1Var;
        int length = iArr.length;
        this.f78495b = length;
        this.f78497d = new androidx.media3.common.b[length];
        for (int i14 = 0; i14 < iArr.length; i14++) {
            this.f78497d[i14] = c1Var.f967d[iArr[i14]];
        }
        Arrays.sort(this.f78497d, new i2.t(5));
        this.f78496c = new int[this.f78495b];
        while (true) {
            int i15 = this.f78495b;
            if (i13 >= i15) {
                this.f78498e = new long[i15];
                return;
            } else {
                this.f78496c[i13] = c1Var.b(this.f78497d[i13]);
                i13++;
            }
        }
    }

    @Override // k8.t
    public final boolean c(int i13, long j13) {
        return this.f78498e[i13] > j13;
    }

    @Override // k8.t
    public final int d(androidx.media3.common.b bVar) {
        for (int i13 = 0; i13 < this.f78495b; i13++) {
            if (this.f78497d[i13] == bVar) {
                return i13;
            }
        }
        return -1;
    }

    @Override // k8.t
    public final androidx.media3.common.b e(int i13) {
        return this.f78497d[i13];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f78494a.equals(cVar.f78494a) && Arrays.equals(this.f78496c, cVar.f78496c);
    }

    @Override // k8.t
    public final int f(int i13) {
        return this.f78496c[i13];
    }

    @Override // k8.t
    public void g() {
    }

    @Override // k8.t
    public final boolean h(int i13, long j13) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean c13 = c(i13, elapsedRealtime);
        int i14 = 0;
        while (i14 < this.f78495b && !c13) {
            c13 = (i14 == i13 || c(i14, elapsedRealtime)) ? false : true;
            i14++;
        }
        if (!c13) {
            return false;
        }
        long[] jArr = this.f78498e;
        long j14 = jArr[i13];
        int i15 = n0.f53866a;
        long j15 = elapsedRealtime + j13;
        if (((j13 ^ j15) & (elapsedRealtime ^ j15)) < 0) {
            j15 = Long.MAX_VALUE;
        }
        jArr[i13] = Math.max(j14, j15);
        return true;
    }

    public final int hashCode() {
        if (this.f78499f == 0) {
            this.f78499f = Arrays.hashCode(this.f78496c) + (System.identityHashCode(this.f78494a) * 31);
        }
        return this.f78499f;
    }

    @Override // k8.t
    public void i(float f13) {
    }

    @Override // k8.t
    public final int l(int i13) {
        for (int i14 = 0; i14 < this.f78495b; i14++) {
            if (this.f78496c[i14] == i13) {
                return i14;
            }
        }
        return -1;
    }

    @Override // k8.t
    public final int length() {
        return this.f78496c.length;
    }

    @Override // k8.t
    public final c1 m() {
        return this.f78494a;
    }

    @Override // k8.t
    public final void n(boolean z13) {
    }

    @Override // k8.t
    public void o() {
    }

    @Override // k8.t
    public int p(long j13, List list) {
        return list.size();
    }

    @Override // k8.t
    public final int q() {
        return this.f78496c[a()];
    }

    @Override // k8.t
    public final androidx.media3.common.b r() {
        return this.f78497d[a()];
    }
}
