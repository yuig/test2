package a7;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final m0[] f1152a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1153b;

    public n0(List list) {
        this((m0[]) list.toArray(new m0[0]));
    }

    public final n0 a(m0... m0VarArr) {
        if (m0VarArr.length == 0) {
            return this;
        }
        int i13 = d7.n0.f53866a;
        m0[] m0VarArr2 = this.f1152a;
        Object[] copyOf = Arrays.copyOf(m0VarArr2, m0VarArr2.length + m0VarArr.length);
        System.arraycopy(m0VarArr, 0, copyOf, m0VarArr2.length, m0VarArr.length);
        return new n0(this.f1153b, (m0[]) copyOf);
    }

    public final n0 b(n0 n0Var) {
        return n0Var == null ? this : a(n0Var.f1152a);
    }

    public final m0 c(int i13) {
        return this.f1152a[i13];
    }

    public final int d() {
        return this.f1152a.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n0.class != obj.getClass()) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Arrays.equals(this.f1152a, n0Var.f1152a) && this.f1153b == n0Var.f1153b;
    }

    public final int hashCode() {
        return bs1.c.W0(this.f1153b) + (Arrays.hashCode(this.f1152a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder("entries=");
        sb3.append(Arrays.toString(this.f1152a));
        long j13 = this.f1153b;
        if (j13 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j13;
        }
        sb3.append(str);
        return sb3.toString();
    }

    public n0(m0... m0VarArr) {
        this(-9223372036854775807L, m0VarArr);
    }

    public n0(long j13, m0... m0VarArr) {
        this.f1153b = j13;
        this.f1152a = m0VarArr;
    }
}
