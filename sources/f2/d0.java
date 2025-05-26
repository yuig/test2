package f2;

import ao2.j0;
import k1.v1;
import k1.y1;
import k1.z1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class d0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f60829r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e0 f60830s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v1 f60831t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function2 f60832u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, v1 v1Var, Function2 function2, bl2.c cVar) {
        super(2, cVar);
        this.f60830s = e0Var;
        this.f60831t = v1Var;
        this.f60832u = function2;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new d0(this.f60830s, this.f60831t, this.f60832u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d0) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f60829r;
        e0 e0Var = this.f60830s;
        if (i13 == 0) {
            ue.c.H(obj);
            e0Var.f60844k.setValue(Boolean.TRUE);
            this.f60829r = 1;
            z1 z1Var = e0Var.f60849p;
            z1Var.getClass();
            if (dl2.b.O(new y1(this.f60831t, z1Var, this.f60832u, e0Var.f60848o, null), this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        e0Var.f60844k.setValue(Boolean.FALSE);
        return Unit.f80348a;
    }
}
