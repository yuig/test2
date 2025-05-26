package gi;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class s1 extends t1 {

    /* renamed from: a */
    public final String f65115a;

    public s1(String str) {
        this.f65115a = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        t1 t1Var = (t1) obj;
        int zza = t1Var.zza();
        int c13 = t1.c((byte) 96);
        if (c13 != zza) {
            return c13 - t1Var.zza();
        }
        String str = ((s1) t1Var).f65115a;
        int length = str.length();
        String str2 = this.f65115a;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s1.class == obj.getClass()) {
            return this.f65115a.equals(((s1) obj).f65115a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(t1.c((byte) 96)), this.f65115a});
    }

    public final String toString() {
        return a.a.p(new StringBuilder("\""), this.f65115a, "\"");
    }

    @Override // gi.t1
    public final int zza() {
        return t1.c((byte) 96);
    }
}
