package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class u4 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f25287r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f25288s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ i2.v3 f25289t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ i2.v3 f25290u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f25291v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(w wVar, i2.v3 v3Var, i2.v3 v3Var2, i2.q1 q1Var, bl2.c cVar) {
        super(2, cVar);
        this.f25288s = wVar;
        this.f25289t = v3Var;
        this.f25290u = v3Var2;
        this.f25291v = q1Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new u4(this.f25288s, this.f25289t, this.f25290u, this.f25291v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u4) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f25287r;
        if (i13 == 0) {
            ue.c.H(obj);
            pb.k Z1 = bs1.c.Z1(new u(this.f25288s, 5));
            t4 t4Var = new t4(this.f25289t, this.f25290u, this.f25291v, null);
            this.f25287r = 1;
            if (lb.l0.I(Z1, t4Var, this) == aVar) {
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
