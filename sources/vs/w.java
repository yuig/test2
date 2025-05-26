package vs;

import kotlin.Unit;

/* loaded from: classes3.dex */
public final class w extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f126522r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f126523s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u50.r f126524t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i13, u50.r rVar, bl2.c cVar) {
        super(3, cVar);
        this.f126522r = i13;
        this.f126524t = rVar;
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f126522r) {
        }
        return r((do2.j) obj, (Throwable) obj2, (bl2.c) obj3);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f126522r;
        u50.r rVar = this.f126524t;
        switch (i13) {
            case 0:
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                rVar.a(new m(this.f126523s));
                break;
            case 1:
                cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                rVar.a(new m(this.f126523s));
                break;
            case 2:
                cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                rVar.a(new cj0.h0(this.f126523s));
                break;
            case 3:
                cl2.a aVar4 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                rVar.a(new pm0.m(this.f126523s));
                break;
            case 4:
                cl2.a aVar5 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                rVar.a(new wr1.w(this.f126523s));
                break;
            case 5:
                cl2.a aVar6 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                rVar.a(new wr1.a0(this.f126523s));
                break;
            case 6:
                cl2.a aVar7 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                rVar.a(new hu1.e(this.f126523s));
                break;
            case 7:
                cl2.a aVar8 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                rVar.a(new iu1.g(this.f126523s));
                break;
            default:
                cl2.a aVar9 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                rVar.a(new bx1.g(this.f126523s));
                break;
        }
        return Unit.f80348a;
    }

    public final Object r(do2.j jVar, Throwable th3, bl2.c cVar) {
        int i13 = this.f126522r;
        u50.r rVar = this.f126524t;
        switch (i13) {
            case 0:
                w wVar = new w(0, rVar, cVar);
                wVar.f126523s = th3;
                return wVar.invokeSuspend(Unit.f80348a);
            case 1:
                w wVar2 = new w(1, rVar, cVar);
                wVar2.f126523s = th3;
                return wVar2.invokeSuspend(Unit.f80348a);
            case 2:
                w wVar3 = new w(2, rVar, cVar);
                wVar3.f126523s = th3;
                return wVar3.invokeSuspend(Unit.f80348a);
            case 3:
                w wVar4 = new w(3, rVar, cVar);
                wVar4.f126523s = th3;
                return wVar4.invokeSuspend(Unit.f80348a);
            case 4:
                w wVar5 = new w(4, rVar, cVar);
                wVar5.f126523s = th3;
                return wVar5.invokeSuspend(Unit.f80348a);
            case 5:
                w wVar6 = new w(5, rVar, cVar);
                wVar6.f126523s = th3;
                return wVar6.invokeSuspend(Unit.f80348a);
            case 6:
                w wVar7 = new w(6, rVar, cVar);
                wVar7.f126523s = th3;
                return wVar7.invokeSuspend(Unit.f80348a);
            case 7:
                w wVar8 = new w(7, rVar, cVar);
                wVar8.f126523s = th3;
                return wVar8.invokeSuspend(Unit.f80348a);
            default:
                w wVar9 = new w(8, rVar, cVar);
                wVar9.f126523s = th3;
                return wVar9.invokeSuspend(Unit.f80348a);
        }
    }
}
