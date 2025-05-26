package nt;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class i0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f92052r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f92053s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f92054t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(long j13, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f92053s = j13;
        this.f92054t = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new i0(this.f92053s, this.f92054t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f92052r;
        if (i13 == 0) {
            ue.c.H(obj);
            long currentTimeMillis = System.currentTimeMillis() - this.f92053s;
            long j13 = currentTimeMillis > 700 ? 0L : 700 - currentTimeMillis;
            this.f92052r = 1;
            if (lb.l0.S(j13, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        this.f92054t.a(new c0(System.currentTimeMillis() * 1000000));
        return Unit.f80348a;
    }
}
