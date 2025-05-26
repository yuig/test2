package gi;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class q1 extends t1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f65108a;

    public q1(long j13) {
        this.f65108a = j13;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        t1 t1Var = (t1) obj;
        if (zza() != t1Var.zza()) {
            return zza() - t1Var.zza();
        }
        long abs = Math.abs(this.f65108a);
        long abs2 = Math.abs(((q1) t1Var).f65108a);
        if (abs < abs2) {
            return -1;
        }
        return abs > abs2 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && q1.class == obj.getClass() && this.f65108a == ((q1) obj).f65108a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zza()), Long.valueOf(this.f65108a)});
    }

    public final String toString() {
        return Long.toString(this.f65108a);
    }

    @Override // gi.t1
    public final int zza() {
        return t1.c(this.f65108a >= 0 ? (byte) 0 : (byte) 32);
    }
}
