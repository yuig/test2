package dy0;

import i2.q1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class x extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f56616r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f56617s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ q1 f56618t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ q1 f56619u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ q1 f56620v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(e eVar, q1 q1Var, q1 q1Var2, q1 q1Var3, bl2.c cVar) {
        super(2, cVar);
        this.f56617s = eVar;
        this.f56618t = q1Var;
        this.f56619u = q1Var2;
        this.f56620v = q1Var3;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        return new x(this.f56617s, this.f56618t, this.f56619u, this.f56620v, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((ao2.j0) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        long g03;
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f56616r;
        q1 q1Var = this.f56618t;
        e eVar = this.f56617s;
        if (i13 == 0) {
            ue.c.H(obj);
            u50.i0 i0Var = eVar.f56558c;
            j1.y yVar = i0.f56582a;
            q1Var.setValue(i0Var);
            zn2.a aVar2 = zn2.b.f142311b;
            long P2 = dl2.b.P2(eVar.f56557b, zn2.d.MILLISECONDS);
            if ((((int) P2) & 1) == 0) {
                g03 = dl2.b.i0((P2 >> 1) / 2);
            } else if (zn2.b.i(P2)) {
                g03 = zn2.b.m(ml2.c.a(2), P2);
            } else {
                long j13 = P2 >> 1;
                long j14 = 2;
                long j15 = j13 / j14;
                if (new ql2.q(-4611686018426L, 4611686018426L).e(j15)) {
                    long j16 = 1000000;
                    g03 = dl2.b.i0((j15 * j16) + (((j13 - (j15 * j14)) * j16) / j14));
                } else {
                    g03 = dl2.b.g0(j15);
                }
            }
            long j17 = zn2.b.j(zn2.b.j(g03, i0.f56585d), i0.f56584c);
            this.f56616r = 1;
            if (lb.l0.T(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        this.f56619u.setValue(Integer.valueOf((int) zn2.b.e(i0.f56584c)));
        this.f56620v.setValue(Integer.valueOf((int) zn2.b.e(i0.f56585d)));
        q1Var.setValue(eVar.f56559d);
        return Unit.f80348a;
    }
}
