package co2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class f extends kotlin.jvm.internal.p implements kl2.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28301a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Object obj, int i13) {
        super(3, obj, m.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        this.f28301a = i13;
        if (i13 != 1) {
        } else {
            super(3, obj, m.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f28301a) {
            case 0:
                Function1 function1 = ((m) this.receiver).f28322b;
                Intrinsics.f(function1);
                kg.t.r(function1, obj2, (CoroutineContext) obj3);
                break;
            default:
                Object obj4 = ((t) obj2).f28348a;
                Function1 function12 = ((m) this.receiver).f28322b;
                Intrinsics.f(function12);
                Object b13 = t.b(obj4);
                Intrinsics.f(b13);
                kg.t.r(function12, b13, (CoroutineContext) obj3);
                break;
        }
        return Unit.f80348a;
    }
}
