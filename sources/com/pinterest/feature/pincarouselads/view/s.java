package com.pinterest.feature.pincarouselads.view;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import ni1.o2;

/* loaded from: classes2.dex */
public final class s extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f47419r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o2 f47420s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ti1.f f47421t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(o2 o2Var, ti1.f fVar, bl2.c cVar) {
        super(2, cVar);
        this.f47420s = o2Var;
        this.f47421t = fVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new s(this.f47420s, this.f47421t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f47419r;
        if (i13 == 0) {
            ue.c.H(obj);
            do2.i d2 = this.f47420s.f90763e.d();
            r rVar = new r(this.f47421t, null);
            this.f47419r = 1;
            if (l0.I(d2, rVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
