package qm;

import com.google.gson.stream.MalformedJsonException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class m extends um.a {

    /* renamed from: t, reason: collision with root package name */
    public static final k f104172t = new k();

    /* renamed from: u, reason: collision with root package name */
    public static final Object f104173u = new Object();

    /* renamed from: p, reason: collision with root package name */
    public Object[] f104174p;

    /* renamed from: q, reason: collision with root package name */
    public int f104175q;

    /* renamed from: r, reason: collision with root package name */
    public String[] f104176r;

    /* renamed from: s, reason: collision with root package name */
    public int[] f104177s;

    public m(nm.s sVar) {
        super(f104172t);
        this.f104174p = new Object[32];
        this.f104175q = 0;
        this.f104176r = new String[32];
        this.f104177s = new int[32];
        q0(sVar);
    }

    @Override // um.a
    public final void B1() {
        b0(um.b.NULL);
        n0();
        int i13 = this.f104175q;
        if (i13 > 0) {
            int[] iArr = this.f104177s;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
        }
    }

    @Override // um.a
    public final void E() {
        int i13 = l.f104171a[K().ordinal()];
        if (i13 == 1) {
            i0(true);
            return;
        }
        if (i13 == 2) {
            f();
            return;
        }
        if (i13 == 3) {
            g();
            return;
        }
        if (i13 != 4) {
            n0();
            int i14 = this.f104175q;
            if (i14 > 0) {
                int[] iArr = this.f104177s;
                int i15 = i14 - 1;
                iArr[i15] = iArr[i15] + 1;
            }
        }
    }

    @Override // um.a
    public final um.b K() {
        if (this.f104175q == 0) {
            return um.b.END_DOCUMENT;
        }
        Object m03 = m0();
        if (m03 instanceof Iterator) {
            boolean z13 = this.f104174p[this.f104175q - 2] instanceof nm.u;
            Iterator it = (Iterator) m03;
            if (!it.hasNext()) {
                return z13 ? um.b.END_OBJECT : um.b.END_ARRAY;
            }
            if (z13) {
                return um.b.NAME;
            }
            q0(it.next());
            return K();
        }
        if (m03 instanceof nm.u) {
            return um.b.BEGIN_OBJECT;
        }
        if (m03 instanceof nm.q) {
            return um.b.BEGIN_ARRAY;
        }
        if (m03 instanceof nm.v) {
            Serializable serializable = ((nm.v) m03).f91367a;
            if (serializable instanceof String) {
                return um.b.STRING;
            }
            if (serializable instanceof Boolean) {
                return um.b.BOOLEAN;
            }
            if (serializable instanceof Number) {
                return um.b.NUMBER;
            }
            throw new AssertionError();
        }
        if (m03 instanceof nm.t) {
            return um.b.NULL;
        }
        if (m03 == f104173u) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + m03.getClass().getName() + " is not supported");
    }

    @Override // um.a
    public final boolean R0() {
        b0(um.b.BOOLEAN);
        boolean b13 = ((nm.v) n0()).b();
        int i13 = this.f104175q;
        if (i13 > 0) {
            int[] iArr = this.f104177s;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
        }
        return b13;
    }

    @Override // um.a
    public final long W1() {
        um.b K = K();
        um.b bVar = um.b.NUMBER;
        if (K != bVar && K != um.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + K + g0());
        }
        long l13 = ((nm.v) m0()).l();
        n0();
        int i13 = this.f104175q;
        if (i13 > 0) {
            int[] iArr = this.f104177s;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
        }
        return l13;
    }

    @Override // um.a
    public final String Y0() {
        um.b K = K();
        um.b bVar = um.b.STRING;
        if (K != bVar && K != um.b.NUMBER) {
            throw new IllegalStateException("Expected " + bVar + " but was " + K + g0());
        }
        String p13 = ((nm.v) n0()).p();
        int i13 = this.f104175q;
        if (i13 > 0) {
            int[] iArr = this.f104177s;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
        }
        return p13;
    }

    @Override // um.a
    public final void a() {
        b0(um.b.BEGIN_ARRAY);
        q0(((nm.q) m0()).f91364a.iterator());
        this.f104177s[this.f104175q - 1] = 0;
    }

    public final void b0(um.b bVar) {
        if (K() == bVar) {
            return;
        }
        throw new IllegalStateException("Expected " + bVar + " but was " + K() + g0());
    }

    @Override // um.a
    public final void c() {
        b0(um.b.BEGIN_OBJECT);
        q0(((pm.l) ((nm.u) m0()).f91366a.entrySet()).iterator());
    }

    @Override // um.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f104174p = new Object[]{f104173u};
        this.f104175q = 1;
    }

    public final String d0(boolean z13) {
        StringBuilder sb3 = new StringBuilder("$");
        int i13 = 0;
        while (true) {
            int i14 = this.f104175q;
            if (i13 >= i14) {
                return sb3.toString();
            }
            Object[] objArr = this.f104174p;
            Object obj = objArr[i13];
            if (obj instanceof nm.q) {
                i13++;
                if (i13 < i14 && (objArr[i13] instanceof Iterator)) {
                    int i15 = this.f104177s[i13];
                    if (z13 && i15 > 0 && (i13 == i14 - 1 || i13 == i14 - 2)) {
                        i15--;
                    }
                    sb3.append('[');
                    sb3.append(i15);
                    sb3.append(']');
                }
            } else if ((obj instanceof nm.u) && (i13 = i13 + 1) < i14 && (objArr[i13] instanceof Iterator)) {
                sb3.append('.');
                String str = this.f104176r[i13];
                if (str != null) {
                    sb3.append(str);
                }
            }
            i13++;
        }
    }

    @Override // um.a
    public final void f() {
        b0(um.b.END_ARRAY);
        n0();
        n0();
        int i13 = this.f104175q;
        if (i13 > 0) {
            int[] iArr = this.f104177s;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
        }
    }

    @Override // um.a
    public final void g() {
        b0(um.b.END_OBJECT);
        this.f104176r[this.f104175q - 1] = null;
        n0();
        n0();
        int i13 = this.f104175q;
        if (i13 > 0) {
            int[] iArr = this.f104177s;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
        }
    }

    public final String g0() {
        return " at path " + d0(false);
    }

    @Override // um.a
    public final boolean hasNext() {
        um.b K = K();
        return (K == um.b.END_OBJECT || K == um.b.END_ARRAY || K == um.b.END_DOCUMENT) ? false : true;
    }

    public final String i0(boolean z13) {
        b0(um.b.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m0()).next();
        String str = (String) entry.getKey();
        this.f104176r[this.f104175q - 1] = z13 ? "<skipped>" : str;
        q0(entry.getValue());
        return str;
    }

    @Override // um.a
    public final String k() {
        return d0(false);
    }

    @Override // um.a
    public final String k0() {
        return i0(false);
    }

    public final Object m0() {
        return this.f104174p[this.f104175q - 1];
    }

    public final Object n0() {
        Object[] objArr = this.f104174p;
        int i13 = this.f104175q - 1;
        this.f104175q = i13;
        Object obj = objArr[i13];
        objArr[i13] = null;
        return obj;
    }

    @Override // um.a
    public final String o() {
        return d0(true);
    }

    @Override // um.a
    public final int o0() {
        um.b K = K();
        um.b bVar = um.b.NUMBER;
        if (K != bVar && K != um.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + K + g0());
        }
        int e13 = ((nm.v) m0()).e();
        n0();
        int i13 = this.f104175q;
        if (i13 > 0) {
            int[] iArr = this.f104177s;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
        }
        return e13;
    }

    public final void q0(Object obj) {
        int i13 = this.f104175q;
        Object[] objArr = this.f104174p;
        if (i13 == objArr.length) {
            int i14 = i13 * 2;
            this.f104174p = Arrays.copyOf(objArr, i14);
            this.f104177s = Arrays.copyOf(this.f104177s, i14);
            this.f104176r = (String[]) Arrays.copyOf(this.f104176r, i14);
        }
        Object[] objArr2 = this.f104174p;
        int i15 = this.f104175q;
        this.f104175q = i15 + 1;
        objArr2[i15] = obj;
    }

    @Override // um.a
    public final double s1() {
        um.b K = K();
        um.b bVar = um.b.NUMBER;
        if (K != bVar && K != um.b.STRING) {
            throw new IllegalStateException("Expected " + bVar + " but was " + K + g0());
        }
        double c13 = ((nm.v) m0()).c();
        if (this.f122652b != nm.b0.LENIENT && (Double.isNaN(c13) || Double.isInfinite(c13))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + c13);
        }
        n0();
        int i13 = this.f104175q;
        if (i13 > 0) {
            int[] iArr = this.f104177s;
            int i14 = i13 - 1;
            iArr[i14] = iArr[i14] + 1;
        }
        return c13;
    }

    @Override // um.a
    public final String toString() {
        return m.class.getSimpleName() + g0();
    }
}
