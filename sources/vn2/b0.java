package vn2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final b0 f126310i = new b0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        xl2.l lVar = (xl2.l) obj;
        Intrinsics.checkNotNullParameter(lVar, "$this$null");
        lVar.getClass();
        pn2.h0 t13 = lVar.t(xl2.o.BOOLEAN);
        if (t13 != null) {
            Intrinsics.checkNotNullExpressionValue(t13, "getBooleanType(...)");
            return t13;
        }
        xl2.l.a(64);
        throw null;
    }
}
