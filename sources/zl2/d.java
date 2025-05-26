package zl2;

import a.cb;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lb.l0;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f142106a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f142107b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f142108c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f142109d;

    /* renamed from: e, reason: collision with root package name */
    public static final ym2.b f142110e;

    /* renamed from: f, reason: collision with root package name */
    public static final ym2.c f142111f;

    /* renamed from: g, reason: collision with root package name */
    public static final ym2.b f142112g;

    /* renamed from: h, reason: collision with root package name */
    public static final HashMap f142113h;

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f142114i;

    /* renamed from: j, reason: collision with root package name */
    public static final HashMap f142115j;

    /* renamed from: k, reason: collision with root package name */
    public static final HashMap f142116k;

    /* renamed from: l, reason: collision with root package name */
    public static final HashMap f142117l;

    /* renamed from: m, reason: collision with root package name */
    public static final HashMap f142118m;

    /* renamed from: n, reason: collision with root package name */
    public static final List f142119n;

    static {
        StringBuilder sb3 = new StringBuilder();
        yl2.h hVar = yl2.h.f139372c;
        sb3.append(hVar.f139376a.f139467a.toString());
        sb3.append('.');
        sb3.append(hVar.f139377b);
        f142106a = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        yl2.i iVar = yl2.i.f139373c;
        sb4.append(iVar.f139376a.f139467a.toString());
        sb4.append('.');
        sb4.append(iVar.f139377b);
        f142107b = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        yl2.k kVar = yl2.k.f139375c;
        sb5.append(kVar.f139376a.f139467a.toString());
        sb5.append('.');
        sb5.append(kVar.f139377b);
        f142108c = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        yl2.j jVar = yl2.j.f139374c;
        sb6.append(jVar.f139376a.f139467a.toString());
        sb6.append('.');
        sb6.append(jVar.f139377b);
        f142109d = sb6.toString();
        ym2.b j13 = ym2.b.j(new ym2.c("kotlin.jvm.functions.FunctionN"));
        Intrinsics.checkNotNullExpressionValue(j13, "topLevel(...)");
        f142110e = j13;
        ym2.c b13 = j13.b();
        Intrinsics.checkNotNullExpressionValue(b13, "asSingleFqName(...)");
        f142111f = b13;
        f142112g = ym2.j.f139503o;
        e(Class.class);
        f142113h = new HashMap();
        f142114i = new HashMap();
        f142115j = new HashMap();
        f142116k = new HashMap();
        f142117l = new HashMap();
        f142118m = new HashMap();
        ym2.b j14 = ym2.b.j(xl2.q.A);
        Intrinsics.checkNotNullExpressionValue(j14, "topLevel(...)");
        ym2.c cVar = xl2.q.I;
        ym2.c g13 = j14.g();
        ym2.c g14 = j14.g();
        Intrinsics.checkNotNullExpressionValue(g14, "getPackageFqName(...)");
        c cVar2 = new c(e(Iterable.class), j14, new ym2.b(g13, l0.u1(cVar, g14), false));
        ym2.b j15 = ym2.b.j(xl2.q.f135320z);
        Intrinsics.checkNotNullExpressionValue(j15, "topLevel(...)");
        ym2.c cVar3 = xl2.q.H;
        ym2.c g15 = j15.g();
        ym2.c g16 = j15.g();
        Intrinsics.checkNotNullExpressionValue(g16, "getPackageFqName(...)");
        c cVar4 = new c(e(Iterator.class), j15, new ym2.b(g15, l0.u1(cVar3, g16), false));
        ym2.b j16 = ym2.b.j(xl2.q.B);
        Intrinsics.checkNotNullExpressionValue(j16, "topLevel(...)");
        ym2.c cVar5 = xl2.q.f135291J;
        ym2.c g17 = j16.g();
        ym2.c g18 = j16.g();
        Intrinsics.checkNotNullExpressionValue(g18, "getPackageFqName(...)");
        c cVar6 = new c(e(Collection.class), j16, new ym2.b(g17, l0.u1(cVar5, g18), false));
        ym2.b j17 = ym2.b.j(xl2.q.C);
        Intrinsics.checkNotNullExpressionValue(j17, "topLevel(...)");
        ym2.c cVar7 = xl2.q.K;
        ym2.c g19 = j17.g();
        ym2.c g23 = j17.g();
        Intrinsics.checkNotNullExpressionValue(g23, "getPackageFqName(...)");
        c cVar8 = new c(e(List.class), j17, new ym2.b(g19, l0.u1(cVar7, g23), false));
        ym2.b j18 = ym2.b.j(xl2.q.E);
        Intrinsics.checkNotNullExpressionValue(j18, "topLevel(...)");
        ym2.c cVar9 = xl2.q.M;
        ym2.c g24 = j18.g();
        ym2.c g25 = j18.g();
        Intrinsics.checkNotNullExpressionValue(g25, "getPackageFqName(...)");
        c cVar10 = new c(e(Set.class), j18, new ym2.b(g24, l0.u1(cVar9, g25), false));
        ym2.b j19 = ym2.b.j(xl2.q.D);
        Intrinsics.checkNotNullExpressionValue(j19, "topLevel(...)");
        ym2.c cVar11 = xl2.q.L;
        ym2.c g26 = j19.g();
        ym2.c g27 = j19.g();
        Intrinsics.checkNotNullExpressionValue(g27, "getPackageFqName(...)");
        c cVar12 = new c(e(ListIterator.class), j19, new ym2.b(g26, l0.u1(cVar11, g27), false));
        ym2.c cVar13 = xl2.q.F;
        ym2.b j23 = ym2.b.j(cVar13);
        Intrinsics.checkNotNullExpressionValue(j23, "topLevel(...)");
        ym2.c cVar14 = xl2.q.N;
        ym2.c g28 = j23.g();
        ym2.c g29 = j23.g();
        Intrinsics.checkNotNullExpressionValue(g29, "getPackageFqName(...)");
        c cVar15 = new c(e(Map.class), j23, new ym2.b(g28, l0.u1(cVar14, g29), false));
        ym2.b d2 = ym2.b.j(cVar13).d(xl2.q.G.f());
        Intrinsics.checkNotNullExpressionValue(d2, "createNestedClassId(...)");
        ym2.c cVar16 = xl2.q.O;
        ym2.c g33 = d2.g();
        ym2.c g34 = d2.g();
        Intrinsics.checkNotNullExpressionValue(g34, "getPackageFqName(...)");
        ym2.c u13 = l0.u1(cVar16, g34);
        List<c> j24 = f0.j(cVar2, cVar4, cVar6, cVar8, cVar10, cVar12, cVar15, new c(e(Map.Entry.class), d2, new ym2.b(g33, u13, false)));
        f142119n = j24;
        d(Object.class, xl2.q.f135292a);
        d(String.class, xl2.q.f135300f);
        d(CharSequence.class, xl2.q.f135299e);
        c(Throwable.class, xl2.q.f135305k);
        d(Cloneable.class, xl2.q.f135296c);
        d(Number.class, xl2.q.f135303i);
        c(Comparable.class, xl2.q.f135306l);
        d(Enum.class, xl2.q.f135304j);
        c(Annotation.class, xl2.q.f135313s);
        for (c cVar17 : j24) {
            ym2.b bVar = cVar17.f142103a;
            ym2.b bVar2 = cVar17.f142104b;
            a(bVar, bVar2);
            ym2.b bVar3 = cVar17.f142105c;
            ym2.c b14 = bVar3.b();
            Intrinsics.checkNotNullExpressionValue(b14, "asSingleFqName(...)");
            b(b14, bVar);
            f142117l.put(bVar3, bVar2);
            f142118m.put(bVar2, bVar3);
            ym2.c b15 = bVar2.b();
            Intrinsics.checkNotNullExpressionValue(b15, "asSingleFqName(...)");
            ym2.c b16 = bVar3.b();
            Intrinsics.checkNotNullExpressionValue(b16, "asSingleFqName(...)");
            ym2.e i13 = bVar3.b().i();
            Intrinsics.checkNotNullExpressionValue(i13, "toUnsafe(...)");
            f142115j.put(i13, b15);
            ym2.e i14 = b15.i();
            Intrinsics.checkNotNullExpressionValue(i14, "toUnsafe(...)");
            f142116k.put(i14, b16);
        }
        for (gn2.c cVar18 : gn2.c.values()) {
            ym2.b j25 = ym2.b.j(cVar18.getWrapperFqName());
            Intrinsics.checkNotNullExpressionValue(j25, "topLevel(...)");
            xl2.o primitiveType = cVar18.getPrimitiveType();
            Intrinsics.checkNotNullExpressionValue(primitiveType, "getPrimitiveType(...)");
            Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
            ym2.c c13 = xl2.r.f135332l.c(primitiveType.getTypeName());
            Intrinsics.checkNotNullExpressionValue(c13, "child(...)");
            ym2.b j26 = ym2.b.j(c13);
            Intrinsics.checkNotNullExpressionValue(j26, "topLevel(...)");
            a(j25, j26);
        }
        for (ym2.b bVar4 : xl2.e.f135266b) {
            ym2.b j27 = ym2.b.j(new ym2.c("kotlin.jvm.internal." + bVar4.i().b() + "CompanionObject"));
            Intrinsics.checkNotNullExpressionValue(j27, "topLevel(...)");
            ym2.b d13 = bVar4.d(ym2.i.f139483b);
            Intrinsics.checkNotNullExpressionValue(d13, "createNestedClassId(...)");
            a(j27, d13);
        }
        for (int i15 = 0; i15 < 23; i15++) {
            ym2.b j28 = ym2.b.j(new ym2.c(a.a.d("kotlin.jvm.functions.Function", i15)));
            Intrinsics.checkNotNullExpressionValue(j28, "topLevel(...)");
            a(j28, new ym2.b(xl2.r.f135332l, ym2.g.e("Function" + i15)));
            b(new ym2.c(f142107b + i15), f142112g);
        }
        for (int i16 = 0; i16 < 22; i16++) {
            yl2.j jVar2 = yl2.j.f139374c;
            b(new ym2.c(cb.i(jVar2.f139376a.f139467a.toString() + '.' + jVar2.f139377b, i16)), f142112g);
        }
        ym2.c g35 = xl2.q.f135294b.g();
        Intrinsics.checkNotNullExpressionValue(g35, "toSafe(...)");
        b(g35, e(Void.class));
    }

    public static void a(ym2.b bVar, ym2.b bVar2) {
        ym2.e i13 = bVar.b().i();
        Intrinsics.checkNotNullExpressionValue(i13, "toUnsafe(...)");
        f142113h.put(i13, bVar2);
        ym2.c b13 = bVar2.b();
        Intrinsics.checkNotNullExpressionValue(b13, "asSingleFqName(...)");
        b(b13, bVar);
    }

    public static void b(ym2.c cVar, ym2.b bVar) {
        ym2.e i13 = cVar.i();
        Intrinsics.checkNotNullExpressionValue(i13, "toUnsafe(...)");
        f142114i.put(i13, bVar);
    }

    public static void c(Class cls, ym2.c cVar) {
        ym2.b e13 = e(cls);
        ym2.b j13 = ym2.b.j(cVar);
        Intrinsics.checkNotNullExpressionValue(j13, "topLevel(...)");
        a(e13, j13);
    }

    public static void d(Class cls, ym2.e eVar) {
        ym2.c g13 = eVar.g();
        Intrinsics.checkNotNullExpressionValue(g13, "toSafe(...)");
        c(cls, g13);
    }

    public static ym2.b e(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ym2.b j13 = ym2.b.j(new ym2.c(cls.getCanonicalName()));
            Intrinsics.checkNotNullExpressionValue(j13, "topLevel(...)");
            return j13;
        }
        ym2.b d2 = e(declaringClass).d(ym2.g.e(cls.getSimpleName()));
        Intrinsics.checkNotNullExpressionValue(d2, "createNestedClassId(...)");
        return d2;
    }

    public static boolean f(ym2.e eVar, String str) {
        Integer intOrNull;
        String str2 = eVar.f139473a;
        if (str2 == null) {
            ym2.e.a(4);
            throw null;
        }
        Intrinsics.checkNotNullExpressionValue(str2, "asString(...)");
        String a03 = StringsKt.a0(str2, str, "");
        return a03.length() > 0 && !StringsKt.X(a03, '0') && (intOrNull = StringsKt.toIntOrNull(a03)) != null && intOrNull.intValue() >= 23;
    }

    public static ym2.b g(ym2.e kotlinFqName) {
        Intrinsics.checkNotNullParameter(kotlinFqName, "kotlinFqName");
        boolean f13 = f(kotlinFqName, f142106a);
        ym2.b bVar = f142110e;
        if (f13 || f(kotlinFqName, f142108c)) {
            return bVar;
        }
        boolean f14 = f(kotlinFqName, f142107b);
        ym2.b bVar2 = f142112g;
        return (f14 || f(kotlinFqName, f142109d)) ? bVar2 : (ym2.b) f142114i.get(kotlinFqName);
    }
}
