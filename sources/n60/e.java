package n60;

import android.content.Context;
import ao2.j0;
import kb.u0;
import kb.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m60.f0;

/* loaded from: classes5.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j f89251r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f89251r = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f89251r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        u0 u0Var = w0.f79048a;
        Context context = kb0.a.f79058b;
        d7.b.s0(u0Var.a(f0.j0()), this.f89251r.f89261c);
        return Unit.f80348a;
    }
}
