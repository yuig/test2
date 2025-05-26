package cl2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends dl2.h {

    /* renamed from: r, reason: collision with root package name */
    public int f27995r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function2 f27996s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f27997t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Function2 function2, Object obj, bl2.c cVar) {
        super(cVar);
        this.f27996s = function2;
        this.f27997t = obj;
        Intrinsics.g(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f27995r;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f27995r = 2;
            ue.c.H(obj);
            return obj;
        }
        this.f27995r = 1;
        ue.c.H(obj);
        Function2 function2 = this.f27996s;
        Intrinsics.g(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        dl2.b.y(2, function2);
        return function2.invoke(this.f27997t, this);
    }
}
