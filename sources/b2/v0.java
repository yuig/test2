package b2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import w1.q1;
import w1.y1;

/* loaded from: classes2.dex */
public final class v0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f21247r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f21248s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y1 f21249t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(y1 y1Var, bl2.c cVar) {
        super(2, cVar);
        this.f21249t = y1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        v0 v0Var = new v0(this.f21249t, cVar);
        v0Var.f21248s = obj;
        return v0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v0) create((n3.w) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f21247r;
        if (i13 == 0) {
            ue.c.H(obj);
            n3.w wVar = (n3.w) this.f21248s;
            this.f21247r = 1;
            Object O = dl2.b.O(new q1(wVar, this.f21249t, null), this);
            if (O != obj2) {
                O = Unit.f80348a;
            }
            if (O == obj2) {
                return obj2;
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
