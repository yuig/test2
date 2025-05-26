package do2;

/* loaded from: classes2.dex */
public final class t0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public u0 f55946r;

    /* renamed from: s, reason: collision with root package name */
    public Object f55947s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f55948t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u0 f55949u;

    /* renamed from: v, reason: collision with root package name */
    public int f55950v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, bl2.c cVar) {
        super(cVar);
        this.f55949u = u0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55948t = obj;
        this.f55950v |= Integer.MIN_VALUE;
        return this.f55949u.emit(null, this);
    }
}
