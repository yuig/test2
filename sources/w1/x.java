package w1;

import i2.v3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class x extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f127557r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l1 f127558s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v3 f127559t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h4.g0 f127560u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b2.t0 f127561v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h4.o f127562w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(l1 l1Var, v3 v3Var, h4.g0 g0Var, b2.t0 t0Var, h4.o oVar, bl2.c cVar) {
        super(2, cVar);
        this.f127558s = l1Var;
        this.f127559t = v3Var;
        this.f127560u = g0Var;
        this.f127561v = t0Var;
        this.f127562w = oVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new x(this.f127558s, this.f127559t, this.f127560u, this.f127561v, this.f127562w, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f127557r;
        l1 l1Var = this.f127558s;
        try {
            if (i13 == 0) {
                ue.c.H(obj);
                pb.k Z1 = bs1.c.Z1(new q1.o(this.f127559t, 3));
                k1.j0 j0Var = new k1.j0(this.f127558s, this.f127560u, this.f127561v, this.f127562w, 1);
                this.f127557r = 1;
                if (Z1.collect(j0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ue.c.H(obj);
            }
            g1.i(l1Var);
            return Unit.f80348a;
        } catch (Throwable th3) {
            g1.i(l1Var);
            throw th3;
        }
    }
}
