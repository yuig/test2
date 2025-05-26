package do2;

/* loaded from: classes2.dex */
public final class o0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f55875r;

    /* renamed from: s, reason: collision with root package name */
    public int f55876s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p0 f55877t;

    /* renamed from: u, reason: collision with root package name */
    public p0 f55878u;

    /* renamed from: v, reason: collision with root package name */
    public j f55879v;

    /* renamed from: w, reason: collision with root package name */
    public Throwable f55880w;

    /* renamed from: x, reason: collision with root package name */
    public long f55881x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p0 p0Var, bl2.c cVar) {
        super(cVar);
        this.f55877t = p0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55875r = obj;
        this.f55876s |= Integer.MIN_VALUE;
        return this.f55877t.collect(null, this);
    }
}
