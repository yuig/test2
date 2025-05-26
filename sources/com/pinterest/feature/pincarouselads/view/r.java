package com.pinterest.feature.pincarouselads.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ni1.u0;

/* loaded from: classes2.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f47417r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ti1.f f47418s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ti1.f fVar, bl2.c cVar) {
        super(2, cVar);
        this.f47418s = fVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r rVar = new r(this.f47418s, cVar);
        rVar.f47417r = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((u0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f47418s.bindDisplayState((u0) this.f47417r);
        return Unit.f80348a;
    }
}
