package cn0;

import do2.z1;
import kotlin.Pair;
import kotlin.Unit;
import lb.l0;

/* loaded from: classes5.dex */
public final class t extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f28104r;

    /* renamed from: s, reason: collision with root package name */
    public int f28105s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f28106t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f28107u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i13, bl2.c cVar) {
        super(3, cVar);
        this.f28104r = i13;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f28104r) {
            case 0:
                return r((do2.j) obj, (Throwable) obj2, (bl2.c) obj3);
            case 1:
                return r((do2.j) obj, (Throwable) obj2, (bl2.c) obj3);
            case 2:
                t tVar = new t(2, (bl2.c) obj3);
                tVar.f28106t = (xu1.i) obj;
                tVar.f28107u = (xu1.j) obj2;
                return tVar.invokeSuspend(Unit.f80348a);
            default:
                t tVar2 = new t(3, (bl2.c) obj3);
                tVar2.f28106t = (do2.j) obj;
                tVar2.f28107u = obj2;
                return tVar2.invokeSuspend(Unit.f80348a);
        }
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f28104r) {
            case 0:
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                int i13 = this.f28105s;
                if (i13 == 0) {
                    ue.c.H(obj);
                    do2.j jVar = (do2.j) this.f28106t;
                    j jVar2 = new j((Throwable) this.f28107u);
                    this.f28106t = null;
                    this.f28105s = 1;
                    if (jVar.emit(jVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ue.c.H(obj);
                }
                return Unit.f80348a;
            case 1:
                cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                int i14 = this.f28105s;
                if (i14 == 0) {
                    ue.c.H(obj);
                    do2.j jVar3 = (do2.j) this.f28106t;
                    j jVar4 = new j((Throwable) this.f28107u);
                    this.f28106t = null;
                    this.f28105s = 1;
                    if (jVar3.emit(jVar4, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ue.c.H(obj);
                }
                return Unit.f80348a;
            case 2:
                cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
                if (this.f28105s != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                return new Pair((xu1.i) this.f28106t, (xu1.j) this.f28107u);
            default:
                cl2.a aVar4 = cl2.a.COROUTINE_SUSPENDED;
                int i15 = this.f28105s;
                if (i15 == 0) {
                    ue.c.H(obj);
                    do2.j jVar5 = (do2.j) this.f28106t;
                    z1 z1Var = ((df2.b) this.f28107u).f54898b;
                    this.f28105s = 1;
                    if (l0.Z(this, z1Var, jVar5) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ue.c.H(obj);
                }
                return Unit.f80348a;
        }
    }

    public final Object r(do2.j jVar, Throwable th3, bl2.c cVar) {
        switch (this.f28104r) {
            case 0:
                t tVar = new t(0, cVar);
                tVar.f28106t = jVar;
                tVar.f28107u = th3;
                return tVar.invokeSuspend(Unit.f80348a);
            default:
                t tVar2 = new t(1, cVar);
                tVar2.f28106t = jVar;
                tVar2.f28107u = th3;
                return tVar2.invokeSuspend(Unit.f80348a);
        }
    }
}
