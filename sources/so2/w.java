package so2;

import kotlin.Unit;

/* loaded from: classes4.dex */
public final class w extends dl2.i implements kl2.l {

    /* renamed from: s, reason: collision with root package name */
    public int f114825s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ xk2.b f114826t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ y f114827u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, bl2.c cVar) {
        super(3, cVar);
        this.f114827u = yVar;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w wVar = new w(this.f114827u, (bl2.c) obj3);
        wVar.f114826t = (xk2.b) obj;
        return wVar.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f114825s;
        if (i13 == 0) {
            ue.c.H(obj);
            xk2.b bVar = this.f114826t;
            y yVar = this.f114827u;
            byte r13 = yVar.f114835a.r();
            if (r13 == 1) {
                return yVar.d(true);
            }
            if (r13 == 0) {
                return yVar.d(false);
            }
            if (r13 != 6) {
                if (r13 == 8) {
                    return yVar.c();
                }
                g0.n(yVar.f114835a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f114825s = 1;
            obj = y.a(yVar, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return (ro2.n) obj;
    }
}
