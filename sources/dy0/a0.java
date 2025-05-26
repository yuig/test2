package dy0;

import i2.q1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class a0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q1 f56539r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(q1 q1Var, bl2.c cVar) {
        super(2, cVar);
        this.f56539r = q1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new a0(this.f56539r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j1.y yVar = i0.f56582a;
        this.f56539r.setValue(Boolean.TRUE);
        return Unit.f80348a;
    }
}
