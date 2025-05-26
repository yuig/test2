package zc;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes3.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public static final a f141580i = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable it = (Throwable) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        System.out.println((Object) "Apollo: unhandled exception");
        it.printStackTrace();
        return Unit.f80348a;
    }
}
