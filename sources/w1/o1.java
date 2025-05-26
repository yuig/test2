package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class o1 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f127420r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n3.w f127421s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ y1 f127422t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(n3.w wVar, y1 y1Var, bl2.c cVar) {
        super(2, cVar);
        this.f127421s = wVar;
        this.f127422t = y1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o1(this.f127421s, this.f127422t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o1) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f127420r;
        if (i13 == 0) {
            ue.c.H(obj);
            this.f127420r = 1;
            Object w13 = kh2.u2.w(this.f127421s, new t1(this.f127422t, null), this);
            if (w13 != obj2) {
                w13 = Unit.f80348a;
            }
            if (w13 == obj2) {
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
