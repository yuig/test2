package io2;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import xk2.q;
import xk2.s;

/* loaded from: classes2.dex */
public final class c implements bl2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f73324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f73325b;

    public c(CoroutineContext coroutineContext, f fVar) {
        this.f73324a = coroutineContext;
        this.f73325b = fVar;
    }

    @Override // bl2.c
    public final CoroutineContext getContext() {
        return this.f73324a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bl2.c
    public final void resumeWith(Object obj) {
        bl2.c<Unit> bVar;
        f completion = this.f73325b;
        d dVar = new d(1, completion, f.class, "flowProcessing", "flowProcessing(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        try {
            Intrinsics.checkNotNullParameter(dVar, "<this>");
            Intrinsics.checkNotNullParameter(completion, "completion");
            Intrinsics.checkNotNullParameter(completion, "completion");
            if (dVar instanceof dl2.a) {
                bVar = ((dl2.a) dVar).create(completion);
            } else {
                CoroutineContext coroutineContext = completion.f20108c;
                bVar = coroutineContext == kotlin.coroutines.j.f80412a ? new cl2.b(dVar, completion) : new cl2.c(completion, coroutineContext, dVar);
            }
            bl2.c b13 = cl2.h.b(bVar);
            q qVar = s.f135225b;
            ho2.f.a(Unit.f80348a, b13);
        } catch (Throwable th3) {
            q qVar2 = s.f135225b;
            completion.resumeWith(ue.c.m(th3));
            throw th3;
        }
    }
}
