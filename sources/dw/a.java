package dw;

import h32.g0;
import h32.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f56399i = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        h0 update = (h0) obj;
        Intrinsics.checkNotNullParameter(update, "$this$update");
        update.f67045d = g0.FLOWED_PIN;
        return Unit.f80348a;
    }
}
