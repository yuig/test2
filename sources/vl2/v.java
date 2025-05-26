package vl2;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v extends x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Method method) {
        super(method, false, 6);
        Intrinsics.checkNotNullParameter(method, "method");
    }

    @Override // vl2.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        dl2.b.F(this, args);
        return e(args.length <= 1 ? new Object[0] : kotlin.collections.z.n(1, args.length, args), args[0]);
    }
}
