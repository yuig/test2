package vl2;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class r extends x implements f {

    /* renamed from: f, reason: collision with root package name */
    public final Object f126187f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Object obj, Method method) {
        super(method, false, 4);
        Intrinsics.checkNotNullParameter(method, "method");
        this.f126187f = obj;
    }

    @Override // vl2.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        dl2.b.F(this, args);
        return e(args, this.f126187f);
    }
}
