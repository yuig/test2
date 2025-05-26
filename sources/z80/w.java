package z80;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import s80.q1;
import s80.y5;
import s80.z5;

/* loaded from: classes5.dex */
public final class w extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f141098r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ z5 f141099s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f141100t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z5 z5Var, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f141099s = z5Var;
        this.f141100t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new w(this.f141099s, this.f141100t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f141098r;
        z5 z5Var = this.f141099s;
        if (i13 == 0) {
            ue.c.H(obj);
            long j13 = ((y5) z5Var).f111859b;
            this.f141098r = 1;
            if (l0.T(j13, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        this.f141100t.a(new q1(((y5) z5Var).f111858a));
        return Unit.f80348a;
    }
}
