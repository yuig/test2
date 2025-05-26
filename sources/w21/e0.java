package w21;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class e0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h0 f127679r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v1 f127680s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(h0 h0Var, v1 v1Var, bl2.c cVar) {
        super(2, cVar);
        this.f127679r = h0Var;
        this.f127680s = v1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e0(this.f127679r, this.f127680s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        h0 h0Var = this.f127679r;
        h0Var.f127702d.m(((h1) this.f127680s).f127703a);
        h0Var.f127701c.B();
        return Unit.f80348a;
    }
}
