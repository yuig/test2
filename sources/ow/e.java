package ow;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p0 f97773r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ fn.i f97774s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p0 p0Var, fn.i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f97773r = p0Var;
        this.f97774s = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new e(this.f97773r, this.f97774s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        this.f97773r.f97860b.getClass();
        fn.i adSession = this.f97774s;
        Intrinsics.checkNotNullParameter(adSession, "adSession");
        try {
            adSession.f();
            return new ww.e(Unit.f80348a);
        } catch (Exception e13) {
            return new ww.d(e13);
        }
    }
}
