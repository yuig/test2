package m2;

import a8.q;
import ao2.m0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.o;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import q5.x0;

/* loaded from: classes2.dex */
public final class f extends o implements Collection, ll2.b {

    /* renamed from: a, reason: collision with root package name */
    public l2.c f85672a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f85673b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f85674c;

    /* renamed from: d, reason: collision with root package name */
    public int f85675d;

    /* renamed from: e, reason: collision with root package name */
    public p2.b f85676e = new p2.b();

    /* renamed from: f, reason: collision with root package name */
    public Object[] f85677f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f85678g;

    /* renamed from: h, reason: collision with root package name */
    public int f85679h;

    public f(l2.c cVar, Object[] objArr, Object[] objArr2, int i13) {
        this.f85672a = cVar;
        this.f85673b = objArr;
        this.f85674c = objArr2;
        this.f85675d = i13;
        this.f85677f = objArr;
        this.f85678g = objArr2;
        this.f85679h = cVar.size();
    }

    public static void e(Object[] objArr, int i13, Iterator it) {
        while (i13 < 32 && it.hasNext()) {
            objArr[i13] = it.next();
            i13++;
        }
    }

    public final Object[] A(Object[] objArr, int i13, Object[][] objArr2) {
        x0 D0 = com.bumptech.glide.c.D0(objArr2);
        int i14 = i13 >> 5;
        int i15 = this.f85675d;
        Object[] z13 = i14 < (1 << i15) ? z(objArr, i13, i15, D0) : s(objArr);
        while (D0.hasNext()) {
            this.f85675d += 5;
            z13 = v(z13);
            int i16 = this.f85675d;
            z(z13, 1 << i16, i16, D0);
        }
        return z13;
    }

    public final void B(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i13 = this.f85679h;
        int i14 = i13 >> 5;
        int i15 = this.f85675d;
        if (i14 > (1 << i15)) {
            this.f85677f = C(this.f85675d + 5, v(objArr), objArr2);
            this.f85678g = objArr3;
            this.f85675d += 5;
            this.f85679h++;
            return;
        }
        if (objArr == null) {
            this.f85677f = objArr2;
            this.f85678g = objArr3;
            this.f85679h = i13 + 1;
        } else {
            this.f85677f = C(i15, objArr, objArr2);
            this.f85678g = objArr3;
            this.f85679h++;
        }
    }

    public final Object[] C(int i13, Object[] objArr, Object[] objArr2) {
        int b03 = d7.b.b0(b() - 1, i13);
        Object[] s13 = s(objArr);
        if (i13 == 5) {
            s13[b03] = objArr2;
        } else {
            s13[b03] = C(i13 - 5, (Object[]) s13[b03], objArr2);
        }
        return s13;
    }

