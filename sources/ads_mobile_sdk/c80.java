package ads_mobile_sdk;

import a.l0;
import ao2.g0;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class c80 extends dl2.j implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f3811a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f80 f3812b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c80(f80 f80Var, bl2.c cVar) {
        super(2, cVar);
        this.f3812b = f80Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new c80(this.f3812b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c80(this.f3812b, (bl2.c) obj2).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        List<Pair> F0;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f3811a;
        if (i13 == 0) {
            ue.c.H(obj);
            f80 f80Var = this.f3812b;
            this.f3811a = 1;
            synchronized (f80Var) {
                F0 = CollectionsKt.F0(f80Var.f5085p);
                f80Var.f5085p.clear();
                f80Var.f5086q.set(false);
                Unit unit = Unit.f80348a;
            }
            for (Pair pair : F0) {
                String str = (String) pair.f80346a;
                String str2 = (String) pair.f80347b;
                l0 l0Var = cm0.f3958f;
                kotlin.jvm.internal.j.z(dl2.b.b(getContext().minusKey(zs2.f14913b).minusKey(g0.f20153a).minusKey(g0.f20154b)), null, null, new r70(null, f80Var, str, str2), 3);
            }
            if (Unit.f80348a == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        return Unit.f80348a;
    }
}
