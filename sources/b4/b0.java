package b4;

import android.util.Log;
import b3.w0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21530i;

    /* renamed from: j, reason: collision with root package name */
    public static final b0 f21513j = new b0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final b0 f21514k = new b0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final b0 f21515l = new b0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final b0 f21516m = new b0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final b0 f21517n = new b0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final b0 f21518o = new b0(5);

    /* renamed from: p, reason: collision with root package name */
    public static final b0 f21519p = new b0(6);

    /* renamed from: q, reason: collision with root package name */
    public static final b0 f21520q = new b0(7);

    /* renamed from: r, reason: collision with root package name */
    public static final b0 f21521r = new b0(8);

    /* renamed from: s, reason: collision with root package name */
    public static final b0 f21522s = new b0(9);

    /* renamed from: t, reason: collision with root package name */
    public static final b0 f21523t = new b0(10);

    /* renamed from: u, reason: collision with root package name */
    public static final b0 f21524u = new b0(11);

    /* renamed from: v, reason: collision with root package name */
    public static final b0 f21525v = new b0(12);

    /* renamed from: w, reason: collision with root package name */
    public static final b0 f21526w = new b0(13);

    /* renamed from: x, reason: collision with root package name */
    public static final b0 f21527x = new b0(14);

    /* renamed from: y, reason: collision with root package name */
    public static final b0 f21528y = new b0(15);

    /* renamed from: z, reason: collision with root package name */
    public static final b0 f21529z = new b0(16);
    public static final b0 A = new b0(17);
    public static final b0 B = new b0(18);
    public static final b0 C = new b0(19);
    public static final b0 D = new b0(20);
    public static final b0 E = new b0(21);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(int i13) {
        super(1);
        this.f21530i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        List list2;
        int i13 = 0;
        List list3 = null;
        r11 = null;
        g0 g0Var = null;
        r11 = null;
        n4.m mVar = null;
        r11 = null;
        w0 w0Var = null;
        r11 = null;
        m4.q qVar = null;
        r11 = null;
        n0 n0Var = null;
        r11 = null;
        n0 n0Var2 = null;
        r11 = null;
        l lVar = null;
        r11 = null;
        m mVar2 = null;
        r11 = null;
        t0 t0Var = null;
        r11 = null;
        u0 u0Var = null;
        r11 = null;
        g0 g0Var2 = null;
        r11 = null;
        v vVar = null;
        list3 = null;
        switch (this.f21530i) {
            case 0:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list4 = (List) obj;
                Object obj2 = list4.get(1);
                r2.s sVar = f0.f21550b;
                Boolean bool = Boolean.FALSE;
                List list5 = ((!Intrinsics.d(obj2, bool) || (sVar instanceof e0)) && obj2 != null) ? (List) sVar.f106064b.invoke(obj2) : null;
                Object obj3 = list4.get(2);
                List list6 = ((!Intrinsics.d(obj3, bool) || (sVar instanceof e0)) && obj3 != null) ? (List) sVar.f106064b.invoke(obj3) : null;
                Object obj4 = list4.get(0);
                String str = obj4 != null ? (String) obj4 : null;
                Intrinsics.f(str);
                if (list5 != null) {
                    List list7 = list5;
                    if (list7.isEmpty()) {
                        list7 = null;
                    }
                    list = list7;
                } else {
                    list = null;
                }
                if (list6 != null) {
                    List list8 = list6;
                    if (list8.isEmpty()) {
                        list8 = null;
                    }
                    list2 = list8;
                } else {
                    list2 = null;
                }
                Object obj5 = list4.get(3);
                if ((!Intrinsics.d(obj5, bool) || (sVar instanceof e0)) && obj5 != null) {
                    list3 = (List) sVar.f106064b.invoke(obj5);
                }
                return new g(str, list, list2, list3);
            case 1:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list9 = (List) obj;
                ArrayList arrayList = new ArrayList(list9.size());
                int size = list9.size();
                while (i13 < size) {
                    Object obj6 = list9.get(i13);
                    r2.s sVar2 = f0.f21551c;
                    e eVar = ((!Intrinsics.d(obj6, Boolean.FALSE) || (sVar2 instanceof e0)) && obj6 != null) ? (e) sVar2.f106064b.invoke(obj6) : null;
                    Intrinsics.f(eVar);
                    arrayList.add(eVar);
                    i13++;
                }
                return arrayList;
            case 2:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list10 = (List) obj;
                Object obj7 = list10.get(0);
                i iVar = obj7 != null ? (i) obj7 : null;
                Intrinsics.f(iVar);
                Object obj8 = list10.get(2);
                Integer num = obj8 != null ? (Integer) obj8 : null;
                Intrinsics.f(num);
                int intValue = num.intValue();
                Object obj9 = list10.get(3);
                Integer num2 = obj9 != null ? (Integer) obj9 : null;
                Intrinsics.f(num2);
                int intValue2 = num2.intValue();
                Object obj10 = list10.get(4);
                String str2 = obj10 != null ? (String) obj10 : null;
                Intrinsics.f(str2);
                switch (d0.f21541a[iVar.ordinal()]) {
                    case 1:
                        Object obj11 = list10.get(1);
                        r2.s sVar3 = f0.f21556h;
                        if ((!Intrinsics.d(obj11, Boolean.FALSE) || (sVar3 instanceof e0)) && obj11 != null) {
                            vVar = (v) sVar3.f106064b.invoke(obj11);
                        }
                        Intrinsics.f(vVar);
                        return new e(intValue, intValue2, vVar, str2);
                    case 2:
                        Object obj12 = list10.get(1);
                        r2.s sVar4 = f0.f21557i;
                        if ((!Intrinsics.d(obj12, Boolean.FALSE) || (sVar4 instanceof e0)) && obj12 != null) {
                            g0Var2 = (g0) sVar4.f106064b.invoke(obj12);
                        }
                        Intrinsics.f(g0Var2);
                        return new e(intValue, intValue2, g0Var2, str2);
                    case 3:
                        Object obj13 = list10.get(1);
                        r2.s sVar5 = f0.f21552d;
                        if ((!Intrinsics.d(obj13, Boolean.FALSE) || (sVar5 instanceof e0)) && obj13 != null) {
                            u0Var = (u0) sVar5.f106064b.invoke(obj13);
                        }
                        Intrinsics.f(u0Var);
                        return new e(intValue, intValue2, u0Var, str2);
                    case 4:
                        Object obj14 = list10.get(1);
                        r2.s sVar6 = f0.f21553e;
                        if ((!Intrinsics.d(obj14, Boolean.FALSE) || (sVar6 instanceof e0)) && obj14 != null) {
                            t0Var = (t0) sVar6.f106064b.invoke(obj14);
                        }
                        Intrinsics.f(t0Var);
                        return new e(intValue, intValue2, t0Var, str2);
                    case 5:
                        Object obj15 = list10.get(1);
                        r2.s sVar7 = f0.f21554f;
                        if ((!Intrinsics.d(obj15, Boolean.FALSE) || (sVar7 instanceof e0)) && obj15 != null) {
                            mVar2 = (m) sVar7.f106064b.invoke(obj15);
                        }
                        Intrinsics.f(mVar2);
                        return new e(intValue, intValue2, mVar2, str2);
                    case 6:
                        Object obj16 = list10.get(1);
                        r2.s sVar8 = f0.f21555g;
                        if ((!Intrinsics.d(obj16, Boolean.FALSE) || (sVar8 instanceof e0)) && obj16 != null) {
                            lVar = (l) sVar8.f106064b.invoke(obj16);
                        }
                        Intrinsics.f(lVar);
                        return new e(intValue, intValue2, lVar, str2);
                    case 7:
                        Object obj17 = list10.get(1);
                        String str3 = obj17 != null ? (String) obj17 : null;
                        Intrinsics.f(str3);
                        return new e(intValue, intValue2, str3, str2);
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 3:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Float");
                return new m4.a(((Float) obj).floatValue());
            case 4:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list11 = (List) obj;
                Object obj18 = list11.get(0);
                String str4 = obj18 != null ? (String) obj18 : null;
                Intrinsics.f(str4);
                Object obj19 = list11.get(1);
                r2.s sVar9 = f0.f21558j;
                if ((!Intrinsics.d(obj19, Boolean.FALSE) || (sVar9 instanceof e0)) && obj19 != null) {
                    n0Var2 = (n0) sVar9.f106064b.invoke(obj19);
                }
                return new l(str4, n0Var2);
            case 5:
                if (Intrinsics.d(obj, Boolean.FALSE)) {
                    return new b3.w(b3.w.f21390n);
                }
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
                return new b3.w(androidx.compose.ui.graphics.a.c(((Integer) obj).intValue()));
            case 6:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
                return new g4.l(((Integer) obj).intValue());
            case 7:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list12 = (List) obj;
                Object obj20 = list12.get(0);
                String str5 = obj20 != null ? (String) obj20 : null;
                Intrinsics.f(str5);
                Object obj21 = list12.get(1);
                r2.s sVar10 = f0.f21558j;
                if ((!Intrinsics.d(obj21, Boolean.FALSE) || (sVar10 instanceof e0)) && obj21 != null) {
                    n0Var = (n0) sVar10.f106064b.invoke(obj21);
                }
                return new m(str5, n0Var);
            case 8:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list13 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list13.size());
                int size2 = list13.size();
                while (i13 < size2) {
                    Object obj22 = list13.get(i13);
                    r2.s sVar11 = f0.f21570v;
                    i4.b bVar = ((!Intrinsics.d(obj22, Boolean.FALSE) || (sVar11 instanceof e0)) && obj22 != null) ? (i4.b) sVar11.f106064b.invoke(obj22) : null;
                    Intrinsics.f(bVar);
                    arrayList2.add(bVar);
                    i13++;
                }
                return new i4.c(arrayList2);
            case 9:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.String");
                String str6 = (String) obj;
                i4.d.f71506a.getClass();
                Locale forLanguageTag = Locale.forLanguageTag(str6);
                if (Intrinsics.d(forLanguageTag.toLanguageTag(), "und")) {
                    Log.e("Locale", "The language tag " + str6 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new i4.b(forLanguageTag);
            case 10:
                if (Intrinsics.d(obj, Boolean.FALSE)) {
                    return new a3.c(y2.h.f136670b);
                }
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list14 = (List) obj;
                Object obj23 = list14.get(0);
                Float f13 = obj23 != null ? (Float) obj23 : null;
                Intrinsics.f(f13);
                float floatValue = f13.floatValue();
                Object obj24 = list14.get(1);
                Float f14 = obj24 != null ? (Float) obj24 : null;
                Intrinsics.f(f14);
                return new a3.c(com.bumptech.glide.c.d(floatValue, f14.floatValue()));
            case 11:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list15 = (List) obj;
                Object obj25 = list15.get(0);
                m4.j jVar = obj25 != null ? (m4.j) obj25 : null;
                Intrinsics.f(jVar);
                Object obj26 = list15.get(1);
                m4.l lVar2 = obj26 != null ? (m4.l) obj26 : null;
                Intrinsics.f(lVar2);
                Object obj27 = list15.get(2);
                n4.n[] nVarArr = n4.m.f89188b;
                e0 e0Var = f0.f21567s;
                Boolean bool2 = Boolean.FALSE;
                n4.m mVar3 = ((!Intrinsics.d(obj27, bool2) || (e0Var instanceof e0)) && obj27 != null) ? (n4.m) e0Var.f21547b.invoke(obj27) : null;
                Intrinsics.f(mVar3);
                Object obj28 = list15.get(3);
                m4.q qVar2 = m4.q.f85809c;
                r2.s sVar12 = f0.f21561m;
                if ((!Intrinsics.d(obj28, bool2) || (sVar12 instanceof e0)) && obj28 != null) {
                    qVar = (m4.q) sVar12.f106064b.invoke(obj28);
                }
                return new v(jVar.f85797a, lVar2.f85802a, mVar3.f89190a, qVar, null, null, 0, Integer.MIN_VALUE, null);
            case 12:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list16 = (List) obj;
                Object obj29 = list16.get(0);
                int i14 = b3.w.f21391o;
                e0 e0Var2 = f0.f21566r;
                Boolean bool3 = Boolean.FALSE;
                b3.w wVar = ((!Intrinsics.d(obj29, bool3) || (e0Var2 instanceof e0)) && obj29 != null) ? (b3.w) e0Var2.f21547b.invoke(obj29) : null;
                Intrinsics.f(wVar);
                Object obj30 = list16.get(1);
                e0 e0Var3 = f0.f21568t;
                a3.c cVar = ((!Intrinsics.d(obj30, bool3) || (e0Var3 instanceof e0)) && obj30 != null) ? (a3.c) e0Var3.f21547b.invoke(obj30) : null;
                Intrinsics.f(cVar);
                Object obj31 = list16.get(2);
                Float f15 = obj31 != null ? (Float) obj31 : null;
                Intrinsics.f(f15);
                return new w0(wVar.f21392a, cVar.f482a, f15.floatValue());
            case 13:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list17 = (List) obj;
                Object obj32 = list17.get(0);
                int i15 = b3.w.f21391o;
                e0 e0Var4 = f0.f21566r;
                Boolean bool4 = Boolean.FALSE;
                b3.w wVar2 = ((!Intrinsics.d(obj32, bool4) || (e0Var4 instanceof e0)) && obj32 != null) ? (b3.w) e0Var4.f21547b.invoke(obj32) : null;
                Intrinsics.f(wVar2);
                Object obj33 = list17.get(1);
                n4.n[] nVarArr2 = n4.m.f89188b;
                e0 e0Var5 = f0.f21567s;
                n4.m mVar4 = ((!Intrinsics.d(obj33, bool4) || (e0Var5 instanceof e0)) && obj33 != null) ? (n4.m) e0Var5.f21547b.invoke(obj33) : null;
                Intrinsics.f(mVar4);
                Object obj34 = list17.get(2);
                g4.l lVar3 = g4.l.f63467b;
                r2.s sVar13 = f0.f21562n;
                g4.l lVar4 = ((!Intrinsics.d(obj34, bool4) || (sVar13 instanceof e0)) && obj34 != null) ? (g4.l) sVar13.f106064b.invoke(obj34) : null;
                Object obj35 = list17.get(3);
                g4.j jVar2 = obj35 != null ? (g4.j) obj35 : null;
                Object obj36 = list17.get(4);
                g4.k kVar = obj36 != null ? (g4.k) obj36 : null;
                Object obj37 = list17.get(6);
                String str7 = obj37 != null ? (String) obj37 : null;
                Object obj38 = list17.get(7);
                n4.m mVar5 = ((!Intrinsics.d(obj38, bool4) || (e0Var5 instanceof e0)) && obj38 != null) ? (n4.m) e0Var5.f21547b.invoke(obj38) : null;
                Intrinsics.f(mVar5);
                Object obj39 = list17.get(8);
                r2.s sVar14 = f0.f21563o;
                m4.a aVar = ((!Intrinsics.d(obj39, bool4) || (sVar14 instanceof e0)) && obj39 != null) ? (m4.a) sVar14.f106064b.invoke(obj39) : null;
                Object obj40 = list17.get(9);
                r2.s sVar15 = f0.f21560l;
                m4.p pVar = ((!Intrinsics.d(obj40, bool4) || (sVar15 instanceof e0)) && obj40 != null) ? (m4.p) sVar15.f106064b.invoke(obj40) : null;
                Object obj41 = list17.get(10);
                i4.c cVar2 = i4.c.f71503c;
                r2.s sVar16 = f0.f21569u;
                i4.c cVar3 = ((!Intrinsics.d(obj41, bool4) || (sVar16 instanceof e0)) && obj41 != null) ? (i4.c) sVar16.f106064b.invoke(obj41) : null;
                Object obj42 = list17.get(11);
                b3.w wVar3 = ((!Intrinsics.d(obj42, bool4) || (e0Var4 instanceof e0)) && obj42 != null) ? (b3.w) e0Var4.f21547b.invoke(obj42) : null;
                Intrinsics.f(wVar3);
                Object obj43 = list17.get(12);
                r2.s sVar17 = f0.f21559k;
                m4.k kVar2 = ((!Intrinsics.d(obj43, bool4) || (sVar17 instanceof e0)) && obj43 != null) ? (m4.k) sVar17.f106064b.invoke(obj43) : null;
                Object obj44 = list17.get(13);
                w0 w0Var2 = w0.f21393d;
                r2.s sVar18 = f0.f21565q;
                if ((!Intrinsics.d(obj44, bool4) || (sVar18 instanceof e0)) && obj44 != null) {
                    w0Var = (w0) sVar18.f106064b.invoke(obj44);
                }
                return new g0(wVar2.f21392a, mVar4.f89190a, lVar4, jVar2, kVar, null, str7, mVar5.f89190a, aVar, pVar, cVar3, wVar3.f21392a, kVar2, w0Var, 49184);
            case 14:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.Int");
                return new m4.k(((Integer) obj).intValue());
            case 15:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list18 = (List) obj;
                return new m4.p(((Number) list18.get(0)).floatValue(), ((Number) list18.get(1)).floatValue());
            case 16:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list19 = (List) obj;
                Object obj45 = list19.get(0);
                n4.n[] nVarArr3 = n4.m.f89188b;
                e0 e0Var6 = f0.f21567s;
                Boolean bool5 = Boolean.FALSE;
                n4.m mVar6 = ((!Intrinsics.d(obj45, bool5) || (e0Var6 instanceof e0)) && obj45 != null) ? (n4.m) e0Var6.f21547b.invoke(obj45) : null;
                Intrinsics.f(mVar6);
                Object obj46 = list19.get(1);
                if ((!Intrinsics.d(obj46, bool5) || (e0Var6 instanceof e0)) && obj46 != null) {
                    mVar = (n4.m) e0Var6.f21547b.invoke(obj46);
                }
                Intrinsics.f(mVar);
                return new m4.q(mVar6.f89190a, mVar.f89190a);
            case 17:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list20 = (List) obj;
                Object obj47 = list20.get(0);
                r2.s sVar19 = f0.f21557i;
                Boolean bool6 = Boolean.FALSE;
                g0 g0Var3 = ((!Intrinsics.d(obj47, bool6) || (sVar19 instanceof e0)) && obj47 != null) ? (g0) sVar19.f106064b.invoke(obj47) : null;
                Object obj48 = list20.get(1);
                g0 g0Var4 = ((!Intrinsics.d(obj48, bool6) || (sVar19 instanceof e0)) && obj48 != null) ? (g0) sVar19.f106064b.invoke(obj48) : null;
                Object obj49 = list20.get(2);
                g0 g0Var5 = ((!Intrinsics.d(obj49, bool6) || (sVar19 instanceof e0)) && obj49 != null) ? (g0) sVar19.f106064b.invoke(obj49) : null;
                Object obj50 = list20.get(3);
                if ((!Intrinsics.d(obj50, bool6) || (sVar19 instanceof e0)) && obj50 != null) {
                    g0Var = (g0) sVar19.f106064b.invoke(obj50);
                }
                return new n0(g0Var3, g0Var4, g0Var5, g0Var);
            case 18:
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list21 = (List) obj;
                Object obj51 = list21.get(0);
                Integer num3 = obj51 != null ? (Integer) obj51 : null;
                Intrinsics.f(num3);
                int intValue3 = num3.intValue();
                Object obj52 = list21.get(1);
                Integer num4 = obj52 != null ? (Integer) obj52 : null;
                Intrinsics.f(num4);
                return new p0(b7.c.h(intValue3, num4.intValue()));
            case 19:
                if (Intrinsics.d(obj, Boolean.FALSE)) {
                    return new n4.m(n4.m.f89189c);
                }
                Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list22 = (List) obj;
                Object obj53 = list22.get(0);
                Float f16 = obj53 != null ? (Float) obj53 : null;
                Intrinsics.f(f16);
                float floatValue2 = f16.floatValue();
                Object obj54 = list22.get(1);
                n4.n nVar = obj54 != null ? (n4.n) obj54 : null;
                Intrinsics.f(nVar);
                return new n4.m(kh2.w.r0(nVar.f89192a, floatValue2));
            case 20:
                String str8 = obj != null ? (String) obj : null;
                Intrinsics.f(str8);
                return new t0(str8);
            default:
                String str9 = obj != null ? (String) obj : null;
                Intrinsics.f(str9);
                return new u0(str9);
        }
    }
}
