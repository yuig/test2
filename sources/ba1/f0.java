package ba1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class f0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ m0 f22363r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w60.d f22364s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(m0 m0Var, w60.d dVar, bl2.c cVar) {
        super(2, cVar);
        this.f22363r = m0Var;
        this.f22364s = dVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new f0(this.f22363r, this.f22364s, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        m0 m0Var = this.f22363r;
        boolean z13 = m0Var instanceof k0;
        w60.d dVar = this.f22364s;
        if (z13) {
            dVar.f128119b.f(((k0) m0Var).f22380a);
        } else if (m0Var instanceof l0) {
            dVar.f128119b.B();
        }
        return Unit.f80348a;
    }
}
