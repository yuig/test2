package ow;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class n extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ p0 f97836r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p0 p0Var, bl2.c cVar) {
        super(2, cVar);
        this.f97836r = p0Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new n(this.f97836r, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        Object dVar;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        p0 p0Var = this.f97836r;
        p0Var.f97860b.getClass();
        try {
        } catch (Exception e13) {
            dVar = new ww.d(e13);
        }
        if (!en.a.f59641a.f59642a) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
        hn.a.f69587f.c();
        dVar = new ww.e(Unit.f80348a);
        if (dVar instanceof ww.d) {
            ((pw.c) p0Var.f97861c).getClass();
            Intrinsics.checkNotNullParameter("Failed to update last activity.", "message");
        } else if (dVar instanceof ww.e) {
            return Unit.f80348a;
        }
        return Unit.f80348a;
    }
}
