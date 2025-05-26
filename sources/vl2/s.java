package vl2;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s extends x implements f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Method method) {
        super(method, false, 4);
        Intrinsics.checkNotNullParameter(method, "method");
    }

    @Override // vl2.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        dl2.b.F(this, args);
        return e(args, null);
    }
}
