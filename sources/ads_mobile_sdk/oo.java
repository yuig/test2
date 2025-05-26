package ads_mobile_sdk;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class oo extends a.lg {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f9379b = Logger.getLogger(oo.class.getName());

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f9380c = mw2.f8410e;

    /* renamed from: a, reason: collision with root package name */
    public po f9381a;

    public static int a(int i13) {
        return h(i13) + 1;
    }

    public static long b(long j13) {
        return (j13 >> 63) ^ (j13 << 1);
    }

    public static int c(int i13) {
        return h(i13) + 4;
    }

    public static int d(int i13) {
        return h(i13) + 8;
    }

    public static int e(int i13) {
        return h(i13) + 4;
    }

    public static int f(int i13) {
        return h(i13) + 4;
    }

    public static int g(int i13) {
        return h(i13) + 8;
    }

    public static int h(int i13) {
        return i(i13 << 3);
    }

    public static int i(int i13) {
        return (352 - (Integer.numberOfLeadingZeros(i13) * 9)) >>> 6;
    }

    public static int j(int i13) {
        return (i13 >> 31) ^ (i13 << 1);
    }

    public abstract void a(byte b13);

    public abstract void a(int i13, boolean z13);

    public abstract void a(a.xe xeVar);

    public abstract void a(byte[] bArr, int i13);

    public abstract void b(int i13, a.xe xeVar, a.tb tbVar);

    public abstract void b(int i13, il ilVar);

    public abstract void b(il ilVar);

    public abstract void b(String str);

    public abstract void b(String str, int i13);

    public abstract void c(long j13);

    public abstract void d(int i13, long j13);

    public abstract void d(long j13);

    public abstract void e(int i13, int i14);

    public abstract void e(int i13, long j13);

    public abstract void f(int i13, int i14);

    public abstract void g(int i13, int i14);

    public abstract void h(int i13, int i14);

    public abstract void k(int i13);

    public abstract void l(int i13);

    public abstract void m(int i13);

    public static int a(int i13, il ilVar) {
        return a(ilVar) + h(i13);
    }

    public static int b(int i13) {
        return h(i13) + 8;
    }

    public static int c(int i13, int i14) {
        return i(j(i14)) + h(i13);
    }

    public static int d(int i13, int i14) {
        return i(i14) + h(i13);
    }

    public static int a(il ilVar) {
        int size = ilVar.size();
        return i(size) + size;
    }

    public static int b(int i13, int i14) {
        return a(i14) + h(i13);
    }

    public static int c(int i13, long j13) {
        return a(j13) + h(i13);
    }

    public static int a(int i13, int i14) {
        return a(i14) + h(i13);
    }

    public static int b(int i13, long j13) {
        return a(b(j13)) + h(i13);
    }

    public static int a(int i13, a.xe xeVar, a.tb tbVar) {
        return ((g) xeVar).a(tbVar) + (h(i13) * 2);
    }

    public static int a(int i13, long j13) {
        return a(j13) + h(i13);
    }

    public static int a(String str, int i13) {
        return a(str) + h(i13);
    }

    public static int a(String str) {
        int length;
        try {
            length = rx2.a(str);
        } catch (px2 unused) {
            length = str.getBytes(hw0.f6126a).length;
        }
        return i(length) + length;
    }

    public static int a(long j13) {
        return (640 - (Long.numberOfLeadingZeros(j13) * 9)) >>> 6;
    }

    public final void a(String str, px2 px2Var) {
        f9379b.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) px2Var);
        byte[] bytes = str.getBytes(hw0.f6126a);
        try {
            m(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e13) {
            throw new mo(e13);
        }
    }
}
