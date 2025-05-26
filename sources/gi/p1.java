package gi;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class p1 extends t1 {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f65106a;

    public p1(k1 k1Var) {
        this.f65106a = k1Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        t1 t1Var = (t1) obj;
        int zza = t1Var.zza();
        int c13 = t1.c((byte) 64);
        if (c13 != zza) {
            return c13 - t1Var.zza();
        }
        j1 j1Var = this.f65106a;
        int f13 = j1Var.f();
        j1 j1Var2 = ((p1) t1Var).f65106a;
        if (f13 != j1Var2.f()) {
            return j1Var.f() - j1Var2.f();
        }
        return f1.f65067a.compare(j1Var.n(), j1Var2.n());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p1.class == obj.getClass()) {
            return this.f65106a.equals(((p1) obj).f65106a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(t1.c((byte) 64)), this.f65106a});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        z0 z0Var;
        int i13;
        boolean z13;
        a1 a1Var = c1.f65051d;
        c1 c1Var = a1Var.f65054c;
        if (c1Var == null) {
            z0 z0Var2 = a1Var.f65052a;
            int i14 = 0;
            while (true) {
                char[] cArr = z0Var2.f65144b;
                if (i14 >= cArr.length) {
                    z0Var = z0Var2;
                    break;
                }
                char c13 = cArr[i14];
                if (c13 < 'a' || c13 > 'z') {
                    i14++;
                } else {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= cArr.length) {
                            z13 = false;
                            break;
                        }
                        char c14 = cArr[i15];
                        if (c14 >= 'A' && c14 <= 'Z') {
                            z13 = true;
                            break;
                        }
                        i15++;
                    }
                    if (!(!z13)) {
                        throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                    }
                    char[] cArr2 = new char[cArr.length];
                    for (int i16 = 0; i16 < cArr.length; i16++) {
                        char c15 = cArr[i16];
                        if (c15 >= 97 && c15 <= 122) {
                            c15 ^= 32;
                        }
                        cArr2[i16] = (char) c15;
                    }
                    z0Var = new z0(z0Var2.f65143a.concat(".upperCase()"), cArr2);
                    if (z0Var2.f65150h && !z0Var.f65150h) {
                        byte[] bArr = z0Var.f65149g;
                        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                        for (i13 = 65; i13 <= 90; i13++) {
                            int i17 = i13 | 32;
                            byte b13 = bArr[i13];
                            byte b14 = bArr[i17];
                            if (b13 == -1) {
                                copyOf[i13] = b14;
                            } else {
                                char c16 = (char) i13;
                                char c17 = (char) i17;
                                if (b14 != -1) {
                                    throw new IllegalStateException(kh2.g0.t0("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c16), Character.valueOf(c17)));
                                }
                                copyOf[i17] = b13;
                            }
                        }
                        z0Var = new z0(z0Var.f65143a.concat(".ignoreCase()"), z0Var.f65144b, copyOf, true);
                    }
                }
            }
            c1Var = z0Var == z0Var2 ? a1Var : new a1(z0Var);
            a1Var.f65054c = c1Var;
        }
        byte[] n13 = this.f65106a.n();
        return a.a.k("h'", c1Var.c(n13, n13.length), "'");
    }

    @Override // gi.t1
    public final int zza() {
        return t1.c((byte) 64);
    }
}
