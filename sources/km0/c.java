package km0;

/* loaded from: classes5.dex */
public final class c extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public a f80175r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f80176s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ d f80177t;

    /* renamed from: u, reason: collision with root package name */
    public int f80178u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, bl2.c cVar) {
        super(cVar);
        this.f80177t = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f80176s = obj;
        this.f80178u |= Integer.MIN_VALUE;
        return this.f80177t.a(0, null, null, null, this);
    }
}
