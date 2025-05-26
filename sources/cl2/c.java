package cl2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public int f27993r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function1 f27994s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(io2.f fVar, CoroutineContext coroutineContext, io2.d dVar) {
        super(fVar, coroutineContext);
        this.f27994s = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f27993r;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f27993r = 2;
            ue.c.H(obj);
            return obj;
        }
        this.f27993r = 1;
        ue.c.H(obj);
        Function1 function1 = this.f27994s;
        Intrinsics.g(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
        dl2.b.y(1, function1);
        return function1.invoke(this);
    }
}
