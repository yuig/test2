package fd;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import wr1.k0;
import wr1.l0;
import wr1.o0;
import wr1.s0;

/* loaded from: classes3.dex */
public final class t extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f61806r;

    /* renamed from: s, reason: collision with root package name */
    public int f61807s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f61808t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f61809u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f61810v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, bl2.c cVar, int i13) {
        super(3, cVar);
        this.f61806r = i13;
        this.f61810v = obj;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i13 = this.f61806r;
        Object obj4 = this.f61810v;
        switch (i13) {
            case 0:
                t tVar = new t((pc.f) obj4, (bl2.c) obj3, 0);
                tVar.f61808t = (do2.j) obj;
                tVar.f61809u = (gd.d) obj2;
                return tVar.invokeSuspend(Unit.f80348a);
            case 1:
                return r((do2.j) obj, (Throwable) obj2, (bl2.c) obj3);
            case 2:
                t tVar2 = new t((u50.r) obj4, (bl2.c) obj3, 2);
                tVar2.f61808t = (u62.c) obj;
                tVar2.f61809u = (y62.g) obj2;
                return tVar2.invokeSuspend(Unit.f80348a);
            case 3:
                return r((do2.j) obj, (Throwable) obj2, (bl2.c) obj3);
            case 4:
                return r((do2.j) obj, (Throwable) obj2, (bl2.c) obj3);
            default:
                t tVar3 = new t((kl2.l) obj4, (bl2.c) obj3, 5);
                tVar3.f61808t = (do2.j) obj;
                tVar3.f61809u = (Object[]) obj2;
                return tVar3.invokeSuspend(Unit.f80348a);
        }
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        y62.f fVar;
        do2.j jVar;
        int i13 = this.f61806r;
        boolean z13 = false;
        Object obj2 = this.f61810v;
        switch (i13) {
            case 0:
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                int i14 = this.f61807s;
                if (i14 != 0) {
                    if (i14 == 1) {
                        ue.c.H(obj);
                        return Boolean.valueOf(z13);
                    }
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ue.c.H(obj);
                    z13 = true;
                    return Boolean.valueOf(z13);
                }
                ue.c.H(obj);
                do2.j jVar2 = (do2.j) this.f61808t;
                gd.d dVar = (gd.d) this.f61809u;
                if (!(dVar instanceof gd.h) && !(dVar instanceof gd.b)) {
                    if (dVar instanceof gd.g) {
                        this.f61808t = null;
                        this.f61807s = 1;
                        if (jVar2.emit(dVar, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (dVar instanceof gd.e) {
                            System.out.println((Object) ("Received general error while executing operation " + ((pc.f) obj2).f99541a.name() + ": " + ((gd.e) dVar).f64786a));
                        } else {
                            this.f61808t = null;
                            this.f61807s = 2;
                            if (jVar2.emit(dVar, this) == aVar) {
                                return aVar;
                            }
                        }
                        z13 = true;
                    }
                }
                return Boolean.valueOf(z13);
            case 1:
                cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                if (this.f61807s != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                ((g70.h) this.f61809u).f63884f.q((Throwable) this.f61808t, a.a.j("BoardNavigator: Failed to get board for ID: ", (String) obj2), tb0.p.BOARD_AND_SECTION_VIEW);
                return Unit.f80348a;
            case 2:
                cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
                if (this.f61807s != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                u62.c cVar = (u62.c) this.f61808t;
                y62.g gVar = (y62.g) this.f61809u;
                bp1.h hVar = cVar.f120830c;
                y62.f fVar2 = gVar.f137936c;
                if (!(hVar instanceof u62.e)) {
                    if (hVar instanceof u62.h) {
                        fVar = y62.f.LOADING;
                        ((u50.r) obj2).a(new v90.t(y62.g.a(gVar, null, null, fVar, null, 11)));
                        return Unit.f80348a;
                    }
                    if (!(hVar instanceof u62.d) && !(hVar instanceof u62.f) && !(hVar instanceof u62.g)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                fVar = fVar2;
                ((u50.r) obj2).a(new v90.t(y62.g.a(gVar, null, null, fVar, null, 11)));
                return Unit.f80348a;
            case 3:
                cl2.a aVar4 = cl2.a.COROUTINE_SUSPENDED;
                if (this.f61807s != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                Throwable th3 = (Throwable) this.f61808t;
                ta0.v vVar = (ta0.v) this.f61809u;
                int i15 = qa0.f.collage_download_failed;
                vVar.getClass();
                ta0.v.j((u50.r) obj2, i15);
                ((ta0.v) this.f61809u).f116914b.q(th3, "Failed to download image", tb0.p.COLLAGES);
                return Unit.f80348a;
            case 4:
                cl2.a aVar5 = cl2.a.COROUTINE_SUSPENDED;
                if (this.f61807s != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                Throwable th4 = (Throwable) this.f61808t;
                ((u50.r) obj2).a(((o0) ((s0) this.f61809u)).f130986c ? new l0(th4) : new k0(th4));
                return Unit.f80348a;
            default:
                cl2.a aVar6 = cl2.a.COROUTINE_SUSPENDED;
                int i16 = this.f61807s;
                if (i16 == 0) {
                    ue.c.H(obj);
                    do2.j jVar3 = (do2.j) this.f61808t;
                    Object[] objArr = (Object[]) this.f61809u;
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    this.f61808t = jVar3;
                    this.f61807s = 1;
                    Object invoke = ((kl2.l) obj2).invoke(obj3, obj4, this);
                    if (invoke == aVar6) {
                        return aVar6;
                    }
                    jVar = jVar3;
                    obj = invoke;
                } else {
                    if (i16 != 1) {
                        if (i16 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ue.c.H(obj);
                        return Unit.f80348a;
                    }
                    jVar = (do2.j) this.f61808t;
                    ue.c.H(obj);
                }
                this.f61808t = null;
                this.f61807s = 2;
                if (jVar.emit(obj, this) == aVar6) {
                    return aVar6;
                }
                return Unit.f80348a;
        }
    }

    public final Object r(do2.j jVar, Throwable th3, bl2.c cVar) {
        int i13 = this.f61806r;
        Object obj = this.f61810v;
        switch (i13) {
            case 1:
                t tVar = new t((g70.h) this.f61809u, (String) obj, cVar, 1);
                tVar.f61808t = th3;
                return tVar.invokeSuspend(Unit.f80348a);
            case 2:
            default:
                t tVar2 = new t((s0) this.f61809u, (u50.r) obj, cVar, 4);
                tVar2.f61808t = th3;
                return tVar2.invokeSuspend(Unit.f80348a);
            case 3:
                t tVar3 = new t((ta0.v) this.f61809u, (u50.r) obj, cVar, 3);
                tVar3.f61808t = th3;
                return tVar3.invokeSuspend(Unit.f80348a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(Object obj, Object obj2, bl2.c cVar, int i13) {
        super(3, cVar);
        this.f61806r = i13;
        this.f61809u = obj;
        this.f61810v = obj2;
    }
}
