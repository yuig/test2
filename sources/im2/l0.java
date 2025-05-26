package im2;

import dm2.u0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class l0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final l0 f72751i = new l0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        am2.d it = (am2.d) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        int i13 = e.f72718m;
        u0 functionDescriptor = (u0) it;
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        return Boolean.valueOf(xl2.l.B(functionDescriptor) && fn2.d.b(functionDescriptor, new e82.l(functionDescriptor, 14)) != null);
    }
}
