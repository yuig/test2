package androidx.compose.foundation.lazy.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class q0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f17276r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r0 f17277s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f17278t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, int i13, bl2.c cVar) {
        super(2, cVar);
        this.f17277s = r0Var;
        this.f17278t = i13;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new q0(this.f17277s, this.f17278t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f17276r;
        if (i13 == 0) {
            ue.c.H(obj);
            n0 n0Var = this.f17277s.f17281o;
            this.f17276r = 1;
            if (n0Var.f(this.f17278t, this) == aVar) {
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
