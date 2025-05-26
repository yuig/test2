package co2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public static final n f28324a = new n();

    public n() {
        super(2, o.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        u uVar = (u) obj2;
        u uVar2 = o.f28325a;
        m mVar = uVar.f28349e;
        Intrinsics.f(mVar);
        return new u(longValue, uVar, mVar, 0);
    }
}
