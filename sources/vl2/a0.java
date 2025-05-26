package vl2;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a0 extends b0 {
    @Override // vl2.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        dl2.b.F(this, args);
        Object obj = args[0];
        Object[] args2 = args.length <= 1 ? new Object[0] : kotlin.collections.z.n(1, args.length, args);
        Intrinsics.checkNotNullParameter(args2, "args");
        return this.f126149a.invoke(obj, Arrays.copyOf(args2, args2.length));
    }
}
