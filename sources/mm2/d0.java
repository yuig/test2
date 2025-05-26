package mm2;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d0 implements wn2.a {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f87659a = new d0();

    @Override // wn2.a
    public final Iterable a(Object obj) {
        int i13 = i0.f87697p;
        Collection c13 = ((am2.g) obj).e().c();
        Intrinsics.checkNotNullExpressionValue(c13, "getSupertypes(...)");
        return yn2.c0.g(yn2.c0.q(CollectionsKt.K(c13), g0.f87674i));
    }
}
