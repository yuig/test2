package m2;

import a8.q;
import ao2.m0;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.collections.z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends c {

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f85668b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f85669c;

    /* renamed from: d, reason: collision with root package name */
    public final int f85670d;

    /* renamed from: e, reason: collision with root package name */
    public final int f85671e;

    public e(int i13, int i14, Object[] objArr, Object[] objArr2) {
        this.f85668b = objArr;
        this.f85669c = objArr2;
        this.f85670d = i13;
        this.f85671e = i14;
        if (b() > 32) {
            int length = objArr2.length;
            return;
        }
        m0.o0("Trie-based persistent vector should have at least 33 elements, got " + b());
        throw null;
    }

    public static Object[] d(Object[] objArr, int i13, int i14, Object obj, q qVar) {
        Object[] copyOf;
        int b03 = d7.b.b0(i14, i13);
        if (i13 == 0) {
            if (b03 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            }
            z.h(b03 + 1, b03, 31, objArr, copyOf);
            qVar.f1449a = objArr[31];
            copyOf[b03] = obj;
            return copyOf;
        }
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        int i15 = i13 - 5;
        Object obj2 = objArr[b03];
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[b03] = d((Object[]) obj2, i15, i14, obj, qVar);
        while (true) {
            b03++;
            if (b03 >= 32 || copyOf2[b03] == null) {
                break;
            }
            Object obj3 = objArr[b03];
            Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf2[b03] = d((Object[]) obj3, i15, 0, qVar.f1449a, qVar);
        }
        return copyOf2;
    }

    public static Object[] f(Object[] objArr, int i13, int i14, q qVar) {
        Object[] f13;
        int b03 = d7.b.b0(i14, i13);
        if (i13 == 5) {
            qVar.f1449a = objArr[b03];
            f13 = null;
        } else {
            Object obj = objArr[b03];
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            f13 = f((Object[]) obj, i13 - 5, i14, qVar);
        }
        if (f13 == null && b03 == 0) {
            return null;
        }
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        copyOf[b03] = f13;
        return copyOf;
    }

    public static Object[] s(int i13, int i14, Object obj, Object[] objArr) {
        int b03 = d7.b.b0(i14, i13);
        Object[] copyOf = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        if (i13 == 0) {
            copyOf[b03] = obj;
        } else {
            Object obj2 = copyOf[b03];
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            copyOf[b03] = s(i13 - 5, i14, obj, (Object[]) obj2);
        }
        return copyOf;
    }

    @Override // l2.c
    public final l2.c P(b bVar) {
        f q13 = q();
        q13.G(bVar);
        return q13.d();
    }

    @Override // l2.c
    public final l2.c W(int i13) {
        ue.c.f(i13, this.f85670d);
        int r13 = r();
        Object[] objArr = this.f85668b;
        int i14 = this.f85671e;
        return i13 >= r13 ? p(objArr, r13, i14, i13 - r13) : p(n(objArr, i14, i13, new q(this.f85669c[0])), r13, i14, 0);
    }

    @Override // java.util.Collection, java.util.List, l2.c
    public final l2.c add(Object obj) {
        int r13 = r();
        int i13 = this.f85670d;
        int i14 = i13 - r13;
        Object[] objArr = this.f85668b;
        Object[] objArr2 = this.f85669c;
        if (i14 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return i(objArr, objArr2, objArr3);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        copyOf[i14] = obj;
        return new e(i13 + 1, this.f85671e, objArr, copyOf);
    }

    @Override // kotlin.collections.b
    public final int b() {
        return this.f85670d;
    }

    @Override // l2.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final f q() {
        return new f(this, this.f85668b, this.f85669c, this.f85671e);
    }

    public final e e(int i13, Object obj, Object[] objArr) {
        int r13 = r();
        int i14 = this.f85670d;
        int i15 = i14 - r13;
        Object[] objArr2 = this.f85669c;
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        if (i15 < 32) {
            z.h(i13 + 1, i13, i15, objArr2, copyOf);
            copyOf[i13] = obj;
            return new e(i14 + 1, this.f85671e, objArr, copyOf);
        }
        Object obj2 = objArr2[31];
        z.h(i13 + 1, i13, i15 - 1, objArr2, copyOf);
        copyOf[i13] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return i(objArr, copyOf, objArr3);
    }

    @Override // java.util.List
    public final Object get(int i13) {
        Object[] objArr;
        ue.c.f(i13, b());
        if (r() <= i13) {
            objArr = this.f85669c;
        } else {
            objArr = this.f85668b;
            for (int i14 = this.f85671e; i14 > 0; i14 -= 5) {
                Object obj = objArr[d7.b.b0(i13, i14)];
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i13 & 31];
    }

    public final e i(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i13 = this.f85670d;
        int i14 = i13 >> 5;
        int i15 = this.f85671e;
        if (i14 <= (1 << i15)) {
            return new e(i13 + 1, i15, j(i15, objArr, objArr2), objArr3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i16 = i15 + 5;
        return new e(i13 + 1, i16, j(i16, objArr4, objArr2), objArr3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r5 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object[] j(int r4, java.lang.Object[] r5, java.lang.Object[] r6) {
        /*
            r3 = this;
            int r0 = r3.b()
            int r0 = r0 + (-1)
            int r0 = d7.b.b0(r0, r4)
            r1 = 32
            if (r5 == 0) goto L19
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            if (r5 != 0) goto L1b
        L19:
            java.lang.Object[] r5 = new java.lang.Object[r1]
        L1b:
            r1 = 5
            if (r4 != r1) goto L21
            r5[r0] = r6
            goto L2c
        L21:
            r2 = r5[r0]
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r4 = r4 - r1
            java.lang.Object[] r4 = r3.j(r4, r2, r6)
            r5[r0] = r4
        L2c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.e.j(int, java.lang.Object[], java.lang.Object[]):java.lang.Object[]");
    }

    @Override // kotlin.collections.h, java.util.List
    public final ListIterator listIterator(int i13) {
        ue.c.g(i13, b());
        return new g(i13, b(), (this.f85671e / 5) + 1, this.f85668b, this.f85669c);
    }

    public final Object[] n(Object[] objArr, int i13, int i14, q qVar) {
        Object[] copyOf;
        int b03 = d7.b.b0(i14, i13);
        if (i13 == 0) {
            if (b03 == 0) {
                copyOf = new Object[32];
            } else {
                copyOf = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            }
            z.h(b03, b03 + 1, 32, objArr, copyOf);
            copyOf[31] = qVar.f1449a;
            qVar.f1449a = objArr[b03];
            return copyOf;
        }
        int b04 = objArr[31] == null ? d7.b.b0(r() - 1, i13) : 31;
        Object[] copyOf2 = Arrays.copyOf(objArr, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
        int i15 = i13 - 5;
        int i16 = b03 + 1;
        if (i16 <= b04) {
            while (true) {
                Object obj = copyOf2[b04];
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                copyOf2[b04] = n((Object[]) obj, i15, 0, qVar);
                if (b04 == i16) {
                    break;
                }
                b04--;
            }
        }
        Object obj2 = copyOf2[b03];
        Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        copyOf2[b03] = n((Object[]) obj2, i15, i14, qVar);
        return copyOf2;
    }

    public final c p(Object[] objArr, int i13, int i14, int i15) {
        e eVar;
        int i16 = this.f85670d - i13;
        if (i16 != 1) {
            Object[] objArr2 = this.f85669c;
            Object[] copyOf = Arrays.copyOf(objArr2, 32);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            int i17 = i16 - 1;
            if (i15 < i17) {
                z.h(i15, i15 + 1, i16, objArr2, copyOf);
            }
            copyOf[i17] = null;
            return new e((i13 + i16) - 1, i14, objArr, copyOf);
        }
        if (i14 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
            }
            return new j(objArr);
        }
        q qVar = new q(null);
        Object[] f13 = f(objArr, i14, i13 - 1, qVar);
        Intrinsics.f(f13);
        Object obj = qVar.f1449a;
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj;
        if (f13[1] == null) {
            Object obj2 = f13[0];
            Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            eVar = new e(i13, i14 - 5, (Object[]) obj2, objArr3);
        } else {
            eVar = new e(i13, i14, f13, objArr3);
        }
        return eVar;
    }

    public final int r() {
        return (this.f85670d - 1) & (-32);
    }

    @Override // kotlin.collections.h, java.util.List
    public final l2.c set(int i13, Object obj) {
        int i14 = this.f85670d;
        ue.c.f(i13, i14);
        int r13 = r();
        Object[] objArr = this.f85668b;
        Object[] objArr2 = this.f85669c;
        int i15 = this.f85671e;
        if (r13 > i13) {
            return new e(i14, i15, s(i15, i13, obj, objArr), objArr2);
        }
        Object[] copyOf = Arrays.copyOf(objArr2, 32);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
        copyOf[i13 & 31] = obj;
        return new e(i14, i15, objArr, copyOf);
    }

    @Override // java.util.List, l2.c
    public final l2.c add(int i13, Object obj) {
        int i14 = this.f85670d;
        ue.c.g(i13, i14);
        if (i13 == i14) {
            return add(obj);
        }
        int r13 = r();
        Object[] objArr = this.f85668b;
        if (i13 >= r13) {
            return e(i13 - r13, obj, objArr);
        }
        q qVar = new q(null);
        return e(0, qVar.f1449a, d(objArr, this.f85671e, i13, obj, qVar));
    }
}
