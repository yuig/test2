package androidx.compose.foundation.lazy.layout;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final g1.c0 f17293a;

    /* renamed from: b, reason: collision with root package name */
    public b0 f17294b;

    /* renamed from: c, reason: collision with root package name */
    public final g1.g0 f17295c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f17296d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f17297e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f17298f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f17299g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f17300h;

    /* renamed from: i, reason: collision with root package name */
    public final u2.q f17301i;

    public u() {
        long[] jArr = g1.k0.f63281a;
        this.f17293a = new g1.c0();
        int i13 = g1.n0.f63290a;
        this.f17295c = new g1.g0();
        this.f17296d = new ArrayList();
        this.f17297e = new ArrayList();
        this.f17298f = new ArrayList();
        this.f17299g = new ArrayList();
        this.f17300h = new ArrayList();
        this.f17301i = new s3.e1(this) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$DisplayingDisappearingItemsElement

            /* renamed from: b, reason: collision with root package name */
            public final u f17192b;

            {
                this.f17192b = this;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) && Intrinsics.d(this.f17192b, ((LazyLayoutItemAnimator$DisplayingDisappearingItemsElement) obj).f17192b);
            }

            public final int hashCode() {
                return this.f17192b.hashCode();
            }

            @Override // s3.e1
            public final u2.p l() {
                r rVar = new r();
                rVar.f17279n = this.f17192b;
                return rVar;
            }

            @Override // s3.e1
            public final void m(u2.p pVar) {
                r rVar = (r) pVar;
                u uVar = rVar.f17279n;
                u uVar2 = this.f17192b;
                if (Intrinsics.d(uVar, uVar2) || !rVar.f120042a.f120054m) {
                    return;
                }
                rVar.f17279n.e();
                uVar2.getClass();
                rVar.f17279n = uVar2;
            }

            public final String toString() {
                return "DisplayingDisappearingItemsElement(animator=" + this.f17192b + ')';
            }
        };
    }

    public static int f(int[] iArr, e0 e0Var) {
        int f13 = e0Var.f();
        int b13 = e0Var.b() + f13;
        int i13 = 0;
        while (f13 < b13) {
            int c13 = e0Var.c() + iArr[f13];
            iArr[f13] = c13;
            i13 = Math.max(i13, c13);
            f13++;
        }
        return i13;
    }

    public final void a(int i13, Object obj) {
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(this.f17293a.g(obj));
    }

    public final long b() {
        ArrayList arrayList = this.f17300h;
        if (arrayList.size() <= 0) {
            return 0L;
        }
        ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(arrayList.get(0));
        throw null;
    }

    public final void c(int i13, int i14, int i15, ArrayList arrayList, b0 b0Var, f0 f0Var, boolean z13, boolean z14, int i16, boolean z15, int i17, int i18) {
        int i19;
        b0 b0Var2 = this.f17294b;
        this.f17294b = b0Var;
        int size = arrayList.size();
        int i23 = 0;
        for (int i24 = 0; i24 < size; i24++) {
            e0 e0Var = (e0) arrayList.get(i24);
            int a13 = e0Var.a();
            for (int i25 = 0; i25 < a13; i25++) {
                e0Var.d(i25);
            }
        }
        g1.c0 c0Var = this.f17293a;
        if (c0Var.f63242e == 0) {
            e();
            return;
        }
        e0 e0Var2 = (e0) CollectionsKt.firstOrNull(arrayList);
        if (e0Var2 != null) {
            e0Var2.getIndex();
        }
        if (z13) {
            d7.b.a(0, i13);
        } else {
            d7.b.a(i13, 0);
        }
        boolean z16 = z14 || !z15;
        Object[] objArr = c0Var.f63239b;
        long[] jArr = c0Var.f63238a;
        int length = jArr.length - 2;
        long j13 = 255;
        g1.g0 g0Var = this.f17295c;
        if (length >= 0) {
            while (true) {
                long j14 = jArr[i23];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i26 = 8 - ((~(i23 - length)) >>> 31);
                    int i27 = 0;
                    while (i27 < i26) {
                        if ((j14 & j13) < 128) {
                            g0Var.d(objArr[(i23 << 3) + i27]);
                        }
                        j14 >>= 8;
                        i27++;
                        j13 = 255;
                    }
                    if (i26 != 8) {
                        break;
                    }
                }
                if (i23 == length) {
                    break;
                }
                i23++;
                j13 = 255;
            }
        }
        int size2 = arrayList.size();
        for (int i28 = 0; i28 < size2; i28++) {
            e0 e0Var3 = (e0) arrayList.get(i28);
            g0Var.l(e0Var3.getKey());
            int a14 = e0Var3.a();
            for (int i29 = 0; i29 < a14; i29++) {
                e0Var3.d(i29);
            }
            d(e0Var3.getKey());
        }
        int[] iArr = new int[i16];
        for (int i33 = 0; i33 < i16; i33++) {
            iArr[i33] = 0;
        }
        ArrayList arrayList2 = this.f17297e;
        ArrayList arrayList3 = this.f17296d;
        if (z16 && b0Var2 != null) {
            if (!arrayList3.isEmpty()) {
                if (arrayList3.size() > 1) {
                    kotlin.collections.j0.t(arrayList3, new t(b0Var2, 2));
                }
                if (arrayList3.size() > 0) {
                    e0 e0Var4 = (e0) arrayList3.get(0);
                    f(iArr, e0Var4);
                    Object g13 = c0Var.g(e0Var4.getKey());
                    Intrinsics.f(g13);
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(g13);
                    e0Var4.e(0);
                    throw null;
                }
                i19 = 0;
                kotlin.collections.z.p(iArr, 0);
            } else {
                i19 = 0;
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    kotlin.collections.j0.t(arrayList2, new t(b0Var2, i19));
                }
                if (arrayList2.size() > 0) {
                    e0 e0Var5 = (e0) arrayList2.get(i19);
                    f(iArr, e0Var5);
                    Object g14 = c0Var.g(e0Var5.getKey());
                    Intrinsics.f(g14);
                    ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(g14);
                    e0Var5.e(i19);
                    throw null;
                }
                kotlin.collections.z.p(iArr, i19);
            }
        }
        Object[] objArr2 = g0Var.f63286b;
        long[] jArr2 = g0Var.f63285a;
        int length2 = jArr2.length - 2;
        ArrayList arrayList4 = this.f17299g;
        ArrayList arrayList5 = this.f17298f;
        if (length2 >= 0) {
            int i34 = length2;
            int i35 = 0;
            while (true) {
                long j15 = jArr2[i35];
                int i36 = i35;
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i37 = 8;
                    int i38 = 8 - ((~(i36 - i34)) >>> 31);
                    long j16 = j15;
                    int i39 = 0;
                    while (i39 < i38) {
                        if ((j16 & 255) < 128) {
                            Object obj = objArr2[(i36 << 3) + i39];
                            Object g15 = c0Var.g(obj);
                            Intrinsics.f(g15);
                            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(g15);
                            b0Var.b(obj);
                            throw null;
                        }
                        j16 >>= i37;
                        i39++;
                        i37 = 8;
                    }
                    if (i38 != i37) {
                        break;
                    }
                }
                int i43 = i34;
                if (i36 == i43) {
                    break;
                }
                i35 = i36 + 1;
                i34 = i43;
            }
        }
        if (!arrayList5.isEmpty()) {
            if (arrayList5.size() > 1) {
                kotlin.collections.j0.t(arrayList5, new t(b0Var, 3));
            }
            if (arrayList5.size() > 0) {
                e0 e0Var6 = (e0) arrayList5.get(0);
                Object g16 = c0Var.g(e0Var6.getKey());
                Intrinsics.f(g16);
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(g16);
                f(iArr, e0Var6);
                if (!z14) {
                    throw null;
                }
                ((e0) CollectionsKt.S(arrayList)).e(0);
                throw null;
            }
            kotlin.collections.z.p(iArr, 0);
        }
        if (!arrayList4.isEmpty()) {
            if (arrayList4.size() > 1) {
                kotlin.collections.j0.t(arrayList4, new t(b0Var, 1));
            }
            if (arrayList4.size() > 0) {
                e0 e0Var7 = (e0) arrayList4.get(0);
                Object g17 = c0Var.g(e0Var7.getKey());
                Intrinsics.f(g17);
                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(g17);
                f(iArr, e0Var7);
                if (!z14) {
                    throw null;
                }
                ((e0) CollectionsKt.b0(arrayList)).e(0);
                throw null;
            }
        }
        Intrinsics.checkNotNullParameter(arrayList5, "<this>");
        Collections.reverse(arrayList5);
        Unit unit = Unit.f80348a;
        arrayList.addAll(0, arrayList5);
        arrayList.addAll(arrayList4);
        arrayList3.clear();
        arrayList2.clear();
        arrayList5.clear();
        arrayList4.clear();
        g0Var.f();
    }

    public final void d(Object obj) {
    }

    public final void e() {
        g1.c0 c0Var = this.f17293a;
        if (c0Var.f63242e != 0) {
            Object[] objArr = c0Var.f63240c;
            long[] jArr = c0Var.f63238a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i13 = 0;
                while (true) {
                    long j13 = jArr[i13];
                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((255 & j13) < 128) {
                                ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(objArr[(i13 << 3) + i15]);
                                throw null;
                            }
                            j13 >>= 8;
                        }
                        if (i14 != 8) {
                            break;
                        }
                    }
                    if (i13 == length) {
                        break;
                    } else {
                        i13++;
                    }
                }
            }
            c0Var.a();
        }
        this.f17294b = a0.f17206a;
    }
}
