package com.google.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class l implements Iterable, Serializable {

    /* renamed from: b */
    public static final j f33922b = new j(w0.f34009b);

    /* renamed from: c */
    public static final k f33923c;

    /* renamed from: a */
    public int f33924a;

    static {
        Class cls = d.f33867a;
        f33923c = new k();
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
        f33923c.getClass();
        byte[] bArr2 = new byte[i14];
        System.arraycopy(bArr, i13, bArr2, 0, i14);
        return new j(bArr2);
    }

    public static j e(String str) {
        return new j(str.getBytes(w0.f34008a));
    }

    public abstract byte b(int i13);

    public abstract byte f(int i13);

    public final int hashCode() {
        int i13 = this.f33924a;
        if (i13 == 0) {
            int size = size();
            i13 = l(size, size);
            if (i13 == 0) {
                i13 = 1;
            }
            this.f33924a = i13;
        }
        return i13;
    }

    public abstract boolean i();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f(this);
    }

    public abstract p j();

    public abstract int l(int i13, int i14);

    public abstract l n(int i13);

    public abstract String p(Charset charset);

    public final String r() {
        return size() == 0 ? "" : p(w0.f34008a);
    }

    public abstract void s(me.o oVar);

    public abstract int size();

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            str = g2.M(this);
        } else {
            str = g2.M(n(47)) + "...";
        }
        return a.a.p(a.a.v("<ByteString@", hexString, " size=", size, " contents=\""), str, "\">");
    }
}