    public final int D(b bVar, Object[] objArr, int i13, int i14, q qVar, ArrayList arrayList, ArrayList arrayList2) {
        if (p(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = qVar.f1449a;
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArr3 = objArr2;
        for (int i15 = 0; i15 < i13; i15++) {
            Object obj2 = objArr[i15];
            if (!((Boolean) bVar.invoke(obj2)).booleanValue()) {
                if (i14 == 32) {
                    objArr3 = arrayList.isEmpty() ^ true ? (Object[]) arrayList.remove(arrayList.size() - 1) : u();
                    i14 = 0;
                }
                objArr3[i14] = obj2;
                i14++;
            }
        }
        qVar.f1449a = objArr3;
        if (objArr2 != objArr3) {
            arrayList2.add(objArr2);
        }
        return i14;
    }

    public final int E(b bVar, Object[] objArr, int i13, q qVar) {
        Object[] objArr2 = objArr;
        int i14 = i13;
        boolean z13 = false;
        for (int i15 = 0; i15 < i13; i15++) {
            Object obj = objArr[i15];
            if (((Boolean) bVar.invoke(obj)).booleanValue()) {
                if (!z13) {
                    objArr2 = s(objArr);
                    z13 = true;
                    i14 = i15;
                }
            } else if (z13) {
                objArr2[i14] = obj;
                i14++;
            }
        }
        qVar.f1449a = objArr2;
        return i14;
    }

    public final int F(b bVar, int i13, q qVar) {
        int E = E(bVar, this.f85678g, i13, qVar);
        if (E == i13) {
            return i13;
        }
        Object obj = qVar.f1449a;
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Arrays.fill(objArr, E, i13, (Object) null);
        this.f85678g = objArr;
        this.f85679h -= i13 - E;
        return E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r0 != r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (F(r19, r10, r11) != r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        r14 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean G(m2.b r19) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.f.G(m2.b):boolean");
    }

    public final Object[] H(Object[] objArr, int i13, int i14, q qVar) {
        int b03 = d7.b.b0(i14, i13);
        if (i13 == 0) {
            Object obj = objArr[b03];
            Object[] s13 = s(objArr);
            z.h(b03, b03 + 1, 32, objArr, s13);
            s13[31] = qVar.f1449a;
            qVar.f1449a = obj;
            return s13;
        }
        int b04 = objArr[31] == null ? d7.b.b0(L() - 1, i13) : 31;
        Object[] s14 = s(objArr);
        int i15 = i13 - 5;
        int i16 = b03 + 1;
        if (i16 <= b04) {
            while (true) {
                Object obj2 = s14[b04];
                Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                s14[b04] = H((Object[]) obj2, i15, 0, qVar);
                if (b04 == i16) {
                    break;
                }
                b04--;
            }
        }
        Object obj3 = s14[b03];
        Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        s14[b03] = H((Object[]) obj3, i15, i14, qVar);
        return s14;
    }

    public final Object I(Object[] objArr, int i13, int i14, int i15) {
        int i16 = this.f85679h - i13;
        if (i16 == 1) {
            Object obj = this.f85678g[0];
            y(i13, i14, objArr);
            return obj;
        }
        Object[] objArr2 = this.f85678g;
        Object obj2 = objArr2[i15];
        Object[] s13 = s(objArr2);
        z.h(i15, i15 + 1, i16, objArr2, s13);
        s13[i16 - 1] = null;
        this.f85677f = objArr;
        this.f85678g = s13;
        this.f85679h = (i13 + i16) - 1;
        this.f85675d = i14;
        return obj2;
    }

    public final int L() {
        int i13 = this.f85679h;
        if (i13 <= 32) {
            return 0;
        }
        return (i13 - 1) & (-32);
    }

    public final Object[] M(Object[] objArr, int i13, int i14, Object obj, q qVar) {
        int b03 = d7.b.b0(i14, i13);
        Object[] s13 = s(objArr);
        if (i13 != 0) {
            Object obj2 = s13[b03];
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            s13[b03] = M((Object[]) obj2, i13 - 5, i14, obj, qVar);
            return s13;
        }
        if (s13 != objArr) {
            ((AbstractList) this).modCount++;
        }
        qVar.f1449a = s13[b03];
        s13[b03] = obj;
        return s13;
    }

    public final void N(Collection collection, int i13, Object[] objArr, int i14, Object[][] objArr2, int i15, Object[] objArr3) {
        Object[] u13;
        if (i15 < 1) {
            m0.o0("requires at least one nullBuffer");
            throw null;
        }
        Object[] s13 = s(objArr);
        objArr2[0] = s13;
        int i16 = i13 & 31;
        int size = ((collection.size() + i13) - 1) & 31;
        int i17 = (i14 - i16) + size;
        if (i17 < 32) {
            z.h(size + 1, i16, i14, s13, objArr3);
        } else {
            int i18 = i17 - 31;
            if (i15 == 1) {
                u13 = s13;
            } else {
                u13 = u();
                i15--;
                objArr2[i15] = u13;
            }
            int i19 = i14 - i18;
            z.h(0, i19, i14, s13, objArr3);
            z.h(size + 1, i16, i19, s13, u13);
            objArr3 = u13;
        }
        Iterator it = collection.iterator();
        e(s13, i16, it);
        for (int i23 = 1; i23 < i15; i23++) {
            Object[] u14 = u();
            e(u14, 0, it);
            objArr2[i23] = u14;
        }
        e(objArr3, 0, it);
    }

    public final int O() {
        int i13 = this.f85679h;
        return i13 <= 32 ? i13 : i13 - ((i13 - 1) & (-32));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i13, Object obj) {
        ue.c.g(i13, b());
        if (i13 == b()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int L = L();
        if (i13 >= L) {
            n(i13 - L, obj, this.f85677f);
            return;
        }
        q qVar = new q(null);
        Object[] objArr = this.f85677f;
        Intrinsics.f(objArr);
        n(0, qVar.f1449a, j(objArr, this.f85675d, i13, obj, qVar));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i13, Collection collection) {
        Object[] u13;
        ue.c.g(i13, this.f85679h);
        if (i13 == this.f85679h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i14 = (i13 >> 5) << 5;
        int size = ((collection.size() + (this.f85679h - i14)) - 1) / 32;
        if (size == 0) {
            int i15 = i13 & 31;
            int size2 = ((collection.size() + i13) - 1) & 31;
            Object[] objArr = this.f85678g;
            Object[] s13 = s(objArr);
            z.h(size2 + 1, i15, O(), objArr, s13);
            e(s13, i15, collection.iterator());
            this.f85678g = s13;
            this.f85679h = collection.size() + this.f85679h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int O = O();
        int size3 = collection.size() + this.f85679h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i13 >= L()) {
            u13 = u();
            N(collection, i13, this.f85678g, O, objArr2, size, u13);
        } else if (size3 > O) {
            int i16 = size3 - O;
            u13 = t(i16, this.f85678g);
            i(collection, i13, i16, objArr2, size, u13);
        } else {
            Object[] objArr3 = this.f85678g;
            u13 = u();
            int i17 = O - size3;
            z.h(0, i17, O, objArr3, u13);
            int i18 = 32 - i17;
            Object[] t13 = t(i18, this.f85678g);
            int i19 = size - 1;
            objArr2[i19] = t13;
            i(collection, i13, i18, objArr2, i19, t13);
        }
        this.f85677f = A(this.f85677f, i14, objArr2);
        this.f85678g = u13;
        this.f85679h = collection.size() + this.f85679h;
        return true;
    }

    @Override // kotlin.collections.o
    public final int b() {
        return this.f85679h;
    }

    @Override // kotlin.collections.o
    public final Object c(int i13) {
        ue.c.f(i13, b());
        ((AbstractList) this).modCount++;
        int L = L();
        if (i13 >= L) {
            return I(this.f85677f, L, this.f85675d, i13 - L);
        }
        q qVar = new q(this.f85678g[0]);
        Object[] objArr = this.f85677f;
        Intrinsics.f(objArr);
        I(H(objArr, this.f85675d, i13, qVar), L, this.f85675d, 0);
        return qVar.f1449a;
    }

    public final l2.c d() {
        l2.c eVar;
        Object[] objArr = this.f85677f;
        if (objArr == this.f85673b && this.f85678g == this.f85674c) {
            eVar = this.f85672a;
        } else {
            this.f85676e = new p2.b();
            this.f85673b = objArr;
            Object[] objArr2 = this.f85678g;
            this.f85674c = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.f85677f;
                Intrinsics.f(objArr3);
                eVar = new e(b(), this.f85675d, objArr3, this.f85678g);
            } else if (objArr2.length == 0) {
                eVar = j.f85687c;
            } else {
                Object[] copyOf = Arrays.copyOf(this.f85678g, b());
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                eVar = new j(copyOf);
            }
        }
        this.f85672a = eVar;
        return eVar;
    }

    public final int f() {
        return ((AbstractList) this).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i13) {
        Object[] objArr;
        ue.c.f(i13, b());
        if (L() <= i13) {
            objArr = this.f85678g;
        } else {
            objArr = this.f85677f;
            Intrinsics.f(objArr);
            for (int i14 = this.f85675d; i14 > 0; i14 -= 5) {
                Object obj = objArr[d7.b.b0(i13, i14)];
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i13 & 31];
    }

    public final void i(Collection collection, int i13, int i14, Object[][] objArr, int i15, Object[] objArr2) {
        if (this.f85677f == null) {
            throw new IllegalStateException("root is null".toString());
        }
        int i16 = i13 >> 5;
        a r13 = r(L() >> 5);
        int i17 = i15;
        Object[] objArr3 = objArr2;
        while (r13.f85663a - 1 != i16) {
            Object[] objArr4 = (Object[]) r13.previous();
            z.h(0, 32 - i14, 32, objArr4, objArr3);
            objArr3 = t(i14, objArr4);
            i17--;
            objArr[i17] = objArr3;
        }
        Object[] objArr5 = (Object[]) r13.previous();
        int L = i15 - (((L() >> 5) - 1) - i16);
        if (L < i15) {
            objArr2 = objArr[L];
            Intrinsics.f(objArr2);
        }
        N(collection, i13, objArr5, 32, objArr, L, objArr2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object[] j(Object[] objArr, int i13, int i14, Object obj, q qVar) {
        Object obj2;
        int b03 = d7.b.b0(i14, i13);
        if (i13 == 0) {
            qVar.f1449a = objArr[31];
            Object[] s13 = s(objArr);
            z.h(b03 + 1, b03, 31, objArr, s13);
            s13[b03] = obj;
            return s13;
        }
        Object[] s14 = s(objArr);
        int i15 = i13 - 5;
        Object obj3 = s14[b03];
        Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        s14[b03] = j((Object[]) obj3, i15, i14, obj, qVar);
        while (true) {
            b03++;
            if (b03 >= 32 || (obj2 = s14[b03]) == null) {
                break;
            }
            s14[b03] = j((Object[]) obj2, i15, 0, qVar.f1449a, qVar);
        }
        return s14;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void n(int i13, Object obj, Object[] objArr) {
        int O = O();
        Object[] s13 = s(this.f85678g);
        if (O >= 32) {
            Object[] objArr2 = this.f85678g;
            Object obj2 = objArr2[31];
            z.h(i13 + 1, i13, 31, objArr2, s13);
            s13[i13] = obj;
            B(objArr, s13, v(obj2));
            return;
        }
        z.h(i13 + 1, i13, O, this.f85678g, s13);
        s13[i13] = obj;
        this.f85677f = objArr;
        this.f85678g = s13;
        this.f85679h++;
    }

    public final boolean p(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f85676e;
    }

    public final a r(int i13) {
        Object[] objArr = this.f85677f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root".toString());
        }
        int L = L() >> 5;
        ue.c.g(i13, L);
        int i14 = this.f85675d;
        return i14 == 0 ? new i(objArr, i13) : new k(objArr, i13, L, i14 / 5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return G(new b(1, collection));
    }

    public final Object[] s(Object[] objArr) {
        if (objArr == null) {
            return u();
        }
        if (p(objArr)) {
            return objArr;
        }
        Object[] u13 = u();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        z.l(objArr, u13, 0, length, 6);
        return u13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i13, Object obj) {
        ue.c.f(i13, b());
        if (L() > i13) {
            q qVar = new q(null);
            Object[] objArr = this.f85677f;
            Intrinsics.f(objArr);
            this.f85677f = M(objArr, this.f85675d, i13, obj, qVar);
            return qVar.f1449a;
        }
        Object[] s13 = s(this.f85678g);
        if (s13 != this.f85678g) {
            ((AbstractList) this).modCount++;
        }
        int i14 = i13 & 31;
        Object obj2 = s13[i14];
        s13[i14] = obj;
        this.f85678g = s13;
        return obj2;
    }

    public final Object[] t(int i13, Object[] objArr) {
        if (p(objArr)) {
            z.h(i13, 0, 32 - i13, objArr, objArr);
            return objArr;
        }
        Object[] u13 = u();
        z.h(i13, 0, 32 - i13, objArr, u13);
        return u13;
    }

    public final Object[] u() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f85676e;
        return objArr;
    }

    public final Object[] v(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f85676e;
        return objArr;
    }

    public final Object[] w(int i13, int i14, Object[] objArr) {
        if (!(i14 >= 0)) {
            m0.o0("shift should be positive");
            throw null;
        }
        if (i14 == 0) {
            return objArr;
        }
        int b03 = d7.b.b0(i13, i14);
        Object obj = objArr[b03];
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object w13 = w(i13, i14 - 5, (Object[]) obj);
        if (b03 < 31) {
            int i15 = b03 + 1;
            if (objArr[i15] != null) {
                if (p(objArr)) {
                    Intrinsics.checkNotNullParameter(objArr, "<this>");
                    Arrays.fill(objArr, i15, 32, (Object) null);
                }
                Object[] u13 = u();
                z.h(0, 0, i15, objArr, u13);
                objArr = u13;
            }
        }
        if (w13 == objArr[b03]) {
            return objArr;
        }
        Object[] s13 = s(objArr);
        s13[b03] = w13;
        return s13;
    }

    public final Object[] x(Object[] objArr, int i13, int i14, q qVar) {
        Object[] x13;
        int b03 = d7.b.b0(i14 - 1, i13);
        if (i13 == 5) {
            qVar.f1449a = objArr[b03];
            x13 = null;
        } else {
            Object obj = objArr[b03];
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            x13 = x((Object[]) obj, i13 - 5, i14, qVar);
        }
        if (x13 == null && b03 == 0) {
            return null;
        }
        Object[] s13 = s(objArr);
        s13[b03] = x13;
        return s13;
    }

    public final void y(int i13, int i14, Object[] objArr) {
        if (i14 == 0) {
            this.f85677f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f85678g = objArr;
            this.f85679h = i13;
            this.f85675d = i14;
            return;
        }
        q qVar = new q(null);
        Intrinsics.f(objArr);
        Object[] x13 = x(objArr, i14, i13, qVar);
        Intrinsics.f(x13);
        Object obj = qVar.f1449a;
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.f85678g = (Object[]) obj;
        this.f85679h = i13;
        if (x13[1] == null) {
            this.f85677f = (Object[]) x13[0];
            this.f85675d = i14 - 5;
        } else {
            this.f85677f = x13;
            this.f85675d = i14;
        }
    }

    public final Object[] z(Object[] objArr, int i13, int i14, Iterator it) {
        if (!it.hasNext()) {
            m0.o0("invalid buffersIterator");
            throw null;
        }
        if (!(i14 >= 0)) {
            m0.o0("negative shift");
            throw null;
        }
        if (i14 == 0) {
            return (Object[]) it.next();
        }
        Object[] s13 = s(objArr);
        int b03 = d7.b.b0(i13, i14);
        int i15 = i14 - 5;
        s13[b03] = z((Object[]) s13[b03], i13, i15, it);
        while (true) {
            b03++;
            if (b03 >= 32 || !it.hasNext()) {
                break;
            }
            s13[b03] = z((Object[]) s13[b03], 0, i15, it);
        }
        return s13;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i13) {
        ue.c.g(i13, b());
        return new h(this, i13);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int O = O();
        if (O < 32) {
            Object[] s13 = s(this.f85678g);
            s13[O] = obj;
            this.f85678g = s13;
            this.f85679h = b() + 1;
        } else {
            B(this.f85677f, this.f85678g, v(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int O = O();
        Iterator it = collection.iterator();
        if (32 - O >= collection.size()) {
            Object[] s13 = s(this.f85678g);
            e(s13, O, it);
            this.f85678g = s13;
            this.f85679h = collection.size() + this.f85679h;
        } else {
            int size = ((collection.size() + O) - 1) / 32;
            Object[][] objArr = new Object[size][];
            Object[] s14 = s(this.f85678g);
            e(s14, O, it);
            objArr[0] = s14;
            for (int i13 = 1; i13 < size; i13++) {
                Object[] u13 = u();
                e(u13, 0, it);
                objArr[i13] = u13;
            }
            this.f85677f = A(this.f85677f, L(), objArr);
            Object[] u14 = u();
            e(u14, 0, it);
            this.f85678g = u14;
            this.f85679h = collection.size() + this.f85679h;
        }
        return true;
    }
}
