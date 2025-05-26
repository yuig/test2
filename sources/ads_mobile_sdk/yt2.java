package ads_mobile_sdk;

import android.os.Binder;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class yt2 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ au2 f14405a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt2(au2 au2Var, bl2.c cVar) {
        super(2, cVar);
        this.f14405a = au2Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new yt2(this.f14405a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new yt2(this.f14405a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        au2 au2Var = this.f14405a;
        au2Var.f2555g.set(true);
        if (au2Var.f2552d.isConnected() || au2Var.f2552d.isConnecting()) {
            au2Var.f2552d.disconnect();
        }
        Binder.flushPendingCommands();
        return Unit.f80348a;
    }
}
