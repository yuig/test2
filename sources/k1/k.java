package k1;

/* loaded from: classes2.dex */
public final class k extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public n f77908r;

    /* renamed from: s, reason: collision with root package name */
    public long f77909s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f77910t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ n f77911u;

    /* renamed from: v, reason: collision with root package name */
    public int f77912v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, bl2.c cVar) {
        super(cVar);
        this.f77911u = nVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f77910t = obj;
        this.f77912v |= Integer.MIN_VALUE;
        return this.f77911u.e(0L, null, this);
    }
}
