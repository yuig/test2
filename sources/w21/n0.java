package w21;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class n0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f127754r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127755s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(ao2.j0 j0Var, i2.q1 q1Var, bl2.c cVar) {
        super(2, cVar);
        this.f127754r = j0Var;
        this.f127755s = q1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n0(this.f127754r, this.f127755s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        kotlin.jvm.internal.j.z(this.f127754r, null, null, new m0(this.f127755s, null), 3);
        return Unit.f80348a;
    }
}
