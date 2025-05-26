package gi;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class o1 extends t1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65104a;

    public o1(boolean z13) {
        this.f65104a = z13;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        t1 t1Var = (t1) obj;
        int zza = t1Var.zza();
        int c13 = t1.c((byte) -32);
        if (c13 != zza) {
            return c13 - t1Var.zza();
        }
        return (true != this.f65104a ? 20 : 21) - (true != ((o1) t1Var).f65104a ? 20 : 21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && o1.class == obj.getClass() && this.f65104a == ((o1) obj).f65104a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(t1.c((byte) -32)), Boolean.valueOf(this.f65104a)});
    }

    public final String toString() {
        return Boolean.toString(this.f65104a);
    }

    @Override // gi.t1
    public final int zza() {
        return t1.c((byte) -32);
    }
}
