package do2;

/* loaded from: classes2.dex */
public final class i0 extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f55813r;

    /* renamed from: s, reason: collision with root package name */
    public int f55814s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ j0 f55815t;

    /* renamed from: u, reason: collision with root package name */
    public j0 f55816u;

    /* renamed from: v, reason: collision with root package name */
    public j f55817v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(j0 j0Var, bl2.c cVar) {
        super(cVar);
        this.f55815t = j0Var;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f55813r = obj;
        this.f55814s |= Integer.MIN_VALUE;
        return this.f55815t.collect(null, this);
    }
}
