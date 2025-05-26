package com.google.android.gms.internal.recaptcha;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class u implements Serializable, Iterable {

    /* renamed from: b, reason: collision with root package name */
    public static final t f31799b = new t(d0.f31746b);

    /* renamed from: a, reason: collision with root package name */
    public int f31800a;

    static {
        Class cls = o.f31774a;
    }

    public static int i(int i13, int i14, int i15) {
        int i16 = i14 - i13;
        if ((i13 | i14 | i16 | (i15 - i14)) >= 0) {
            return i16;
        }
        if (i13 < 0) {
            StringBuilder sb3 = new StringBuilder(32);
            sb3.append("Beginning index: ");
            sb3.append(i13);
            sb3.append(" < 0");
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        if (i14 < i13) {
            StringBuilder sb4 = new StringBuilder(66);
            sb4.append("Beginning index larger than ending index: ");
            sb4.append(i13);
            sb4.append(", ");
            sb4.append(i14);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        StringBuilder sb5 = new StringBuilder(37);
        sb5.append("End index: ");
        sb5.append(i14);
        sb5.append(" >= ");
        sb5.append(i15);
        throw new IndexOutOfBoundsException(sb5.toString());
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int i13 = this.f31800a;
        if (i13 == 0) {
            int e13 = e();
            t tVar = (t) this;
            int j13 = tVar.j();
            Charset charset = d0.f31745a;
            int i14 = e13;
            for (int i15 = j13; i15 < j13 + e13; i15++) {
                i14 = (i14 * 31) + tVar.f31788c[i15];
            }
            i13 = i14 == 0 ? 1 : i14;
            this.f31800a = i13;
        }
        return i13;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int e13 = e();
        if (e() <= 50) {
            concat = a0.a(this);
        } else {
            t tVar = (t) this;
            int i13 = i(0, 47, tVar.e());
            concat = String.valueOf(a0.a(i13 == 0 ? f31799b : new s(tVar.f31788c, tVar.j(), i13))).concat("...");
        }
        return a.a.p(a.a.v("<ByteString@", hexString, " size=", e13, " contents=\""), concat, "\">");
    }

    public abstract byte d(int i13);

    public abstract int e();

    public abstract byte f(int i13);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new p(this);
    }
}
