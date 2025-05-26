package bm2;

import dn2.x;
import kotlin.Pair;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import xl2.q;

/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ym2.g f23535a;

    /* renamed from: b, reason: collision with root package name */
    public static final ym2.g f23536b;

    /* renamed from: c, reason: collision with root package name */
    public static final ym2.g f23537c;

    /* renamed from: d, reason: collision with root package name */
    public static final ym2.g f23538d;

    /* renamed from: e, reason: collision with root package name */
    public static final ym2.g f23539e;

    static {
        ym2.g e13 = ym2.g.e("message");
        Intrinsics.checkNotNullExpressionValue(e13, "identifier(...)");
        f23535a = e13;
        ym2.g e14 = ym2.g.e("replaceWith");
        Intrinsics.checkNotNullExpressionValue(e14, "identifier(...)");
        f23536b = e14;
        ym2.g e15 = ym2.g.e("level");
        Intrinsics.checkNotNullExpressionValue(e15, "identifier(...)");
        f23537c = e15;
        ym2.g e16 = ym2.g.e("expression");
        Intrinsics.checkNotNullExpressionValue(e16, "identifier(...)");
        f23538d = e16;
        ym2.g e17 = ym2.g.e("imports");
        Intrinsics.checkNotNullExpressionValue(e17, "identifier(...)");
        f23539e = e17;
    }

    public static final k a(xl2.l lVar, String message, String replaceWith, String level, boolean z13) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(replaceWith, "replaceWith");
        Intrinsics.checkNotNullParameter(level, "level");
        k value = new k(lVar, q.f135309o, z0.g(new Pair(f23538d, new x(replaceWith)), new Pair(f23539e, new dn2.b(q0.f80391a, new e82.l(lVar, 12)))));
        ym2.c cVar = q.f135307m;
        Pair pair = new Pair(f23535a, new x(message));
        Intrinsics.checkNotNullParameter(value, "value");
        Pair pair2 = new Pair(f23536b, new dn2.a((Object) value));
        ym2.b j13 = ym2.b.j(q.f135308n);
        Intrinsics.checkNotNullExpressionValue(j13, "topLevel(...)");
        ym2.g e13 = ym2.g.e(level);
        Intrinsics.checkNotNullExpressionValue(e13, "identifier(...)");
        return new k(lVar, cVar, z0.g(pair, pair2, new Pair(f23537c, new dn2.i(j13, e13))));
    }
}
