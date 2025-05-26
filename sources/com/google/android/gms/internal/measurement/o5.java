package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class o5 implements Serializable, Iterable {

    /* renamed from: b */
    public static final n5 f31566b = new n5(c6.f31326b);

    /* renamed from: c */
    public static final p0 f31567c = new p0();

    /* renamed from: a */
    public int f31568a;

    public static int e(int i13, int i14, int i15) {
        int i16 = i14 - i13;
        if ((i13 | i14 | i16 | (i15 - i14)) >= 0) {
            return i16;
        }
        if (i13 < 0) {
            throw new IndexOutOfBoundsException(a.a.e("Beginning index: ", i13, " < 0"));
        }
        if (i14 < i13) {
            throw new IndexOutOfBoundsException(a.a.f("Beginning index larger than ending index: ", i13, ", ", i14));
        }
        throw new IndexOutOfBoundsException(a.a.f("End index: ", i14, " >= ", i15));
    }

    public static n5 f(byte[] bArr, int i13, int i14) {
        e(i13, i13 + i14, bArr.length);
        f31567c.getClass();
        byte[] bArr2 = new byte[i14];
        System.arraycopy(bArr, i13, bArr2, 0, i14);
        return new n5(bArr2);
    }

    /* renamed from: b */
    public final int hashCode() {
        int i13 = this.f31568a;
        if (i13 == 0) {
            int j13 = j();
            n5 n5Var = (n5) this;
            int l13 = n5Var.l();
            int i14 = j13;
            for (int i15 = l13; i15 < l13 + j13; i15++) {
                i14 = (i14 * 31) + n5Var.f31553d[i15];
            }
            i13 = i14 == 0 ? 1 : i14;
            this.f31568a = i13;
        }
        return i13;
    }

    /* renamed from: c */
    public final String toString() {
        String C;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int j13 = j();
        if (j() <= 50) {
            C = o0.s(this);
        } else {
            n5 n5Var = (n5) this;
            int e13 = e(0, 47, n5Var.j());
            C = a.a.C(o0.s(e13 == 0 ? f31566b : new l5(n5Var.f31553d, n5Var.l(), e13)), "...");
        }
        return a.a.p(a.a.v("<ByteString@", hexString, " size=", j13, " contents=\""), C, "\">");
    }

    public abstract byte d(int i13);

    public abstract byte i(int i13);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new k5(this);
    }

    public abstract int j();
}
