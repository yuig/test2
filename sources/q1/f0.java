package q1;

import j1.o1;
import j1.t1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class f0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f101897r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h0 f101898s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(h0 h0Var, bl2.c cVar) {
        super(2, cVar);
        this.f101898s = h0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f0(this.f101898s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object g13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f101897r;
        if (i13 == 0) {
            ue.c.H(obj);
            j1.o oVar = this.f101898s.f101929v;
            Float f13 = new Float(0.0f);
            o1 q13 = j1.e.q(0.0f, 400.0f, new Float(0.5f), 1);
            this.f101897r = 1;
            g13 = j1.e.g(oVar, f13, q13, true, t1.f74240j, this);
            if (g13 == aVar) {
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
