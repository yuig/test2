package so2;

import java.util.Set;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;
import qo2.p1;
import qo2.s1;
import qo2.v1;
import qo2.y1;

/* loaded from: classes4.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f114786a;

    static {
        Intrinsics.checkNotNullParameter(xk2.b0.f135200b, "<this>");
        Intrinsics.checkNotNullParameter(xk2.e0.f135207b, "<this>");
        Intrinsics.checkNotNullParameter(xk2.y.f135237b, "<this>");
        Intrinsics.checkNotNullParameter(xk2.i0.f135212b, "<this>");
        f114786a = h1.f(s1.f104622b, v1.f104641b, p1.f104609b, y1.f104668b);
    }

    public static final boolean a(oo2.g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        return gVar.isInline() && f114786a.contains(gVar);
    }
}
