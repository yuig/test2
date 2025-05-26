package c2;

import com.pinterest.api.model.wy0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class r extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f25111r;

    /* renamed from: s, reason: collision with root package name */
    public int f25112s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f25113t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f25114u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(b60.b bVar, bl2.c cVar) {
        super(3, cVar);
        this.f25111r = 4;
        this.f25114u = bVar;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f25111r) {
            case 0:
                break;
        }
        return r((do2.j) obj, (Throwable) obj2, (bl2.c) obj3);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f25111r;
        Object obj2 = this.f25114u;
        switch (i13) {
            case 0:
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                int i14 = this.f25112s;
                if (i14 == 0) {
                    ue.c.H(obj);
                    s sVar = ((t) this.f25113t).f25223a;
                    this.f25112s = 1;
                    if (((Function2) obj2).invoke(sVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ue.c.H(obj);
                }
                return Unit.f80348a;
            case 1:
                cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                int i15 = this.f25112s;
                if (i15 == 0) {
                    ue.c.H(obj);
                    co2.m mVar = ((fd.y) this.f25113t).f61834g;
                    gd.m mVar2 = new gd.m((pc.f) obj2);
                    this.f25112s = 1;
                    if (mVar.o(mVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ue.c.H(obj);
                }
                return Unit.f80348a;
            case 2:
                cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
                if (this.f25112s != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                ((z80.q) this.f25113t).f141083a.j(new dl1.u(((s80.i5) ((s80.k5) obj2)).f111590a));
                return Unit.f80348a;
            case 3:
                cl2.a aVar4 = cl2.a.COROUTINE_SUSPENDED;
                if (this.f25112s != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                tu.d0.k((tu.d0) this.f25113t, (u50.r) obj2, null, null);
                return Unit.f80348a;
            default:
                cl2.a aVar5 = cl2.a.COROUTINE_SUSPENDED;
                int i16 = this.f25112s;
                if (i16 == 0) {
                    ue.c.H(obj);
                    do2.j jVar = (do2.j) this.f25113t;
                    wy0 f13 = ((b60.d) ((b60.b) obj2)).f();
                    this.f25112s = 1;
                    if (jVar.emit(f13, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ue.c.H(obj);
                }
                return Unit.f80348a;
        }
    }

    public final Object r(do2.j jVar, Throwable th3, bl2.c cVar) {
        int i13 = this.f25111r;
        Object obj = this.f25114u;
        switch (i13) {
            case 1:
                return new r((fd.y) this.f25113t, (pc.f) obj, cVar, 1).invokeSuspend(Unit.f80348a);
            case 2:
                return new r((z80.q) this.f25113t, (s80.k5) obj, cVar, 2).invokeSuspend(Unit.f80348a);
            case 3:
                return new r((tu.d0) this.f25113t, (u50.r) obj, cVar, 3).invokeSuspend(Unit.f80348a);
            default:
                r rVar = new r((b60.b) obj, cVar);
                rVar.f25113t = jVar;
                return rVar.invokeSuspend(Unit.f80348a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Object obj, Object obj2, bl2.c cVar, int i13) {
        super(3, cVar);
        this.f25111r = i13;
        this.f25113t = obj;
        this.f25114u = obj2;
    }
}
