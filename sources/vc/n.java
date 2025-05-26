package vc;

import com.apollographql.apollo3.exception.ApolloException;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j0;

/* loaded from: classes.dex */
public final class n extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f125546r;

    /* renamed from: s, reason: collision with root package name */
    public int f125547s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f125548t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Serializable f125549u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(bl2.c cVar) {
        super(3, cVar);
        this.f125546r = 3;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Serializable, java.lang.Object[]] */
    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f125546r) {
            case 0:
                return r((do2.j) obj, (Throwable) obj2, (bl2.c) obj3);
            case 1:
                return r((do2.j) obj, (Throwable) obj2, (bl2.c) obj3);
            case 2:
                return r((do2.j) obj, (Throwable) obj2, (bl2.c) obj3);
            default:
                n nVar = new n((bl2.c) obj3);
                nVar.f125548t = (do2.j) obj;
                nVar.f125549u = (Object[]) obj2;
                return nVar.invokeSuspend(Unit.f80348a);
        }
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        pb.c cVar;
        pb.c cVar2;
        switch (this.f125546r) {
            case 0:
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                if (this.f125547s != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                Throwable th3 = (Throwable) this.f125548t;
                if (!(th3 instanceof ApolloException)) {
                    throw th3;
                }
                ((j0) this.f125549u).f80434a = th3;
                return Unit.f80348a;
            case 1:
                cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                if (this.f125547s != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                Throwable th4 = (Throwable) this.f125548t;
                if (!(th4 instanceof ApolloException)) {
                    throw th4;
                }
                ((j0) this.f125549u).f80434a = th4;
                return Unit.f80348a;
            case 2:
                cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
                if (this.f125547s != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
                Throwable th5 = (Throwable) this.f125548t;
                if (!(th5 instanceof ApolloException)) {
                    throw th5;
                }
                ((j0) this.f125549u).f80434a = th5;
                return Unit.f80348a;
            default:
                cl2.a aVar4 = cl2.a.COROUTINE_SUSPENDED;
                int i13 = this.f125547s;
                if (i13 == 0) {
                    ue.c.H(obj);
                    do2.j jVar = (do2.j) this.f125548t;
                    pb.c[] cVarArr = (pb.c[]) ((Object[]) this.f125549u);
                    int length = cVarArr.length;
                    int i14 = 0;
                    while (true) {
                        cVar = pb.a.f99402a;
                        if (i14 < length) {
                            cVar2 = cVarArr[i14];
                            if (!(!Intrinsics.d(cVar2, cVar))) {
                                i14++;
                            }
                        } else {
                            cVar2 = null;
                        }
                    }
                    if (cVar2 != null) {
                        cVar = cVar2;
                    }
                    this.f125547s = 1;
                    if (jVar.emit(cVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ue.c.H(obj);
                }
                return Unit.f80348a;
        }
    }

    public final Object r(do2.j jVar, Throwable th3, bl2.c cVar) {
        switch (this.f125546r) {
            case 0:
                n nVar = new n((j0) this.f125549u, cVar, 0);
                nVar.f125548t = th3;
                return nVar.invokeSuspend(Unit.f80348a);
            case 1:
                n nVar2 = new n((j0) this.f125549u, cVar, 1);
                nVar2.f125548t = th3;
                return nVar2.invokeSuspend(Unit.f80348a);
            default:
                n nVar3 = new n((j0) this.f125549u, cVar, 2);
                nVar3.f125548t = th3;
                return nVar3.invokeSuspend(Unit.f80348a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(j0 j0Var, bl2.c cVar, int i13) {
        super(3, cVar);
        this.f125546r = i13;
        this.f125549u = j0Var;
    }
}
