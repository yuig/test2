package i2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class n2 extends dl2.j implements kl2.l {
    public /* synthetic */ i1 A;
    public final /* synthetic */ o2 B;

    /* renamed from: r, reason: collision with root package name */
    public List f71192r;

    /* renamed from: s, reason: collision with root package name */
    public List f71193s;

    /* renamed from: t, reason: collision with root package name */
    public List f71194t;

    /* renamed from: u, reason: collision with root package name */
    public g1.g0 f71195u;

    /* renamed from: v, reason: collision with root package name */
    public g1.g0 f71196v;

    /* renamed from: w, reason: collision with root package name */
    public g1.g0 f71197w;

    /* renamed from: x, reason: collision with root package name */
    public Set f71198x;

    /* renamed from: y, reason: collision with root package name */
    public g1.g0 f71199y;

    /* renamed from: z, reason: collision with root package name */
    public int f71200z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(o2 o2Var, bl2.c cVar) {
        super(3, cVar);
        this.B = o2Var;
    }

    public static final void r(o2 o2Var, List list, List list2, List list3, g1.g0 g0Var, g1.g0 g0Var2, g1.g0 g0Var3, g1.g0 g0Var4) {
        synchronized (o2Var.f71209b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i13 = 0; i13 < size; i13++) {
                    z zVar = (z) ((i0) list3.get(i13));
                    zVar.e();
                    o2Var.G(zVar);
                }
                list3.clear();
                Object[] objArr = g0Var.f63286b;
                long[] jArr = g0Var.f63285a;
                int length = jArr.length - 2;
                long j13 = -9187201950435737472L;
                if (length >= 0) {
                    int i14 = 0;
                    while (true) {
                        long j14 = jArr[i14];
                        long[] jArr2 = jArr;
                        if ((((~j14) << 7) & j14 & j13) != j13) {
                            int i15 = 8 - ((~(i14 - length)) >>> 31);
                            for (int i16 = 0; i16 < i15; i16++) {
                                if ((j14 & 255) < 128) {
                                    z zVar2 = (z) ((i0) objArr[(i14 << 3) + i16]);
                                    zVar2.e();
                                    o2Var.G(zVar2);
                                }
                                j14 >>= 8;
                            }
                            if (i15 != 8) {
                                break;
                            }
                        }
                        if (i14 == length) {
                            break;
                        }
                        i14++;
                        jArr = jArr2;
                        j13 = -9187201950435737472L;
                    }
                }
                g0Var.f();
                Object[] objArr2 = g0Var2.f63286b;
                long[] jArr3 = g0Var2.f63285a;
                int length2 = jArr3.length - 2;
                if (length2 >= 0) {
                    int i17 = 0;
                    while (true) {
                        long j15 = jArr3[i17];
                        if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i18 = 8 - ((~(i17 - length2)) >>> 31);
                            for (int i19 = 0; i19 < i18; i19++) {
                                if ((j15 & 255) < 128) {
                                    ((z) ((i0) objArr2[(i17 << 3) + i19])).k();
                                }
                                j15 >>= 8;
                            }
                            if (i18 != 8) {
                                break;
                            }
                        }
                        if (i17 == length2) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                }
                g0Var2.f();
                g0Var3.f();
                Object[] objArr3 = g0Var4.f63286b;
                long[] jArr4 = g0Var4.f63285a;
                int length3 = jArr4.length - 2;
                if (length3 >= 0) {
                    int i23 = 0;
                    while (true) {
                        long j16 = jArr4[i23];
                        if ((((~j16) << 7) & j16 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i24 = 8 - ((~(i23 - length3)) >>> 31);
                            for (int i25 = 0; i25 < i24; i25++) {
                                if ((j16 & 255) < 128) {
                                    z zVar3 = (z) ((i0) objArr3[(i23 << 3) + i25]);
                                    zVar3.e();
                                    o2Var.G(zVar3);
                                }
                                j16 >>= 8;
                            }
                            if (i24 != 8) {
                                break;
                            }
                        }
                        if (i23 == length3) {
                            break;
                        } else {
                            i23++;
                        }
                    }
                }
                g0Var4.f();
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public static final void s(List list, o2 o2Var) {
        list.clear();
        synchronized (o2Var.f71209b) {
            try {
                ArrayList arrayList = o2Var.f71217j;
                int size = arrayList.size();
                for (int i13 = 0; i13 < size; i13++) {
                    list.add((k1) arrayList.get(i13));
                }
                o2Var.f71217j.clear();
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        n2 n2Var = new n2(this.B, (bl2.c) obj3);
        n2Var.A = (i1) obj2;
        return n2Var.invokeSuspend(Unit.f80348a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0172 -> B:6:0x017b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0213 -> B:20:0x00a3). Please report as a decompilation issue!!! */
    @Override // dl2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.n2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
