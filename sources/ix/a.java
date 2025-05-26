package ix;

/* loaded from: classes3.dex */
public final class a extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public d f73772r;

    /* renamed from: s, reason: collision with root package name */
    public d f73773s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f73774t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f73775u;

    /* renamed from: v, reason: collision with root package name */
    public int f73776v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, bl2.c cVar) {
        super(cVar);
        this.f73775u = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f73774t = obj;
        this.f73776v |= Integer.MIN_VALUE;
        return this.f73775u.a(this);
    }
}
