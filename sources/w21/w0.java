package w21;

import i2.v3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m1.n3;

/* loaded from: classes5.dex */
public final class w0 extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public int f127845r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f127846s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j3.a f127847t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ao2.j0 f127848u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127849v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127850w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y1 f127851x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i2.q1 f127852y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ v3 f127853z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(j3.a aVar, ao2.j0 j0Var, i2.q1 q1Var, i2.q1 q1Var2, y1 y1Var, i2.q1 q1Var3, v3 v3Var, bl2.c cVar) {
        super(2, cVar);
        this.f127847t = aVar;
        this.f127848u = j0Var;
        this.f127849v = q1Var;
        this.f127850w = q1Var2;
        this.f127851x = y1Var;
        this.f127852y = q1Var3;
        this.f127853z = v3Var;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        w0 w0Var = new w0(this.f127847t, this.f127848u, this.f127849v, this.f127850w, this.f127851x, this.f127852y, this.f127853z, cVar);
        w0Var.f127846s = obj;
        return w0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((n3.w) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        int i13 = this.f127845r;
        if (i13 == 0) {
            ue.c.H(obj);
            n3.w wVar = (n3.w) this.f127846s;
            s0 s0Var = new s0(this.f127847t, this.f127848u, this.f127849v, this.f127850w, this.f127851x, this.f127852y, this.f127853z, 1);
            this.f127845r = 1;
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
