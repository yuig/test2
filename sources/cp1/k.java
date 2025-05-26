package cp1;

import ao2.j0;
import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p f53004r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f30 f53005s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f30 f30Var, p pVar, bl2.c cVar) {
        super(2, cVar);
        this.f53004r = pVar;
        this.f53005s = f30Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k(this.f53005s, this.f53004r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        p.access$logDeepLinkClickthroughEnd(this.f53004r, this.f53005s);
        return Unit.f80348a;
    }
}
