package fn0;

import ao2.j0;
import co2.y;
import co2.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f62657r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f62658s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z f62659t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t tVar, z zVar, bl2.c cVar) {
        super(2, cVar);
        this.f62658s = tVar;
        this.f62659t = zVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        q qVar = new q(this.f62658s, this.f62659t, cVar);
        qVar.f62657r = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        j0 j0Var = (j0) this.f62657r;
        t tVar = this.f62658s;
        in0.f fVar = tVar.f62666c;
        if (fVar == null) {
            Intrinsics.r("watermarkDecoder");
            throw null;
        }
        y o23 = dl2.b.o2(j0Var, 0, new n(tVar, fVar, null), 3);
        hn0.e eVar = tVar.f62668e;
        if (eVar == null) {
            Intrinsics.r("videoDecoder");
            throw null;
        }
        c cVar = tVar.f62664a;
        if (cVar == null) {
            Intrinsics.r("encoder");
            throw null;
        }
        kotlin.jvm.internal.j.z(j0Var, null, null, new m(eVar, o23, tVar, cVar, null), 3);
        c cVar2 = tVar.f62664a;
        if (cVar2 != null) {
            kotlin.jvm.internal.j.z(j0Var, null, null, new l(cVar2, tVar, this.f62659t, null), 3);
            return Unit.f80348a;
        }
        Intrinsics.r("encoder");
        throw null;
    }
}
