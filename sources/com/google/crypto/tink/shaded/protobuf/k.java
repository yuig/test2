package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class k implements Iterable, Serializable {

    /* renamed from: b */
    public static final j f33636b = new j(l0.f33647b);

    /* renamed from: c */
    public static final i f33637c;

    /* renamed from: a */
    public int f33638a;

    static {
        f33637c = d.a() ? new bk.f() : new c50.c1((Object) null);
    }

    public static int c(int i13, int i14, int i15) {
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

    public static j d(byte[] bArr, int i13, int i14) {
        c(i13, i13 + i14, bArr.length);
        return new j(f33637c.a(bArr, i13, i14));
    }

    public abstract byte b(int i13);

    public abstract void e(int i13, byte[] bArr);

    public abstract boolean equals(Object obj);

    public abstract byte f(int i13);

    public final int hashCode() {
        int i13 = this.f33638a;
        if (i13 == 0) {
            int size = size();
            j jVar = (j) this;
            int j13 = jVar.j();
            int i14 = size;
            for (int i15 = j13; i15 < j13 + size; i15++) {
                i14 = (i14 * 31) + jVar.f33635d[i15];
            }
            i13 = i14 == 0 ? 1 : i14;
            this.f33638a = i13;
        }
        return i13;
    }

    public final byte[] i() {
        int size = size();
        if (size == 0) {
            return l0.f33647b;
        }
        byte[] bArr = new byte[size];
        e(size, bArr);
        return bArr;
    }

    public abstract int size();

    public final String toString() {
        j hVar;
        String sb3;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb3 = u1.I(this);
        } else {
            StringBuilder sb4 = new StringBuilder();
            j jVar = (j) this;
            int c13 = c(0, 47, jVar.size());
            if (c13 == 0) {
                hVar = f33636b;
            } else {
                hVar = new h(jVar.f33635d, jVar.j(), c13);
            }
            sb4.append(u1.I(hVar));
            sb4.append("...");
            sb3 = sb4.toString();
        }
        return a.a.p(a.a.v("<ByteString@", hexString, " size=", size, " contents=\""), sb3, "\">");
    }
}
