package com.pinterest.qrCodeLogin;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f50358r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f50359s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, bl2.c cVar) {
        super(2, cVar);
        this.f50359s = zVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new x(this.f50359s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f50358r;
        if (i13 == 0) {
            ue.c.H(obj);
            z zVar = this.f50359s;
            androidx.lifecycle.z viewLifecycleOwner = zVar.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            androidx.lifecycle.r rVar = androidx.lifecycle.r.STARTED;
            w wVar = new w(zVar, null);
            this.f50358r = 1;
            if (ao2.m0.f0(viewLifecycleOwner, rVar, wVar, this) == aVar) {
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
