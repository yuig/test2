package n2;

import ao2.m0;
import java.util.Arrays;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: e */
    public static final r f88954e = new r(0, 0, new Object[0], null);

    /* renamed from: a */
    public int f88955a;

    /* renamed from: b */
    public int f88956b;

    /* renamed from: c */
    public final p2.b f88957c;

    /* renamed from: d */
    public Object[] f88958d;

    public r(int i13, int i14, Object[] objArr, p2.b bVar) {
        this.f88955a = i13;
        this.f88956b = i14;
        this.f88957c = bVar;
        this.f88958d = objArr;
    }

    public static r m(int i13, Object obj, Object obj2, int i14, Object obj3, Object obj4, int i15, p2.b bVar) {
        if (i15 > 30) {
            return new r(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int D0 = l0.D0(i13, i15);
        int D02 = l0.D0(i14, i15);
        if (D0 != D02) {
            return new r((1 << D0) | (1 << D02), 0, D0 < D02 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new r(0, 1 << D0, new Object[]{m(i13, obj, obj2, i14, obj3, obj4, i15 + 5, bVar)}, bVar);
    }

    public final r A(int i13) {
        Object obj = this.f88958d[i13];
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (r) obj;
    }

    public final int B(int i13) {
        return (this.f88958d.length - 1) - Integer.bitCount((i13 - 1) & this.f88956b);
    }

    public final q C(int i13, Object obj, Object obj2, int i14) {
        q C;
        int D0 = 1 << l0.D0(i13, i14);
        if (k(D0)) {
            int i15 = i(D0);
            if (!Intrinsics.d(obj, this.f88958d[i15])) {
                return new q(n(i15, D0, i13, obj, obj2, i14), 1);
            }
            if (G(i15) == obj2) {
                return null;
            }
            return F(i15, obj2).a();
        }
        if (!l(D0)) {
            return new q(new r(this.f88955a | D0, this.f88956b, l0.l(this.f88958d, i(D0), obj, obj2), null), 1);
        }
        int B = B(D0);
        r A = A(B);
        if (i14 == 30) {
            C = A.f(obj, obj2);
            if (C == null) {
                return null;
            }
        } else {
            C = A.C(i13, obj, obj2, i14 + 5);
            if (C == null) {
                return null;
            }
        }
        C.a(E(B, D0, C.f88952a));
        return C;
    }

    public final r D(int i13, h1.b bVar, int i14) {
        r D;
        int D0 = 1 << l0.D0(i13, i14);
        if (k(D0)) {
            int i15 = i(D0);
            if (!Intrinsics.d(bVar, this.f88958d[i15])) {
                return this;
            }
            Object[] objArr = this.f88958d;
            if (objArr.length == 2) {
                return null;
            }
            return new r(this.f88955a ^ D0, this.f88956b, l0.q(i15, objArr), null);
        }
        if (!l(D0)) {
            return this;
        }
        int B = B(D0);
        r A = A(B);
        if (i14 == 30) {
            kotlin.ranges.a p13 = ql2.s.p(ql2.s.q(0, A.f88958d.length), 2);
            int i16 = p13.f80453a;
            int i17 = p13.f80454b;
            int i18 = p13.f80455c;
            if ((i18 > 0 && i16 <= i17) || (i18 < 0 && i17 <= i16)) {
                while (!Intrinsics.d(bVar, A.f88958d[i16])) {
                    if (i16 != i17) {
                        i16 += i18;
                    }
                }
                Object[] objArr2 = A.f88958d;
                D = objArr2.length == 2 ? null : new r(0, 0, l0.q(i16, objArr2), null);
            }
            D = A;
            break;
        }
        D = A.D(i13, bVar, i14 + 5);
        if (D != null) {
            return A != D ? E(B, D0, D) : this;
        }
        Object[] objArr3 = this.f88958d;
        if (objArr3.length == 1) {
            return null;
        }
        return new r(this.f88955a, D0 ^ this.f88956b, l0.r(B, objArr3), null);
    }

    public final r E(int i13, int i14, r rVar) {
        Object[] objArr = rVar.f88958d;
        if (objArr.length != 2 || rVar.f88956b != 0) {
            Object[] objArr2 = this.f88958d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            copyOf[i13] = rVar;
            return new r(this.f88955a, this.f88956b, copyOf, null);
        }
        if (this.f88958d.length == 1) {
            rVar.f88955a = this.f88956b;
            return rVar;
        }
        int i15 = i(i14);
        Object[] objArr3 = this.f88958d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        z.h(i13 + 2, i13 + 1, objArr3.length, copyOf2, copyOf2);
        z.h(i15 + 2, i15, i13, copyOf2, copyOf2);
        copyOf2[i15] = obj;
        copyOf2[i15 + 1] = obj2;
        return new r(this.f88955a ^ i14, i14 ^ this.f88956b, copyOf2, null);
    }

    public final r F(int i13, Object obj) {
        Object[] objArr = this.f88958d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i13 + 1] = obj;
        return new r(this.f88955a, this.f88956b, copyOf, null);
    }

    public final Object G(int i13) {
        return this.f88958d[i13 + 1];
    }

    public final q a() {
        return new q(this, 0);
    }

    public final Object[] b(int i13, int i14, int i15, Object obj, Object obj2, int i16, p2.b bVar) {
        Object obj3 = this.f88958d[i13];
        r m13 = m(obj3 != null ? obj3.hashCode() : 0, obj3, G(i13), i15, obj, obj2, i16 + 5, bVar);
        int B = B(i14);
        int i17 = B + 1;
        Object[] objArr = this.f88958d;
        Object[] objArr2 = new Object[objArr.length - 1];
        z.l(objArr, objArr2, 0, i13, 6);
        z.h(i13, i13 + 2, i17, objArr, objArr2);
        objArr2[B - 1] = m13;
        z.h(B, i17, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int c() {
        if (this.f88956b == 0) {
            return this.f88958d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f88955a);
        int length = this.f88958d.length;
        for (int i13 = bitCount * 2; i13 < length; i13++) {
            bitCount += A(i13).c();
        }
        return bitCount;
    }

    public final boolean d(Object obj) {
        kotlin.ranges.a p13 = ql2.s.p(ql2.s.q(0, this.f88958d.length), 2);
        int i13 = p13.f80453a;
        int i14 = p13.f80454b;
        int i15 = p13.f80455c;
        if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
            while (!Intrinsics.d(obj, this.f88958d[i13])) {
                if (i13 != i14) {
                    i13 += i15;
                }
            }
            return true;
        }
        return false;
    }

    public final Object e(Object obj) {
        kotlin.ranges.a p13 = ql2.s.p(ql2.s.q(0, this.f88958d.length), 2);
        int i13 = p13.f80453a;
        int i14 = p13.f80454b;
        int i15 = p13.f80455c;
        if ((i15 <= 0 || i13 > i14) && (i15 >= 0 || i14 > i13)) {
            return null;
        }
        while (!Intrinsics.d(obj, this.f88958d[i13])) {
            if (i13 == i14) {
                return null;
            }
            i13 += i15;
        }
        return G(i13);
    }

    public final q f(Object obj, Object obj2) {
        kotlin.ranges.a p13 = ql2.s.p(ql2.s.q(0, this.f88958d.length), 2);
        int i13 = p13.f80453a;
        int i14 = p13.f80454b;
        int i15 = p13.f80455c;
        if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
            while (!Intrinsics.d(obj, this.f88958d[i13])) {
                if (i13 != i14) {
                    i13 += i15;
                }
            }
            if (obj2 == G(i13)) {
                return null;
            }
            Object[] objArr = this.f88958d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[i13 + 1] = obj2;
            return new r(0, 0, copyOf, null).a();
        }
        return new q(new r(0, 0, l0.l(this.f88958d, 0, obj, obj2), null), 1);
    }

    public final boolean g(int i13, Object obj, int i14) {
        int D0 = 1 << l0.D0(i13, i14);
        if (k(D0)) {
            return Intrinsics.d(obj, this.f88958d[i(D0)]);
        }
        if (!l(D0)) {
            return false;
        }
        r A = A(B(D0));
        return i14 == 30 ? A.d(obj) : A.g(i13, obj, i14 + 5);
    }

    public final boolean h(r rVar) {
        if (this == rVar) {
            return true;
        }
        if (this.f88956b != rVar.f88956b || this.f88955a != rVar.f88955a) {
            return false;
        }
        int length = this.f88958d.length;
        for (int i13 = 0; i13 < length; i13++) {
            if (this.f88958d[i13] != rVar.f88958d[i13]) {
                return false;
            }
        }
        return true;
    }

    public final int i(int i13) {
        return Integer.bitCount((i13 - 1) & this.f88955a) * 2;
    }

    public final Object j(int i13, Object obj, int i14) {
        int D0 = 1 << l0.D0(i13, i14);
        if (k(D0)) {
            int i15 = i(D0);
            if (Intrinsics.d(obj, this.f88958d[i15])) {
                return G(i15);
            }
            return null;
        }
        if (!l(D0)) {
            return null;
        }
        r A = A(B(D0));
        return i14 == 30 ? A.e(obj) : A.j(i13, obj, i14 + 5);
    }

    public final boolean k(int i13) {
        return (i13 & this.f88955a) != 0;
    }

    public final boolean l(int i13) {
        return (i13 & this.f88956b) != 0;
    }

    public final r n(int i13, int i14, int i15, Object obj, Object obj2, int i16) {
        return new r(this.f88955a ^ i14, i14 | this.f88956b, b(i13, i14, i15, obj, obj2, i16, null), null);
    }

    public final r o(Object obj, Object obj2, f fVar) {
        kotlin.ranges.a p13 = ql2.s.p(ql2.s.q(0, this.f88958d.length), 2);
        int i13 = p13.f80453a;
        int i14 = p13.f80454b;
        int i15 = p13.f80455c;
        if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
            while (!Intrinsics.d(obj, this.f88958d[i13])) {
                if (i13 != i14) {
                    i13 += i15;
                }
            }
            fVar.f88938c = G(i13);
            if (this.f88957c == fVar.f88936a) {
                this.f88958d[i13 + 1] = obj2;
                return this;
            }
            fVar.f88939d++;
            Object[] objArr = this.f88958d;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
            copyOf[i13 + 1] = obj2;
            return new r(0, 0, copyOf, fVar.f88936a);
        }
        fVar.g(fVar.f88940e + 1);
        return new r(0, 0, l0.l(this.f88958d, 0, obj, obj2), fVar.f88936a);
    }

    public final r p(r rVar, p2.a aVar, p2.b bVar) {
        Object[] objArr = this.f88958d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length + rVar.f88958d.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        int length = this.f88958d.length;
        kotlin.ranges.a p13 = ql2.s.p(ql2.s.q(0, rVar.f88958d.length), 2);
        int i13 = p13.f80453a;
        int i14 = p13.f80454b;
        int i15 = p13.f80455c;
        if ((i15 > 0 && i13 <= i14) || (i15 < 0 && i14 <= i13)) {
            while (true) {
                if (d(rVar.f88958d[i13])) {
                    aVar.f98684a++;
                } else {
                    Object[] objArr2 = rVar.f88958d;
                    copyOf[length] = objArr2[i13];
                    copyOf[length + 1] = objArr2[i13 + 1];
                    length += 2;
                }
                if (i13 == i14) {
                    break;
                }
                i13 += i15;
            }
        }
        if (length == this.f88958d.length) {
            return this;
        }
        if (length == rVar.f88958d.length) {
            return rVar;
        }
        if (length == copyOf.length) {
            return new r(0, 0, copyOf, bVar);
        }
        Object[] copyOf2 = Arrays.copyOf(copyOf, length);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        return new r(0, 0, copyOf2, bVar);
    }

    public final r q(int i13, f fVar) {
        fVar.g(fVar.d() - 1);
        fVar.f88938c = G(i13);
        Object[] objArr = this.f88958d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f88957c != fVar.f88936a) {
            return new r(0, 0, l0.q(i13, objArr), fVar.f88936a);
        }
        this.f88958d = l0.q(i13, objArr);
        return this;
    }

    public final r r(int i13, int i14, int i15, Object obj, Object obj2, int i16, p2.b bVar) {
        if (this.f88957c != bVar) {
            return new r(this.f88955a ^ i14, i14 | this.f88956b, b(i13, i14, i15, obj, obj2, i16, bVar), bVar);
        }
        this.f88958d = b(i13, i14, i15, obj, obj2, i16, bVar);
        this.f88955a ^= i14;
        this.f88956b |= i14;
        return this;
    }

    public final r s(int i13, Object obj, Object obj2, int i14, f fVar) {
        int D0 = 1 << l0.D0(i13, i14);
        if (k(D0)) {
            int i15 = i(D0);
            if (Intrinsics.d(obj, this.f88958d[i15])) {
                fVar.f(G(i15));
                return G(i15) == obj2 ? this : z(i15, obj2, fVar);
            }
            fVar.g(fVar.d() + 1);
            return r(i15, D0, i13, obj, obj2, i14, fVar.f88936a);
        }
        if (l(D0)) {
            int B = B(D0);
            r A = A(B);
            r o13 = i14 == 30 ? A.o(obj, obj2, fVar) : A.s(i13, obj, obj2, i14 + 5, fVar);
            return A == o13 ? this : y(B, o13, fVar.f88936a);
        }
        fVar.g(fVar.d() + 1);
        p2.b bVar = fVar.f88936a;
        int i16 = i(D0);
        if (this.f88957c != bVar) {
            return new r(this.f88955a | D0, this.f88956b, l0.l(this.f88958d, i16, obj, obj2), bVar);
        }
        this.f88958d = l0.l(this.f88958d, i16, obj, obj2);
        this.f88955a |= D0;
        return this;
    }

    public final r t(r rVar, int i13, p2.a aVar, f fVar) {
        Object[] objArr;
        int i14;
        r m13;
        if (this == rVar) {
            aVar.a(c());
            return this;
        }
        if (i13 > 30) {
            return p(rVar, aVar, fVar.f88936a);
        }
        int i15 = this.f88956b | rVar.f88956b;
        int i16 = this.f88955a;
        int i17 = rVar.f88955a;
        int i18 = (i16 ^ i17) & (~i15);
        int i19 = i16 & i17;
        int i23 = i18;
        while (i19 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i19);
            if (Intrinsics.d(this.f88958d[i(lowestOneBit)], rVar.f88958d[rVar.i(lowestOneBit)])) {
                i23 |= lowestOneBit;
            } else {
                i15 |= lowestOneBit;
            }
            i19 ^= lowestOneBit;
        }
        if (!((i15 & i23) == 0)) {
            m0.p0("Check failed.");
            throw null;
        }
        r rVar2 = (Intrinsics.d(this.f88957c, fVar.f88936a) && this.f88955a == i23 && this.f88956b == i15) ? this : new r(i23, i15, new Object[Integer.bitCount(i15) + (Integer.bitCount(i23) * 2)], null);
        int i24 = i15;
        int i25 = 0;
        while (i24 != 0) {
            int lowestOneBit2 = Integer.lowestOneBit(i24);
            Object[] objArr2 = rVar2.f88958d;
            int length = (objArr2.length - 1) - i25;
            if (l(lowestOneBit2)) {
                m13 = A(B(lowestOneBit2));
                if (rVar.l(lowestOneBit2)) {
                    m13 = m13.t(rVar.A(rVar.B(lowestOneBit2)), i13 + 5, aVar, fVar);
                } else if (rVar.k(lowestOneBit2)) {
                    int i26 = rVar.i(lowestOneBit2);
                    Object obj = rVar.f88958d[i26];
                    Object G = rVar.G(i26);
                    int i27 = fVar.f88940e;
                    objArr = objArr2;
                    m13 = m13.s(obj != null ? obj.hashCode() : 0, obj, G, i13 + 5, fVar);
                    if (fVar.f88940e == i27) {
                        aVar.b(aVar.f98684a + 1);
                    }
                    i14 = lowestOneBit2;
                }
                objArr = objArr2;
                i14 = lowestOneBit2;
            } else {
                objArr = objArr2;
                i14 = lowestOneBit2;
                if (rVar.l(i14)) {
                    m13 = rVar.A(rVar.B(i14));
                    if (k(i14)) {
                        int i28 = i(i14);
                        Object obj2 = this.f88958d[i28];
                        int i29 = i13 + 5;
                        if (m13.g(obj2 != null ? obj2.hashCode() : 0, obj2, i29)) {
                            aVar.b(aVar.f98684a + 1);
                        } else {
                            m13 = m13.s(obj2 != null ? obj2.hashCode() : 0, obj2, G(i28), i29, fVar);
                        }
                    }
                } else {
                    int i33 = i(i14);
                    Object obj3 = this.f88958d[i33];
                    Object G2 = G(i33);
                    int i34 = rVar.i(i14);
                    Object obj4 = rVar.f88958d[i34];
                    m13 = m(obj3 != null ? obj3.hashCode() : 0, obj3, G2, obj4 != null ? obj4.hashCode() : 0, obj4, rVar.G(i34), i13 + 5, fVar.f88936a);
                }
            }
            objArr[length] = m13;
            i25++;
            i24 ^= i14;
        }
        int i35 = 0;
        while (i23 != 0) {
            int lowestOneBit3 = Integer.lowestOneBit(i23);
            int i36 = i35 * 2;
            if (rVar.k(lowestOneBit3)) {
                int i37 = rVar.i(lowestOneBit3);
                Object[] objArr3 = rVar2.f88958d;
                objArr3[i36] = rVar.f88958d[i37];
                objArr3[i36 + 1] = rVar.G(i37);
                if (k(lowestOneBit3)) {
                    aVar.b(aVar.f98684a + 1);
                }
            } else {
                int i38 = i(lowestOneBit3);
                Object[] objArr4 = rVar2.f88958d;
                objArr4[i36] = this.f88958d[i38];
                objArr4[i36 + 1] = G(i38);
            }
            i35++;
            i23 ^= lowestOneBit3;
        }
        return h(rVar2) ? this : rVar.h(rVar2) ? rVar : rVar2;
    }

    public final r u(int i13, Object obj, int i14, f fVar) {
        r u13;
        int D0 = 1 << l0.D0(i13, i14);
        if (k(D0)) {
            int i15 = i(D0);
            return Intrinsics.d(obj, this.f88958d[i15]) ? w(i15, D0, fVar) : this;
        }
        if (!l(D0)) {
            return this;
        }
        int B = B(D0);
        r A = A(B);
        if (i14 == 30) {
            kotlin.ranges.a p13 = ql2.s.p(ql2.s.q(0, A.f88958d.length), 2);
            int i16 = p13.f80453a;
            int i17 = p13.f80454b;
            int i18 = p13.f80455c;
            if ((i18 > 0 && i16 <= i17) || (i18 < 0 && i17 <= i16)) {
                while (!Intrinsics.d(obj, A.f88958d[i16])) {
                    if (i16 != i17) {
                        i16 += i18;
                    }
                }
                u13 = A.q(i16, fVar);
            }
            u13 = A;
            break;
        }
        u13 = A.u(i13, obj, i14 + 5, fVar);
        return x(A, u13, B, D0, fVar.f88936a);
    }

    public final r v(int i13, Object obj, Object obj2, int i14, f fVar) {
        r v13;
        int D0 = 1 << l0.D0(i13, i14);
        if (k(D0)) {
            int i15 = i(D0);
            return (Intrinsics.d(obj, this.f88958d[i15]) && Intrinsics.d(obj2, G(i15))) ? w(i15, D0, fVar) : this;
        }
        if (!l(D0)) {
            return this;
        }
        int B = B(D0);
        r A = A(B);
        if (i14 == 30) {
            kotlin.ranges.a p13 = ql2.s.p(ql2.s.q(0, A.f88958d.length), 2);
            int i16 = p13.f80453a;
            int i17 = p13.f80454b;
            int i18 = p13.f80455c;
            if ((i18 > 0 && i16 <= i17) || (i18 < 0 && i17 <= i16)) {
                while (true) {
                    if (!Intrinsics.d(obj, A.f88958d[i16]) || !Intrinsics.d(obj2, A.G(i16))) {
                        if (i16 == i17) {
                            break;
                        }
                        i16 += i18;
                    } else {
                        v13 = A.q(i16, fVar);
                        break;
                    }
                }
            }
            v13 = A;
        } else {
            v13 = A.v(i13, obj, obj2, i14 + 5, fVar);
        }
        return x(A, v13, B, D0, fVar.f88936a);
    }

    public final r w(int i13, int i14, f fVar) {
        fVar.g(fVar.d() - 1);
        fVar.f88938c = G(i13);
        Object[] objArr = this.f88958d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f88957c != fVar.f88936a) {
            return new r(i14 ^ this.f88955a, this.f88956b, l0.q(i13, objArr), fVar.f88936a);
        }
        this.f88958d = l0.q(i13, objArr);
        this.f88955a ^= i14;
        return this;
    }

    public final r x(r rVar, r rVar2, int i13, int i14, p2.b bVar) {
        p2.b bVar2 = this.f88957c;
        if (rVar2 == null) {
            Object[] objArr = this.f88958d;
            if (objArr.length == 1) {
                return null;
            }
            if (bVar2 != bVar) {
                return new r(this.f88955a, i14 ^ this.f88956b, l0.r(i13, objArr), bVar);
            }
            this.f88958d = l0.r(i13, objArr);
            this.f88956b ^= i14;
        } else if (bVar2 == bVar || rVar != rVar2) {
            return y(i13, rVar2, bVar);
        }
        return this;
    }

    public final r y(int i13, r rVar, p2.b bVar) {
        Object[] objArr = this.f88958d;
        if (objArr.length == 1 && rVar.f88958d.length == 2 && rVar.f88956b == 0) {
            rVar.f88955a = this.f88956b;
            return rVar;
        }
        if (this.f88957c == bVar) {
            objArr[i13] = rVar;
            return this;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i13] = rVar;
        return new r(this.f88955a, this.f88956b, copyOf, bVar);
    }

    public final r z(int i13, Object obj, f fVar) {
        if (this.f88957c == fVar.f88936a) {
            this.f88958d[i13 + 1] = obj;
            return this;
        }
        fVar.f88939d++;
        Object[] objArr = this.f88958d;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        copyOf[i13 + 1] = obj;
        return new r(this.f88955a, this.f88956b, copyOf, fVar.f88936a);
    }
}
