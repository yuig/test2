package i12;

/* loaded from: classes4.dex */
public final class c extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public d f71061r;

    /* renamed from: s, reason: collision with root package name */
    public String f71062s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f71063t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f71064u;

    /* renamed from: v, reason: collision with root package name */
    public int f71065v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, bl2.c cVar) {
        super(cVar);
        this.f71064u = dVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f71063t = obj;
        this.f71065v |= Integer.MIN_VALUE;
        return this.f71064u.a0(null, this);
    }
}
