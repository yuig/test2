package ads_mobile_sdk;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class f00 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g00 f4996a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f00(g00 g00Var, bl2.c cVar) {
        super(2, cVar);
        this.f4996a = g00Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f00(this.f4996a, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new f00(this.f4996a, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        String c13;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        e00 e00Var = this.f4996a.f5342d;
        e00Var.f4537f.getAndSet(true);
        Context context = e00Var.f4532a;
        if (e00Var.f4536e == null && (c13 = s.k.c(context)) != null) {
            s.k.a(context, c13, e00Var);
        }
        return Unit.f80348a;
    }
}
