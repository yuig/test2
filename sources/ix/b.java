package ix;

/* loaded from: classes3.dex */
public final class b extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public d f73777r;

    /* renamed from: s, reason: collision with root package name */
    public d f73778s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f73779t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f73780u;

    /* renamed from: v, reason: collision with root package name */
    public int f73781v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, bl2.c cVar) {
        super(cVar);
        this.f73780u = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f73779t = obj;
        this.f73781v |= Integer.MIN_VALUE;
        return this.f73780u.b(this);
    }
}
