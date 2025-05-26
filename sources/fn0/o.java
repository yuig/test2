package fn0;

/* loaded from: classes5.dex */
public final class o extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public Object f62649r;

    /* renamed from: s, reason: collision with root package name */
    public t f62650s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f62651t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ t f62652u;

    /* renamed from: v, reason: collision with root package name */
    public int f62653v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t tVar, bl2.c cVar) {
        super(cVar);
        this.f62652u = tVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f62651t = obj;
        this.f62653v |= Integer.MIN_VALUE;
        return this.f62652u.a(null, null, null, this);
    }
}
