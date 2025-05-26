package cl2;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b extends dl2.h {

    /* renamed from: r, reason: collision with root package name */
    public int f27991r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Function1 f27992s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(io2.d dVar, io2.f fVar) {
        super(fVar);
        this.f27992s = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f27991r;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f27991r = 2;
            ue.c.H(obj);
            return obj;
        }
        this.f27991r = 1;
        ue.c.H(obj);
        Function1 function1 = this.f27992s;
        Intrinsics.g(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
        dl2.b.y(1, function1);
        return function1.invoke(this);
    }
}
