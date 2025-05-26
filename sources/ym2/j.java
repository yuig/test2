package ym2;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.g0;
import kotlin.collections.h1;
import kotlin.collections.i1;
import kotlin.collections.y0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f139489a = new j();

    /* renamed from: b, reason: collision with root package name */
    public static final c f139490b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f139491c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f139492d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f139493e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f139494f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f139495g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f139496h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f139497i;

    /* renamed from: j, reason: collision with root package name */
    public static final b f139498j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f139499k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f139500l;

    /* renamed from: m, reason: collision with root package name */
    public static final b f139501m;

    /* renamed from: n, reason: collision with root package name */
    public static final b f139502n;

    /* renamed from: o, reason: collision with root package name */
    public static final b f139503o;

    /* renamed from: p, reason: collision with root package name */
    public static final Set f139504p;

    /* renamed from: q, reason: collision with root package name */
    public static final Set f139505q;

    /* renamed from: r, reason: collision with root package name */
    public static final b f139506r;

    /* renamed from: s, reason: collision with root package name */
    public static final b f139507s;

    /* renamed from: t, reason: collision with root package name */
    public static final b f139508t;

    /* renamed from: u, reason: collision with root package name */
    public static final b f139509u;

    static {
        c cVar = new c("kotlin");
        f139490b = cVar;
        c c13 = cVar.c(g.e("reflect"));
        Intrinsics.checkNotNullExpressionValue(c13, "child(...)");
        f139491c = c13;
        c c14 = cVar.c(g.e("collections"));
        Intrinsics.checkNotNullExpressionValue(c14, "child(...)");
        f139492d = c14;
        c c15 = cVar.c(g.e("ranges"));
        Intrinsics.checkNotNullExpressionValue(c15, "child(...)");
        f139493e = c15;
        c c16 = cVar.c(g.e("jvm"));
        Intrinsics.checkNotNullExpressionValue(c16, "child(...)");
        Intrinsics.checkNotNullExpressionValue(c16.c(g.e("internal")), "child(...)");
        c c17 = cVar.c(g.e("annotation"));
        Intrinsics.checkNotNullExpressionValue(c17, "child(...)");
        f139494f = c17;
        c c18 = cVar.c(g.e("internal"));
        Intrinsics.checkNotNullExpressionValue(c18, "child(...)");
        Intrinsics.checkNotNullExpressionValue(c18.c(g.e("ir")), "child(...)");
        c c19 = cVar.c(g.e("coroutines"));
        Intrinsics.checkNotNullExpressionValue(c19, "child(...)");
        f139495g = c19;
        c c23 = cVar.c(g.e("enums"));
        Intrinsics.checkNotNullExpressionValue(c23, "child(...)");
        f139496h = c23;
        Intrinsics.checkNotNullExpressionValue(cVar.c(g.e("contracts")), "child(...)");
        Intrinsics.checkNotNullExpressionValue(cVar.c(g.e("concurrent")), "child(...)");
        Intrinsics.checkNotNullExpressionValue(cVar.c(g.e("test")), "child(...)");
        h1.f(cVar, c14, c15, c17, c13, c18, c19);
        k.a("Nothing");
        k.a("Unit");
        k.a("Any");
        k.a("Enum");
        k.a("Annotation");
        f139497i = k.a("Array");
        b a13 = k.a("Boolean");
        b a14 = k.a("Char");
        b a15 = k.a("Byte");
        b a16 = k.a("Short");
        b a17 = k.a("Int");
        b a18 = k.a("Long");
        b a19 = k.a("Float");
        b a23 = k.a("Double");
        f139498j = k.f(a15);
        f139499k = k.f(a16);
        f139500l = k.f(a17);
        f139501m = k.f(a18);
        k.a("CharSequence");
        f139502n = k.a("String");
        k.a("Throwable");
        k.a("Cloneable");
        k.e("KProperty");
        k.e("KMutableProperty");
        k.e("KProperty0");
        k.e("KMutableProperty0");
        k.e("KProperty1");
        k.e("KMutableProperty1");
        k.e("KProperty2");
        k.e("KMutableProperty2");
        f139503o = k.e("KFunction");
        k.e("KClass");
        k.e("KCallable");
        k.e("KType");
        k.a("Comparable");
        k.a("Number");
        k.a("Function");
        Set f13 = h1.f(a13, a14, a15, a16, a17, a18, a19, a23);
        f139504p = f13;
        Set set = f13;
        int a24 = y0.a(g0.q(set, 10));
        if (a24 < 16) {
            a24 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a24);
        for (Object obj : set) {
            g i13 = ((b) obj).i();
            Intrinsics.checkNotNullExpressionValue(i13, "getShortClassName(...)");
            linkedHashMap.put(obj, k.d(i13));
        }
        k.c(linkedHashMap);
        Set f14 = h1.f(f139498j, f139499k, f139500l, f139501m);
        f139505q = f14;
        Set set2 = f14;
        int a25 = y0.a(g0.q(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(a25 >= 16 ? a25 : 16);
        for (Object obj2 : set2) {
            g i14 = ((b) obj2).i();
            Intrinsics.checkNotNullExpressionValue(i14, "getShortClassName(...)");
            linkedHashMap2.put(obj2, k.d(i14));
        }
        k.c(linkedHashMap2);
        i1.j(i1.i(f139504p, f139505q), f139502n);
        c cVar2 = f139495g;
        g e13 = g.e("Continuation");
        if (cVar2 == null) {
            b.a(3);
            throw null;
        }
        c.j(e13);
        k.b("Iterator");
        k.b("Iterable");
        k.b("Collection");
        k.b("List");
        k.b("ListIterator");
        k.b("Set");
        b b13 = k.b("Map");
        k.b("MutableIterator");
        k.b("CharIterator");
        k.b("MutableIterable");
        k.b("MutableCollection");
        f139506r = k.b("MutableList");
        k.b("MutableListIterator");
        f139507s = k.b("MutableSet");
        b b14 = k.b("MutableMap");
        f139508t = b14;
        Intrinsics.checkNotNullExpressionValue(b13.d(g.e("Entry")), "createNestedClassId(...)");
        Intrinsics.checkNotNullExpressionValue(b14.d(g.e("MutableEntry")), "createNestedClassId(...)");
        k.a("Result");
        c cVar3 = f139493e;
        g e14 = g.e("IntRange");
        if (cVar3 == null) {
            b.a(3);
            throw null;
        }
        c.j(e14);
        g e15 = g.e("LongRange");
        if (cVar3 == null) {
            b.a(3);
            throw null;
        }
        c.j(e15);
        g e16 = g.e("CharRange");
        if (cVar3 == null) {
            b.a(3);
            throw null;
        }
        c.j(e16);
        c cVar4 = f139494f;
        g e17 = g.e("AnnotationRetention");
        if (cVar4 == null) {
            b.a(3);
            throw null;
        }
        c.j(e17);
        g e18 = g.e("AnnotationTarget");
        if (cVar4 == null) {
            b.a(3);
            throw null;
        }
        c.j(e18);
        k.a("DeprecationLevel");
        f139509u = new b(f139496h, g.e("EnumEntries"));
    }
}
