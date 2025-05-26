package ads_mobile_sdk;

import java.io.InputStream;

/* loaded from: classes2.dex */
public abstract class io {

    /* renamed from: a, reason: collision with root package name */
    public int f6507a;

    /* renamed from: b, reason: collision with root package name */
    public int f6508b;

    /* renamed from: c, reason: collision with root package name */
    public jo f6509c;

    public static long a(long j13) {
        return (-(j13 & 1)) ^ (j13 >>> 1);
    }

    public static int b(int i13) {
        return (-(i13 & 1)) ^ (i13 >>> 1);
    }

    public abstract int a();

    public abstract void a(int i13);

    public abstract boolean b();

    public abstract void c(int i13);

    public abstract boolean c();

    public abstract int d(int i13);

    public abstract gl d();

    public abstract double e();

    public abstract boolean e(int i13);

    public abstract int f();

    public abstract int g();

    public abstract long h();

    public abstract float i();

    public abstract int j();

    public abstract long k();

    public abstract int l();

    public abstract long m();

    public abstract int n();

    public abstract long o();

    public abstract String p();

    public abstract String q();

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public final void u() {
        int r13;
        do {
            r13 = r();
            if (r13 == 0) {
                return;
            }
            int i13 = this.f6507a;
            int i14 = this.f6508b;
            if (i13 + i14 >= 100) {
                throw new e21("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f6508b = i14 + 1;
            this.f6508b--;
        } while (e(r13));
    }

    public static io a(InputStream inputStream) {
        if (inputStream != null) {
            return new ho(inputStream);
        }
        byte[] bArr = hw0.f6127b;
        int length = bArr.length;
        fo foVar = new fo(bArr, 0, length, false);
        try {
            foVar.d(length);
            return foVar;
        } catch (e21 e13) {
            throw new IllegalArgumentException(e13);
        }
    }
}
