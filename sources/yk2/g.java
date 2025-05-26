package yk2;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lb.l0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class g implements Map, Serializable, ll2.e {

    /* renamed from: n */
    @NotNull
    public static final c f139246n = new c(null);

    /* renamed from: o */
    public static final g f139247o;

    /* renamed from: a */
    public Object[] f139248a;

    /* renamed from: b */
    public Object[] f139249b;

    /* renamed from: c */
    public int[] f139250c;

    /* renamed from: d */
    public int[] f139251d;

    /* renamed from: e */
    public int f139252e;

    /* renamed from: f */
    public int f139253f;

    /* renamed from: g */
    public int f139254g;

    /* renamed from: h */
    public int f139255h;

    /* renamed from: i */
    public int f139256i;

    /* renamed from: j */
    public i f139257j;

    /* renamed from: k */
    public j f139258k;

    /* renamed from: l */
    public h f139259l;

    /* renamed from: m */
    public boolean f139260m;

    static {
        g gVar = new g(0);
        gVar.f139260m = true;
        f139247o = gVar;
    }

    public g() {
        this(8);
    }

    private final Object writeReplace() {
        if (this.f139260m) {
            return new n(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    public final int b(Object obj) {
        d();
        while (true) {
            int j13 = j(obj);
            int i13 = this.f139252e * 2;
            int length = this.f139251d.length / 2;
            if (i13 > length) {
                i13 = length;
            }
            int i14 = 0;
            while (true) {
                int[] iArr = this.f139251d;
                int i15 = iArr[j13];
                if (i15 <= 0) {
                    int i16 = this.f139253f;
                    Object[] objArr = this.f139248a;
                    if (i16 < objArr.length) {
                        int i17 = i16 + 1;
                        this.f139253f = i17;
                        objArr[i16] = obj;
                        this.f139250c[i16] = j13;
                        iArr[j13] = i17;
                        this.f139256i++;
                        this.f139255h++;
                        if (i14 > this.f139252e) {
                            this.f139252e = i14;
                        }
                        return i16;
                    }
                    g(1);
                } else {
                    if (Intrinsics.d(this.f139248a[i15 - 1], obj)) {
                        return -i15;
                    }
                    i14++;
                    if (i14 > i13) {
                        k(this.f139251d.length * 2);
                        break;
                    }
                    j13 = j13 == 0 ? this.f139251d.length - 1 : j13 - 1;
                }
            }
        }
    }

    public final g c() {
        d();
        this.f139260m = true;
        if (this.f139256i > 0) {
            return this;
        }
        g gVar = f139247o;
        Intrinsics.g(gVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return gVar;
    }

    @Override // java.util.Map
    public final void clear() {
        d();
        ql2.k it = new IntRange(0, this.f139253f - 1, 1).iterator();
        while (it.f104109c) {
            int b13 = it.b();
            int[] iArr = this.f139250c;
            int i13 = iArr[b13];
            if (i13 >= 0) {
                this.f139251d[i13] = 0;
                iArr[b13] = -1;
            }
        }
        l0.a1(0, this.f139253f, this.f139248a);
        Object[] objArr = this.f139249b;
        if (objArr != null) {
            l0.a1(0, this.f139253f, objArr);
        }
        this.f139256i = 0;
        this.f139253f = 0;
        this.f139255h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return i(obj) >= 0;
    }

    public final void d() {
        if (this.f139260m) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean e(Collection m13) {
        Intrinsics.checkNotNullParameter(m13, "m");
        for (Object obj : m13) {
            if (obj != null) {
                try {
                    if (!f((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h hVar = this.f139259l;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this);
        this.f139259l = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f139256i != map.size() || !e(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        int h10 = h(entry.getKey());
        if (h10 < 0) {
            return false;
        }
        Object[] objArr = this.f139249b;
        Intrinsics.f(objArr);
        return Intrinsics.d(objArr[h10], entry.getValue());
    }

    public final void g(int i13) {
        Object[] objArr;
        Object[] objArr2 = this.f139248a;
        int length = objArr2.length;
        int i14 = this.f139253f;
        int i15 = length - i14;
        int i16 = i14 - this.f139256i;
        if (i15 < i13 && i15 + i16 >= i13 && i16 >= objArr2.length / 4) {
            k(this.f139251d.length);
            return;
        }
        int i17 = i14 + i13;
        if (i17 < 0) {
            throw new OutOfMemoryError();
        }
        if (i17 > objArr2.length) {
            kotlin.collections.e eVar = kotlin.collections.h.f80373a;
            int length2 = objArr2.length;
            eVar.getClass();
            int e13 = kotlin.collections.e.e(length2, i17);
            Object[] objArr3 = this.f139248a;
            Intrinsics.checkNotNullParameter(objArr3, "<this>");
            Object[] copyOf = Arrays.copyOf(objArr3, e13);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.f139248a = copyOf;
            Object[] objArr4 = this.f139249b;
            if (objArr4 != null) {
                Intrinsics.checkNotNullParameter(objArr4, "<this>");
                objArr = Arrays.copyOf(objArr4, e13);
                Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(...)");
            } else {
                objArr = null;
            }
            this.f139249b = objArr;
            int[] copyOf2 = Arrays.copyOf(this.f139250c, e13);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(...)");
            this.f139250c = copyOf2;
            f139246n.getClass();
            if (e13 < 1) {
                e13 = 1;
            }
            int highestOneBit = Integer.highestOneBit(e13 * 3);
            if (highestOneBit > this.f139251d.length) {
                k(highestOneBit);
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int h10 = h(obj);
        if (h10 < 0) {
            return null;
        }
        Object[] objArr = this.f139249b;
        Intrinsics.f(objArr);
        return objArr[h10];
    }

    public final int h(Object obj) {
        int j13 = j(obj);
        int i13 = this.f139252e;
        while (true) {
            int i14 = this.f139251d[j13];
            if (i14 == 0) {
                return -1;
            }
            if (i14 > 0) {
                int i15 = i14 - 1;
                if (Intrinsics.d(this.f139248a[i15], obj)) {
                    return i15;
                }
            }
            i13--;
            if (i13 < 0) {
                return -1;
            }
            j13 = j13 == 0 ? this.f139251d.length - 1 : j13 - 1;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        d dVar = new d(this, 0);
        int i13 = 0;
        while (dVar.hasNext()) {
            int i14 = dVar.f102464a;
            g gVar = (g) dVar.f102467d;
            if (i14 >= gVar.f139253f) {
                throw new NoSuchElementException();
            }
            dVar.f102464a = i14 + 1;
            dVar.f102465b = i14;
            Object obj = gVar.f139248a[i14];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = gVar.f139249b;
            Intrinsics.f(objArr);
            Object obj2 = objArr[dVar.f102465b];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            dVar.f();
            i13 += hashCode ^ hashCode2;
        }
        return i13;
    }

    public final int i(Object obj) {
        int i13 = this.f139253f;
        while (true) {
            i13--;
            if (i13 < 0) {
                return -1;
            }
            if (this.f139250c[i13] >= 0) {
                Object[] objArr = this.f139249b;
                Intrinsics.f(objArr);
                if (Intrinsics.d(objArr[i13], obj)) {
                    return i13;
                }
            }
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f139256i == 0;
    }

    public final int j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f139254g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0070, code lost:
    
        r3[r0] = r7;
        r6.f139250c[r2] = r0;
        r2 = r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r7) {
        /*
            r6 = this;
            int r0 = r6.f139255h
            int r0 = r0 + 1
            r6.f139255h = r0
            int r0 = r6.f139253f
            int r1 = r6.f139256i
            r2 = 0
            if (r0 <= r1) goto L3a
            java.lang.Object[] r0 = r6.f139249b
            r1 = r2
            r3 = r1
        L11:
            int r4 = r6.f139253f
            if (r1 >= r4) goto L2c
            int[] r4 = r6.f139250c
            r4 = r4[r1]
            if (r4 < 0) goto L29
            java.lang.Object[] r4 = r6.f139248a
            r5 = r4[r1]
            r4[r3] = r5
            if (r0 == 0) goto L27
            r4 = r0[r1]
            r0[r3] = r4
        L27:
            int r3 = r3 + 1
        L29:
            int r1 = r1 + 1
            goto L11
        L2c:
            java.lang.Object[] r1 = r6.f139248a
            lb.l0.a1(r3, r4, r1)
            if (r0 == 0) goto L38
            int r1 = r6.f139253f
            lb.l0.a1(r3, r1, r0)
        L38:
            r6.f139253f = r3
        L3a:
            int[] r0 = r6.f139251d
            int r1 = r0.length
            if (r7 == r1) goto L51
            int[] r0 = new int[r7]
            r6.f139251d = r0
            yk2.c r0 = yk2.g.f139246n
            r0.getClass()
            int r7 = java.lang.Integer.numberOfLeadingZeros(r7)
            int r7 = r7 + 1
            r6.f139254g = r7
            goto L5a
        L51:
            int r7 = r0.length
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.util.Arrays.fill(r0, r2, r7, r2)
        L5a:
            int r7 = r6.f139253f
            if (r2 >= r7) goto L8e
            int r7 = r2 + 1
            java.lang.Object[] r0 = r6.f139248a
            r0 = r0[r2]
            int r0 = r6.j(r0)
            int r1 = r6.f139252e
        L6a:
            int[] r3 = r6.f139251d
            r4 = r3[r0]
            if (r4 != 0) goto L78
            r3[r0] = r7
            int[] r1 = r6.f139250c
            r1[r2] = r0
            r2 = r7
            goto L5a
        L78:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L86
            int r4 = r0 + (-1)
            if (r0 != 0) goto L84
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L6a
        L84:
            r0 = r4
            goto L6a
        L86:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r7.<init>(r0)
            throw r7
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yk2.g.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        i iVar = this.f139257j;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this);
        this.f139257j = iVar2;
        return iVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:5:0x001e->B:22:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.f139248a
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r1 = 0
            r0[r12] = r1
            int[] r0 = r11.f139250c
            r0 = r0[r12]
            int r1 = r11.f139252e
            int r1 = r1 * 2
            int[] r2 = r11.f139251d
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1a
            r1 = r2
        L1a:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L1e:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L28
            int[] r0 = r11.f139251d
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L29
        L28:
            r0 = r5
        L29:
            int r4 = r4 + 1
            int r5 = r11.f139252e
            r6 = -1
            if (r4 <= r5) goto L35
            int[] r0 = r11.f139251d
            r0[r1] = r2
            goto L66
        L35:
            int[] r5 = r11.f139251d
            r7 = r5[r0]
            if (r7 != 0) goto L3e
            r5[r1] = r2
            goto L66
        L3e:
            if (r7 >= 0) goto L45
            r5[r1] = r6
        L42:
            r1 = r0
            r4 = r2
            goto L5f
        L45:
            java.lang.Object[] r5 = r11.f139248a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.j(r5)
            int r5 = r5 - r0
            int[] r9 = r11.f139251d
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L5f
            r9[r1] = r7
            int[] r4 = r11.f139250c
            r4[r8] = r1
            goto L42
        L5f:
            int r3 = r3 + r6
            if (r3 >= 0) goto L1e
            int[] r0 = r11.f139251d
            r0[r1] = r6
        L66:
            int[] r0 = r11.f139250c
            r0[r12] = r6
            int r12 = r11.f139256i
            int r12 = r12 + r6
            r11.f139256i = r12
            int r12 = r11.f139255h
            int r12 = r12 + 1
            r11.f139255h = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yk2.g.m(int):void");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        d();
        int b13 = b(obj);
        Object[] objArr = this.f139249b;
        if (objArr == null) {
            int length = this.f139248a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
            objArr = new Object[length];
            this.f139249b = objArr;
        }
        if (b13 >= 0) {
            objArr[b13] = obj2;
            return null;
        }
        int i13 = (-b13) - 1;
        Object obj3 = objArr[i13];
        objArr[i13] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        d();
        Set<Map.Entry> entrySet = from.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        g(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int b13 = b(entry.getKey());
            Object[] objArr = this.f139249b;
            if (objArr == null) {
                int length = this.f139248a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.".toString());
                }
                objArr = new Object[length];
                this.f139249b = objArr;
            }
            if (b13 >= 0) {
                objArr[b13] = entry.getValue();
            } else {
                int i13 = (-b13) - 1;
                if (!Intrinsics.d(entry.getValue(), objArr[i13])) {
                    objArr[i13] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        d();
        int h10 = h(obj);
        if (h10 < 0) {
            h10 = -1;
        } else {
            m(h10);
        }
        if (h10 < 0) {
            return null;
        }
        Object[] objArr = this.f139249b;
        Intrinsics.f(objArr);
        Object obj2 = objArr[h10];
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        objArr[h10] = null;
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f139256i;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder((this.f139256i * 3) + 2);
        sb3.append("{");
        int i13 = 0;
        d dVar = new d(this, 0);
        while (dVar.hasNext()) {
            if (i13 > 0) {
                sb3.append(", ");
            }
            Intrinsics.checkNotNullParameter(sb3, "sb");
            int i14 = dVar.f102464a;
            g gVar = (g) dVar.f102467d;
            if (i14 >= gVar.f139253f) {
                throw new NoSuchElementException();
            }
            dVar.f102464a = i14 + 1;
            dVar.f102465b = i14;
            Object obj = gVar.f139248a[i14];
            if (obj == gVar) {
                sb3.append("(this Map)");
            } else {
                sb3.append(obj);
            }
            sb3.append('=');
            Object[] objArr = gVar.f139249b;
            Intrinsics.f(objArr);
            Object obj2 = objArr[dVar.f102465b];
            if (obj2 == gVar) {
                sb3.append("(this Map)");
            } else {
                sb3.append(obj2);
            }
            dVar.f();
            i13++;
        }
        sb3.append("}");
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    @Override // java.util.Map
    public final Collection values() {
        j jVar = this.f139258k;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this);
        this.f139258k = jVar2;
        return jVar2;
    }

    public g(int i13) {
        if (i13 >= 0) {
            Object[] objArr = new Object[i13];
            int[] iArr = new int[i13];
            f139246n.getClass();
            int highestOneBit = Integer.highestOneBit((i13 < 1 ? 1 : i13) * 3);
            this.f139248a = objArr;
            this.f139249b = null;
            this.f139250c = iArr;
            this.f139251d = new int[highestOneBit];
            this.f139252e = 2;
            this.f139253f = 0;
            this.f139254g = Integer.numberOfLeadingZeros(highestOneBit) + 1;
            return;
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }
}
