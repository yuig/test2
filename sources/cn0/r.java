package cn0;

import ao2.j0;
import co2.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f28098r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ u f28099s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z f28100t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(u uVar, z zVar, bl2.c cVar) {
        super(2, cVar);
        this.f28099s = uVar;
        this.f28100t = zVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        r rVar = new r(this.f28099s, this.f28100t, cVar);
        rVar.f28098r = obj;
        return rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j0 j0Var = (j0) this.f28098r;
        u uVar = this.f28099s;
        n9.d dVar = uVar.f28109b;
        if (dVar != null) {
            kotlin.jvm.internal.j.z(j0Var, null, null, new n(uVar, dl2.b.o2(j0Var, 0, new q(dVar, null), 3), this.f28100t, null), 3).invokeOnCompletion(o.f28087j);
            return Unit.f80348a;
        }
        Intrinsics.r("frameInfoProvider");
        throw null;
    }
}
