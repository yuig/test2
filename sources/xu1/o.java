package xu1;

import ao2.f0;
import ao2.j0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class o extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f135964r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ t f135965s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f135966t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f135967u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, int i13, int i14, bl2.c cVar) {
        super(2, cVar);
        this.f135965s = tVar;
        this.f135966t = i13;
        this.f135967u = i14;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new o(this.f135965s, this.f135966t, this.f135967u, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f135964r;
        if (i13 == 0) {
            ue.c.H(obj);
            f0 f0Var = this.f135965s.f135975b.f92750a;
            n nVar = new n(this.f135966t, this.f135967u, null);
            this.f135964r = 1;
            if (kotlin.jvm.internal.j.M(this, f0Var, nVar) == aVar) {
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
