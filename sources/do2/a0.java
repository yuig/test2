package do2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class a0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f55720r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f55721s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i f55722t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(i iVar, bl2.c cVar) {
        super(2, cVar);
        this.f55722t = iVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        a0 a0Var = new a0(this.f55722t, cVar);
        a0Var.f55721s = obj;
        return a0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((co2.z) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f55720r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            t tVar = new t((co2.z) this.f55721s, i14);
            this.f55720r = 1;
            if (this.f55722t.collect(tVar, this) == aVar) {
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
