package z01;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import lb.l0;
import u50.r;
import xk2.q;
import xk2.s;

/* loaded from: classes5.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f140539r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f140540s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ e f140541t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f140542u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f140541t = eVar;
        this.f140542u = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d dVar = new d(this.f140541t, this.f140542u, cVar);
        dVar.f140540s = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object m13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f140539r;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                e eVar = this.f140541t;
                r rVar = this.f140542u;
                q qVar = s.f135225b;
                do2.c a13 = kotlin.jvm.internal.j.a(eVar.f140544b.z());
                c cVar = new c(rVar, null);
                this.f140539r = 1;
                if (l0.I(a13, cVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            m13 = Unit.f80348a;
            q qVar2 = s.f135225b;
        } catch (Throwable th3) {
            q qVar3 = s.f135225b;
            m13 = ue.c.m(th3);
        }
        s.a(m13);
        return Unit.f80348a;
    }
}
