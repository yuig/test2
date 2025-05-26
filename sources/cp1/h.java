package cp1;

import ao2.j0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class h extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f30 f52999r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p f53000s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f30 f30Var, p pVar, bl2.c cVar) {
        super(2, cVar);
        this.f52999r = f30Var;
        this.f53000s = pVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new h(this.f52999r, this.f53000s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        f30 f30Var = this.f52999r;
        if (b40.q0(f30Var)) {
            p.access$logDeepLinkClickthroughEnd(this.f53000s, f30Var);
        }
        return Unit.f80348a;
    }
}
