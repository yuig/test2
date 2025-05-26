package qm2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pn2.b0;

/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final l f104431i = new l(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        am2.d it = (am2.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        dm2.d D = it.D();
        Intrinsics.f(D);
        b0 type = D.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return type;
    }
}
