package ny0;

/* loaded from: classes5.dex */
public final class c extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public e f92556r;

    /* renamed from: s, reason: collision with root package name */
    public String f92557s;

    /* renamed from: t, reason: collision with root package name */
    public long f92558t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f92559u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f92560v;

    /* renamed from: w, reason: collision with root package name */
    public int f92561w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, bl2.c cVar) {
        super(cVar);
        this.f92560v = eVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f92559u = obj;
        this.f92561w |= Integer.MIN_VALUE;
        return this.f92560v.a(null, this);
    }
}
