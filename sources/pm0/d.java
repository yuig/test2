package pm0;

import kotlin.Unit;

/* loaded from: classes5.dex */
public final class d extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f100642r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f100643s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j f100644t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u50.r f100645u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(j jVar, u50.r rVar, bl2.c cVar, int i13) {
        super(3, cVar);
        this.f100642r = i13;
        this.f100644t = jVar;
        this.f100645u = rVar;
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f100642r) {
        }
        return r((do2.j) obj, (Throwable) obj2, (bl2.c) obj3);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f100642r;
        u50.r rVar = this.f100645u;
        j jVar = this.f100644t;
        switch (i13) {
            case 0:
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                Throwable th3 = this.f100643s;
                jVar.getClass();
                j.p(rVar, th3);
                break;
            case 1:
                cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                Throwable th4 = this.f100643s;
                jVar.getClass();
                j.p(rVar, th4);
                break;
            default:
                cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                Throwable th5 = this.f100643s;
                jVar.getClass();
                j.p(rVar, th5);
                break;
        }
        return Unit.f80348a;
    }

    public final Object r(do2.j jVar, Throwable th3, bl2.c cVar) {
        int i13 = this.f100642r;
        j jVar2 = this.f100644t;
        u50.r rVar = this.f100645u;
        switch (i13) {
            case 0:
                d dVar = new d(jVar2, rVar, cVar, 0);
                dVar.f100643s = th3;
                return dVar.invokeSuspend(Unit.f80348a);
            case 1:
                d dVar2 = new d(jVar2, rVar, cVar, 1);
                dVar2.f100643s = th3;
                return dVar2.invokeSuspend(Unit.f80348a);
            default:
                d dVar3 = new d(jVar2, rVar, cVar, 2);
                dVar3.f100643s = th3;
                return dVar3.invokeSuspend(Unit.f80348a);
        }
    }
}
