package ba;

import ao2.j0;
import i2.v3;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class k extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v3 f22276r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f22277s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s2.t f22278t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(v3 v3Var, n nVar, s2.t tVar, bl2.c cVar) {
        super(2, cVar);
        this.f22276r = v3Var;
        this.f22277s = nVar;
        this.f22278t = tVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new k(this.f22276r, this.f22277s, this.f22278t, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        for (z9.k kVar : (Set) this.f22276r.getValue()) {
            n nVar = this.f22277s;
            if (!((List) nVar.b().f141227e.f55726a.getValue()).contains(kVar) && !this.f22278t.contains(kVar)) {
                nVar.b().b(kVar);
            }
        }
        return Unit.f80348a;
    }
}
