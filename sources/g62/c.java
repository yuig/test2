package g62;

import ao2.m0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class c extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final c f63740i = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        me2.c gpuBackend = (me2.c) obj;
        Intrinsics.checkNotNullParameter(gpuBackend, "gpuBackend");
        m0.O(gpuBackend);
        return Unit.f80348a;
    }
}
