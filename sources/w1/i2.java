package w1;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class i2 extends dl2.j implements kl2.l {

    /* renamed from: r, reason: collision with root package name */
    public int f127296r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ m1.g1 f127297s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ long f127298t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f127299u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127300v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o1.l f127301w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(ao2.j0 j0Var, i2.q1 q1Var, o1.l lVar, bl2.c cVar) {
        super(3, cVar);
        this.f127299u = j0Var;
        this.f127300v = q1Var;
        this.f127301w = lVar;
    }

    @Override // kl2.l
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j13 = ((a3.c) obj2).f482a;
        i2 i2Var = new i2(this.f127299u, this.f127300v, this.f127301w, (bl2.c) obj3);
        i2Var.f127297s = (m1.g1) obj;
        i2Var.f127298t = j13;
        return i2Var.invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f127296r;
        ao2.j0 j0Var = this.f127299u;
        if (i13 == 0) {
            ue.c.H(obj);
            m1.g1 g1Var = this.f127297s;
            kotlin.jvm.internal.j.z(j0Var, null, null, new g2(this.f127300v, this.f127298t, this.f127301w, null), 3);
            this.f127296r = 1;
            obj = ((m1.j1) g1Var).c(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ue.c.H(obj);
        }
        kotlin.jvm.internal.j.z(j0Var, null, null, new h2(this.f127300v, ((Boolean) obj).booleanValue(), this.f127301w, null), 3);
        return Unit.f80348a;
    }
}
