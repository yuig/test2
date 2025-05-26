package ht1;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements mt1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f70143a;

    public a(d dVar) {
        this.f70143a = dVar;
    }

    @Override // mt1.d
    public final void c(Function1 producePacketCallback) {
        Intrinsics.checkNotNullParameter(producePacketCallback, "producePacketCallback");
        nt1.a aVar = this.f70143a.f70186f;
        Intrinsics.f(aVar);
        producePacketCallback.invoke(aVar);
    }

    @Override // mt1.d
    public final void d(Function0 doneProducingCallback) {
        Intrinsics.checkNotNullParameter(doneProducingCallback, "doneProducingCallback");
        this.f70143a.f70200t = doneProducingCallback;
    }
}
