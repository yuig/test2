package mq;

import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class s extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f88015r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f88016s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, bl2.c cVar) {
        super(2, cVar);
        this.f88016s = uVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        s sVar = new s(this.f88016s, cVar);
        sVar.f88015r = obj;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((f30) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        u.b8(this.f88016s, (f30) this.f88015r);
        return Unit.f80348a;
    }
}
