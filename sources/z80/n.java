package z80;

import ay1.e0;
import ay1.h0;
import kotlin.Unit;
import s80.b1;

/* loaded from: classes5.dex */
public final class n extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f141073r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u50.r f141074s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i13, u50.r rVar, bl2.c cVar) {
        super(3, cVar);
        this.f141073r = i13;
        this.f141074s = rVar;
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f141073r) {
        }
        return r((do2.j) obj, (Throwable) obj2, (bl2.c) obj3);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f141073r;
        u50.r rVar = this.f141074s;
        switch (i13) {
            case 0:
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                rVar.a(new b1(false));
                break;
            case 1:
                cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                rVar.a(new b1(true));
                break;
            case 2:
                cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                rVar.a(v90.m.f124943a);
                break;
            case 3:
                cl2.a aVar4 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                rVar.a(new sa0.b(u62.j.f120844a));
                break;
            case 4:
                cl2.a aVar5 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                rVar.a(new ay1.o(e0.f20664a));
                break;
            default:
                cl2.a aVar6 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                rVar.a(new ay1.m(ay1.d.f20661a));
                rVar.a(new ay1.p(h0.f20673a));
                break;
        }
        return Unit.f80348a;
    }

    public final Object r(do2.j jVar, Throwable th3, bl2.c cVar) {
        int i13 = this.f141073r;
        u50.r rVar = this.f141074s;
        switch (i13) {
            case 0:
                return new n(0, rVar, cVar).invokeSuspend(Unit.f80348a);
            case 1:
                return new n(1, rVar, cVar).invokeSuspend(Unit.f80348a);
            case 2:
                return new n(2, rVar, cVar).invokeSuspend(Unit.f80348a);
            case 3:
                return new n(3, rVar, cVar).invokeSuspend(Unit.f80348a);
            case 4:
                return new n(4, rVar, cVar).invokeSuspend(Unit.f80348a);
            default:
                return new n(5, rVar, cVar).invokeSuspend(Unit.f80348a);
        }
    }
}
