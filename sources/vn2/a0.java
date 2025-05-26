package vn2;

import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.g1;
import kotlin.collections.h1;
import kotlin.collections.i1;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ym2.g f126287a;

    /* renamed from: b, reason: collision with root package name */
    public static final ym2.g f126288b;

    /* renamed from: c, reason: collision with root package name */
    public static final ym2.g f126289c;

    /* renamed from: d, reason: collision with root package name */
    public static final ym2.g f126290d;

    /* renamed from: e, reason: collision with root package name */
    public static final ym2.g f126291e;

    /* renamed from: f, reason: collision with root package name */
    public static final ym2.g f126292f;

    /* renamed from: g, reason: collision with root package name */
    public static final ym2.g f126293g;

    /* renamed from: h, reason: collision with root package name */
    public static final ym2.g f126294h;

    /* renamed from: i, reason: collision with root package name */
    public static final ym2.g f126295i;

    /* renamed from: j, reason: collision with root package name */
    public static final ym2.g f126296j;

    /* renamed from: k, reason: collision with root package name */
    public static final ym2.g f126297k;

    /* renamed from: l, reason: collision with root package name */
    public static final ym2.g f126298l;

    /* renamed from: m, reason: collision with root package name */
    public static final Regex f126299m;

    /* renamed from: n, reason: collision with root package name */
    public static final ym2.g f126300n;

    /* renamed from: o, reason: collision with root package name */
    public static final ym2.g f126301o;

    /* renamed from: p, reason: collision with root package name */
    public static final ym2.g f126302p;

    /* renamed from: q, reason: collision with root package name */
    public static final ym2.g f126303q;

    /* renamed from: r, reason: collision with root package name */
    public static final Set f126304r;

    /* renamed from: s, reason: collision with root package name */
    public static final Set f126305s;

    /* renamed from: t, reason: collision with root package name */
    public static final Set f126306t;

    /* renamed from: u, reason: collision with root package name */
    public static final Map f126307u;

    static {
        ym2.g e13 = ym2.g.e("getValue");
        Intrinsics.checkNotNullExpressionValue(e13, "identifier(...)");
        f126287a = e13;
        ym2.g e14 = ym2.g.e("setValue");
        Intrinsics.checkNotNullExpressionValue(e14, "identifier(...)");
        f126288b = e14;
        ym2.g e15 = ym2.g.e("provideDelegate");
        Intrinsics.checkNotNullExpressionValue(e15, "identifier(...)");
        f126289c = e15;
        ym2.g e16 = ym2.g.e("equals");
        Intrinsics.checkNotNullExpressionValue(e16, "identifier(...)");
        f126290d = e16;
        Intrinsics.checkNotNullExpressionValue(ym2.g.e("hashCode"), "identifier(...)");
        ym2.g e17 = ym2.g.e("compareTo");
        Intrinsics.checkNotNullExpressionValue(e17, "identifier(...)");
        f126291e = e17;
        ym2.g e18 = ym2.g.e("contains");
        Intrinsics.checkNotNullExpressionValue(e18, "identifier(...)");
        f126292f = e18;
        ym2.g e19 = ym2.g.e("invoke");
        Intrinsics.checkNotNullExpressionValue(e19, "identifier(...)");
        f126293g = e19;
        ym2.g e23 = ym2.g.e("iterator");
        Intrinsics.checkNotNullExpressionValue(e23, "identifier(...)");
        f126294h = e23;
        ym2.g e24 = ym2.g.e("get");
        Intrinsics.checkNotNullExpressionValue(e24, "identifier(...)");
        f126295i = e24;
        ym2.g e25 = ym2.g.e("set");
        Intrinsics.checkNotNullExpressionValue(e25, "identifier(...)");
        f126296j = e25;
        ym2.g e26 = ym2.g.e("next");
        Intrinsics.checkNotNullExpressionValue(e26, "identifier(...)");
        f126297k = e26;
        ym2.g e27 = ym2.g.e("hasNext");
        Intrinsics.checkNotNullExpressionValue(e27, "identifier(...)");
        f126298l = e27;
        Intrinsics.checkNotNullExpressionValue(ym2.g.e("toString"), "identifier(...)");
        f126299m = new Regex("component\\d+");
        ym2.g e28 = ym2.g.e("and");
        Intrinsics.checkNotNullExpressionValue(e28, "identifier(...)");
        ym2.g e29 = ym2.g.e("or");
        Intrinsics.checkNotNullExpressionValue(e29, "identifier(...)");
        ym2.g e33 = ym2.g.e("xor");
        Intrinsics.checkNotNullExpressionValue(e33, "identifier(...)");
        ym2.g e34 = ym2.g.e("inv");
        Intrinsics.checkNotNullExpressionValue(e34, "identifier(...)");
        ym2.g e35 = ym2.g.e("shl");
        Intrinsics.checkNotNullExpressionValue(e35, "identifier(...)");
        ym2.g e36 = ym2.g.e("shr");
        Intrinsics.checkNotNullExpressionValue(e36, "identifier(...)");
        ym2.g e37 = ym2.g.e("ushr");
        Intrinsics.checkNotNullExpressionValue(e37, "identifier(...)");
        ym2.g e38 = ym2.g.e("inc");
        Intrinsics.checkNotNullExpressionValue(e38, "identifier(...)");
        f126300n = e38;
        ym2.g e39 = ym2.g.e("dec");
        Intrinsics.checkNotNullExpressionValue(e39, "identifier(...)");
        f126301o = e39;
        ym2.g e43 = ym2.g.e("plus");
        Intrinsics.checkNotNullExpressionValue(e43, "identifier(...)");
        ym2.g e44 = ym2.g.e("minus");
        Intrinsics.checkNotNullExpressionValue(e44, "identifier(...)");
        ym2.g e45 = ym2.g.e("not");
        Intrinsics.checkNotNullExpressionValue(e45, "identifier(...)");
        ym2.g e46 = ym2.g.e("unaryMinus");
        Intrinsics.checkNotNullExpressionValue(e46, "identifier(...)");
        ym2.g e47 = ym2.g.e("unaryPlus");
        Intrinsics.checkNotNullExpressionValue(e47, "identifier(...)");
        ym2.g e48 = ym2.g.e("times");
        Intrinsics.checkNotNullExpressionValue(e48, "identifier(...)");
        ym2.g e49 = ym2.g.e("div");
        Intrinsics.checkNotNullExpressionValue(e49, "identifier(...)");
        ym2.g e53 = ym2.g.e("mod");
        Intrinsics.checkNotNullExpressionValue(e53, "identifier(...)");
        ym2.g e54 = ym2.g.e("rem");
        Intrinsics.checkNotNullExpressionValue(e54, "identifier(...)");
        ym2.g e55 = ym2.g.e("rangeTo");
        Intrinsics.checkNotNullExpressionValue(e55, "identifier(...)");
        f126302p = e55;
        ym2.g e56 = ym2.g.e("rangeUntil");
        Intrinsics.checkNotNullExpressionValue(e56, "identifier(...)");
        f126303q = e56;
        ym2.g e57 = ym2.g.e("timesAssign");
        Intrinsics.checkNotNullExpressionValue(e57, "identifier(...)");
        ym2.g e58 = ym2.g.e("divAssign");
        Intrinsics.checkNotNullExpressionValue(e58, "identifier(...)");
        ym2.g e59 = ym2.g.e("modAssign");
        Intrinsics.checkNotNullExpressionValue(e59, "identifier(...)");
        ym2.g e63 = ym2.g.e("remAssign");
        Intrinsics.checkNotNullExpressionValue(e63, "identifier(...)");
        ym2.g e64 = ym2.g.e("plusAssign");
        Intrinsics.checkNotNullExpressionValue(e64, "identifier(...)");
        ym2.g e65 = ym2.g.e("minusAssign");
        Intrinsics.checkNotNullExpressionValue(e65, "identifier(...)");
        h1.f(e38, e39, e47, e46, e45, e34);
        f126304r = h1.f(e47, e46, e45, e34);
        Set f13 = h1.f(e48, e43, e44, e49, e53, e54, e55, e56);
        f126305s = f13;
        i1.i(i1.i(f13, h1.f(e28, e29, e33, e34, e35, e36, e37)), h1.f(e16, e18, e17));
        Set f14 = h1.f(e57, e58, e59, e63, e64, e65);
        f126306t = f14;
        h1.f(e13, e14, e15);
        f126307u = z0.g(new Pair(e53, e54), new Pair(e59, e63));
        i1.i(g1.b(e25), f14);
    }
}
