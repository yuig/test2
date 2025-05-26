package fd;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j0;
import lb.l0;

/* loaded from: classes3.dex */
public final class x extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f61823r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f61824s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0 f61825t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j0 f61826u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j0 f61827v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, j0 j0Var, j0 j0Var2, j0 j0Var3, bl2.c cVar) {
        super(2, cVar);
        this.f61824s = yVar;
        this.f61825t = j0Var;
        this.f61826u = j0Var2;
        this.f61827v = j0Var3;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new x(this.f61824s, this.f61825t, this.f61826u, this.f61827v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f61823r;
        if (i13 == 0) {
            ue.c.H(obj);
            long j13 = this.f61824s.f61831d;
            this.f61823r = 1;
            if (l0.S(j13, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        y.c(this.f61825t, this.f61826u, this.f61827v);
        return Unit.f80348a;
    }
}
