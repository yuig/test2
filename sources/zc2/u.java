package zc2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class u extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f141647r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f141648s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(w wVar, bl2.c cVar) {
        super(2, cVar);
        this.f141648s = wVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        u uVar = new u(this.f141648s, cVar);
        uVar.f141647r = obj;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((String) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        kh2.j.x2(this.f141648s, new g((String) this.f141647r));
        return Unit.f80348a;
    }
}
