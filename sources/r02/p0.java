package r02;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class p0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f105785r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s0 f105786s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(s0 s0Var, bl2.c cVar) {
        super(2, cVar);
        this.f105786s = s0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        p0 p0Var = new p0(this.f105786s, cVar);
        p0Var.f105785r = obj;
        return p0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p0) create((s02.o) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        int i13 = s0.f105802t0;
        this.f105786s.getClass();
        return Unit.f80348a;
    }
}
