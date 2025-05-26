package w21;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class l0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f127736r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127737s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ao2.j0 j0Var, i2.q1 q1Var, bl2.c cVar) {
        super(2, cVar);
        this.f127736r = j0Var;
        this.f127737s = q1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new l0(this.f127736r, this.f127737s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        kotlin.jvm.internal.j.z(this.f127736r, null, null, new k0(this.f127737s, null), 3);
        return Unit.f80348a;
    }
}
