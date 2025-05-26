package vc;

import com.apollographql.apollo3.exception.ApolloException;
import kotlin.Unit;
import kotlin.jvm.internal.j0;

/* loaded from: classes3.dex */
public final class h extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f125528r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f125529s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0 f125530t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j0 j0Var, bl2.c cVar, int i13) {
        super(3, cVar);
        this.f125528r = i13;
        this.f125530t = j0Var;
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f125528r) {
        }
        return r((do2.j) obj, (Throwable) obj2, (bl2.c) obj3);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f125528r;
        j0 j0Var = this.f125530t;
        switch (i13) {
            case 0:
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                Throwable th3 = (Throwable) this.f125529s;
                if (!(th3 instanceof ApolloException)) {
                    throw th3;
                }
                j0Var.f80434a = th3;
                return Unit.f80348a;
            case 1:
                cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                Throwable th4 = (Throwable) this.f125529s;
                if (!(th4 instanceof ApolloException)) {
                    throw th4;
                }
                j0Var.f80434a = th4;
                return Unit.f80348a;
            case 2:
                cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                Throwable th5 = (Throwable) this.f125529s;
                if (!(th5 instanceof ApolloException)) {
                    throw th5;
                }
                j0Var.f80434a = th5;
                return Unit.f80348a;
            case 3:
                cl2.a aVar4 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                Throwable th6 = (Throwable) this.f125529s;
                if (!(th6 instanceof ApolloException)) {
                    throw th6;
                }
                j0Var.f80434a = th6;
                return Unit.f80348a;
            default:
                cl2.a aVar5 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                try {
                    xk2.q qVar = xk2.s.f135225b;
                    bd.l lVar = (bd.l) j0Var.f80434a;
                    if (lVar != null) {
                        lVar.close();
                        Unit unit = Unit.f80348a;
                    }
                } catch (Throwable th7) {
                    xk2.q qVar2 = xk2.s.f135225b;
                    ue.c.m(th7);
                }
                return Unit.f80348a;
        }
    }

    public final Object r(do2.j jVar, Throwable th3, bl2.c cVar) {
        int i13 = this.f125528r;
        j0 j0Var = this.f125530t;
        switch (i13) {
            case 0:
                h hVar = new h(j0Var, cVar, 0);
                hVar.f125529s = th3;
                return hVar.invokeSuspend(Unit.f80348a);
            case 1:
                h hVar2 = new h(j0Var, cVar, 1);
                hVar2.f125529s = th3;
                return hVar2.invokeSuspend(Unit.f80348a);
            case 2:
                h hVar3 = new h(j0Var, cVar, 2);
                hVar3.f125529s = th3;
                return hVar3.invokeSuspend(Unit.f80348a);
            case 3:
                h hVar4 = new h(j0Var, cVar, 3);
                hVar4.f125529s = th3;
                return hVar4.invokeSuspend(Unit.f80348a);
            default:
                h hVar5 = new h(j0Var, cVar, 4);
                hVar5.f125529s = jVar;
                return hVar5.invokeSuspend(Unit.f80348a);
        }
    }
}
