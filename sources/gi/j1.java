package gi;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class j1 implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final k1 f65077b = new k1(m1.f65098a);

    /* renamed from: a, reason: collision with root package name */
    public int f65078a;

    static {
        int i13 = g1.f65070a;
    }

    public static int j(int i13, int i14, int i15) {
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

    public static k1 l(byte[] bArr, int i13) {
        j(0, i13, bArr.length);
        byte[] bArr2 = new byte[i13];
        System.arraycopy(bArr, 0, bArr2, 0, i13);
        return new k1(bArr2);
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int i13 = this.f65078a;
        if (i13 != 0) {
            return i13;
        }
        int f13 = f();
        k1 k1Var = (k1) this;
        int p13 = k1Var.p();
        byte[] bArr = m1.f65098a;
        int i14 = f13;
        for (int i15 = p13; i15 < p13 + f13; i15++) {
            i14 = (i14 * 31) + k1Var.f65082c[i15];
        }
        if (i14 == 0) {
            i14 = 1;
        }
        this.f65078a = i14;
        return i14;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        k1 i1Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int f13 = f();
        if (f() <= 50) {
            concat = f0.h.q0(this);
        } else {
            k1 k1Var = (k1) this;
            int j13 = j(0, 47, k1Var.f());
            if (j13 == 0) {
                i1Var = f65077b;
            } else {
                i1Var = new i1(k1Var.f65082c, k1Var.p(), j13);
            }
            concat = f0.h.q0(i1Var).concat("...");
        }
        return a.a.p(a.a.v("<ByteString@", hexString, " size=", f13, " contents=\""), concat, "\">");
    }

    public abstract byte d(int i13);

    public abstract byte e(int i13);

    public abstract boolean equals(Object obj);

    public abstract int f();

    public abstract void i(byte[] bArr, int i13);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new h1(this);
    }

    public final byte[] n() {
        int f13 = f();
        if (f13 == 0) {
            return m1.f65098a;
        }
        byte[] bArr = new byte[f13];
        i(bArr, f13);
        return bArr;
    }
}
