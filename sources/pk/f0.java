package pk;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class f0 extends AbstractMap implements Serializable {

    /* renamed from: j */
    public static final Object f100386j = new Object();

    /* renamed from: a */
    public transient Object f100387a;

    /* renamed from: b */
    public transient int[] f100388b;

    /* renamed from: c */
    public transient Object[] f100389c;

    /* renamed from: d */
    public transient Object[] f100390d;

    /* renamed from: e */
    public transient int f100391e;

    /* renamed from: f */
    public transient int f100392f;

    /* renamed from: g */
    public transient c0 f100393g;

    /* renamed from: h */
    public transient c0 f100394h;

    /* renamed from: i */
    public transient u f100395i;

    public static f0 a() {
        f0 f0Var = new f0();
        f0Var.f(3);
        return f0Var;
    }

    public static f0 b(int i13) {
        f0 f0Var = new f0();
        f0Var.f(i13);
        return f0Var;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(a.a.d("Invalid size: ", readInt));
        }
        f(readInt);
        for (int i13 = 0; i13 < readInt; i13++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map c13 = c();
        Iterator it = c13 != null ? c13.entrySet().iterator() : new b0(this, 1);
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final Map c() {
        Object obj = this.f100387a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (h()) {
            return;
        }
        this.f100391e += 32;
        Map c13 = c();
        if (c13 != null) {
            this.f100391e = Math.min(Math.max(size(), 3), 1073741823);
            c13.clear();
            this.f100387a = null;
            this.f100392f = 0;
            return;
        }
        Arrays.fill(k(), 0, this.f100392f, (Object) null);
        Arrays.fill(m(), 0, this.f100392f, (Object) null);
        Object obj = this.f100387a;
        Objects.requireNonNull(obj);
        kh2.m2.P1(obj);
        Arrays.fill(j(), 0, this.f100392f, 0);
        this.f100392f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map c13 = c();
        return c13 != null ? c13.containsKey(obj) : e(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map c13 = c();
        if (c13 != null) {
            return c13.containsValue(obj);
        }
        for (int i13 = 0; i13 < this.f100392f; i13++) {
            if (kh2.g0.m(obj, m()[i13])) {
                return true;
            }
        }
        return false;
    }

    public final int d() {
        return (1 << (this.f100391e & 31)) - 1;
    }

    public final int e(Object obj) {
        if (h()) {
            return -1;
        }
        int Y1 = bs1.c.Y1(obj);
        int d2 = d();
        Object obj2 = this.f100387a;
        Objects.requireNonNull(obj2);
        int Q1 = kh2.m2.Q1(Y1 & d2, obj2);
        if (Q1 == 0) {
            return -1;
        }
        int R0 = kh2.m2.R0(Y1, d2);
        do {
            int i13 = Q1 - 1;
            int i14 = j()[i13];
            if (kh2.m2.R0(i14, d2) == R0 && kh2.g0.m(obj, k()[i13])) {
                return i13;
            }
            Q1 = kh2.m2.S0(i14, d2);
        } while (Q1 != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        c0 c0Var = this.f100394h;
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0(this, 0);
        this.f100394h = c0Var2;
        return c0Var2;
    }

    public final void f(int i13) {
        bf.b.j("Expected size must be >= 0", i13 >= 0);
        this.f100391e = Math.min(Math.max(i13, 1), 1073741823);
    }

    public final void g(int i13, int i14) {
        Object obj = this.f100387a;
        Objects.requireNonNull(obj);
        int[] j13 = j();
        Object[] k13 = k();
        Object[] m13 = m();
        int size = size();
        int i15 = size - 1;
        if (i13 >= i15) {
            k13[i13] = null;
            m13[i13] = null;
            j13[i13] = 0;
            return;
        }
        Object obj2 = k13[i15];
        k13[i13] = obj2;
        m13[i13] = m13[i15];
        k13[i15] = null;
        m13[i15] = null;
        j13[i13] = j13[i15];
        j13[i15] = 0;
        int Y1 = bs1.c.Y1(obj2) & i14;
        int Q1 = kh2.m2.Q1(Y1, obj);
        if (Q1 == size) {
            kh2.m2.R1(Y1, obj, i13 + 1);
            return;
        }
        while (true) {
            int i16 = Q1 - 1;
            int i17 = j13[i16];
            int S0 = kh2.m2.S0(i17, i14);
            if (S0 == size) {
                j13[i16] = kh2.m2.C1(i17, i13 + 1, i14);
                return;
            }
            Q1 = S0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map c13 = c();
        if (c13 != null) {
            return c13.get(obj);
        }
        int e13 = e(obj);
        if (e13 == -1) {
            return null;
        }
        return m()[e13];
    }

    public final boolean h() {
        return this.f100387a == null;
    }

    public final Object i(Object obj) {
        boolean h10 = h();
        Object obj2 = f100386j;
        if (h10) {
            return obj2;
        }
        int d2 = d();
        Object obj3 = this.f100387a;
        Objects.requireNonNull(obj3);
        int H1 = kh2.m2.H1(obj, null, d2, obj3, j(), k(), null);
        if (H1 == -1) {
            return obj2;
        }
        Object obj4 = m()[H1];
        g(H1, d2);
        this.f100392f--;
        this.f100391e += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int[] j() {
        int[] iArr = this.f100388b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] k() {
        Object[] objArr = this.f100389c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        c0 c0Var = this.f100393g;
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0(this, 1);
        this.f100393g = c0Var2;
        return c0Var2;
    }

    public final Object[] m() {
        Object[] objArr = this.f100390d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int n(int i13, int i14, int i15, int i16) {
        Object v03 = kh2.m2.v0(i14);
        int i17 = i14 - 1;
        if (i16 != 0) {
            kh2.m2.R1(i15 & i17, v03, i16 + 1);
        }
        Object obj = this.f100387a;
        Objects.requireNonNull(obj);
        int[] j13 = j();
        for (int i18 = 0; i18 <= i13; i18++) {
            int Q1 = kh2.m2.Q1(i18, obj);
            while (Q1 != 0) {
                int i19 = Q1 - 1;
                int i23 = j13[i19];
                int R0 = kh2.m2.R0(i23, i13) | i18;
                int i24 = R0 & i17;
                int Q12 = kh2.m2.Q1(i24, v03);
                kh2.m2.R1(i24, v03, Q1);
                j13[i19] = kh2.m2.C1(R0, Q12, i17);
                Q1 = kh2.m2.S0(i23, i13);
            }
        }
        this.f100387a = v03;
        this.f100391e = kh2.m2.C1(this.f100391e, 32 - Integer.numberOfLeadingZeros(i17), 31);
        return i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d6 -> B:34:0x00be). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object put(java.lang.Object r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pk.f0.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map c13 = c();
        if (c13 != null) {
            return c13.remove(obj);
        }
        Object i13 = i(obj);
        if (i13 == f100386j) {
            return null;
        }
        return i13;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map c13 = c();
        return c13 != null ? c13.size() : this.f100392f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        u uVar = this.f100395i;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this);
        this.f100395i = uVar2;
        return uVar2;
    }
}
