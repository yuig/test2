package cl2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f extends dl2.h {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(bl2.c cVar) {
        super(cVar);
        Intrinsics.g(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        ue.c.H(obj);
        return obj;
    }
}
