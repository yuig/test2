package i2;

import android.os.Trace;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class m2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o2 f71172i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g1.g0 f71173j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g1.g0 f71174k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f71175l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List f71176m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ g1.g0 f71177n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f71178o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g1.g0 f71179p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Set f71180q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(o2 o2Var, g1.g0 g0Var, g1.g0 g0Var2, List list, List list2, g1.g0 g0Var3, List list3, g1.g0 g0Var4, Set set) {
        super(1);
        this.f71172i = o2Var;
        this.f71173j = g0Var;
        this.f71174k = g0Var2;
        this.f71175l = list;
        this.f71176m = list2;
        this.f71177n = g0Var3;
        this.f71178o = list3;
        this.f71179p = g0Var4;
        this.f71180q = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean y13;
        g1.g0 g0Var;
        g1.g0 g0Var2;
        List D;
        o2 o2Var;
        o2 o2Var2;
        g1.g0 g0Var3;
        g1.g0 g0Var4;
        boolean z13;
        long longValue = ((Number) obj).longValue();
        o2 o2Var3 = this.f71172i;
        synchronized (o2Var3.f71209b) {
            y13 = o2Var3.y();
        }
        if (y13) {
            o2 o2Var4 = this.f71172i;
            Trace.beginSection("Recomposer:animation");
            try {
                o2Var4.f71208a.b(longValue);
                synchronized (s2.p.f110667b) {
                    g1.g0 g0Var5 = ((s2.b) s2.p.f110674i.get()).f110610h;
                    if (g0Var5 != null) {
                        z13 = g0Var5.c();
                    }
                }
                if (z13) {
                    s2.p.a();
                }
                Unit unit = Unit.f80348a;
            } finally {
            }
        }
        o2 o2Var5 = this.f71172i;
        g1.g0 g0Var6 = this.f71173j;
        g1.g0 g0Var7 = this.f71174k;
        List list = this.f71175l;
        List list2 = this.f71176m;
        g1.g0 g0Var8 = this.f71177n;
        List list3 = this.f71178o;
        g1.g0 g0Var9 = this.f71179p;
        Set set = this.f71180q;
        Trace.beginSection("Recomposer:recompose");
        try {
            o2.t(o2Var5);
            synchronized (o2Var5.f71209b) {
                try {
                    k2.e eVar = o2Var5.f71215h;
                    int i13 = eVar.f78184c;
                    if (i13 > 0) {
                        Object[] objArr = eVar.f78182a;
                        int i14 = 0;
                        do {
                            list.add((i0) objArr[i14]);
                            i14++;
                        } while (i14 < i13);
                    }
                    o2Var5.f71215h.h();
                    Unit unit2 = Unit.f80348a;
                } finally {
                }
            }
            g0Var6.f();
            g0Var7.f();
            while (true) {
                if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                    break;
                }
                o2 o2Var6 = o2Var5;
                g1.g0 g0Var10 = g0Var6;
                g1.g0 g0Var11 = g0Var7;
                try {
                    try {
                        int size = list.size();
                        int i15 = 0;
                        while (i15 < size) {
                            i0 i0Var = (i0) list.get(i15);
                            g0Var = g0Var10;
                            try {
                                i0 s13 = o2.s(o2Var6, i0Var, g0Var);
                                if (s13 != null) {
                                    list3.add(s13);
                                    Unit unit3 = Unit.f80348a;
                                }
                                g0Var2 = g0Var11;
                            } catch (Exception e13) {
                                e = e13;
                                g0Var2 = g0Var11;
                                o2.F(o2Var6, e, true, 2);
                                n2.r(o2Var6, list, list2, list3, g0Var8, g0Var9, g0Var, g0Var2);
                                return Unit.f80348a;
                            }
                            try {
                                g0Var2.d(i0Var);
                                i15++;
                                g0Var10 = g0Var;
                                g0Var11 = g0Var2;
                            } catch (Exception e14) {
                                e = e14;
                                o2.F(o2Var6, e, true, 2);
                                n2.r(o2Var6, list, list2, list3, g0Var8, g0Var9, g0Var, g0Var2);
                                return Unit.f80348a;
                            }
                        }
                        g0Var6 = g0Var10;
                        g0Var7 = g0Var11;
                        list.clear();
                        if (g0Var6.c() || o2Var6.f71215h.m()) {
                            synchronized (o2Var6.f71209b) {
                                try {
                                    List A = o2Var6.A();
                                    int size2 = A.size();
                                    for (int i16 = 0; i16 < size2; i16++) {
                                        i0 i0Var2 = (i0) A.get(i16);
                                        if (!g0Var7.a(i0Var2)) {
                                            z zVar = (z) i0Var2;
                                            if (zVar.x(set)) {
                                                list.add(zVar);
                                            }
                                        }
                                    }
                                    k2.e eVar2 = o2Var6.f71215h;
                                    int i17 = eVar2.f78184c;
                                    int i18 = 0;
                                    for (int i19 = 0; i19 < i17; i19++) {
                                        i0 i0Var3 = (i0) eVar2.f78182a[i19];
                                        if (!g0Var7.a(i0Var3) && !list.contains(i0Var3)) {
                                            list.add(i0Var3);
                                            i18++;
                                        } else if (i18 > 0) {
                                            Object[] objArr2 = eVar2.f78182a;
                                            objArr2[i19 - i18] = objArr2[i19];
                                        }
                                    }
                                    int i23 = i17 - i18;
                                    kotlin.collections.z.o(i23, i17, null, eVar2.f78182a);
                                    eVar2.f78184c = i23;
                                    Unit unit4 = Unit.f80348a;
                                } finally {
                                }
                            }
                        }
                        if (list.isEmpty()) {
                            try {
                                n2.s(list2, o2Var6);
                                while (!list2.isEmpty()) {
                                    D = o2Var6.D(list2, g0Var6);
                                    g0Var8.k(D);
                                    n2.s(list2, o2Var6);
                                }
                            } catch (Exception e15) {
                                o2.F(o2Var6, e15, true, 2);
                                n2.r(o2Var6, list, list2, list3, g0Var8, g0Var9, g0Var6, g0Var7);
                            }
                        }
                        o2Var5 = o2Var6;
                    } catch (Exception e16) {
                        e = e16;
                        g0Var = g0Var10;
                    }
                } finally {
                    list.clear();
                }
            }
            if (!list3.isEmpty()) {
                try {
                    try {
                        int size3 = list3.size();
                        for (int i24 = 0; i24 < size3; i24++) {
                            g0Var9.d((i0) list3.get(i24));
                        }
                        int size4 = list3.size();
                        for (int i25 = 0; i25 < size4; i25++) {
                            ((z) ((i0) list3.get(i25))).h();
                        }
                        list3.clear();
                    } finally {
                        list3.clear();
                    }
                } catch (Exception e17) {
                    o2.F(o2Var5, e17, false, 6);
                    n2.r(o2Var5, list, list2, list3, g0Var8, g0Var9, g0Var6, g0Var7);
                    list3.clear();
                }
            }
            try {
                if (g0Var8.c()) {
                    try {
                        g0Var9.j(g0Var8);
                        Object[] objArr3 = g0Var8.f63286b;
                        long[] jArr = g0Var8.f63285a;
                        int length = jArr.length - 2;
                        o2Var = o2Var5;
                        if (length >= 0) {
                            int i26 = 0;
                            while (true) {
                                try {
                                    long j13 = jArr[i26];
                                    int i27 = length;
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i28 = 8 - ((~(i26 - i27)) >>> 31);
                                        long j14 = j13;
                                        for (int i29 = 0; i29 < i28; i29++) {
                                            if ((j14 & 255) < 128) {
                                                ((z) ((i0) objArr3[(i26 << 3) + i29])).j();
                                            }
                                            j14 >>= 8;
                                        }
                                        if (i28 != 8) {
                                            break;
                                        }
                                    }
                                    length = i27;
                                    if (i26 == length) {
                                        break;
                                    }
                                    i26++;
                                } catch (Exception e18) {
                                    e = e18;
                                    o2 o2Var7 = o2Var;
                                    o2.F(o2Var7, e, false, 6);
                                    n2.r(o2Var7, list, list2, list3, g0Var8, g0Var9, g0Var6, g0Var7);
                                    g0Var8.f();
                                    return Unit.f80348a;
                                }
                            }
                        }
                        o2Var2 = o2Var;
                    } catch (Exception e19) {
                        e = e19;
                        o2Var = o2Var5;
                    }
                } else {
                    o2Var2 = o2Var5;
                }
                if (g0Var9.c()) {
                    try {
                        try {
                            Object[] objArr4 = g0Var9.f63286b;
                            long[] jArr2 = g0Var9.f63285a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i33 = 0;
                                while (true) {
                                    long j15 = jArr2[i33];
                                    g0Var3 = g0Var6;
                                    g0Var4 = g0Var7;
                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i34 = 8 - ((~(i33 - length2)) >>> 31);
                                        long j16 = j15;
                                        for (int i35 = 0; i35 < i34; i35++) {
                                            if ((j16 & 255) < 128) {
                                                try {
                                                    ((z) ((i0) objArr4[(i33 << 3) + i35])).k();
                                                } catch (Exception e23) {
                                                    e = e23;
                                                    o2.F(o2Var2, e, false, 6);
                                                    n2.r(o2Var2, list, list2, list3, g0Var8, g0Var9, g0Var3, g0Var4);
                                                    g0Var9.f();
                                                    return Unit.f80348a;
                                                }
                                            }
                                            j16 >>= 8;
                                        }
                                        if (i34 != 8) {
                                            break;
                                        }
                                    }
                                    if (i33 == length2) {
                                        break;
                                    }
                                    i33++;
                                    g0Var6 = g0Var3;
                                    g0Var7 = g0Var4;
                                }
                            } else {
                                g0Var3 = g0Var6;
                                g0Var4 = g0Var7;
                            }
                        } finally {
                            g0Var9.f();
                        }
                    } catch (Exception e24) {
                        e = e24;
                        g0Var3 = g0Var6;
                        g0Var4 = g0Var7;
                    }
                } else {
                    g0Var3 = g0Var6;
                    g0Var4 = g0Var7;
                }
                synchronized (o2Var2.f71209b) {
                    o2Var2.x();
                }
                s2.p.k().m();
                g0Var4.f();
                g0Var3.f();
                o2Var2.f71221n = null;
                Unit unit5 = Unit.f80348a;
                return Unit.f80348a;
            } finally {
                g0Var8.f();
            }
        } finally {
        }
    }
}
