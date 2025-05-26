package com.pinterest.feature.pincarouselads.view;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import ni1.o2;

/* loaded from: classes2.dex */
public final class v extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f47427r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o2 f47428s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SingleColumnCarouselPinView f47429t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(o2 o2Var, SingleColumnCarouselPinView singleColumnCarouselPinView, bl2.c cVar) {
        super(2, cVar);
        this.f47428s = o2Var;
        this.f47429t = singleColumnCarouselPinView;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new v(this.f47428s, this.f47429t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f47427r;
        if (i13 == 0) {
            ue.c.H(obj);
            a6.w wVar = new a6.w(this.f47428s.f90763e.d());
            t tVar = new t(this.f47429t, null);
            this.f47427r = 1;
            if (l0.I(wVar, tVar, this) == aVar) {
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
