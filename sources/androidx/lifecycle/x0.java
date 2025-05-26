package androidx.lifecycle;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class x0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f18721r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f18722s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s f18723t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f18724u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function2 f18725v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(s sVar, r rVar, Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f18723t = sVar;
        this.f18724u = rVar;
        this.f18725v = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        x0 x0Var = new x0(this.f18723t, this.f18724u, this.f18725v, cVar);
        x0Var.f18722s = obj;
        return x0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f18721r;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.j0 j0Var = (ao2.j0) this.f18722s;
            ko2.f fVar = ao2.v0.f20219a;
            bo2.e eVar = ((bo2.e) ho2.q.f69782a).f23612f;
            w0 w0Var = new w0(this.f18723t, this.f18724u, j0Var, this.f18725v, null);
            this.f18721r = 1;
            if (kotlin.jvm.internal.j.M(this, eVar, w0Var) == aVar) {
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
