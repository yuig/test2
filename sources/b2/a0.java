package b2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class a0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f21102r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f21103s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function1 f21104t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(Function1 function1, bl2.c cVar) {
        super(2, cVar);
        this.f21104t = function1;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        a0 a0Var = new a0(this.f21104t, cVar);
        a0Var.f21103s = obj;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((n3.w) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f21102r;
        if (i13 == 0) {
            ue.c.H(obj);
            n3.w wVar = (n3.w) this.f21103s;
            z zVar = new z(this.f21104t, null);
            this.f21102r = 1;
            if (((n3.o0) wVar).M0(zVar, this) == aVar) {
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
