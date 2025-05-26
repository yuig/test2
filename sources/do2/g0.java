package do2;

/* loaded from: classes4.dex */
public final class g0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f55795r;

    /* renamed from: s, reason: collision with root package name */
    public int f55796s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h0 f55797t;

    /* renamed from: u, reason: collision with root package name */
    public h0 f55798u;

    /* renamed from: v, reason: collision with root package name */
    public j f55799v;

    /* renamed from: w, reason: collision with root package name */
    public eo2.k0 f55800w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, bl2.c cVar) {
        super(cVar);
        this.f55797t = h0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55795r = obj;
        this.f55796s |= Integer.MIN_VALUE;
        return this.f55797t.collect(null, this);
    }
}
