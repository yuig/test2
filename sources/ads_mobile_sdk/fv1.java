package ads_mobile_sdk;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fv1 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hv1 f5292a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv1(hv1 hv1Var, bl2.c cVar) {
        super(2, cVar);
        this.f5292a = hv1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new fv1(this.f5292a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new fv1(this.f5292a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        List list = this.f5292a.f6111g;
        if (list == null) {
            Intrinsics.r("renderingJobs");
            throw null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ao2.o1) it.next()).cancel(new CancellationException("Best possible ad config has been rendered, cancelling inflight renderers."));
        }
        return Unit.f80348a;
    }
}
