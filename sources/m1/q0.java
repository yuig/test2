package m1;

/* loaded from: classes2.dex */
public final class q0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public t0 f85524r;

    /* renamed from: s, reason: collision with root package name */
    public y f85525s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f85526t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ t0 f85527u;

    /* renamed from: v, reason: collision with root package name */
    public int f85528v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(t0 t0Var, bl2.c cVar) {
        super(cVar);
        this.f85527u = t0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f85526t = obj;
        this.f85528v |= Integer.MIN_VALUE;
        return t0.R0(this.f85527u, null, this);
    }
}
