package mq;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class a0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f87950r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h0 f87951s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(h0 h0Var, bl2.c cVar) {
        super(2, cVar);
        this.f87951s = h0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        a0 a0Var = new a0(this.f87951s, cVar);
        a0Var.f87950r = obj;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((y01.h0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        y01.h0 h0Var = (y01.h0) this.f87950r;
        int i13 = h0.f87984k0;
        this.f87951s.Z7(h0Var);
        return Unit.f80348a;
    }
}
