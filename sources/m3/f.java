package m3;

/* loaded from: classes2.dex */
public final class f extends dl2.d {

    /* renamed from: r, reason: collision with root package name */
    public g f85735r;

    /* renamed from: s, reason: collision with root package name */
    public long f85736s;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f85737t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ g f85738u;

    /* renamed from: v, reason: collision with root package name */
    public int f85739v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, bl2.c cVar) {
        super(cVar);
        this.f85738u = gVar;
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        this.f85737t = obj;
        this.f85739v |= Integer.MIN_VALUE;
        return this.f85738u.L(0L, this);
    }
}
