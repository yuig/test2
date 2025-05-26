package vl2;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class z extends b0 implements f {

    /* renamed from: d, reason: collision with root package name */
    public final Object f126196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Object obj, Method unboxMethod) {
        super(unboxMethod, q0.f80391a);
        Intrinsics.checkNotNullParameter(unboxMethod, "unboxMethod");
        this.f126196d = obj;
    }

    @Override // vl2.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        dl2.b.F(this, args);
        Intrinsics.checkNotNullParameter(args, "args");
        return this.f126149a.invoke(this.f126196d, Arrays.copyOf(args, args.length));
    }
}
