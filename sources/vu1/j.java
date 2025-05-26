package vu1;

import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.Callback;

/* loaded from: classes4.dex */
public final class j extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f126684r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Callback f126685s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, Callback callback, bl2.c cVar) {
        super(2, cVar);
        this.f126684r = pVar;
        this.f126685s = callback;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new j(this.f126684r, this.f126685s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f126684r.c(this.f126685s);
        return Unit.f80348a;
    }
}
