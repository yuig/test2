package com.pinterest.feature.pincarouselads.view;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class t extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ boolean f47422r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SingleColumnCarouselPinView f47423s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(SingleColumnCarouselPinView singleColumnCarouselPinView, bl2.c cVar) {
        super(2, cVar);
        this.f47423s = singleColumnCarouselPinView;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        t tVar = new t(this.f47423s, cVar);
        tVar.f47422r = ((Boolean) obj).booleanValue();
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((t) create(bool, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f47423s.modifyViewsForD2S(this.f47422r);
        return Unit.f80348a;
    }
}
