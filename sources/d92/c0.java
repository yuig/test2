package d92;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import x02.i2;

/* loaded from: classes4.dex */
public final class c0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f54127r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f54128s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f0 f54129t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f54130u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ u50.r f54131v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var, String str, u50.r rVar, bl2.c cVar) {
        super(2, cVar);
        this.f54129t = f0Var;
        this.f54130u = str;
        this.f54131v = rVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        c0 c0Var = new c0(this.f54129t, this.f54130u, this.f54131v, cVar);
        c0Var.f54128s = obj;
        return c0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c0) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f54127r;
        int i14 = 1;
        if (i13 == 0) {
            ue.c.H(obj);
            ao2.j0 j0Var = (ao2.j0) this.f54128s;
            f0 f0Var = this.f54129t;
            i2 i2Var = f0Var.f54143b;
            String str = this.f54130u;
            do2.c x13 = ve.h.x(i2Var, str);
            u50.r rVar = this.f54131v;
            do2.j0 j0Var2 = new do2.j0(x13, new qp1.d0(rVar, str, null, i14));
            b0 b0Var = new b0(j0Var, f0Var, rVar, str);
            this.f54127r = 1;
            if (j0Var2.collect(b0Var, this) == aVar) {
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
