package s1;

import java.util.ArrayList;
import java.util.List;
import kh2.p2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import m1.f1;
import p1.x0;
import q3.o1;

/* loaded from: classes2.dex */
public final class e0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o0 f110388i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f1 f110389j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x0 f110390k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f110391l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f110392m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p f110393n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f110394o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Function0 f110395p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ u2.d f110396q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u2.c f110397r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f110398s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n1.n f110399t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(o0 o0Var, f1 f1Var, x0 x0Var, boolean z13, float f13, p pVar, rl2.r rVar, Function0 function0, u2.d dVar, u2.c cVar, int i13, n1.n nVar, ao2.j0 j0Var) {
        super(2);
        this.f110388i = o0Var;
        this.f110389j = f1Var;
        this.f110390k = x0Var;
        this.f110391l = z13;
        this.f110392m = f13;
        this.f110393n = pVar;
        this.f110394o = rVar;
        this.f110395p = function0;
        this.f110396q = dVar;
        this.f110397r = cVar;
        this.f110398s = i13;
        this.f110399t = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v54, types: [kotlin.ranges.a] */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v40, types: [kotlin.collections.q0] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int R;
        int R2;
        long a13;
        int i13;
        f1 f1Var;
        long j13;
        Function1 function1;
        int i14;
        q1.q qVar;
        int i15;
        u2.d dVar;
        List list;
        u2.c cVar;
        int i16;
        boolean z13;
        int i17;
        int i18;
        kotlin.collections.v vVar;
        int i19;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        l lVar;
        int i28;
        d0 d0Var;
        ArrayList arrayList;
        d0 d0Var2;
        ArrayList arrayList2;
        long j14;
        int i29;
        l lVar2;
        ArrayList arrayList3;
        f1 f1Var2;
        int i33;
        int i34;
        List list2;
        ArrayList arrayList4;
        List arrayList5;
        List list3;
        Object obj3;
        int i35;
        int i36;
        o0 o0Var;
        f0 f0Var;
        int[] iArr;
        int i37;
        kotlin.collections.v vVar2;
        e0 e0Var = this;
        androidx.compose.foundation.lazy.layout.c0 c0Var = (androidx.compose.foundation.lazy.layout.c0) obj;
        long j15 = ((n4.a) obj2).f89168a;
        o0 o0Var2 = e0Var.f110388i;
        o0Var2.B.getValue();
        f1 f1Var3 = f1.Vertical;
        f1 f1Var4 = e0Var.f110389j;
        boolean z14 = f1Var4 == f1Var3;
        tb.f.B(j15, z14 ? f1Var3 : f1.Horizontal);
        x0 x0Var = e0Var.f110390k;
        if (z14) {
            androidx.compose.foundation.lazy.layout.d0 d0Var3 = (androidx.compose.foundation.lazy.layout.d0) c0Var;
            R = d0Var3.f17231b.R(x0Var.c(d0Var3.f17231b.getLayoutDirection()));
        } else {
            androidx.compose.foundation.lazy.layout.d0 d0Var4 = (androidx.compose.foundation.lazy.layout.d0) c0Var;
            R = d0Var4.f17231b.R(androidx.compose.foundation.layout.b.f(x0Var, d0Var4.f17231b.getLayoutDirection()));
        }
        if (z14) {
            androidx.compose.foundation.lazy.layout.d0 d0Var5 = (androidx.compose.foundation.lazy.layout.d0) c0Var;
            R2 = d0Var5.f17231b.R(x0Var.b(d0Var5.f17231b.getLayoutDirection()));
        } else {
            androidx.compose.foundation.lazy.layout.d0 d0Var6 = (androidx.compose.foundation.lazy.layout.d0) c0Var;
            R2 = d0Var6.f17231b.R(androidx.compose.foundation.layout.b.e(x0Var, d0Var6.f17231b.getLayoutDirection()));
        }
        androidx.compose.foundation.lazy.layout.d0 d0Var7 = (androidx.compose.foundation.lazy.layout.d0) c0Var;
        int R3 = d0Var7.f17231b.R(x0Var.d());
        float a14 = x0Var.a();
        o1 o1Var = d0Var7.f17231b;
        int R4 = o1Var.R(a14);
        int i38 = R3 + R4;
        int i39 = R + R2;
        int i43 = z14 ? i38 : i39;
        boolean z15 = e0Var.f110391l;
        if (z14 && !z15) {
            R2 = R3;
        } else if (z14 && z15) {
            R2 = R4;
        } else if (!z14 && !z15) {
            R2 = R;
        }
        int i44 = i43 - R2;
        int i45 = R2;
        long w13 = bs1.c.w1(-i39, -i38, j15);
        o0Var2.f110506p = c0Var;
        int R5 = o1Var.R(e0Var.f110392m);
        int g13 = z14 ? n4.a.g(j15) - i38 : n4.a.h(j15) - i39;
        if (!z15 || g13 > 0) {
            a13 = d7.b.a(R, R3);
        } else {
            if (!z14) {
                R += g13;
            }
            if (z14) {
                R3 += g13;
            }
            a13 = d7.b.a(R, R3);
        }
        int a15 = e0Var.f110393n.a(c0Var, g13);
        if (a15 < 0) {
            f1Var = f1Var3;
            i13 = 0;
        } else {
            i13 = a15;
            f1Var = f1Var3;
        }
        o0Var2.f110515y = bs1.c.b(f1Var4 == f1Var ? n4.a.h(w13) : i13, f1Var4 != f1Var ? n4.a.g(w13) : i13, 5);
        c0 c0Var2 = (c0) e0Var.f110394o.invoke();
        n1.n nVar = e0Var.f110399t;
        s2.i P = bk.f.P();
        if (P != null) {
            j13 = w13;
            function1 = P.f();
        } else {
            j13 = w13;
            function1 = null;
        }
        s2.i X = bk.f.X(P);
        try {
            int l13 = o0Var2.l();
            f1 f1Var5 = f1Var;
            i0 i0Var = o0Var2.f110493c;
            int i46 = g13;
            int j16 = androidx.compose.foundation.lazy.layout.o.j(l13, c0Var2, i0Var.f110452e);
            if (l13 != j16) {
                i14 = i38;
                i0Var.f110449b.i(j16);
                i0Var.f110453f.b(l13);
            } else {
                i14 = i38;
            }
            o0Var2.l();
            float h10 = i0Var.f110450c.h();
            o0Var2.n();
            nVar.getClass();
            float f13 = 0;
            int i47 = i13 + R5;
            int c13 = ml2.c.c(f13 - (h10 * i47));
            Unit unit = Unit.f80348a;
            bk.f.c0(P, X, function1);
            List h13 = androidx.compose.foundation.lazy.layout.o.h(c0Var2, o0Var2.f110516z, o0Var2.f110511u);
            int intValue = ((Number) e0Var.f110395p.invoke()).intValue();
            q1.q qVar2 = new q1.q(c0Var, j15, i39, i14, 2);
            if (i45 < 0) {
                throw new IllegalArgumentException("negative beforeContentPadding".toString());
            }
            if (i44 < 0) {
                throw new IllegalArgumentException("negative afterContentPadding".toString());
            }
            int i48 = i47 < 0 ? 0 : i47;
            f1 f1Var6 = e0Var.f110389j;
            int i49 = e0Var.f110398s;
            n1.n nVar2 = e0Var.f110399t;
            if (intValue <= 0) {
                f0Var = new f0(kotlin.collections.q0.f80391a, i13, R5, i44, f1Var6, -i45, i46 + i44, i49, nVar2, (q3.q0) qVar2.invoke(Integer.valueOf(n4.a.j(j13)), Integer.valueOf(n4.a.i(j13)), d.f110376k));
                o0Var = o0Var2;
            } else {
                long b13 = bs1.c.b(f1Var6 == f1Var5 ? n4.a.h(j13) : i13, f1Var6 != f1Var5 ? n4.a.g(j13) : i13, 5);
                while (j16 > 0 && c13 > 0) {
                    j16--;
                    c13 -= i48;
                }
                int i53 = c13 * (-1);
                if (j16 >= intValue) {
                    j16 = intValue - 1;
                    i53 = 0;
                }
                kotlin.collections.v vVar3 = new kotlin.collections.v();
                int i54 = -i45;
                int i55 = R5;
                if (i55 < 0) {
                    i15 = i55;
                    qVar = qVar2;
                } else {
                    qVar = qVar2;
                    i15 = 0;
                }
                int i56 = i54 + i15;
                int i57 = i53 + i56;
                int i58 = i45;
                int i59 = 0;
                int i63 = j16;
                int i64 = i57;
                int i65 = i63;
                while (true) {
                    dVar = e0Var.f110396q;
                    list = h13;
                    cVar = e0Var.f110397r;
                    i16 = i59;
                    z13 = e0Var.f110391l;
                    if (i64 >= 0 || i65 <= 0) {
                        break;
                    }
                    int i66 = i65 - 1;
                    int i67 = i55;
                    androidx.compose.foundation.lazy.layout.c0 c0Var3 = c0Var;
                    kotlin.collections.v vVar4 = vVar3;
                    androidx.compose.foundation.lazy.layout.c0 c0Var4 = c0Var;
                    int i68 = i48;
                    f1 f1Var7 = f1Var6;
                    l i03 = p2.i0(c0Var3, i66, b13, c0Var2, a13, f1Var7, cVar, dVar, o1Var.getLayoutDirection(), z13, i13);
                    vVar4.add(0, i03);
                    i64 += i68;
                    i48 = i68;
                    vVar3 = vVar4;
                    i59 = Math.max(i16, i03.f110468k);
                    h13 = list;
                    i65 = i66;
                    i54 = i54;
                    nVar2 = nVar2;
                    i49 = i49;
                    c0Var = c0Var4;
                    f1Var6 = f1Var7;
                    i55 = i67;
                    f13 = f13;
                    intValue = intValue;
                    i46 = i46;
                    i58 = i58;
                    e0Var = this;
                }
                androidx.compose.foundation.lazy.layout.c0 c0Var5 = c0Var;
                int i69 = i55;
                int i73 = i54;
                n1.n nVar3 = nVar2;
                kotlin.collections.v vVar5 = vVar3;
                int i74 = i49;
                int i75 = i48;
                f1 f1Var8 = f1Var6;
                float f14 = f13;
                int i76 = intValue;
                int i77 = i64;
                int i78 = i46;
                int i79 = i58;
                int i83 = i56;
                if (i77 < i83) {
                    i77 = i83;
                }
                int i84 = i77 - i83;
                int i85 = i78;
                int i86 = i85 + i44;
                int i87 = i86 < 0 ? 0 : i86;
                int i88 = -i84;
                int i89 = 0;
                boolean z16 = false;
                int i93 = i65;
                while (i89 < vVar5.f80402c) {
                    if (i88 >= i87) {
                        vVar5.c(i89);
                        z16 = true;
                    } else {
                        i93++;
                        i88 += i75;
                        i89++;
                    }
                }
                int i94 = i88;
                int i95 = i84;
                boolean z17 = z16;
                int i96 = i65;
                int i97 = i76;
                int i98 = i93;
                int i99 = i16;
                while (i98 < i97 && (i94 < i87 || i94 <= 0 || vVar5.isEmpty())) {
                    int i100 = i97;
                    kotlin.collections.v vVar6 = vVar5;
                    int i101 = i87;
                    int i102 = i99;
                    int i103 = i98;
                    int i104 = i85;
                    int i105 = i83;
                    int i106 = i94;
                    u2.c cVar2 = cVar;
                    u2.d dVar2 = dVar;
                    l i04 = p2.i0(c0Var5, i98, b13, c0Var2, a13, f1Var8, cVar, dVar, o1Var.getLayoutDirection(), z13, i13);
                    int i107 = i100 - 1;
                    i94 = i106 + (i103 == i107 ? i13 : i75);
                    if (i94 > i105 || i103 == i107) {
                        int max = Math.max(i102, i04.f110468k);
                        vVar2 = vVar6;
                        vVar2.addLast(i04);
                        i99 = max;
                    } else {
                        i95 -= i75;
                        i96 = i103 + 1;
                        vVar2 = vVar6;
                        i99 = i102;
                        z17 = true;
                    }
                    i98 = i103 + 1;
                    i97 = i100;
                    i83 = i105;
                    vVar5 = vVar2;
                    cVar = cVar2;
                    i87 = i101;
                    dVar = dVar2;
                    i85 = i104;
                }
                int i108 = i97;
                int i109 = i99;
                int i110 = i94;
                u2.c cVar3 = cVar;
                u2.d dVar3 = dVar;
                kotlin.collections.v vVar7 = vVar5;
                int i111 = i98;
                int i112 = i85;
                if (i110 < i112) {
                    int i113 = i112 - i110;
                    int i114 = i95 - i113;
                    int i115 = i110 + i113;
                    int i116 = i109;
                    int i117 = i114;
                    int i118 = i79;
                    while (i117 < i118 && i96 > 0) {
                        i96--;
                        int i119 = i108;
                        kotlin.collections.v vVar8 = vVar7;
                        l i05 = p2.i0(c0Var5, i96, b13, c0Var2, a13, f1Var8, cVar3, dVar3, o1Var.getLayoutDirection(), z13, i13);
                        vVar8.add(0, i05);
                        i116 = Math.max(i116, i05.f110468k);
                        i117 += i75;
                        vVar7 = vVar8;
                        i118 = i118;
                        i111 = i111;
                        i112 = i112;
                        i108 = i119;
                    }
                    i17 = i108;
                    i23 = i111;
                    i19 = i118;
                    int i120 = i117;
                    i25 = i116;
                    i18 = i112;
                    vVar = vVar7;
                    if (i120 < 0) {
                        i24 = i115 + i120;
                        i26 = 0;
                    } else {
                        i24 = i115;
                        i26 = i120;
                    }
                } else {
                    i17 = i108;
                    i18 = i112;
                    vVar = vVar7;
                    i19 = i79;
                    i23 = i111;
                    i24 = i110;
                    i25 = i109;
                    i26 = i95;
                }
                if (i26 < 0) {
                    throw new IllegalArgumentException("invalid currentFirstPageScrollOffset".toString());
                }
                int i121 = -i26;
                l lVar3 = (l) vVar.first();
                if (i19 > 0 || i69 < 0) {
                    int i122 = vVar.f80402c;
                    int i123 = i26;
                    int i124 = 0;
                    while (i124 < i122 && i123 != 0) {
                        i27 = i75;
                        if (i27 > i123 || i124 == kotlin.collections.f0.i(vVar)) {
                            break;
                        }
                        i123 -= i27;
                        i124++;
                        lVar3 = (l) vVar.get(i124);
                        i75 = i27;
                    }
                    i27 = i75;
                    lVar = lVar3;
                    i28 = i123;
                } else {
                    i27 = i75;
                    i28 = i26;
                    lVar = lVar3;
                }
                d0 d0Var8 = r9;
                int i125 = i27;
                int i126 = i25;
                l lVar4 = lVar;
                int i127 = i24;
                d0 d0Var9 = new d0(c0Var5, b13, c0Var2, a13, f1Var8, cVar3, dVar3, z13, i13, 1);
                int max2 = Math.max(0, i96 - i74);
                int i128 = i96 - 1;
                if (max2 <= i128) {
                    arrayList = null;
                    while (true) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        d0Var = d0Var8;
                        arrayList.add(d0Var.invoke(Integer.valueOf(i128)));
                        if (i128 == max2) {
                            break;
                        }
                        i128--;
                        d0Var8 = d0Var;
                    }
                } else {
                    d0Var = d0Var8;
                    arrayList = null;
                }
                int size = list.size();
                List list4 = arrayList;
                int i129 = 0;
                while (i129 < size) {
                    List list5 = list;
                    int intValue2 = ((Number) list5.get(i129)).intValue();
                    if (intValue2 < max2) {
                        if (list4 == null) {
                            list4 = new ArrayList();
                        }
                        list4.add(d0Var.invoke(Integer.valueOf(intValue2)));
                    }
                    i129++;
                    list = list5;
                }
                List list6 = list;
                if (list4 == null) {
                    list4 = kotlin.collections.q0.f80391a;
                }
                List list7 = list4;
                int size2 = list7.size();
                int i130 = i126;
                for (int i131 = 0; i131 < size2; i131++) {
                    i130 = Math.max(i130, ((l) list7.get(i131)).f110468k);
                }
                int i132 = ((l) vVar.last()).f110458a;
                long j17 = a13;
                d0 d0Var10 = r9;
                int i133 = i130;
                List list8 = list6;
                d0 d0Var11 = new d0(c0Var5, b13, c0Var2, j17, f1Var8, cVar3, dVar3, z13, i13, 0);
                int min = Math.min(i132 + i74, i17 - 1);
                int i134 = i132 + 1;
                if (i134 <= min) {
                    arrayList2 = null;
                    while (true) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        d0Var2 = d0Var10;
                        arrayList2.add(d0Var2.invoke(Integer.valueOf(i134)));
                        if (i134 == min) {
                            break;
                        }
                        i134++;
                        d0Var10 = d0Var2;
                    }
                } else {
                    d0Var2 = d0Var10;
                    arrayList2 = null;
                }
                int size3 = list8.size();
                List list9 = arrayList2;
                int i135 = 0;
                while (i135 < size3) {
                    List list10 = list8;
                    int intValue3 = ((Number) list10.get(i135)).intValue();
                    int i136 = i17;
                    if (min + 1 <= intValue3 && intValue3 < i136) {
                        if (list9 == null) {
                            list9 = new ArrayList();
                        }
                        list9.add(d0Var2.invoke(Integer.valueOf(intValue3)));
                    }
                    i135++;
                    list8 = list10;
                    i17 = i136;
                }
                int i137 = i17;
                if (list9 == null) {
                    list9 = kotlin.collections.q0.f80391a;
                }
                List list11 = list9;
                int size4 = list11.size();
                int i138 = i133;
                for (int i139 = 0; i139 < size4; i139++) {
                    i138 = Math.max(i138, ((l) list11.get(i139)).f110468k);
                }
                boolean z18 = Intrinsics.d(lVar4, vVar.first()) && list7.isEmpty() && list11.isEmpty();
                f1 f1Var9 = f1.Vertical;
                if (f1Var8 == f1Var9) {
                    i29 = i138;
                    j14 = j13;
                } else {
                    j14 = j13;
                    i29 = i127;
                }
                int J2 = bs1.c.J(i29, j14);
                if (f1Var8 == f1Var9) {
                    i138 = i127;
                }
                int I = bs1.c.I(i138, j14);
                int i140 = f1Var8 == f1Var9 ? I : J2;
                int i141 = i18;
                boolean z19 = i127 < Math.min(i140, i141);
                int i142 = i121;
                if (z19 && i142 != 0) {
                    throw new IllegalStateException(a.a.d("non-zero pagesScrollOffset=", i142).toString());
                }
                ArrayList arrayList6 = new ArrayList(list11.size() + list7.size() + vVar.b());
                if (!z19) {
                    lVar2 = lVar4;
                    arrayList3 = arrayList6;
                    f1Var2 = f1Var8;
                    i33 = i69;
                    i34 = i127;
                    int size5 = list7.size();
                    int i143 = i142;
                    for (int i144 = 0; i144 < size5; i144++) {
                        l lVar5 = (l) list7.get(i144);
                        i143 -= i47;
                        lVar5.b(i143, J2, I);
                        arrayList3.add(lVar5);
                    }
                    list2 = list7;
                    int b14 = vVar.b();
                    for (int i145 = 0; i145 < b14; i145++) {
                        l lVar6 = (l) vVar.get(i145);
                        lVar6.b(i142, J2, I);
                        arrayList3.add(lVar6);
                        i142 += i47;
                    }
                    int size6 = list11.size();
                    for (int i146 = 0; i146 < size6; i146++) {
                        l lVar7 = (l) list11.get(i146);
                        lVar7.b(i142, J2, I);
                        arrayList3.add(lVar7);
                        i142 += i47;
                    }
                } else {
                    if (!list7.isEmpty() || !list11.isEmpty()) {
                        throw new IllegalArgumentException("No extra pages".toString());
                    }
                    int b15 = vVar.b();
                    int[] iArr2 = new int[b15];
                    for (int i147 = 0; i147 < b15; i147++) {
                        iArr2[i147] = i13;
                    }
                    int[] iArr3 = new int[b15];
                    int i148 = 0;
                    while (i148 < b15) {
                        iArr3[i148] = 0;
                        i148++;
                        b15 = b15;
                    }
                    int i149 = b15;
                    lVar2 = lVar4;
                    p1.i iVar = new p1.i(o1Var.f0(i69), false, null);
                    if (f1Var8 == f1.Vertical) {
                        iVar.b(c0Var5, i140, iArr2, iArr3);
                        iArr = iArr3;
                        i37 = i140;
                        f1Var2 = f1Var8;
                        arrayList3 = arrayList6;
                        i33 = i69;
                        i34 = i127;
                    } else {
                        iArr = iArr3;
                        i33 = i69;
                        arrayList3 = arrayList6;
                        f1Var2 = f1Var8;
                        i34 = i127;
                        i37 = i140;
                        iVar.c(c0Var5, i140, iArr2, n4.k.Ltr, iArr);
                    }
                    IntRange D = kotlin.collections.c0.D(iArr);
                    IntRange intRange = D;
                    if (z13) {
                        intRange = ql2.s.o(D);
                    }
                    int i150 = intRange.f80453a;
                    int i151 = intRange.f80454b;
                    int i152 = intRange.f80455c;
                    if ((i152 > 0 && i150 <= i151) || (i152 < 0 && i151 <= i150)) {
                        while (true) {
                            int i153 = iArr[i150];
                            l lVar8 = (l) vVar.get(!z13 ? i150 : (i149 - i150) - 1);
                            if (z13) {
                                i153 = (i37 - i153) - lVar8.f110459b;
                            }
                            lVar8.b(i153, J2, I);
                            arrayList3.add(lVar8);
                            if (i150 == i151) {
                                break;
                            }
                            i150 += i152;
                        }
                    }
                    list2 = list7;
                }
                if (z18) {
                    arrayList4 = arrayList3;
                } else {
                    arrayList4 = new ArrayList(arrayList3.size());
                    int size7 = arrayList3.size();
                    for (int i154 = 0; i154 < size7; i154++) {
                        Object obj4 = arrayList3.get(i154);
                        l lVar9 = (l) obj4;
                        if (lVar9.f110458a >= ((l) vVar.first()).f110458a) {
                            if (lVar9.f110458a <= ((l) vVar.last()).f110458a) {
                                arrayList4.add(obj4);
                            }
                        }
                    }
                }
                if (list2.isEmpty()) {
                    arrayList5 = kotlin.collections.q0.f80391a;
                } else {
                    arrayList5 = new ArrayList(arrayList3.size());
                    int size8 = arrayList3.size();
                    for (int i155 = 0; i155 < size8; i155++) {
                        Object obj5 = arrayList3.get(i155);
                        if (((l) obj5).f110458a < ((l) vVar.first()).f110458a) {
                            arrayList5.add(obj5);
                        }
                    }
                }
                if (list11.isEmpty()) {
                    list3 = kotlin.collections.q0.f80391a;
                } else {
                    ArrayList arrayList7 = new ArrayList(arrayList3.size());
                    int size9 = arrayList3.size();
                    for (int i156 = 0; i156 < size9; i156++) {
                        Object obj6 = arrayList3.get(i156);
                        if (((l) obj6).f110458a > ((l) vVar.last()).f110458a) {
                            arrayList7.add(obj6);
                        }
                    }
                    list3 = arrayList7;
                }
                f1 f1Var10 = f1.Vertical;
                if (arrayList4.isEmpty()) {
                    obj3 = null;
                } else {
                    Object obj7 = arrayList4.get(0);
                    int i157 = ((l) obj7).f110470m;
                    nVar3.getClass();
                    float f15 = -Math.abs(i157 - f14);
                    int i158 = kotlin.collections.f0.i(arrayList4);
                    if (1 <= i158) {
                        int i159 = 1;
                        while (true) {
                            Object obj8 = arrayList4.get(i159);
                            float f16 = -Math.abs(((l) obj8).f110470m - f14);
                            if (Float.compare(f15, f16) < 0) {
                                obj7 = obj8;
                                f15 = f16;
                            }
                            if (i159 == i158) {
                                break;
                            }
                            i159++;
                        }
                    }
                    obj3 = obj7;
                }
                l lVar10 = (l) obj3;
                nVar3.getClass();
                if (lVar10 != null) {
                    i36 = lVar10.f110470m;
                    i35 = i125;
                } else {
                    i35 = i125;
                    i36 = 0;
                }
                o0Var = o0Var2;
                f0Var = new f0(arrayList4, i13, i33, i44, f1Var2, i73, i86, z13, i74, lVar2, lVar10, i35 == 0 ? 0.0f : ql2.s.f((0 - i36) / i35, -0.5f, 0.5f), i28, i23 < i137 || i34 > i141, nVar3, (q3.q0) qVar.invoke(Integer.valueOf(J2), Integer.valueOf(I), new r1.z(arrayList3, o0Var.A, 1)), z17, arrayList5, list3);
            }
            o0Var.j(f0Var, false);
            return f0Var;
        } catch (Throwable th3) {
            bk.f.c0(P, X, function1);
            throw th3;
        }
    }
}
