package t80;

/* loaded from: classes5.dex */
public final class o extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public Object f116707r;

    /* renamed from: s, reason: collision with root package name */
    public Object f116708s;

    /* renamed from: t, reason: collision with root package name */
    public u50.r f116709t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f116710u;

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f116711v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f116712w;

    /* renamed from: x, reason: collision with root package name */
    public int f116713x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, bl2.c cVar) {
        super(cVar);
        this.f116712w = sVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f116711v = obj;
        this.f116713x |= Integer.MIN_VALUE;
        return s.j(this.f116712w, null, false, false, null, this);
    }
}
