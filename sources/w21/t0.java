package w21;

import i2.v3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m1.n3;

/* loaded from: classes5.dex */
public final class t0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f127812r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f127813s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j3.a f127814t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f127815u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127816v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127817w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y1 f127818x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127819y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ v3 f127820z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(j3.a aVar, ao2.j0 j0Var, i2.q1 q1Var, i2.q1 q1Var2, y1 y1Var, i2.q1 q1Var3, v3 v3Var, bl2.c cVar) {
        super(2, cVar);
        this.f127814t = aVar;
        this.f127815u = j0Var;
        this.f127816v = q1Var;
        this.f127817w = q1Var2;
        this.f127818x = y1Var;
        this.f127819y = q1Var3;
        this.f127820z = v3Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        t0 t0Var = new t0(this.f127814t, this.f127815u, this.f127816v, this.f127817w, this.f127818x, this.f127819y, this.f127820z, cVar);
        t0Var.f127813s = obj;
        return t0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t0) create((n3.w) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f127812r;
        if (i13 == 0) {
            ue.c.H(obj);
            n3.w wVar = (n3.w) this.f127813s;
            s0 s0Var = new s0(this.f127814t, this.f127815u, this.f127816v, this.f127817w, this.f127818x, this.f127819y, this.f127820z, 0);
            this.f127812r = 1;
            if (n3.d(wVar, null, null, s0Var, this, 7) == aVar) {
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
