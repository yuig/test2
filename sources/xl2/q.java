package xl2;

import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class q {
    public static final ym2.c A;
    public static final ym2.c B;
    public static final ym2.c C;
    public static final ym2.c D;
    public static final ym2.c E;
    public static final ym2.c F;
    public static final ym2.c G;
    public static final ym2.c H;
    public static final ym2.c I;

    /* renamed from: J, reason: collision with root package name */
    public static final ym2.c f135291J;
    public static final ym2.c K;
    public static final ym2.c L;
    public static final ym2.c M;
    public static final ym2.c N;
    public static final ym2.c O;
    public static final ym2.e P;
    public static final ym2.b Q;
    public static final ym2.b R;
    public static final ym2.b S;
    public static final ym2.b T;
    public static final ym2.b U;
    public static final ym2.c V;
    public static final ym2.c W;
    public static final ym2.c X;
    public static final ym2.c Y;
    public static final HashSet Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final HashSet f135293a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final HashMap f135295b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final HashMap f135297c0;

    /* renamed from: d, reason: collision with root package name */
    public static final ym2.e f135298d;

    /* renamed from: e, reason: collision with root package name */
    public static final ym2.e f135299e;

    /* renamed from: f, reason: collision with root package name */
    public static final ym2.e f135300f;

    /* renamed from: g, reason: collision with root package name */
    public static final ym2.e f135301g;

    /* renamed from: h, reason: collision with root package name */
    public static final ym2.e f135302h;

    /* renamed from: i, reason: collision with root package name */
    public static final ym2.e f135303i;

    /* renamed from: j, reason: collision with root package name */
    public static final ym2.e f135304j;

    /* renamed from: k, reason: collision with root package name */
    public static final ym2.c f135305k;

    /* renamed from: l, reason: collision with root package name */
    public static final ym2.c f135306l;

    /* renamed from: m, reason: collision with root package name */
    public static final ym2.c f135307m;

    /* renamed from: n, reason: collision with root package name */
    public static final ym2.c f135308n;

    /* renamed from: o, reason: collision with root package name */
    public static final ym2.c f135309o;

    /* renamed from: p, reason: collision with root package name */
    public static final ym2.c f135310p;

    /* renamed from: q, reason: collision with root package name */
    public static final ym2.c f135311q;

    /* renamed from: r, reason: collision with root package name */
    public static final ym2.c f135312r;

    /* renamed from: s, reason: collision with root package name */
    public static final ym2.c f135313s;

    /* renamed from: t, reason: collision with root package name */
    public static final ym2.c f135314t;

    /* renamed from: u, reason: collision with root package name */
    public static final ym2.c f135315u;

    /* renamed from: v, reason: collision with root package name */
    public static final ym2.c f135316v;

    /* renamed from: w, reason: collision with root package name */
    public static final ym2.c f135317w;

    /* renamed from: x, reason: collision with root package name */
    public static final ym2.c f135318x;

    /* renamed from: y, reason: collision with root package name */
    public static final ym2.c f135319y;

    /* renamed from: z, reason: collision with root package name */
    public static final ym2.c f135320z;

    /* renamed from: a, reason: collision with root package name */
    public static final ym2.e f135292a = d("Any");

    /* renamed from: b, reason: collision with root package name */
    public static final ym2.e f135294b = d("Nothing");

    /* renamed from: c, reason: collision with root package name */
    public static final ym2.e f135296c = d("Cloneable");

    static {
        c("Suppress");
        f135298d = d("Unit");
        f135299e = d("CharSequence");
        f135300f = d("String");
        f135301g = d("Array");
        f135302h = d("Boolean");
        d("Char");
        d("Byte");
        d("Short");
        d("Int");
        d("Long");
        d("Float");
        d("Double");
        f135303i = d("Number");
        f135304j = d("Enum");
        d("Function");
        f135305k = c("Throwable");
        f135306l = c("Comparable");
        ym2.c cVar = r.f135335o;
        Intrinsics.checkNotNullExpressionValue(cVar.c(ym2.g.e("IntRange")).i(), "toUnsafe(...)");
        Intrinsics.checkNotNullExpressionValue(cVar.c(ym2.g.e("LongRange")).i(), "toUnsafe(...)");
        f135307m = c("Deprecated");
        c("DeprecatedSinceKotlin");
        f135308n = c("DeprecationLevel");
        f135309o = c("ReplaceWith");
        f135310p = c("ExtensionFunctionType");
        f135311q = c("ContextFunctionTypeParams");
        ym2.c c13 = c("ParameterName");
        f135312r = c13;
        Intrinsics.checkNotNullExpressionValue(ym2.b.j(c13), "topLevel(...)");
        f135313s = c("Annotation");
        ym2.c a13 = a("Target");
        f135314t = a13;
        Intrinsics.checkNotNullExpressionValue(ym2.b.j(a13), "topLevel(...)");
        f135315u = a("AnnotationTarget");
        f135316v = a("AnnotationRetention");
        ym2.c a14 = a("Retention");
        f135317w = a14;
        Intrinsics.checkNotNullExpressionValue(ym2.b.j(a14), "topLevel(...)");
        Intrinsics.checkNotNullExpressionValue(ym2.b.j(a("Repeatable")), "topLevel(...)");
        f135318x = a("MustBeDocumented");
        f135319y = c("UnsafeVariance");
        c("PublishedApi");
        Intrinsics.checkNotNullExpressionValue(r.f135336p.c(ym2.g.e("AccessibleLateinitPropertyLiteral")), "child(...)");
        f135320z = b("Iterator");
        A = b("Iterable");
        B = b("Collection");
        C = b("List");
        D = b("ListIterator");
        E = b("Set");
        ym2.c b13 = b("Map");
        F = b13;
        ym2.c c14 = b13.c(ym2.g.e("Entry"));
        Intrinsics.checkNotNullExpressionValue(c14, "child(...)");
        G = c14;
        H = b("MutableIterator");
        I = b("MutableIterable");
        f135291J = b("MutableCollection");
        K = b("MutableList");
        L = b("MutableListIterator");
        M = b("MutableSet");
        ym2.c b14 = b("MutableMap");
        N = b14;
        ym2.c c15 = b14.c(ym2.g.e("MutableEntry"));
        Intrinsics.checkNotNullExpressionValue(c15, "child(...)");
        O = c15;
        P = e("KClass");
        e("KType");
        e("KCallable");
        e("KProperty0");
        e("KProperty1");
        e("KProperty2");
        e("KMutableProperty0");
        e("KMutableProperty1");
        e("KMutableProperty2");
        ym2.e e13 = e("KProperty");
        e("KMutableProperty");
        ym2.b j13 = ym2.b.j(e13.g());
        Intrinsics.checkNotNullExpressionValue(j13, "topLevel(...)");
        Q = j13;
        e("KDeclarationContainer");
        ym2.c c16 = c("UByte");
        ym2.c c17 = c("UShort");
        ym2.c c18 = c("UInt");
        ym2.c c19 = c("ULong");
        ym2.b j14 = ym2.b.j(c16);
        Intrinsics.checkNotNullExpressionValue(j14, "topLevel(...)");
        R = j14;
        ym2.b j15 = ym2.b.j(c17);
        Intrinsics.checkNotNullExpressionValue(j15, "topLevel(...)");
        S = j15;
        ym2.b j16 = ym2.b.j(c18);
        Intrinsics.checkNotNullExpressionValue(j16, "topLevel(...)");
        T = j16;
        ym2.b j17 = ym2.b.j(c19);
        Intrinsics.checkNotNullExpressionValue(j17, "topLevel(...)");
        U = j17;
        V = c("UByteArray");
        W = c("UShortArray");
        X = c("UIntArray");
        Y = c("ULongArray");
        int length = o.values().length;
        HashSet hashSet = new HashSet(length < 3 ? 3 : (length / 3) + length + 1);
        for (o oVar : o.values()) {
            hashSet.add(oVar.getTypeName());
        }
        Z = hashSet;
        int length2 = o.values().length;
        HashSet hashSet2 = new HashSet(length2 < 3 ? 3 : (length2 / 3) + length2 + 1);
        for (o oVar2 : o.values()) {
            hashSet2.add(oVar2.getArrayTypeName());
        }
        f135293a0 = hashSet2;
        int length3 = o.values().length;
        HashMap hashMap = new HashMap(length3 < 3 ? 3 : (length3 / 3) + length3 + 1);
        for (o oVar3 : o.values()) {
            String b15 = oVar3.getTypeName().b();
            Intrinsics.checkNotNullExpressionValue(b15, "asString(...)");
            hashMap.put(d(b15), oVar3);
        }
        f135295b0 = hashMap;
        int length4 = o.values().length;
        HashMap hashMap2 = new HashMap(length4 >= 3 ? (length4 / 3) + length4 + 1 : 3);
        for (o oVar4 : o.values()) {
            String b16 = oVar4.getArrayTypeName().b();
            Intrinsics.checkNotNullExpressionValue(b16, "asString(...)");
            hashMap2.put(d(b16), oVar4);
        }
        f135297c0 = hashMap2;
    }

    public static ym2.c a(String str) {
        ym2.c c13 = r.f135333m.c(ym2.g.e(str));
        Intrinsics.checkNotNullExpressionValue(c13, "child(...)");
        return c13;
    }

    public static ym2.c b(String str) {
        ym2.c c13 = r.f135334n.c(ym2.g.e(str));
        Intrinsics.checkNotNullExpressionValue(c13, "child(...)");
        return c13;
    }

    public static ym2.c c(String str) {
        ym2.c c13 = r.f135332l.c(ym2.g.e(str));
        Intrinsics.checkNotNullExpressionValue(c13, "child(...)");
        return c13;
    }

    public static ym2.e d(String str) {
        ym2.e i13 = c(str).i();
        Intrinsics.checkNotNullExpressionValue(i13, "toUnsafe(...)");
        return i13;
    }

    public static final ym2.e e(String simpleName) {
        Intrinsics.checkNotNullParameter(simpleName, "simpleName");
        ym2.e i13 = r.f135329i.c(ym2.g.e(simpleName)).i();
        Intrinsics.checkNotNullExpressionValue(i13, "toUnsafe(...)");
        return i13;
    }
}
