package vc;

import com.apollographql.apollo3.exception.ApolloException;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class t extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Throwable f125572r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f125573s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(boolean z13, bl2.c cVar) {
        super(3, cVar);
        this.f125573s = z13;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        t tVar = new t(this.f125573s, (bl2.c) obj3);
        tVar.f125572r = (Throwable) obj2;
        return tVar.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        Throwable th3 = this.f125572r;
        if (!(th3 instanceof ApolloException)) {
            throw th3;
        }
        if (this.f125573s) {
            throw th3;
        }
        return Unit.f80348a;
    }
}
