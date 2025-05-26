package m1;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class v0 extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f85606r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(int i13, bl2.c cVar) {
        super(3, cVar);
        this.f85606r = i13;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f85606r) {
            case 0:
                long j13 = ((a3.c) obj2).f482a;
                break;
            case 1:
                ((Number) obj2).floatValue();
                break;
            case 2:
                long j14 = ((a3.c) obj2).f482a;
                break;
            case 3:
                ((Number) obj).intValue();
                break;
        }
        return r((do2.j) obj, (Throwable) obj2, (bl2.c) obj3);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f85606r) {
            case 0:
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                break;
            case 1:
                cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                break;
            case 2:
                cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                break;
            case 3:
                cl2.a aVar4 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                break;
            case 4:
                cl2.a aVar5 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                break;
            case 5:
                cl2.a aVar6 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                break;
            default:
                cl2.a aVar7 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                break;
        }
        return Unit.f80348a;
    }

    public final Object r(do2.j jVar, Throwable th3, bl2.c cVar) {
        switch (this.f85606r) {
            case 4:
                return new v0(4, cVar).invokeSuspend(Unit.f80348a);
            case 5:
                return new v0(5, cVar).invokeSuspend(Unit.f80348a);
            default:
                return new v0(6, cVar).invokeSuspend(Unit.f80348a);
        }
    }
}
