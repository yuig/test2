package ed;

import com.apollographql.apollo3.exception.ApolloException;
import com.apollographql.apollo3.exception.ApolloParseException;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class l extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f58488r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f58489s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i13, bl2.c cVar) {
        super(3, cVar);
        this.f58488r = i13;
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f58488r) {
        }
        return r((do2.j) obj, (Throwable) obj2, (bl2.c) obj3);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f58488r) {
            case 0:
                cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                Throwable th3 = this.f58489s;
                int i13 = m.f58490f;
                if (th3 instanceof ApolloException) {
                    throw ((ApolloException) th3);
                }
                throw new ApolloParseException("Failed to parse GraphQL http network response", th3);
            case 1:
                cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                return Unit.f80348a;
            case 2:
                cl2.a aVar3 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                return Unit.f80348a;
            case 3:
                cl2.a aVar4 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                return Unit.f80348a;
            default:
                cl2.a aVar5 = cl2.a.COROUTINE_SUSPENDED;
                ue.c.H(obj);
                return Unit.f80348a;
        }
    }

    public final Object r(do2.j jVar, Throwable th3, bl2.c cVar) {
        switch (this.f58488r) {
            case 0:
                l lVar = new l(0, cVar);
                lVar.f58489s = th3;
                return lVar.invokeSuspend(Unit.f80348a);
            case 1:
                l lVar2 = new l(1, cVar);
                lVar2.f58489s = th3;
                return lVar2.invokeSuspend(Unit.f80348a);
            case 2:
                l lVar3 = new l(2, cVar);
                lVar3.f58489s = th3;
                return lVar3.invokeSuspend(Unit.f80348a);
            case 3:
                l lVar4 = new l(3, cVar);
                lVar4.f58489s = th3;
                return lVar4.invokeSuspend(Unit.f80348a);
            default:
                l lVar5 = new l(4, cVar);
                lVar5.f58489s = th3;
                return lVar5.invokeSuspend(Unit.f80348a);
        }
    }
}
