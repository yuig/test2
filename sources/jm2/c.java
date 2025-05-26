package jm2;

import im2.d0;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import xl2.q;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ym2.g f77050a;

    /* renamed from: b, reason: collision with root package name */
    public static final ym2.g f77051b;

    /* renamed from: c, reason: collision with root package name */
    public static final ym2.g f77052c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f77053d;

    static {
        ym2.g e13 = ym2.g.e("message");
        Intrinsics.checkNotNullExpressionValue(e13, "identifier(...)");
        f77050a = e13;
        ym2.g e14 = ym2.g.e("allowedTargets");
        Intrinsics.checkNotNullExpressionValue(e14, "identifier(...)");
        f77051b = e14;
        ym2.g e15 = ym2.g.e("value");
        Intrinsics.checkNotNullExpressionValue(e15, "identifier(...)");
        f77052c = e15;
        f77053d = z0.g(new Pair(q.f135314t, d0.f72703c), new Pair(q.f135317w, d0.f72704d), new Pair(q.f135318x, d0.f72706f));
    }

    public static km2.i a(ym2.c kotlinName, pm2.d annotationOwner, rg.a c13) {
        pm2.a a13;
        Intrinsics.checkNotNullParameter(kotlinName, "kotlinName");
        Intrinsics.checkNotNullParameter(annotationOwner, "annotationOwner");
        Intrinsics.checkNotNullParameter(c13, "c");
        if (Intrinsics.d(kotlinName, q.f135307m)) {
            ym2.c DEPRECATED_ANNOTATION = d0.f72705e;
            Intrinsics.checkNotNullExpressionValue(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            pm2.a a14 = annotationOwner.a(DEPRECATED_ANNOTATION);
            if (a14 != null) {
                return new g(a14, c13);
            }
        }
        ym2.c cVar = (ym2.c) f77053d.get(kotlinName);
        if (cVar == null || (a13 = annotationOwner.a(cVar)) == null) {
            return null;
        }
        return b(c13, a13, false);
    }

    public static km2.i b(rg.a c13, pm2.a annotation, boolean z13) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c13, "c");
        gm2.e eVar = (gm2.e) annotation;
        ym2.b a13 = gm2.d.a(l0.t0(l0.m0(eVar.f65765a)));
        if (Intrinsics.d(a13, ym2.b.j(d0.f72703c))) {
            return new l(eVar, c13);
        }
        if (Intrinsics.d(a13, ym2.b.j(d0.f72704d))) {
            return new k(eVar, c13);
        }
        if (Intrinsics.d(a13, ym2.b.j(d0.f72706f))) {
            return new b(c13, eVar, q.f135318x);
        }
        if (Intrinsics.d(a13, ym2.b.j(d0.f72705e))) {
            return null;
        }
        return new mm2.f(c13, eVar, z13);
    }
}
