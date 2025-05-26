package vl2;

import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o extends q implements f {
    @Override // vl2.q, vl2.g
    public final Object call(Object[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        c(args);
        ((Field) this.f126192a).set(null, kotlin.collections.c0.N(args));
        return Unit.f80348a;
    }
}
