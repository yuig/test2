package com.pinterest.qrCodeLogin;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class w extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f50356r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z f50357s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, bl2.c cVar) {
        super(2, cVar);
        this.f50357s = zVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new w(this.f50357s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f50356r;
        if (i13 == 0) {
            ue.c.H(obj);
            int i14 = z.f50362q0;
            z zVar = this.f50357s;
            do2.i d2 = zVar.d8().f50325g.d();
            v vVar = new v(zVar, null);
            this.f50356r = 1;
            if (lb.l0.I(d2, vVar, this) == aVar) {
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
